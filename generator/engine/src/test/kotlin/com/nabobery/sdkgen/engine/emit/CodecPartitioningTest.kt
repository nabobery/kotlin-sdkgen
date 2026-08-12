package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.FormFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.FormScalarKind
import com.nabobery.sdkgen.engine.declarations.FormValueDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.MultipartPartDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Every non-`const` property of a Kotlin `object` is assigned in that object's `<clinit>`, and the JVM caps one
 * method's bytecode at 64 KiB. A codecs object holding one client's every operation therefore has a hard size
 * ceiling — reached on the Stripe corpus at 519 operations. These tests pin the partitioning that lifts it, and
 * pin that lifting preserves the internal protocol structure. See ADR-0015.
 *
 * The internal-structure tests inventory **both** internal properties and internal nested types. An earlier revision
 * inventoried only properties, and so could not detect that partitioning had moved the internal per-operation
 * form codec objects inside a `private object`. That regression shipped.
 * `partitioningKeepsInternalNestedCodecObjectsReachable` is the test that would have caught it.
 */
class CodecPartitioningTest {
    @Test
    fun clientBelowThePartitionBoundEmitsOneFlatCodecsObject() {
        val source = renderCodecsClient(operationCount = 40)

        assertFalse(
            source.contains("private object Partition"),
            "a client below the bound must not pay the partitioning indirection",
        )
        assertTrue(source.contains("private val operation0RequestCodec:"))
    }

    @Test
    fun clientAboveThePartitionBoundMovesStoredPropertiesIntoPartitions() {
        val source = renderCodecsClient(operationCount = 200)

        assertTrue(
            Regex("private object Partition\\d+").findAll(source).count() > 1,
            "200 operations must exceed the stored-property bound and produce multiple partitions",
        )
        // The stored properties — the ones that cost `<clinit>` bytecode — moved into the partitions.
        assertFalse(
            Regex("^  private val operation0RequestCodec:", RegexOption.MULTILINE).containsMatchIn(source),
            "stored codecs must not remain on the outer object, or the `<clinit>` limit is unchanged",
        )
        assertTrue(Regex("^    private val operation0RequestCodec:", RegexOption.MULTILINE).containsMatchIn(source))
    }

    @Test
    fun everyPartitionStaysUnderTheStoredPropertyBound() {
        val source = renderCodecsClient(operationCount = 200)

        val storedPerPartition =
            source
                .split(Regex("^  private object Partition\\d+ \\{", RegexOption.MULTILINE))
                .drop(1)
                // Each chunk runs to the partition's closing brace; everything after it belongs to a later
                // declaration and must not be counted.
                .map { chunk -> chunk.lineSequence().takeWhile { line -> line != "  }" }.toList() }
                .map { lines -> lines.count(::isStoredPartitionProperty) }

        assertTrue(storedPerPartition.isNotEmpty(), "expected at least one partition")
        assertTrue(
            storedPerPartition.all { stored -> stored <= 400 },
            "a partition exceeded the stored-property bound: $storedPerPartition",
        )
    }

    @Test
    fun partitioningKeepsInternalNestedCodecObjectsReachable() {
        val flat = renderCodecsClient(operationCount = 40)
        val partitioned = renderCodecsClient(operationCount = 200)

        // A form request body emits `internal object <Op>FormCodec`, and a multipart one `<Op>MultipartCodec`,
        // as members of the codecs object. Nesting either inside a private partition would make it unavailable
        // to the outer codecs holder. Form and multipart
        // are emitted by separate functions, so both are pinned: a multipart-only regression would otherwise
        // leave every other assertion here green.
        listOf("Operation0FormCodec", "Operation1MultipartCodec").forEach { codecObject ->
            assertTrue(
                Regex("^  internal object $codecObject", RegexOption.MULTILINE).containsMatchIn(flat),
                "the unpartitioned client must expose $codecObject directly on the codecs object",
            )
            assertTrue(
                Regex("^  internal object $codecObject", RegexOption.MULTILINE).containsMatchIn(partitioned),
                "partitioning must not move $codecObject inside a private partition",
            )
        }
    }

    @Test
    fun partitioningLeavesTheInternalCodecsStructureUnchanged() {
        val flat = internalCodecMembers(renderCodecsClient(operationCount = 40))
        val partitioned = internalCodecMembers(renderCodecsClient(operationCount = 200))

        // The 200-operation client is a superset: same members for operations 0..39, plus the rest.
        assertEquals(
            emptySet(),
            flat - partitioned,
            "partitioning must not remove or rename any internal member of the codecs object",
        )
        assertTrue(flat.contains("Operation0FormCodec"), "the inventory must cover internal nested types")
        assertTrue(flat.contains("operation0RequestCodecRegistry"), "the inventory must cover internal properties")
    }

    @Test
    fun partitionedConstantsStayCompileTimeConstantsOnTheOuterObject() {
        val source = renderCodecsClient(operationCount = 200)

        assertTrue(
            Regex("^  internal const val OPERATION0_RESPONSE_CODEC_ID", RegexOption.MULTILINE).containsMatchIn(source),
            "codec ids must stay `const` on the codecs object: they cost no `<clinit>` bytecode, and demoting " +
                "them to ordinary properties would break a compile-time constant used by generated code.",
        )
        assertTrue(
            source.contains("KotlinxSerializationCodec(WidgetCodecs.OPERATION0_RESPONSE_CODEC_ID"),
            "a partition must reach the outer object's members qualified, not as unqualified siblings",
        )
        assertTrue(
            source.contains("WidgetCodecs.Operation0FormCodec"),
            "a partition must reach an internal nested form codec object qualified through the outer object",
        )
        assertTrue(
            source.contains("WidgetCodecs.Operation1MultipartCodec"),
            "a partition must reach a public nested multipart codec object qualified through the outer object",
        )
    }

    /** A form or multipart request body, each of which emits its own internal nested codec object. */
    private fun requestBody(
        mediaType: String,
        multipart: Boolean,
        type: KotlinTypeRef,
    ): OperationRequestBodyAlternative =
        if (multipart) {
            OperationRequestBodyAlternative(
                mediaType = mediaType,
                type = type,
                multipartParts =
                    listOf(
                        MultipartPartDeclaration(
                            wireName = "file",
                            accessorName = "file",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            contentType = "text/plain",
                        ),
                    ),
            )
        } else {
            OperationRequestBodyAlternative(
                mediaType = mediaType,
                type = type,
                formFields =
                    listOf(
                        FormFieldDeclaration(
                            wireName = "name",
                            accessorName = "name",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
                        ),
                    ),
            )
        }

    /** A stored property declared directly in a partition body, at one level of nesting inside it. */
    private fun isStoredPartitionProperty(line: String): Boolean =
        line.startsWith("    internal val ") || line.startsWith("    private val ")

    /**
     * Internal members of the codecs object itself — properties and nested types — excluding anything nested
     * inside a partition. Two-space indentation is exactly one level inside the codecs object.
     */
    private fun internalCodecMembers(source: String): Set<String> =
        Regex("^  internal (?:const )?(?:val|object) (\\w+)", RegexOption.MULTILINE)
            .findAll(source)
            .map { match -> match.groupValues[1] }
            .toSet()

    /**
     * The acceptance test for the emitted public-API projection.
     *
     * `kotlinApiSha256` is computed from the declaration model, upstream of emission, and was byte-identical
     * across the ADR 0015 regression that deleted 518 public codec objects *and* across its repair. The whole
     * point of deriving a projection from the emitted KotlinPoet tree is that this class of change moves it.
     * Asserting on the projection rather than on rendered text is what makes it a machine-comparable inventory
     * instead of another regex that has to be remembered and kept in step.
     */
    @Test
    fun theEmittedApiProjectionOmitsInternalNestedCodecObjectsAcrossThePartitionBound() {
        val flat = codecsProjection(operationCount = 40)
        val partitioned = codecsProjection(operationCount = 200)

        listOf("Operation0FormCodec", "Operation1MultipartCodec").forEach { codecObject ->
            val qualifiedName = "\"com.example.generated.widgets.WidgetCodecs.$codecObject\""
            assertFalse(
                flat.contains(qualifiedName),
                "the unpartitioned client's projection must omit internal $codecObject",
            )
            assertFalse(
                partitioned.contains(qualifiedName),
                "partitioning must keep internal $codecObject out of the emitted public API",
            )
        }
    }

    /**
     * A `public` declaration inside a `private` enclosing object is not reachable, and this is the single rule
     * that lets the projection observe the ADR 0015 defect class. A check that read each declaration's own
     * modifiers would report the partitioned codecs as still public -- which is exactly what the previous
     * `^  public (const )?val` grep did, and why the regression shipped.
     */
    @Test
    fun aPublicDeclarationInsideAPrivateEnclosingObjectIsNotInTheProjection() {
        val reachable = TypeSpec.objectBuilder("Reachable").build()
        val hidden =
            TypeSpec
                .objectBuilder("Hidden")
                .addModifiers(KModifier.PRIVATE)
                .addType(TypeSpec.objectBuilder("Buried").build())
                .build()
        val file =
            FileSpec
                .builder("com.example", "Surface")
                .addType(
                    TypeSpec
                        .objectBuilder("Holder")
                        .addType(reachable)
                        .addType(hidden)
                        .build(),
                ).build()

        val projection = projectionOf(file)

        assertTrue(projection.contains("\"com.example.Holder.Reachable\""))
        assertFalse(projection.contains("Hidden"), "a private enclosing object must not appear")
        assertFalse(
            projection.contains("Buried"),
            "a public declaration is unreachable through a private enclosing object, so the projection must " +
                "not claim it as public API",
        )
    }

    /**
     * Top-level `public val`s compile to a synthetic `<FileName>Kt` facade, and the generated SDK has one that
     * matters: `SdkJson`. A projection that walked only nested types would drop it, so a change to it would be
     * invisible -- the same blindness this projection exists to remove.
     */
    @Test
    fun theProjectionCoversPublicTopLevelMembersNotJustNestedTypes() {
        val file =
            FileSpec
                .builder("com.example", "Support")
                .addProperty(
                    PropertySpec.builder("sdkJson", ClassName("kotlin", "String")).initializer("%S", "x").build(),
                ).build()

        val projection = projectionOf(file)

        assertTrue(projection.contains("\"com.example.SupportKt\""), "the file facade must be projected")
        assertTrue(projection.contains("\"sdkJson\""), "the top-level property must be projected")
    }

    @Test
    fun theProjectionCoversPrimaryConstructorsDataSemanticsAndGenericBounds() {
        val parameter = TypeVariableName("T", ClassName("kotlin", "Number"))
        val constructor = FunSpec.constructorBuilder().addParameter("value", parameter).build()
        val file =
            FileSpec
                .builder("com.example", "Value")
                .addType(
                    TypeSpec
                        .classBuilder("Value")
                        .addModifiers(KModifier.DATA)
                        .addTypeVariable(parameter)
                        .primaryConstructor(constructor)
                        .addProperty(PropertySpec.builder("value", parameter).initializer("value").build())
                        .addFunction(FunSpec.builder("inspect").addModifiers(KModifier.PROTECTED).build())
                        .build(),
                ).addFunction(FunSpec.builder("normalized").receiver(ClassName("kotlin", "String")).build())
                .build()

        val projection = projectionOf(file)

        assertTrue(projection.contains("\"data\""))
        assertTrue(projection.contains("\"<init>\""))
        assertTrue(projection.contains("Number"))
        assertTrue(projection.contains("\"value\""))
        assertTrue(projection.contains("\"protected\""))
        assertTrue(projection.contains("\"receiverType\""))
    }

    private fun codecsProjection(operationCount: Int): String =
        KotlinPoetEmitter("com.example.generated")
            .render(codecsModel(operationCount))
            .publicApiProjection

    private fun projectionOf(file: FileSpec): String =
        EmittedApiProjection.render(
            fileSpecs = listOf(file),
            files = listOf(RenderedKotlinFile("Surface.kt", file.toString().encodeToByteArray())),
            declarationModelSha256 = "0".repeat(64),
        )

    private fun renderCodecsClient(operationCount: Int): String =
        KotlinPoetEmitter("com.example.generated")
            .render(codecsModel(operationCount))
            .files
            .single()
            .bytes
            .decodeToString()

    private fun codecsModel(operationCount: Int): KotlinDeclarationModel {
        val packageName = "com.example.generated.widgets"
        val jsonElement = KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
        // Odd-numbered operations use a multipart body so both nested-codec emission paths are exercised.
        val operations =
            (0 until operationCount).map { index ->
                val multipart = index % 2 == 1
                val mediaType =
                    if (multipart) "multipart/form-data" else "application/x-www-form-urlencoded"
                OperationDeclaration(
                    symbolId = "operation:operation$index",
                    order = index,
                    operationId = "operation$index",
                    method = "POST",
                    path = "/widgets/$index",
                    requestMediaTypes = listOf(mediaType),
                    responseMediaTypes = listOf("application/json"),
                    successStatusCodes = setOf(200),
                    requestType = jsonElement,
                    responseType = jsonElement,
                    requestCodecPropertyName = "operation${index}RequestCodec",
                    responseCodecPropertyName = "operation${index}ResponseCodec",
                    requestCodecConstantName = "OPERATION${index}_REQUEST_CODEC_ID",
                    responseCodecConstantName = "OPERATION${index}_RESPONSE_CODEC_ID",
                    requestCodecId = "operation$index.request",
                    responseCodecId = "operation$index.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(10_000, 5_000, null),
                    methodKdoc = "Operation $index.",
                    requestBodyAlternatives = listOf(requestBody(mediaType, multipart, jsonElement)),
                )
            }
        val declaration =
            OperationClientDeclaration(
                symbolId = "client:$packageName.WidgetClient",
                order = 0,
                packageName = packageName,
                fileName = "WidgetClient",
                resolvedName = "WidgetClient",
                kdoc = "Widget client.",
                codecsObjectName = "WidgetCodecs",
                operations = operations,
            )
        return KotlinDeclarationModel(
            listOf(KotlinFileDeclaration(packageName, "WidgetClient", listOf(declaration))),
        )
    }
}
