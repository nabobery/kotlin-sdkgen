@file:Suppress("ktlint:standard:max-line-length")

@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.declarations.AdditionalPropertiesDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.DeepObjectAdditionalPropertiesDeclaration
import com.nabobery.sdkgen.engine.declarations.DeepObjectAdditionalPropertiesSerialization
import com.nabobery.sdkgen.engine.declarations.DeepObjectParameterPropertyDeclaration
import com.nabobery.sdkgen.engine.declarations.EnumValueDeclaration
import com.nabobery.sdkgen.engine.declarations.FieldDeclaration
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnosticCode
import com.nabobery.sdkgen.engine.declarations.JsonAdditionalPropertiesPredicate
import com.nabobery.sdkgen.engine.declarations.JsonBranchPredicate
import com.nabobery.sdkgen.engine.declarations.JsonStringFormat
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterLocation
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.OperationSecurityRequirement
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeRef
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ParameterSerialization
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfJsonKind
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.SimpleFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.SimpleModelDeclaration
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentation
import com.nabobery.sdkgen.engine.spi.applyDeclarationAugmentations
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.openapi.SemanticAdapter
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.reflect.InvocationTargetException
import java.net.URLClassLoader
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KotlinPoetEmitterCompileRegressionTest {
    @Test
    fun nullableAuxiliaryCollectionsCompileAndDetachCallerInputs() {
        val string = KotlinTypeRef("kotlin", "String")
        val auxiliary =
            SimpleModelDeclaration(
                resolvedName = "AuxiliaryCollections",
                kdoc = "Nullable auxiliary collections.",
                fields =
                    listOf(
                        SimpleFieldDeclaration(
                            "items",
                            "items",
                            KotlinTypeRef("kotlin.collections", "List", listOf(string), nullable = true),
                            "",
                        ),
                        SimpleFieldDeclaration(
                            "labels",
                            "labels",
                            KotlinTypeRef("kotlin.collections", "Set", listOf(string), nullable = true),
                            "",
                        ),
                        SimpleFieldDeclaration(
                            "metadata",
                            "metadata",
                            KotlinTypeRef(
                                "kotlin.collections",
                                "Map",
                                listOf(string, KotlinTypeRef("kotlin.collections", "List", listOf(string))),
                                nullable = true,
                            ),
                            "",
                        ),
                    ),
            )
        val owner =
            ModelDeclaration(
                symbolId = "schema:AuxiliaryOwner",
                order = 0,
                packageName = PACKAGE,
                fileName = "AuxiliaryOwner",
                resolvedName = "AuxiliaryOwner",
                kdoc = "",
                fields = emptyList(),
                dslFunctionName = "auxiliaryOwner",
                auxiliaryModels = listOf(auxiliary),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "AuxiliaryOwner", listOf(owner)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val harness =
            """
            package $PACKAGE

            fun auxiliaryCollectionOutcome(): String {
                val items = mutableListOf("item")
                val labels = mutableSetOf("label")
                val nested = mutableListOf("nested")
                val metadata = mutableMapOf("key" to nested)
                val value = AuxiliaryCollections(items, labels, metadata)
                items += "mutated"
                labels += "mutated"
                nested += "mutated"
                metadata["other"] = mutableListOf("mutated")
                return listOf(
                    value.items?.joinToString(),
                    value.labels?.joinToString(),
                    value.metadata?.entries?.joinToString { "${'$'}{it.key}=${'$'}{it.value.joinToString()}" },
                ).joinToString("|")
            }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/AuxiliaryCollectionHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val outcome =
                loader
                    .loadClass("$PACKAGE.AuxiliaryCollectionHarnessKt")
                    .getMethod("auxiliaryCollectionOutcome")
            assertEquals("item|label|key=nested", outcome.invoke(null))
        }
    }

    @Test
    fun generatedUnionCollectionValuesStayDetachedAndConsistentWithRawJson() {
        val string = KotlinTypeRef("kotlin", "String")
        val strings = KotlinTypeRef("kotlin.collections", "List", listOf(string))
        val valuesField = UnionFieldDeclaration("values", "values", strings)
        val objectOneOf =
            OneOfDeclaration(
                symbolId = "schema:CollectionOneOf",
                order = 0,
                packageName = PACKAGE,
                fileName = "CollectionOneOf",
                resolvedName = "CollectionOneOf",
                kdoc = "",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:CollectionOneOf/values",
                            order = 0,
                            resolvedName = "Values",
                            requiredFields = listOf(valuesField),
                            predicate =
                                JsonBranchPredicate.ObjectShape(
                                    requiredNames = listOf("values"),
                                    properties =
                                        mapOf(
                                            "values" to
                                                JsonBranchPredicate.ArrayShape(
                                                    item =
                                                        JsonBranchPredicate.Kind(
                                                            PrimitiveOneOfJsonKind.STRING,
                                                        ),
                                                ),
                                        ),
                                    additionalProperties = JsonAdditionalPropertiesPredicate.Closed,
                                ),
                        ),
                    ),
            )
        val primitiveOneOf =
            PrimitiveOneOfDeclaration(
                symbolId = "schema:CollectionPrimitiveOneOf",
                order = 1,
                packageName = PACKAGE,
                fileName = "CollectionPrimitiveOneOf",
                resolvedName = "CollectionPrimitiveOneOf",
                kdoc = "",
                cases =
                    listOf(
                        PrimitiveOneOfCaseDeclaration(
                            symbolId = "schema:CollectionPrimitiveOneOf/values",
                            order = 0,
                            resolvedName = "Values",
                            type = strings,
                            jsonKind = PrimitiveOneOfJsonKind.ARRAY,
                            predicate =
                                JsonBranchPredicate.ArrayShape(
                                    item = JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                                ),
                        ),
                    ),
            )
        val anyOf =
            AnyOfDeclaration(
                symbolId = "schema:CollectionAnyOf",
                order = 2,
                packageName = PACKAGE,
                fileName = "CollectionAnyOf",
                resolvedName = "CollectionAnyOf",
                kdoc = "",
                branches =
                    listOf(
                        AnyOfBranchDeclaration(
                            symbolId = "schema:CollectionAnyOf/values",
                            order = 0,
                            resolvedName = "Values",
                            propertyName = "values",
                            fields = listOf(valuesField),
                            viewFields = listOf(valuesField),
                            viewTypeName = "CollectionView",
                        ),
                    ),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "CollectionOneOf", listOf(objectOneOf)),
                            KotlinFileDeclaration(PACKAGE, "CollectionPrimitiveOneOf", listOf(primitiveOneOf)),
                            KotlinFileDeclaration(PACKAGE, "CollectionAnyOf", listOf(anyOf)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val harness =
            """
            package $PACKAGE

            import kotlinx.serialization.json.JsonArray
            import kotlinx.serialization.json.JsonObject
            import kotlinx.serialization.json.JsonPrimitive

            fun unionCollectionOutcome(): String {
                val objectInput = mutableListOf("object")
                val objectValue = CollectionOneOf.Values.of(objectInput)
                objectInput += "mutated"
                val objectRaw = ((objectValue.raw as JsonObject)["values"] as JsonArray)
                    .joinToString { (it as JsonPrimitive).content }

                val primitiveInput = mutableListOf("primitive")
                val primitiveValue = CollectionPrimitiveOneOf.Values.of(primitiveInput)
                primitiveInput += "mutated"
                val primitiveRaw = (primitiveValue.raw as JsonArray)
                    .joinToString { (it as JsonPrimitive).content }

                val view = CollectionView(listOf("view"))
                return listOf(
                    objectValue.values.joinToString(),
                    objectRaw,
                    primitiveValue.value.joinToString(),
                    primitiveRaw,
                    view.values.joinToString(),
                ).joinToString("|")
            }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/UnionCollectionHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )
        val anyOfSource =
            rendered
                .single { file -> file.path.endsWith("/CollectionAnyOf.kt") }
                .bytes
                .decodeToString()
        assertTrue(anyOfSource.contains("@ConsistentCopyVisibility"))
        assertTrue(anyOfSource.contains("public data class CollectionView internal constructor("))
        assertTrue(anyOfSource.contains("public val values: List<String>"))

        val externalRoot = Files.createTempDirectory("sdkgen-anyof-view-visibility-")
        val externalSource =
            externalRoot.resolve("ExternalConsumer.kt").also { path ->
                path.writeText(
                    """
                    package external.consumer

                    import $PACKAGE.CollectionView

                    fun construct(values: MutableList<String>): CollectionView = CollectionView(values)

                    fun copy(view: CollectionView, values: MutableList<String>): CollectionView =
                        view.copy(values = values)
                    """.trimIndent(),
                )
            }
        val externalCompilerOutput = ByteArrayOutputStream()
        val externalResult =
            K2JVMCompiler().exec(
                PrintStream(externalCompilerOutput),
                "-classpath",
                "${System.getProperty("java.class.path")}${System.getProperty("path.separator")}$output",
                "-d",
                externalRoot.resolve("out").also { path -> path.createDirectories() }.toString(),
                externalSource.toString(),
            )
        assertEquals(ExitCode.COMPILATION_ERROR, externalResult, externalCompilerOutput.toString())
        assertTrue(externalCompilerOutput.toString().contains("internal"), externalCompilerOutput.toString())

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val outcome =
                loader
                    .loadClass("$PACKAGE.UnionCollectionHarnessKt")
                    .getMethod("unionCollectionOutcome")
            assertEquals("object|object|primitive|primitive|view", outcome.invoke(null))
        }
    }

    @Test
    fun generatedModelsDefensivelyCopyConstructorAndBuilderCollections() {
        val string = KotlinTypeRef("kotlin", "String")
        val stringList = KotlinTypeRef("kotlin.collections", "List", listOf(string))
        val stringSet = KotlinTypeRef("kotlin.collections", "Set", listOf(string))
        val stringMap = KotlinTypeRef("kotlin.collections", "Map", listOf(string, string))
        val nullableString = string.copy(nullable = true)
        val nullableStringList = KotlinTypeRef("kotlin.collections", "List", listOf(nullableString))
        val nestedLists = KotlinTypeRef("kotlin.collections", "List", listOf(nullableStringList))
        val plain =
            ModelDeclaration(
                symbolId = "schema:PlainCollections",
                order = 0,
                packageName = PACKAGE,
                fileName = "PlainCollections",
                resolvedName = "PlainCollections",
                kdoc = "Plain collection ownership fixture.",
                fields =
                    listOf(
                        collectionField("requiredList", stringList, order = 0, required = true),
                        collectionField("requiredSet", stringSet, order = 1, required = true),
                        collectionField("optionalMap", stringMap, order = 2, required = false),
                    ),
                dslFunctionName = "plainCollections",
            )
        val stateful =
            ModelDeclaration(
                symbolId = "schema:StatefulCollections",
                order = 1,
                packageName = PACKAGE,
                fileName = "StatefulCollections",
                resolvedName = "StatefulCollections",
                kdoc = "Field-state collection ownership fixture.",
                fields =
                    listOf(
                        collectionField("requiredList", stringList, order = 0, required = true),
                        collectionField("requiredNullableSet", stringSet, order = 1, required = true, nullable = true),
                        collectionField(
                            "optionalNullableList",
                            nestedLists,
                            order = 2,
                            required = false,
                            nullable = true,
                        ),
                        collectionField("optionalMap", stringMap, order = 3, required = false),
                    ),
                dslFunctionName = "statefulCollections",
                additionalProperties =
                    AdditionalPropertiesDeclaration(
                        resolvedName = "additionalProperties",
                        valueType = nestedLists,
                        valuesAreJsonElements = false,
                        fixedWireNames =
                            setOf(
                                "requiredList",
                                "requiredNullableSet",
                                "optionalNullableList",
                                "optionalMap",
                            ),
                        kdoc = "",
                    ),
                usesFieldState = true,
            )
        val declarations =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                symbolId = "support:serialization",
                                order = 0,
                                packageName = PACKAGE,
                                fileName = "SerializationSupport",
                                resolvedName = "SerializationSupport",
                                kdoc = "",
                                kind = SupportKind.Serialization,
                            ),
                            SupportDeclaration(
                                symbolId = "support:field-presence",
                                order = 1,
                                packageName = PACKAGE,
                                fileName = "FieldPresence",
                                resolvedName = "FieldPresence",
                                kdoc = "",
                                kind = SupportKind.FieldPresence,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(PACKAGE, "PlainCollections", listOf(plain)),
                    KotlinFileDeclaration(PACKAGE, "StatefulCollections", listOf(stateful)),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(declarations).files
        val harness =
            """
            package $PACKAGE

            fun collectionOwnershipOutcome(): String {
                val required = mutableListOf("required")
                val requiredSet = mutableSetOf("required-set")
                val optionalMap = mutableMapOf("optional" to "map")
                val plain = PlainCollections(
                    requiredList = required,
                    requiredSet = requiredSet,
                    optionalMap = optionalMap,
                )
                required += "mutated"
                requiredSet += "mutated"
                optionalMap["mutated"] = "mutated"

                val builderRequired = mutableListOf("builder-required", "second")
                val builderSet = mutableSetOf("builder-set", "second")
                val builderOptionalInner = mutableListOf<String?>("builder-optional", null)
                val builderOptional = mutableListOf(builderOptionalInner, mutableListOf("second"))
                val builderMap = mutableMapOf("builder" to "map", "second" to "value")
                val additionalInner = mutableListOf<String?>("additional", null)
                val additional = mutableMapOf(
                    "dynamic" to mutableListOf(additionalInner, mutableListOf("second")),
                    "other" to mutableListOf(mutableListOf("other"), mutableListOf("second")),
                )
                val builder = StatefulCollections.Builder()
                builder.requiredList = builderRequired
                builder.requiredNullableSet = builderSet
                builder.optionalNullableList = builderOptional
                builder.optionalMap = builderMap
                builder.additionalProperties = additional
                builderRequired += "mutated"
                builderSet += "mutated"
                builderOptionalInner += "mutated"
                builderMap["mutated"] = "mutated"
                additionalInner += "mutated"
                (builder.requiredList as MutableList<String>) += "getter-mutated"
                (builder.requiredNullableSet as MutableSet<String>) += "getter-mutated"
                val builderOwnedOptional = builder.optionalNullableList as MutableList<List<String?>>
                val builderOwnedMap = builder.optionalMap as MutableMap<String, String>
                val builderOwnedAdditional =
                    builder.additionalProperties as MutableMap<String, List<List<String?>>>
                (builderOwnedOptional.first() as MutableList<String?>) += "getter-mutated"
                builderOwnedMap["getter-mutated"] = "mutated"
                (builderOwnedAdditional.getValue("dynamic").first() as MutableList<String?>) += "getter-mutated"
                builderOwnedAdditional["getter-mutated"] = mutableListOf(mutableListOf("mutated"))
                val stateful = builder.build()

                return listOf(
                    plain.requiredList.joinToString(),
                    plain.requiredSet.joinToString(),
                    plain.optionalMap?.entries?.joinToString { "${'$'}{it.key}=${'$'}{it.value}" },
                    stateful.requiredList.joinToString(),
                    stateful.requiredNullableSet?.joinToString(),
                    stateful.optionalNullableList?.joinToString { it.joinToString() },
                    stateful.optionalMap?.entries?.joinToString { "${'$'}{it.key}=${'$'}{it.value}" },
                    stateful.additionalProperties.getValue("dynamic").first().joinToString(),
                    SdkJson.encodeToString(PlainCollections.Serializer, plain),
                    SdkJson.encodeToString(StatefulCollections.Serializer, stateful),
                ).joinToString("|")
            }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/CollectionOwnershipHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val outcome =
                loader
                    .loadClass("$PACKAGE.CollectionOwnershipHarnessKt")
                    .getMethod("collectionOwnershipOutcome")
            assertEquals(
                "required|required-set|optional=map|builder-required, second|builder-set, second|" +
                    "builder-optional, null, second|" +
                    "builder=map, second=value|additional, null|" +
                    """{"requiredList":["required"],"requiredSet":["required-set"],"optionalMap":{"optional":"map"}}|""" +
                    """{"requiredList":["builder-required","second"],""" +
                    """"requiredNullableSet":["builder-set","second"],""" +
                    """"optionalNullableList":[["builder-optional",null],["second"]],""" +
                    """"optionalMap":{"builder":"map","second":"value"},""" +
                    """"dynamic":[["additional",null],["second"]],""" +
                    """"other":[["other"],["second"]]}""",
                outcome.invoke(null),
            )
        }
    }

    @Test
    fun mixedAdditionalPropertiesModelCompilesWithCollisionSafeCodec() {
        val model =
            ModelDeclaration(
                symbolId = "schema:Filter",
                order = 0,
                packageName = PACKAGE,
                fileName = "Filter",
                resolvedName = "Filter",
                kdoc = "Dynamic filter.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Filter/property:status",
                            order = 0,
                            resolvedName = "status",
                            wireName = "status",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = false,
                            nullable = false,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "filter",
                additionalProperties =
                    AdditionalPropertiesDeclaration(
                        resolvedName = "additionalProperties",
                        valueType = KotlinTypeRef("kotlin", "Int", nullable = true),
                        valuesAreJsonElements = false,
                        fixedWireNames = setOf("status"),
                        kdoc = "Dynamic values.",
                    ),
            )
        val declarations =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                symbolId = "support:serialization",
                                order = 0,
                                packageName = PACKAGE,
                                fileName = "SerializationSupport",
                                resolvedName = "SerializationSupport",
                                kdoc = "",
                                kind = SupportKind.Serialization,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(PACKAGE, "Filter", listOf(model)),
                ),
            )

        val rendered = KotlinPoetEmitter(PACKAGE).render(declarations).files
        val filterSource = rendered.single { file -> file.path.endsWith("/Filter.kt") }.bytes.decodeToString()
        assertTrue(filterSource.contains("value.additionalProperties.keys.sorted().forEach { key ->"))
        assertTrue(filterSource.contains("val additionalValue = value.additionalProperties.getValue(key)"))
        assertFalse(filterSource.contains("toSortedMap()"))
        compileGenerated(rendered)
    }

    @Test
    fun deepObjectEnumAdditionalPropertiesCompileWithWireValueSerialization() {
        val status = KotlinTypeRef(PACKAGE, "Status")
        val filter =
            ModelDeclaration(
                symbolId = "schema:Filter",
                order = 0,
                packageName = PACKAGE,
                fileName = "Filter",
                resolvedName = "Filter",
                kdoc = "Dynamic filter.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Filter/property:fixed",
                            order = 0,
                            resolvedName = "fixed",
                            wireName = "fixed",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = false,
                            nullable = false,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "filter",
                additionalProperties =
                    AdditionalPropertiesDeclaration(
                        resolvedName = "additionalProperties",
                        valueType = status,
                        valuesAreJsonElements = false,
                        fixedWireNames = setOf("fixed"),
                        kdoc = "Dynamic status values.",
                    ),
            )
        val operation =
            OperationDeclaration(
                symbolId = "operation:listWidgets",
                order = 0,
                operationId = "listWidgets",
                method = "GET",
                path = "/widgets",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "listWidgetsRequestCodec",
                responseCodecPropertyName = "listWidgetsResponseCodec",
                requestCodecConstantName = "LIST_WIDGETS_REQUEST_CODEC_ID",
                responseCodecConstantName = "LIST_WIDGETS_RESPONSE_CODEC_ID",
                requestCodecId = "listWidgets.request",
                responseCodecId = "listWidgets.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Lists widgets.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            "filter",
                            OperationParameterLocation.QUERY,
                            KotlinTypeRef(PACKAGE, "Filter"),
                            required = false,
                            style = "deepObject",
                            explode = true,
                            serialization =
                                ParameterSerialization.DeepObject(
                                    properties =
                                        listOf(
                                            DeepObjectParameterPropertyDeclaration(
                                                wireName = "fixed",
                                                accessorName = "fixed",
                                                required = false,
                                            ),
                                        ),
                                    additionalProperties =
                                        DeepObjectAdditionalPropertiesDeclaration(
                                            accessorName = "additionalProperties",
                                            serialization =
                                                DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE,
                                        ),
                                ),
                        ),
                        OperationParameterDeclaration(
                            "requiredFilter",
                            OperationParameterLocation.QUERY,
                            KotlinTypeRef(PACKAGE, "Filter"),
                            required = true,
                            style = "deepObject",
                            explode = true,
                            serialization =
                                ParameterSerialization.DeepObject(
                                    properties = emptyList(),
                                    additionalProperties =
                                        DeepObjectAdditionalPropertiesDeclaration(
                                            accessorName = "additionalProperties",
                                            serialization =
                                                DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE,
                                        ),
                                ),
                        ),
                        OperationParameterDeclaration(
                            "requiredNullableFilter",
                            OperationParameterLocation.QUERY,
                            KotlinTypeRef(PACKAGE, "Filter", nullable = true),
                            required = true,
                            style = "deepObject",
                            explode = true,
                            serialization =
                                ParameterSerialization.DeepObject(
                                    properties = emptyList(),
                                    additionalProperties =
                                        DeepObjectAdditionalPropertiesDeclaration(
                                            accessorName = "additionalProperties",
                                            serialization =
                                                DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE,
                                        ),
                                ),
                        ),
                    ),
            )
        val declarations =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                symbolId = "support:serialization",
                                order = 0,
                                packageName = PACKAGE,
                                fileName = "SerializationSupport",
                                resolvedName = "SerializationSupport",
                                kdoc = "",
                                kind = SupportKind.Serialization,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "Status",
                        listOf(
                            OpenEnumDeclaration(
                                symbolId = "schema:Status",
                                order = 1,
                                packageName = PACKAGE,
                                fileName = "Status",
                                resolvedName = "Status",
                                kdoc = "Status.",
                                values =
                                    listOf(
                                        EnumValueDeclaration(
                                            symbolId = "schema:Status/value:in-progress",
                                            order = 0,
                                            resolvedName = "InProgress",
                                            wireValue = "in-progress",
                                            kdoc = "",
                                        ),
                                    ),
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(PACKAGE, "Filter", listOf(filter)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "WidgetsClient",
                        listOf(
                            OperationClientDeclaration(
                                symbolId = "client:WidgetsClient",
                                order = 0,
                                packageName = PACKAGE,
                                fileName = "WidgetsClient",
                                resolvedName = "WidgetsClient",
                                kdoc = "Widgets client.",
                                codecsObjectName = "WidgetsCodecs",
                                operations = listOf(operation),
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(declarations).files
        val clientSource = rendered.single { it.path.endsWith("/WidgetsClient.kt") }.bytes.decodeToString()
        assertTrue(clientSource.contains("values = listOf(dynamicValue.value)"))
        assertTrue(clientSource.contains("filter?.additionalProperties?.let { dynamicProperties ->"))
        assertTrue(clientSource.contains("requiredFilter.additionalProperties.keys.sorted().forEach { key ->"))
        assertTrue(
            clientSource.contains(
                "requiredNullableFilter?.additionalProperties?.let { dynamicProperties ->",
            ),
        )
        assertTrue(clientSource.contains("dynamicProperties.keys.sorted().forEach { key ->"))
        assertFalse(clientSource.contains("toSortedMap()"))

        val harness =
            """
            package $PACKAGE

            fun inProgressWireValue(): String = Status.InProgress.value
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/DeepObjectEnumHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.DeepObjectEnumHarnessKt")
            assertEquals("in-progress", harnessClass.getMethod("inProgressWireValue").invoke(null))
        }
    }

    @Test
    fun stripeCompatibleIndexedArrayParameterWithHostileNameEmissionCompiles() {
        val operation =
            OperationDeclaration(
                symbolId = "operation:listItems",
                order = 0,
                operationId = "listItems",
                method = "GET",
                path = "/items",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "listItemsRequestCodec",
                responseCodecPropertyName = "listItemsResponseCodec",
                requestCodecConstantName = "LIST_ITEMS_REQUEST_CODEC_ID",
                responseCodecConstantName = "LIST_ITEMS_RESPONSE_CODEC_ID",
                requestCodecId = "listItems.request",
                responseCodecId = "listItems.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Lists items.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            "expand\"\\\\\$name\nnext",
                            OperationParameterLocation.QUERY,
                            KotlinTypeRef(
                                "kotlin.collections",
                                "List",
                                arguments = listOf(KotlinTypeRef("kotlin", "String")),
                            ),
                            required = false,
                            style = "deepObject",
                            explode = true,
                            serialization = ParameterSerialization.StripeCompatibleIndexedArray,
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                symbolId = "support:serialization",
                                order = 0,
                                packageName = PACKAGE,
                                fileName = "SerializationSupport",
                                resolvedName = "SerializationSupport",
                                kdoc = "",
                                kind = SupportKind.Serialization,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "IndexedClient",
                        listOf(
                            OperationClientDeclaration(
                                symbolId = "client:IndexedClient",
                                order = 1,
                                packageName = PACKAGE,
                                fileName = "IndexedClient",
                                resolvedName = "IndexedClient",
                                kdoc = "Indexed parameter client.",
                                codecsObjectName = "IndexedCodecs",
                                operations = listOf(operation),
                            ),
                        ),
                    ),
                ),
            )

        compileGenerated(KotlinPoetEmitter(PACKAGE).render(model).files)
    }

    @Test
    fun affectedGeneratedClientSourcesCompileWithTypedResponsesParametersAndPagination() {
        val string = KotlinTypeRef("kotlin", "String")
        val client =
            OperationClientDeclaration(
                symbolId = "client:CompileClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "CompileClient",
                resolvedName = "CompileClient",
                kdoc = "Compile regression client.",
                codecsObjectName = "CompileCodecs",
                securitySchemes = mapOf("bearer" to OperationSecuritySchemeDeclaration.HttpBearer()),
                operations =
                    listOf(
                        OperationDeclaration(
                            symbolId = "operation:typed",
                            order = 0,
                            operationId = "typed",
                            method = "GET",
                            path = "/typed",
                            requestMediaTypes = emptyList(),
                            responseMediaTypes = emptyList(),
                            successStatusCodes = setOf(200),
                            requestType = KotlinTypeRef("kotlin", "Unit"),
                            responseType = KotlinTypeRef("kotlin", "Unit"),
                            requestCodecPropertyName = "typedRequestCodec",
                            responseCodecPropertyName = "typedResponseCodec",
                            requestCodecConstantName = "TYPED_REQUEST_CODEC_ID",
                            responseCodecConstantName = "TYPED_RESPONSE_CODEC_ID",
                            requestCodecId = "typed.request",
                            responseCodecId = "typed.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(null, null, null),
                            methodKdoc = "Typed response compile regression.",
                            security =
                                listOf(
                                    OperationSecurityRequirement(
                                        listOf(OperationSecuritySchemeRef("bearer")),
                                    ),
                                    OperationSecurityRequirement(emptyList()),
                                ),
                            responseAlternatives =
                                listOf(
                                    OperationResponseAlternative(
                                        ResponseSelectorDeclaration.ExactStatus(200),
                                        emptyList(),
                                        KotlinTypeRef("kotlin", "Unit"),
                                    ),
                                    OperationResponseAlternative(
                                        ResponseSelectorDeclaration.Default,
                                        emptyList(),
                                        KotlinTypeRef("kotlin", "Unit"),
                                    ),
                                ),
                        ),
                        OperationDeclaration(
                            symbolId = "operation:page",
                            order = 1,
                            operationId = "page",
                            method = "GET",
                            path = "/files/{id}",
                            requestMediaTypes = emptyList(),
                            responseMediaTypes = listOf("application/json"),
                            successStatusCodes = setOf(200),
                            requestType = KotlinTypeRef("kotlin", "Unit"),
                            responseType = KotlinTypeRef(PACKAGE, "PageResponse"),
                            requestCodecPropertyName = "pageRequestCodec",
                            responseCodecPropertyName = "pageResponseCodec",
                            requestCodecConstantName = "PAGE_REQUEST_CODEC_ID",
                            responseCodecConstantName = "PAGE_RESPONSE_CODEC_ID",
                            requestCodecId = "page.request",
                            responseCodecId = "page.response",
                            responseMode = OperationResponseMode.BUFFERED,
                            deadlines = OperationDeadlines(null, null, null),
                            methodKdoc = "Pagination compile regression.",
                            parameters =
                                listOf(
                                    OperationParameterDeclaration(
                                        "id",
                                        OperationParameterLocation.PATH,
                                        string,
                                        required = true,
                                    ),
                                    OperationParameterDeclaration(
                                        "cursor",
                                        OperationParameterLocation.QUERY,
                                        string,
                                        required = false,
                                    ),
                                    OperationParameterDeclaration(
                                        "limit",
                                        OperationParameterLocation.QUERY,
                                        KotlinTypeRef("kotlin", "Int"),
                                        required = false,
                                    ),
                                ),
                            pagination =
                                PaginationDeclaration.CursorToken(
                                    requestCursorParam = "cursor",
                                    requestLimitParam = "limit",
                                    responseItemsPath = "data",
                                    responseNextCursorPath = "nextCursor",
                                    itemType = string,
                                ),
                        ),
                    ),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(
                                PACKAGE,
                                "CompileClient",
                                listOf(client),
                            ),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        compileGenerated(
            rendered +
                RenderedKotlinFile(
                    "${PACKAGE.replace('.', '/')}/PageResponse.kt",
                    pageResponseStub().encodeToByteArray(),
                ),
        )
    }

    @Test
    fun operationAndMixedStreamMetadataUsePublicationLazyDelegatesAndCompile() {
        val string = KotlinTypeRef("kotlin", "String")
        val operation =
            OperationDeclaration(
                symbolId = "operation:watchUpdates",
                order = 0,
                operationId = "watchUpdates",
                operationIdentity = "watchUpdates",
                method = "GET",
                path = "/updates",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/json", "text/event-stream"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = string,
                requestCodecPropertyName = "watchUpdatesRequestCodec",
                responseCodecPropertyName = "watchUpdatesResponseCodec",
                requestCodecConstantName = "WATCH_UPDATES_REQUEST_CODEC_ID",
                responseCodecConstantName = "WATCH_UPDATES_RESPONSE_CODEC_ID",
                requestCodecId = "watchUpdates.request",
                responseCodecId = "watchUpdates.response",
                responseMode = OperationResponseMode.MIXED,
                deadlines = OperationDeadlines(null, 30_000, null),
                methodKdoc = "Watches updates.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/json"),
                            string,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(401),
                            listOf("application/json"),
                            string,
                        ),
                    ),
                streaming = StreamingDeclaration.ServerSentEvents("[DONE]", responseContentType = "text/event-stream"),
                streamResponseType = string,
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:MetadataClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "MetadataClient",
                resolvedName = "MetadataClient",
                kdoc = "Metadata compile regression client.",
                codecsObjectName = "MetadataCodecs",
                operations = listOf(operation),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "MetadataClient", listOf(client)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val source = rendered.single { it.path.endsWith("MetadataClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public val metadataStream: OperationMetadata"))
        assertEquals(2, Regex("lazy\\(LazyThreadSafetyMode\\.PUBLICATION\\)").findAll(source).count())
        assertFalse(source.contains("LazyThreadSafetyMode.NONE"))
        compileGenerated(rendered)
    }

    @Test
    fun projectedPlainOptionalNullableFieldsDecodeAbsentNullAndValue() {
        val source =
            Files.createTempFile("sdkgen-plain-optional-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Plain optional, version: "1" }
                    paths:
                      /profiles:
                        get:
                          operationId: getProfile
                          responses:
                            "200":
                              description: ok
                              content:
                                application/json:
                                  schema: { ${'$'}ref: '#/components/schemas/Profile' }
                    components:
                      schemas:
                        Profile:
                          type: object
                          properties:
                            nickname: { type: [string, "null"] }
                            label: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "ProfileClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val profileSource = rendered.single { it.path.endsWith("/Profile.kt") }.bytes.decodeToString()
        assertFalse(profileSource.contains("FieldState"))
        assertTrue(profileSource.contains("if (element == JsonNull) null"))

        val harness =
            """
            package $PACKAGE

            fun decode(raw: String): String {
                val profile = SdkJson.decodeFromString(Profile.Serializer, raw)
                return "${'$'}{profile.nickname ?: "<null>"}|${'$'}{profile.label ?: "<absent>"}"
            }

            fun explicitNullForNonNullableOptionalIsRejected(raw: String): String =
                try {
                    SdkJson.decodeFromString(Profile.Serializer, raw)
                    "accepted"
                } catch (_: Throwable) {
                    "rejected"
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/PlainOptionalHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.PlainOptionalHarnessKt")
            val decode = harnessClass.getMethod("decode", String::class.java)
            assertEquals("<null>|<absent>", decode.invoke(null, "{}"))
            assertEquals("<null>|label", decode.invoke(null, "{\"nickname\":null,\"label\":\"label\"}"))
            assertEquals("nick|label", decode.invoke(null, "{\"nickname\":\"nick\",\"label\":\"label\"}"))

            val reject = harnessClass.getMethod("explicitNullForNonNullableOptionalIsRejected", String::class.java)
            assertEquals("rejected", reject.invoke(null, "{\"label\":null}"))
        }
    }

    @Test
    fun projectedPortableFormatsAndDocumentedOperationParameterCompile() {
        val source =
            Files.createTempFile("sdkgen-portable-formats-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Portable formats, version: "1" }
                    paths:
                      /records:
                        get:
                          operationId: getRecord
                          parameters:
                            - name: id
                              in: query
                              description: Record identifier.
                              schema: { type: string, format: uuid }
                          responses:
                            "200":
                              description: ok
                              content:
                                application/json:
                                  schema: { ${'$'}ref: '#/components/schemas/Record' }
                      /payload:
                        get:
                          operationId: downloadPayload
                          responses:
                            "200":
                              description: ok
                              content:
                                application/octet-stream:
                                  schema: { type: string, format: binary }
                    components:
                      schemas:
                        Record:
                          type: object
                          required: [createdAt, ratio]
                          properties:
                            createdAt: { type: string, format: date-time }
                            ratio: { type: number, format: double }
                            encoded: { type: string, format: byte }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "FormatsClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val client = rendered.single { it.path.endsWith("Client.kt") && "getRecord" in it.bytes.decodeToString() }
        val clientSource = client.bytes.decodeToString()
        val allSources = rendered.joinToString(separator = "\n") { it.bytes.decodeToString() }
        assertTrue(clientSource.contains("@param id Record identifier."))
        assertTrue(clientSource.contains("Wire format: `uuid`. Represented as `String` in this release"))
        assertTrue(allSources.contains("public suspend fun downloadPayload("))
        assertTrue(allSources.contains("SdkByteStream"))
        compileGenerated(rendered)
    }

    @Test
    fun edgeShapeSourcesAvoidKnownKotlinCompilerErrors() {
        val rendered =
            KotlinPoetEmitter(PACKAGE).render(edgeShapeModel()).files.associate {
                it.path to
                    it.bytes.decodeToString()
            }
        val model = rendered.getValue("com/example/generated/AllRequired.kt")
        val firstUnion = rendered.getValue("com/example/generated/ChoiceOne.kt")
        val secondUnion = rendered.getValue("com/example/generated/ChoiceTwo.kt")
        val client = rendered.getValue("com/example/generated/EdgeClient.kt")

        assertFalse(model.contains("public constructor("))
        assertFalse(model.contains("lateinit var count: Int"))
        assertFalse(model.contains("lateinit var enabled: Boolean"))
        assertTrue(model.contains("private var countValue: Int?"))
        assertTrue(model.contains("private var enabledValue: Boolean?"))

        assertTrue(firstUnion.contains("ChoiceOneDecodingException"))
        assertTrue(secondUnion.contains("ChoiceTwoDecodingException"))
        assertFalse(firstUnion.contains("UnionDecodingException"))
        assertFalse(secondUnion.contains("UnionDecodingException"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Status>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Int>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<List<String>>"))
        assertTrue(firstUnion.contains("decodeFromJsonElement<Profile>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Status>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Int>"))
        assertTrue(secondUnion.contains("isJsonDecodable<List<String>>"))
        assertTrue(secondUnion.contains("isJsonDecodable<Profile>"))

        assertTrue(client.contains("Int.serializer()"))
        assertTrue(client.contains("Payload.Serializer.nullable"))
        assertTrue(client.contains("MediaTypeCodecRegistry.of()"))
        assertTrue(client.contains("public suspend fun bodyless(options: CallOptions = CallOptions()): Unit"))
        assertTrue(client.contains("public suspend fun uploadBinary(request: SdkByteStream"))
        assertTrue(
            client.contains("public suspend fun downloadBinary(options: CallOptions = CallOptions()): SdkByteStream"),
        )
        assertFalse(client.contains("SdkByteStream.serializer()"))
        assertFalse(client.contains("Unit.serializer()"))
    }

    @Test
    fun primitiveOneOfEmitsTypedJsonKindDispatchWithoutFallback() {
        val timestamp =
            PrimitiveOneOfDeclaration(
                symbolId = "schema:Timestamp",
                order = 0,
                packageName = PACKAGE,
                fileName = "Timestamp",
                resolvedName = "Timestamp",
                kdoc = "Timestamp primitive union.",
                cases =
                    listOf(
                        PrimitiveOneOfCaseDeclaration(
                            symbolId = "schema:Timestamp/branch:epoch",
                            order = 0,
                            resolvedName = "EpochValue",
                            type = KotlinTypeRef("kotlin", "Long"),
                            jsonKind = PrimitiveOneOfJsonKind.NUMBER,
                        ),
                        PrimitiveOneOfCaseDeclaration(
                            symbolId = "schema:Timestamp/branch:date-time",
                            order = 1,
                            resolvedName = "DateTimeValue",
                            type = KotlinTypeRef("kotlin", "String"),
                            jsonKind = PrimitiveOneOfJsonKind.STRING,
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "Timestamp", listOf(timestamp)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )

        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val source = rendered.single { it.path.endsWith("Timestamp.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public sealed interface Timestamp"))
        assertTrue(source.contains("public val raw: JsonElement"))
        assertTrue(source.contains("element.isJsonSchemaNumber()"))
        assertTrue(source.contains("element is JsonPrimitive && element.isString"))
        assertTrue(source.contains("if (matches.size > 1)"))
        assertFalse(source.contains("Any"))
        val harness =
            """
            package $PACKAGE

            fun classifyTimestamp(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(Timestamp.Serializer, raw)) {
                        is Timestamp.EpochValue -> "epoch"
                        is Timestamp.DateTimeValue -> "date-time"
                    }
                } catch (_: TimestampNoMatchException) {
                    "no-match"
                } catch (_: TimestampAmbiguityException) {
                    "ambiguity"
                }

            fun roundTripTimestamp(raw: String): String =
                SdkJson.encodeToString(Timestamp.Serializer, SdkJson.decodeFromString(Timestamp.Serializer, raw))
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/TimestampHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )
        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.TimestampHarnessKt")
            val classify = harnessClass.getMethod("classifyTimestamp", String::class.java)
            val roundTrip = harnessClass.getMethod("roundTripTimestamp", String::class.java)

            assertEquals("epoch", classify.invoke(null, "1700000000"))
            assertEquals("date-time", classify.invoke(null, "\"2026-07-21T00:00:00Z\""))
            assertEquals("no-match", classify.invoke(null, "true"))
            assertEquals("1700000000", roundTrip.invoke(null, "1700000000"))
        }
    }

    @Test
    fun primitiveOneOfPredicatesEnforceRawJsonSchemaMembershipBeforeDeserialization() {
        val element = KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
        val string = KotlinTypeRef("kotlin", "String")

        fun branch(
            name: String,
            predicate: JsonBranchPredicate,
            type: KotlinTypeRef = element,
        ): PrimitiveOneOfCaseDeclaration =
            PrimitiveOneOfCaseDeclaration(
                symbolId = "schema:$name",
                order = 0,
                resolvedName = name,
                type = type,
                jsonKind =
                    when (predicate) {
                        is JsonBranchPredicate.Kind -> {
                            predicate.kind
                        }

                        is JsonBranchPredicate.AllOf -> {
                            predicate.predicates
                                .filterIsInstance<JsonBranchPredicate.Kind>()
                                .single()
                                .kind
                        }

                        else -> {
                            PrimitiveOneOfJsonKind.STRING
                        }
                    },
                predicate = predicate,
            )

        fun union(
            name: String,
            cases: List<PrimitiveOneOfCaseDeclaration>,
        ): PrimitiveOneOfDeclaration =
            PrimitiveOneOfDeclaration("schema:$name", 0, PACKAGE, name, name, "$name predicate union.", cases)

        fun all(vararg predicates: JsonBranchPredicate): JsonBranchPredicate =
            JsonBranchPredicate.AllOf(predicates.toList())

        val enumAndConst =
            union(
                "EnumAndConst",
                listOf(
                    branch(
                        "Enum",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                            JsonBranchPredicate.Enumeration(
                                listOf(JsonValue.StringValue("ready"), JsonValue.StringValue("pending")),
                            ),
                        ),
                        string,
                    ),
                    branch(
                        "Constant",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                            JsonBranchPredicate.Constant(JsonValue.StringValue("fixed")),
                        ),
                        string,
                    ),
                ),
            )
        val numeric =
            union(
                "Numeric",
                listOf(
                    branch("Integer", JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.INTEGER)),
                    branch(
                        "Half",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.NUMBER),
                            JsonBranchPredicate.Numeric(minimum = "-2.5", maximum = "2.5", multipleOf = "0.5"),
                        ),
                    ),
                ),
            )
        val dates =
            union(
                "Dates",
                listOf(
                    branch(
                        "Date",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                            JsonBranchPredicate.StringShape(format = JsonStringFormat.DATE),
                        ),
                        string,
                    ),
                    branch(
                        "DateTime",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                            JsonBranchPredicate.StringShape(format = JsonStringFormat.DATE_TIME),
                        ),
                        string,
                    ),
                ),
            )
        val lengths =
            union(
                "Lengths",
                listOf(
                    branch(
                        "Short",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                            JsonBranchPredicate.StringShape(minLength = 2, maxLength = 3),
                        ),
                        string,
                    ),
                ),
            )
        val arrays =
            union(
                "Arrays",
                listOf(
                    branch(
                        "IntegerArray",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.ARRAY),
                            JsonBranchPredicate.ArrayShape(
                                minItems = 1,
                                maxItems = 2,
                                uniqueItems = true,
                                item = JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.INTEGER),
                            ),
                        ),
                    ),
                ),
            )
        val closedObject =
            union(
                "ClosedObject",
                listOf(
                    branch(
                        "Identifier",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT),
                            JsonBranchPredicate.ObjectShape(
                                requiredNames = listOf("id"),
                                properties = mapOf("id" to JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING)),
                                additionalProperties = JsonAdditionalPropertiesPredicate.Closed,
                            ),
                        ),
                    ),
                ),
            )
        val openObject =
            union(
                "OpenObject",
                listOf(
                    branch(
                        "Anything",
                        all(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT),
                            JsonBranchPredicate.ObjectShape(
                                requiredNames = emptyList(),
                                properties = emptyMap(),
                                additionalProperties = JsonAdditionalPropertiesPredicate.Open,
                            ),
                        ),
                    ),
                ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "EnumAndConst", listOf(enumAndConst)),
                    KotlinFileDeclaration(PACKAGE, "Numeric", listOf(numeric)),
                    KotlinFileDeclaration(PACKAGE, "Dates", listOf(dates)),
                    KotlinFileDeclaration(PACKAGE, "Lengths", listOf(lengths)),
                    KotlinFileDeclaration(PACKAGE, "Arrays", listOf(arrays)),
                    KotlinFileDeclaration(PACKAGE, "ClosedObject", listOf(closedObject)),
                    KotlinFileDeclaration(PACKAGE, "OpenObject", listOf(openObject)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val harness =
            """
            package $PACKAGE

            fun enumConst(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(EnumAndConst.Serializer, raw)) {
                        is EnumAndConst.Enum -> "Enum"
                        is EnumAndConst.Constant -> "Constant"
                    }
                } catch (_: Throwable) { "no-match" }
            fun numeric(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(Numeric.Serializer, raw)) {
                        is Numeric.Integer -> "Integer"
                        is Numeric.Half -> "Half"
                    }
                } catch (_: NumericAmbiguityException) { "ambiguity" }
                catch (_: Throwable) { "no-match" }
            fun dates(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(Dates.Serializer, raw)) {
                        is Dates.Date -> "Date"
                        is Dates.DateTime -> "DateTime"
                    }
                } catch (_: Throwable) { "no-match" }
            fun lengths(raw: String): String = try { SdkJson.decodeFromString(Lengths.Serializer, raw); "Short" } catch (_: Throwable) { "no-match" }
            fun arrays(raw: String): String = try { SdkJson.decodeFromString(Arrays.Serializer, raw); "IntegerArray" } catch (_: Throwable) { "no-match" }
            fun closed(raw: String): String = try { SdkJson.decodeFromString(ClosedObject.Serializer, raw); "Identifier" } catch (_: Throwable) { "no-match" }
            fun open(raw: String): String = try { SdkJson.decodeFromString(OpenObject.Serializer, raw); "Anything" } catch (_: Throwable) { "no-match" }
            fun roundTrip(raw: String): String = SdkJson.encodeToString(Numeric.Serializer, SdkJson.decodeFromString(Numeric.Serializer, raw))
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile("${PACKAGE.replace('.', '/')}/PredicateHarness.kt", harness.encodeToByteArray()),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.PredicateHarnessKt")

            fun invoke(
                method: String,
                raw: String,
            ): String =
                try {
                    harnessClass.getMethod(method, String::class.java).invoke(null, raw) as String
                } catch (failure: InvocationTargetException) {
                    if (failure.targetException.javaClass.simpleName == "NumericAmbiguityException") {
                        "ambiguity"
                    } else {
                        throw failure
                    }
                }

            assertEquals("Enum", invoke("enumConst", "\"ready\""))
            assertEquals("Constant", invoke("enumConst", "\"fixed\""))
            assertEquals("no-match", invoke("enumConst", "\"unknown\""))
            assertEquals("ambiguity", invoke("numeric", "2.0"))
            assertEquals("ambiguity", invoke("numeric", "2e0"))
            assertEquals("Half", invoke("numeric", "1.5"))
            assertEquals("Half", invoke("numeric", "-1.5"))
            assertEquals("no-match", invoke("numeric", "1.1"))
            assertEquals("Date", invoke("dates", "\"2024-02-29\""))
            assertEquals("DateTime", invoke("dates", "\"2024-02-29T23:59:59Z\""))
            assertEquals("DateTime", invoke("dates", "\"2016-12-31T23:59:60Z\""))
            assertEquals("DateTime", invoke("dates", "\"2017-01-01T00:59:60+01:00\""))
            assertEquals("no-match", invoke("dates", "\"2024-02-29T12:00:60Z\""))
            assertEquals("no-match", invoke("dates", "\"2016-12-31T23:59:60+01:00\""))
            assertEquals("no-match", invoke("dates", "\"2023-02-29\""))
            assertEquals("Short", invoke("lengths", "\"😀a\""))
            assertEquals("no-match", invoke("lengths", "\"a\""))
            assertEquals("IntegerArray", invoke("arrays", "[1,2]"))
            assertEquals("no-match", invoke("arrays", "[1,1.0]"))
            assertEquals("Identifier", invoke("closed", "{\"id\":\"x\"}"))
            assertEquals("no-match", invoke("closed", "{\"id\":\"x\",\"extra\":true}"))
            assertEquals("no-match", invoke("closed", "{}"))
            assertEquals("Anything", invoke("open", "{\"extra\":true}"))
            assertEquals("1.5", invoke("roundTrip", "1.5"))
        }
    }

    @Test
    fun primitiveOneOfNumericPredicatesHandleExtremeExponentsWithoutOverflowOrLinearWork() {
        val element = KotlinTypeRef("kotlinx.serialization.json", "JsonElement")

        fun numericUnion(
            name: String,
            predicate: JsonBranchPredicate,
        ): PrimitiveOneOfDeclaration =
            PrimitiveOneOfDeclaration(
                symbolId = "schema:$name",
                order = 0,
                packageName = PACKAGE,
                fileName = name,
                resolvedName = name,
                kdoc = "Extreme exponent regression.",
                cases =
                    listOf(
                        PrimitiveOneOfCaseDeclaration(
                            "schema:$name/number",
                            0,
                            "NumberValue",
                            element,
                            PrimitiveOneOfJsonKind.NUMBER,
                            JsonBranchPredicate.AllOf(
                                listOf(JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.NUMBER), predicate),
                            ),
                        ),
                    ),
            )
        val integer = numericUnion("ExtremeInteger", JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.INTEGER))
        val lowerBound = numericUnion("ExtremeBound", JsonBranchPredicate.Numeric(minimum = "1"))
        val multiple = numericUnion("ExtremeMultiple", JsonBranchPredicate.Numeric(multipleOf = "1"))
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "ExtremeInteger", listOf(integer)),
                            KotlinFileDeclaration(PACKAGE, "ExtremeBound", listOf(lowerBound)),
                            KotlinFileDeclaration(PACKAGE, "ExtremeMultiple", listOf(multiple)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val harness =
            """
            package $PACKAGE

            fun extremeInteger(raw: String): String = try {
                ExtremeInteger.fromRaw(SdkJson.parseToJsonElement(raw)); "match"
            } catch (_: Throwable) { "no-match" }
            fun extremeBound(raw: String): String = try {
                ExtremeBound.fromRaw(SdkJson.parseToJsonElement(raw)); "match"
            } catch (_: Throwable) { "no-match" }
            fun extremeMultiple(raw: String): String = try {
                ExtremeMultiple.fromRaw(SdkJson.parseToJsonElement(raw)); "match"
            } catch (_: Throwable) { "no-match" }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/ExtremeExponentHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.ExtremeExponentHarnessKt")

            fun invoke(
                method: String,
                raw: String,
            ): String = harnessClass.getMethod(method, String::class.java).invoke(null, raw) as String

            assertEquals("match", invoke("extremeInteger", "1e9223372036854775808"))
            assertEquals("no-match", invoke("extremeInteger", "1e-9223372036854775808"))
            assertEquals("match", invoke("extremeBound", "1e9223372036854775808"))
            assertEquals("no-match", invoke("extremeBound", "1e-9223372036854775808"))
            assertEquals("match", invoke("extremeMultiple", "1e9223372036854775808"))
            assertEquals("no-match", invoke("extremeMultiple", "1e-9223372036854775808"))
        }
    }

    @Test
    fun primitiveOneOfFactoriesRejectValuesOutsideTheirDeclaredBranches() {
        val element = KotlinTypeRef("kotlinx.serialization.json", "JsonElement")
        val string = KotlinTypeRef("kotlin", "String")
        val union =
            PrimitiveOneOfDeclaration(
                symbolId = "schema:FactoryChoice",
                order = 0,
                packageName = PACKAGE,
                fileName = "FactoryChoice",
                resolvedName = "FactoryChoice",
                kdoc = "Factory validation regression.",
                cases =
                    listOf(
                        PrimitiveOneOfCaseDeclaration(
                            "schema:FactoryChoice/enum",
                            0,
                            "EnumValue",
                            string,
                            PrimitiveOneOfJsonKind.STRING,
                            JsonBranchPredicate.AllOf(
                                listOf(
                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                                    JsonBranchPredicate.Enumeration(listOf(JsonValue.StringValue("ready"))),
                                ),
                            ),
                        ),
                        PrimitiveOneOfCaseDeclaration(
                            "schema:FactoryChoice/bounded",
                            1,
                            "BoundedValue",
                            element,
                            PrimitiveOneOfJsonKind.NUMBER,
                            JsonBranchPredicate.AllOf(
                                listOf(
                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.NUMBER),
                                    JsonBranchPredicate.Numeric(minimum = "1", maximum = "2"),
                                ),
                            ),
                        ),
                        PrimitiveOneOfCaseDeclaration(
                            "schema:FactoryChoice/date",
                            2,
                            "DateValue",
                            string,
                            PrimitiveOneOfJsonKind.STRING,
                            JsonBranchPredicate.AllOf(
                                listOf(
                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                                    JsonBranchPredicate.StringShape(format = JsonStringFormat.DATE),
                                ),
                            ),
                        ),
                        PrimitiveOneOfCaseDeclaration(
                            "schema:FactoryChoice/array",
                            3,
                            "ArrayValue",
                            element,
                            PrimitiveOneOfJsonKind.ARRAY,
                            JsonBranchPredicate.AllOf(
                                listOf(
                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.ARRAY),
                                    JsonBranchPredicate.ArrayShape(minItems = 1),
                                ),
                            ),
                        ),
                        PrimitiveOneOfCaseDeclaration(
                            "schema:FactoryChoice/object",
                            4,
                            "ObjectValue",
                            element,
                            PrimitiveOneOfJsonKind.OBJECT,
                            JsonBranchPredicate.AllOf(
                                listOf(
                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT),
                                    JsonBranchPredicate.ObjectShape(
                                        requiredNames = listOf("id"),
                                        properties = emptyMap(),
                                        additionalProperties = JsonAdditionalPropertiesPredicate.Open,
                                    ),
                                ),
                            ),
                        ),
                    ),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "FactoryChoice", listOf(union)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val harness =
            """
            package $PACKAGE

            fun factoryOutcome(name: String): String =
                try {
                    when (name) {
                        "bad-enum" -> FactoryChoice.EnumValue.of("other")
                        "good-enum" -> FactoryChoice.EnumValue.of("ready")
                        "bad-bound" -> FactoryChoice.BoundedValue.of(SdkJson.parseToJsonElement("0"))
                        "bad-date" -> FactoryChoice.DateValue.of("2023-02-29")
                        "bad-array" -> FactoryChoice.ArrayValue.of(SdkJson.parseToJsonElement("[]"))
                        "bad-object" -> FactoryChoice.ObjectValue.of(SdkJson.parseToJsonElement("{}"))
                        else -> error("unknown")
                    }
                    "accepted"
                } catch (_: FactoryChoiceBranchValidationException) {
                    "rejected"
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/FactoryHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val outcome = loader.loadClass("$PACKAGE.FactoryHarnessKt").getMethod("factoryOutcome", String::class.java)
            assertEquals("rejected", outcome.invoke(null, "bad-enum"))
            assertEquals("accepted", outcome.invoke(null, "good-enum"))
            assertEquals("rejected", outcome.invoke(null, "bad-bound"))
            assertEquals("rejected", outcome.invoke(null, "bad-date"))
            assertEquals("rejected", outcome.invoke(null, "bad-array"))
            assertEquals("rejected", outcome.invoke(null, "bad-object"))
        }
    }

    @Test
    fun objectOneOfFactoriesRejectValuesOutsideTheirSelectedRawJsonBranch() {
        val string = KotlinTypeRef("kotlin", "String")

        fun branch(
            name: String,
            value: String,
        ): OneOfCaseDeclaration =
            OneOfCaseDeclaration(
                symbolId = "schema:CheckRun/$name",
                order = if (name == "Completed") 0 else 1,
                resolvedName = name,
                requiredFields = listOf(UnionFieldDeclaration("type", "type", string)),
                matchFields =
                    listOf(
                        UnionFieldDeclaration(
                            "type",
                            "type",
                            string,
                            expectedStringValue = value,
                        ),
                    ),
                predicate =
                    JsonBranchPredicate.AllOf(
                        listOf(
                            JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT),
                            JsonBranchPredicate.ObjectShape(
                                requiredNames = listOf("type"),
                                properties =
                                    mapOf(
                                        "type" to
                                            JsonBranchPredicate.AllOf(
                                                listOf(
                                                    JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                                                    if (value == "completed") {
                                                        JsonBranchPredicate.Constant(JsonValue.StringValue(value))
                                                    } else {
                                                        JsonBranchPredicate.Enumeration(
                                                            listOf(JsonValue.StringValue(value)),
                                                        )
                                                    },
                                                ),
                                            ),
                                    ),
                                additionalProperties = JsonAdditionalPropertiesPredicate.Closed,
                            ),
                        ),
                    ),
            )
        val choice =
            OneOfDeclaration(
                symbolId = "schema:CheckRun",
                order = 0,
                packageName = PACKAGE,
                fileName = "CheckRun",
                resolvedName = "CheckRun",
                kdoc = "Object oneOf factory validation regression.",
                cases = listOf(branch("Completed", "completed"), branch("Queued", "queued")),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "CheckRun", listOf(choice)),
                            KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                        ),
                    ),
                ).files
        val harness =
            """
            package $PACKAGE

            fun checkRunFactory(value: String): String =
                try {
                    val result = CheckRun.Completed.of(value)
                    val roundTripped = SdkJson.decodeFromString(CheckRun.Serializer, SdkJson.encodeToString(CheckRun.Serializer, result))
                    if (roundTripped is CheckRun.Completed && roundTripped.type == value) "round-trip" else "wrong-branch"
                } catch (failure: Throwable) {
                    failure::class.simpleName.orEmpty()
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/CheckRunFactoryHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val factory =
                loader
                    .loadClass(
                        "$PACKAGE.CheckRunFactoryHarnessKt",
                    ).getMethod("checkRunFactory", String::class.java)
            assertEquals("round-trip", factory.invoke(null, "completed"))
            assertEquals("CheckRunBranchValidationException", factory.invoke(null, "queued"))
            assertEquals("CheckRunNoMatchException", factory.invoke(null, "unknown"))
        }
    }

    @Test
    fun requiredNullableOneOfFieldsRequirePresenceAndSuccessfulDecode() {
        val nullableString = KotlinTypeRef("kotlin", "String", nullable = true)
        val choice =
            OneOfDeclaration(
                symbolId = "schema:NullableChoice",
                order = 0,
                packageName = PACKAGE,
                fileName = "NullableChoice",
                resolvedName = "NullableChoice",
                kdoc = "Required nullable oneOf compile regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:NullableChoice/nullable",
                            order = 0,
                            resolvedName = "NullableValue",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        resolvedName = "value",
                                        wireName = "value",
                                        type = nullableString,
                                    ),
                                ),
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "NullableChoice", listOf(choice)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val source = rendered.single { it.path.endsWith("NullableChoice.kt") }.bytes.decodeToString()

        assertTrue(source.contains("val valueResult = rawObject[\"value\"]?.let"))
        assertTrue(source.contains("val valuePresent = rawObject.containsKey(\"value\")"))
        assertTrue(source.contains("val valueDecoded = valueResult?.isSuccess == true"))
        assertTrue(source.contains("valuePresent && valueDecoded"))
        assertTrue(source.contains("value = matches.value"))
        compileGenerated(rendered)
    }

    @Test
    fun oneOfSerializerDecodesRequiredFieldsNotUsedForMatching() {
        val string = KotlinTypeRef("kotlin", "String")
        val choice =
            OneOfDeclaration(
                symbolId = "schema:DiscriminatedPayloadChoice",
                order = 0,
                packageName = PACKAGE,
                fileName = "DiscriminatedPayloadChoice",
                resolvedName = "DiscriminatedPayloadChoice",
                kdoc = "Required payload oneOf compile regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:DiscriminatedPayloadChoice/a",
                            order = 0,
                            resolvedName = "TypeA",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("type", "type", string),
                                    UnionFieldDeclaration("payload", "payload", string),
                                ),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        "type",
                                        "type",
                                        string,
                                        expectedStringValue = "a",
                                        expectedStringValues = listOf("a"),
                                    ),
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:DiscriminatedPayloadChoice/b",
                            order = 1,
                            resolvedName = "TypeB",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("type", "type", string),
                                    UnionFieldDeclaration("payload", "payload", string),
                                ),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        "type",
                                        "type",
                                        string,
                                        expectedStringValue = "b",
                                        expectedStringValues = listOf("b"),
                                    ),
                                ),
                        ),
                    ),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "DiscriminatedPayloadChoice", listOf(choice)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )

        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val source = rendered.single { it.path.endsWith("DiscriminatedPayloadChoice.kt") }.bytes.decodeToString()

        assertTrue(source.contains("val payloadResult = rawObject[\"payload\"]?.let"))
        compileGenerated(rendered)
    }

    @Test
    fun sharedOneOfFieldShapesRemainQualifiedAcrossBranchOrdersAndDecodeSemantics() {
        val string = KotlinTypeRef("kotlin", "String")
        val nullableString = string.copy(nullable = true)

        fun branch(
            name: String,
            order: Int,
            type: KotlinTypeRef,
        ): OneOfCaseDeclaration =
            OneOfCaseDeclaration(
                symbolId = "schema:SharedValue/$name",
                order = order,
                resolvedName = name,
                requiredFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = type,
                        ),
                    ),
            )

        fun union(
            name: String,
            cases: List<OneOfCaseDeclaration>,
        ): OneOfDeclaration =
            OneOfDeclaration(
                symbolId = "schema:$name",
                order = 0,
                packageName = PACKAGE,
                fileName = name,
                resolvedName = name,
                kdoc = "Shared oneOf value regression.",
                cases = cases,
            )

        fun discriminatorBranch(
            name: String,
            order: Int,
            expected: List<String>,
        ): OneOfCaseDeclaration =
            OneOfCaseDeclaration(
                symbolId = "schema:SharedValueDiscriminator/$name",
                order = order,
                resolvedName = name,
                requiredFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = string,
                        ),
                    ),
                matchFields =
                    listOf(
                        UnionFieldDeclaration(
                            resolvedName = "value",
                            wireName = "value",
                            type = string,
                            expectedStringValue = expected.singleOrNull(),
                            expectedStringValues = expected,
                        ),
                    ),
            )

        val forward =
            union(
                "SharedValueForward",
                listOf(
                    branch("StringValue", 0, string),
                    branch("NullableValue", 1, nullableString),
                ),
            )
        val reverse =
            union(
                "SharedValueReverse",
                listOf(
                    branch("NullableValue", 0, nullableString),
                    branch("StringValue", 1, string),
                ),
            )
        val discriminator =
            union(
                "SharedValueDiscriminator",
                listOf(
                    discriminatorBranch("Alpha", 0, listOf("a")),
                    discriminatorBranch("Beta", 1, listOf("b", "c")),
                ),
            )
        val emptyObject =
            union(
                "EmptyObjectActor",
                listOf(
                    OneOfCaseDeclaration(
                        symbolId = "schema:EmptyObjectActor/Empty",
                        order = 0,
                        resolvedName = "Empty",
                        requiredFields = emptyList(),
                        matchFields = emptyList(),
                        matchesEmptyObject = true,
                    ),
                    OneOfCaseDeclaration(
                        symbolId = "schema:EmptyObjectActor/User",
                        order = 1,
                        resolvedName = "User",
                        requiredFields = listOf(UnionFieldDeclaration("id", "id", KotlinTypeRef("kotlin", "Long"))),
                    ),
                ),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "SharedValueForward", listOf(forward)),
                    KotlinFileDeclaration(PACKAGE, "SharedValueReverse", listOf(reverse)),
                    KotlinFileDeclaration(PACKAGE, "SharedValueDiscriminator", listOf(discriminator)),
                    KotlinFileDeclaration(PACKAGE, "EmptyObjectActor", listOf(emptyObject)),
                    KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val forwardSource = rendered.single { it.path.endsWith("SharedValueForward.kt") }.bytes.decodeToString()
        val reverseSource = rendered.single { it.path.endsWith("SharedValueReverse.kt") }.bytes.decodeToString()

        listOf(forwardSource, reverseSource).forEach { source ->
            assertTrue(source.contains("decodeFromJsonElement<String>(element)"))
            assertTrue(source.contains("decodeFromJsonElement<String?>(element)"))
            assertTrue(source.contains("valueState1Result"))
            assertTrue(source.contains("valueState2Result"))
            assertTrue(source.contains("valueState2Present"))
            assertFalse(source.contains("valueState1Present"))
            assertTrue(source.contains("matches.stringValueMatches"))
            assertTrue(source.contains("matches.nullableValueMatches"))
        }

        val harness =
            """
            package $PACKAGE

            private fun classifyForward(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueForward.Serializer, raw)) {
                        is SharedValueForward.StringValue -> "non-nullable"
                        is SharedValueForward.NullableValue -> "nullable"
                        else -> "unknown"
                    }
                } catch (_: SharedValueForwardAmbiguityException) {
                    "ambiguity"
                } catch (_: SharedValueForwardNoMatchException) {
                    "no-match"
                }

            fun forward(raw: String): String = classifyForward(raw)

            fun discriminator(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueDiscriminator.Serializer, raw)) {
                        is SharedValueDiscriminator.Alpha -> "alpha"
                        is SharedValueDiscriminator.Beta -> "beta"
                        else -> "unknown"
                    }
                } catch (_: SharedValueDiscriminatorNoMatchException) {
                    "no-match"
                }

            fun emptyActor(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(EmptyObjectActor.Serializer, raw)) {
                        is EmptyObjectActor.Empty -> "empty"
                        is EmptyObjectActor.User -> "user"
                        else -> "unknown"
                    }
                } catch (_: EmptyObjectActorNoMatchException) {
                    "no-match"
                } catch (_: EmptyObjectActorAmbiguityException) {
                    "ambiguity"
                }

            private fun classifyReverse(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(SharedValueReverse.Serializer, raw)) {
                        is SharedValueReverse.StringValue -> "non-nullable"
                        is SharedValueReverse.NullableValue -> "nullable"
                        else -> "unknown"
                    }
                } catch (_: SharedValueReverseAmbiguityException) {
                    "ambiguity"
                } catch (_: SharedValueReverseNoMatchException) {
                    "no-match"
                }

            fun reverse(raw: String): String = classifyReverse(raw)
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/SharedValueHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.SharedValueHarnessKt")

            fun assertCases(methodName: String) {
                val method = harnessClass.getMethod(methodName, String::class.java)
                assertEquals("nullable", method.invoke(null, "{\"value\":null}"))
                assertEquals("no-match", method.invoke(null, "{}"))
                assertEquals("no-match", method.invoke(null, "{\"value\":7}"))
                assertEquals("ambiguity", method.invoke(null, "{\"value\":\"ok\"}"))
            }

            assertCases("forward")
            assertCases("reverse")

            val discriminator = harnessClass.getMethod("discriminator", String::class.java)
            assertEquals("alpha", discriminator.invoke(null, "{\"value\":\"a\"}"))
            assertEquals("beta", discriminator.invoke(null, "{\"value\":\"b\"}"))
            assertEquals("beta", discriminator.invoke(null, "{\"value\":\"c\"}"))
            assertEquals("no-match", discriminator.invoke(null, "{\"value\":\"d\"}"))

            val emptyActor = harnessClass.getMethod("emptyActor", String::class.java)
            assertEquals("empty", emptyActor.invoke(null, "{}"))
            assertEquals("user", emptyActor.invoke(null, "{\"id\":1}"))
            assertEquals("no-match", emptyActor.invoke(null, "{\"other\":1}"))
        }
    }

    @Test
    fun oneOfInspectionNamesAvoidStateHelperAndFixedMemberCollisions() {
        val string = KotlinTypeRef("kotlin", "String")
        val nullableString = string.copy(nullable = true)
        val valueCollision =
            OneOfDeclaration(
                symbolId = "schema:ValueCollision",
                order = 0,
                packageName = PACKAGE,
                fileName = "ValueCollision",
                resolvedName = "ValueCollision",
                kdoc = "Value/helper name collision regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:ValueCollision/foo",
                            order = 0,
                            resolvedName = "Foo",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("foo", "foo", nullableString),
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:ValueCollision/fooDecoded",
                            order = 1,
                            resolvedName = "FooDecoded",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("fooDecoded", "foo_decoded", string),
                                ),
                        ),
                    ),
            )
        val inspectionCollision =
            OneOfDeclaration(
                symbolId = "schema:InspectionCollision",
                order = 0,
                packageName = PACKAGE,
                fileName = "InspectionCollision",
                resolvedName = "InspectionCollision",
                kdoc = "Inspection member name collision regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:InspectionCollision/alpha",
                            order = 0,
                            resolvedName = "Alpha",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("failures", "failures", string),
                                ),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration("alpha", "alpha", nullableString, expectedStringValue = "a"),
                                    UnionFieldDeclaration("alphaResult", "alpha_result", string),
                                    UnionFieldDeclaration("alphaPresent", "alpha_present", string),
                                    UnionFieldDeclaration("alphaMatches", "alpha_matches", string),
                                    UnionFieldDeclaration("failures", "failures", string),
                                    UnionFieldDeclaration("names", "names", string),
                                    UnionFieldDeclaration("raw", "raw", string),
                                    UnionFieldDeclaration("size", "size", string),
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:InspectionCollision/beta",
                            order = 1,
                            resolvedName = "Beta",
                            requiredFields = emptyList(),
                            matchFields =
                                listOf(
                                    UnionFieldDeclaration("beta", "beta", string, expectedStringValue = "b"),
                                ),
                        ),
                    ),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "ValueCollision", listOf(valueCollision)),
                    KotlinFileDeclaration(PACKAGE, "InspectionCollision", listOf(inspectionCollision)),
                    KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val rerendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val valueSource = rendered.single { it.path.endsWith("ValueCollision.kt") }.bytes.decodeToString()
        val inspectionSource = rendered.single { it.path.endsWith("InspectionCollision.kt") }.bytes.decodeToString()

        assertEquals(
            rendered.map { it.path to it.bytes.decodeToString() },
            rerendered.map { it.path to it.bytes.decodeToString() },
        )
        assertTrue(valueSource.contains("rawObject[\"foo\"]"))
        assertTrue(valueSource.contains("rawObject[\"foo_decoded\"]"))
        listOf("alpha", "alpha_result", "alpha_present", "alpha_matches", "failures", "names", "raw", "size")
            .forEach {
                assertTrue(inspectionSource.contains("rawObject[\"$it\"]"))
            }

        val harness =
            """
            package $PACKAGE

            fun valueCollision(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(ValueCollision.Serializer, raw)) {
                        is ValueCollision.Foo -> "foo"
                        is ValueCollision.FooDecoded -> "foo-decoded"
                        else -> "unknown"
                    }
                } catch (_: ValueCollisionNoMatchException) {
                    "no-match"
                }

            fun inspectionCollision(raw: String): String =
                try {
                    when (SdkJson.decodeFromString(InspectionCollision.Serializer, raw)) {
                        is InspectionCollision.Alpha -> "alpha"
                        is InspectionCollision.Beta -> "beta"
                        else -> "unknown"
                    }
                } catch (_: InspectionCollisionNoMatchException) {
                    "no-match"
                }
            """.trimIndent()
        val output =
            compileGenerated(
                rendered +
                    RenderedKotlinFile(
                        "${PACKAGE.replace('.', '/')}/CollisionHarness.kt",
                        harness.encodeToByteArray(),
                    ),
            )

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harnessClass = loader.loadClass("$PACKAGE.CollisionHarnessKt")
            val valueMethod = harnessClass.getMethod("valueCollision", String::class.java)
            assertEquals("foo", valueMethod.invoke(null, "{\"foo\":null}"))
            assertEquals("foo-decoded", valueMethod.invoke(null, "{\"foo_decoded\":\"ok\"}"))
            assertEquals("no-match", valueMethod.invoke(null, "{}"))

            val inspectionMethod = harnessClass.getMethod("inspectionCollision", String::class.java)
            assertEquals(
                "alpha",
                inspectionMethod.invoke(
                    null,
                    "{\"alpha\":\"a\",\"alpha_result\":\"r\",\"alpha_present\":\"p\"," +
                        "\"alpha_matches\":\"m\",\"failures\":\"f\",\"names\":\"n\"," +
                        "\"raw\":\"r\",\"size\":\"s\"}",
                ),
            )
            assertEquals("no-match", inspectionMethod.invoke(null, "{\"alpha\":\"a\"}"))
            assertEquals("beta", inspectionMethod.invoke(null, "{\"beta\":\"b\"}"))
        }
    }

    @Test
    fun binarySuccessWithTypedErrorAlternativesCompilesWithExactRangeDefaultAndUnknownViews() {
        val operation =
            OperationDeclaration(
                symbolId = "operation:downloadBinary",
                order = 0,
                operationId = "downloadBinary",
                method = "GET",
                path = "/files/{id}",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                requestCodecPropertyName = "downloadBinaryRequestCodec",
                responseCodecPropertyName = "downloadBinaryResponseCodec",
                requestCodecConstantName = "DOWNLOAD_BINARY_REQUEST_CODEC_ID",
                responseCodecConstantName = "DOWNLOAD_BINARY_RESPONSE_CODEC_ID",
                requestCodecId = "downloadBinary.request",
                responseCodecId = "downloadBinary.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Downloads a binary response.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/octet-stream"),
                            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.StatusRange(400, 499),
                            listOf("application/json"),
                            KotlinTypeRef("kotlin", "String"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.Default,
                            emptyList(),
                            KotlinTypeRef("kotlin", "Unit"),
                        ),
                    ),
            )
        val customNonTwoXxSuccess =
            OperationDeclaration(
                symbolId = "operation:downloadNotModified",
                order = 1,
                operationId = "downloadNotModified",
                method = "GET",
                path = "/files/cached",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(304),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                requestCodecPropertyName = "downloadNotModifiedRequestCodec",
                responseCodecPropertyName = "downloadNotModifiedResponseCodec",
                requestCodecConstantName = "DOWNLOAD_NOT_MODIFIED_REQUEST_CODEC_ID",
                responseCodecConstantName = "DOWNLOAD_NOT_MODIFIED_RESPONSE_CODEC_ID",
                requestCodecId = "downloadNotModified.request",
                responseCodecId = "downloadNotModified.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Downloads an explicitly successful cached response.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(304),
                            listOf("application/octet-stream"),
                            KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                        ),
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:BinaryClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "BinaryClient",
                resolvedName = "BinaryClient",
                kdoc = "Binary response compile regression client.",
                codecsObjectName = "BinaryCodecs",
                operations = listOf(operation, customNonTwoXxSuccess),
            )
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(PACKAGE, "BinaryClient", listOf(client)),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                0,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(model).files
        val source = rendered.single { it.path.endsWith("BinaryClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public suspend fun downloadBinaryWithResponse("))
        assertTrue(source.contains("public class SuccessOctetStream("))
        assertTrue(source.contains("public class Http400To499Json("))
        assertTrue(source.contains("public class DefaultNoContent("))
        assertTrue(source.contains("public class Unknown("))
        assertTrue(source.contains("SdkResponseDecodeResult<DownloadBinaryResponse>"))
        assertTrue(source.contains("alternative.id == \"downloadBinary.response.alternative0\""))
        assertTrue(source.contains("bytes = body"))
        assertTrue(source.contains("transferBody = true"))
        assertTrue(source.contains("public suspend fun downloadNotModifiedWithResponse("))
        assertTrue(source.contains("alternative.id == \"downloadNotModified.response.alternative0\""))
        assertTrue(source.contains("successStatusCodes = setOf(304)"))
        assertFalse(source.contains("SdkByteStream.serializer()"))
        assertFalse(source.contains("io.ktor"))
        assertFalse(source.contains("okhttp3"))
        compileGenerated(rendered)
    }

    @Test
    fun ergonomicMethodCompilesWithDiscoverableTypedExceptionsForMultipleErrorAlternatives() {
        val operation =
            OperationDeclaration(
                symbolId = "operation:createWidget",
                order = 0,
                operationId = "createWidget",
                method = "POST",
                path = "/widgets",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "String"),
                requestCodecPropertyName = "createWidgetRequestCodec",
                responseCodecPropertyName = "createWidgetResponseCodec",
                requestCodecConstantName = "CREATE_WIDGET_REQUEST_CODEC_ID",
                responseCodecConstantName = "CREATE_WIDGET_RESPONSE_CODEC_ID",
                requestCodecId = "createWidget.request",
                responseCodecId = "createWidget.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Creates a widget.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/json"),
                            KotlinTypeRef("kotlin", "String"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(400),
                            listOf("application/json"),
                            KotlinTypeRef("kotlin", "String"),
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(422),
                            emptyList(),
                            KotlinTypeRef("kotlin", "Unit"),
                        ),
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:WidgetClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "WidgetClient",
                resolvedName = "WidgetClient",
                kdoc = "Widget client.",
                codecsObjectName = "WidgetCodecs",
                operations = listOf(operation),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "WidgetClient", listOf(client)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val source = rendered.single { it.path.endsWith("WidgetClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public suspend fun createWidget("))
        assertTrue(source.contains("public sealed interface CreateWidgetError"))
        assertTrue(source.contains("public class CreateWidgetApiException("))
        assertTrue(source.contains("public val error: CreateWidgetError"))
        assertTrue(source.contains(") : SdkApiException(statusCode, headers, \"createWidget\")"))
        assertTrue(source.contains("@throws CreateWidgetApiException"))
        assertTrue(source.contains("decoded CreateWidgetError payload"))
        assertTrue(
            Regex(
                """executor\.executeWithTypedErrors<Unit,\s+CreateWidgetResponse,\s+String>""",
            ).containsMatchIn(source),
        )
        assertTrue(
            Regex(
                """public class Http400Json\([\s\S]*?\) : CreateWidgetResponse,\s+CreateWidgetError""",
            ).containsMatchIn(source),
        )
        assertTrue(
            Regex(
                """public class Http422NoContent\([\s\S]*?\) : CreateWidgetResponse,\s+CreateWidgetError""",
            ).containsMatchIn(source),
        )
        compileGenerated(rendered)
    }

    @Test
    fun compatibleStreamingAlternativesCompileWithTheCallableStreamingMethod() {
        val string = KotlinTypeRef("kotlin", "String")
        val operation =
            OperationDeclaration(
                symbolId = "operation:streamVariants",
                order = 0,
                operationId = "streamVariants",
                method = "GET",
                path = "/stream",
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("text/event-stream", "application/x-ndjson"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = string,
                requestCodecPropertyName = "streamVariantsRequestCodec",
                responseCodecPropertyName = "streamVariantsResponseCodec",
                requestCodecConstantName = "STREAM_VARIANTS_REQUEST_CODEC_ID",
                responseCodecConstantName = "STREAM_VARIANTS_RESPONSE_CODEC_ID",
                requestCodecId = "streamVariants.request",
                responseCodecId = "streamVariants.response",
                responseMode = OperationResponseMode.STREAMING,
                deadlines = OperationDeadlines(null, 30_000, null),
                methodKdoc = "Streams compatible variants.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("text/event-stream"),
                            string,
                            OperationResponseMode.STREAMING,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/x-ndjson"),
                            string,
                            OperationResponseMode.STREAMING,
                        ),
                    ),
                streaming = StreamingDeclaration.ServerSentEvents("[DONE]"),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:StreamingClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "StreamingClient",
                resolvedName = "StreamingClient",
                kdoc = "Streaming compile regression client.",
                codecsObjectName = "StreamingCodecs",
                operations = listOf(operation),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "StreamingClient", listOf(client)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val source = rendered.single { it.path.endsWith("StreamingClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public fun streamVariants("))
        assertTrue(source.contains("): Flow<String>"))
        assertFalse(source.contains("public suspend fun streamVariantsWithResponse("))
        compileGenerated(rendered)
    }

    @Test
    fun incompatibleJsonAndBinarySuccessesCompileWithOnlyTypedResponseApisInEitherOrder() {
        val string = KotlinTypeRef("kotlin", "String")
        val binary = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val jsonAlternative =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/json"),
                string,
            )
        val binaryAlternative =
            OperationResponseAlternative(
                ResponseSelectorDeclaration.ExactStatus(200),
                listOf("application/octet-stream"),
                binary,
            )
        val operations =
            listOf(
                "jsonFirst" to listOf(jsonAlternative, binaryAlternative),
                "binaryFirst" to listOf(binaryAlternative, jsonAlternative),
            ).mapIndexed { index, (operationId, alternatives) ->
                OperationDeclaration(
                    symbolId = "operation:$operationId",
                    order = index,
                    operationId = operationId,
                    method = "GET",
                    path = "/$operationId",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = listOf("application/json", "application/octet-stream"),
                    successStatusCodes = setOf(200),
                    requestType = KotlinTypeRef("kotlin", "Unit"),
                    responseType = alternatives.first().type,
                    requestCodecPropertyName = "${operationId}RequestCodec",
                    responseCodecPropertyName = "${operationId}ResponseCodec",
                    requestCodecConstantName = "${operationId.uppercase()}_REQUEST_CODEC_ID",
                    responseCodecConstantName = "${operationId.uppercase()}_RESPONSE_CODEC_ID",
                    requestCodecId = "$operationId.request",
                    responseCodecId = "$operationId.response",
                    responseMode = OperationResponseMode.BUFFERED,
                    deadlines = OperationDeadlines(null, null, null),
                    methodKdoc = "Returns JSON or binary content.",
                    responseAlternatives = alternatives,
                    pagination =
                        PaginationDeclaration.CursorToken(
                            requestCursorParam = "cursor",
                            requestLimitParam = null,
                            responseItemsPath = "items",
                            responseNextCursorPath = "nextCursor",
                            itemType = string,
                        ),
                )
            }
        val client =
            OperationClientDeclaration(
                symbolId = "client:MixedMediaClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "MixedMediaClient",
                resolvedName = "MixedMediaClient",
                kdoc = "Mixed-media success compile regression client.",
                codecsObjectName = "MixedMediaCodecs",
                operations = operations,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "MixedMediaClient", listOf(client)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val source = rendered.single { it.path.endsWith("MixedMediaClient.kt") }.bytes.decodeToString()

        assertTrue(source.contains("public suspend fun jsonFirstWithResponse("))
        assertTrue(source.contains("public suspend fun binaryFirstWithResponse("))
        assertFalse(source.contains("public suspend fun jsonFirst("))
        assertFalse(source.contains("public suspend fun binaryFirst("))
        assertFalse(source.contains("public fun jsonFirstPages("))
        assertFalse(source.contains("public fun binaryFirstPages("))
        compileGenerated(rendered)
    }

    @Test
    fun renamedModelReferencesCompileAcrossModelsUnionsOperationsAndDerivedTypes() {
        val child = KotlinTypeRef(PACKAGE, "Child")
        val childList = KotlinTypeRef("kotlin.collections", "List", listOf(child))
        val childModel =
            ModelDeclaration(
                symbolId = "schema:Child",
                order = 0,
                packageName = PACKAGE,
                fileName = "Child",
                resolvedName = "Child",
                kdoc = "Child model.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Child/value",
                            order = 0,
                            resolvedName = "value",
                            wireName = "value",
                            type = KotlinTypeRef("kotlin", "String"),
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "child",
            )
        val parentModel =
            ModelDeclaration(
                symbolId = "schema:Parent",
                order = 1,
                packageName = PACKAGE,
                fileName = "Parent",
                resolvedName = "Parent",
                kdoc = "Parent model referencing Child.",
                fields =
                    listOf(
                        FieldDeclaration(
                            symbolId = "schema:Parent/child",
                            order = 0,
                            resolvedName = "child",
                            wireName = "child",
                            type = child,
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                        FieldDeclaration(
                            symbolId = "schema:Parent/children",
                            order = 1,
                            resolvedName = "children",
                            wireName = "children",
                            type = childList,
                            required = true,
                            nullable = false,
                            kdoc = "",
                        ),
                        FieldDeclaration(
                            symbolId = "schema:Parent/nextCursor",
                            order = 2,
                            resolvedName = "nextCursor",
                            wireName = "nextCursor",
                            type = KotlinTypeRef("kotlin", "String", nullable = true),
                            required = false,
                            nullable = true,
                            kdoc = "",
                        ),
                    ),
                dslFunctionName = "parent",
            )
        val choice =
            OneOfDeclaration(
                symbolId = "schema:Choice",
                order = 2,
                packageName = PACKAGE,
                fileName = "Choice",
                resolvedName = "Choice",
                kdoc = "Union referencing Child.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:Choice/child",
                            order = 0,
                            resolvedName = "ChildValue",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration(
                                        resolvedName = "child",
                                        wireName = "child",
                                        type = child,
                                    ),
                                ),
                        ),
                    ),
            )
        val operation =
            OperationDeclaration(
                symbolId = "operation:search",
                order = 0,
                operationId = "search",
                method = "POST",
                path = "/search",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = childList,
                responseType = KotlinTypeRef(PACKAGE, "Parent"),
                requestCodecPropertyName = "searchRequestCodec",
                responseCodecPropertyName = "searchResponseCodec",
                requestCodecConstantName = "SEARCH_REQUEST_CODEC_ID",
                responseCodecConstantName = "SEARCH_RESPONSE_CODEC_ID",
                requestCodecId = "search.request",
                responseCodecId = "search.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Searches using renamed model references.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            name = "child",
                            location = OperationParameterLocation.QUERY,
                            type = child,
                            required = false,
                        ),
                    ),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative(
                            mediaType = "application/json",
                            type = childList,
                            required = true,
                        ),
                    ),
                requestBodyRequired = true,
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            selector = ResponseSelectorDeclaration.ExactStatus(200),
                            mediaTypes = listOf("application/json"),
                            type = KotlinTypeRef(PACKAGE, "Parent"),
                        ),
                    ),
                pagination =
                    PaginationDeclaration.CursorToken(
                        requestCursorParam = "cursor",
                        requestLimitParam = null,
                        responseItemsPath = "children",
                        responseNextCursorPath = "nextCursor",
                        itemType = child,
                    ),
            )
        val client =
            OperationClientDeclaration(
                symbolId = "client:RenameClient",
                order = 3,
                packageName = PACKAGE,
                fileName = "RenameClient",
                resolvedName = "RenameClient",
                kdoc = "Client referencing renamed models.",
                codecsObjectName = "RenameCodecs",
                operations = listOf(operation),
            )
        val original =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        PACKAGE,
                        "FieldPresence",
                        listOf(
                            SupportDeclaration(
                                "support:presence",
                                0,
                                PACKAGE,
                                "FieldPresence",
                                "FieldPresence",
                                "",
                                SupportKind.FieldPresence,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(
                        PACKAGE,
                        "SerializationSupport",
                        listOf(
                            SupportDeclaration(
                                "support:serialization",
                                1,
                                PACKAGE,
                                "SerializationSupport",
                                "SerializationSupport",
                                "",
                                SupportKind.Serialization,
                            ),
                        ),
                    ),
                    KotlinFileDeclaration(PACKAGE, "Child", listOf(childModel)),
                    KotlinFileDeclaration(PACKAGE, "Parent", listOf(parentModel)),
                    KotlinFileDeclaration(PACKAGE, "Choice", listOf(choice)),
                    KotlinFileDeclaration(PACKAGE, "RenameClient", listOf(client)),
                ),
            )
        val renamed =
            applyDeclarationAugmentations(
                original,
                listOf(
                    DeclarationAugmentation(
                        symbolId = "schema:Child",
                        resolvedName = "RenamedChild",
                        source = sourcePointer(),
                    ),
                ),
            )
        val renamedOperation =
            renamed.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()

        assertEquals(KotlinTypeRef(PACKAGE, "RenamedChild"), renamedOperation.parameters.single().type)
        assertEquals(
            KotlinTypeRef(PACKAGE, "RenamedChild"),
            (renamedOperation.pagination as PaginationDeclaration.CursorToken).itemType,
        )

        val rendered = KotlinPoetEmitter(PACKAGE).render(renamed).files

        assertTrue(rendered.any { it.path.endsWith("/RenamedChild.kt") })
        assertFalse(rendered.any { it.bytes.decodeToString().contains("com.example.generated.Child") })
        compileGenerated(rendered)
    }

    @Test
    fun openRouterDualContentTranscriptionIsDiagnosedAtMultipartSchema() {
        val source =
            Files.createTempFile("sdkgen-stt-dual-content-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: STT dual content, version: "1" }
                    paths:
                      /audio/transcriptions:
                        post:
                          operationId: createAudioTranscriptions
                          requestBody:
                            content:
                              application/json:
                                schema: { ${'$'}ref: '#/components/schemas/STTRequest' }
                              multipart/form-data:
                                schema:
                                  type: object
                                  properties:
                                    file: { type: string, format: binary }
                                    language: { type: string }
                                    model: { type: string }
                                    response_format: { type: string }
                          responses: { '204': { description: Transcribed } }
                    components:
                      schemas:
                        STTInputAudio:
                          type: object
                          required: [data, format]
                          properties:
                            data: { type: string }
                            format: { type: string }
                        STTRequest:
                          type: object
                          required: [input_audio, model]
                          properties:
                            input_audio: { ${'$'}ref: '#/components/schemas/STTInputAudio' }
                            language: { type: string }
                            model: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "SttClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )

        val diagnostic = mapping.diagnostics.single { it.symbolId == "operation:createAudioTranscriptions" }
        assertEquals(GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION, diagnostic.code)
        assertEquals(
            "/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema",
            diagnostic.source.jsonPointer,
        )
        assertTrue(diagnostic.message.contains("incompatible request schemas"))
        assertFalse(
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .any { it.operationIdentity == "createAudioTranscriptions" },
        )
    }

    @Test
    fun multipartAccessorCollisionsUseExactResolvedModelFieldsAndCompile() {
        val source =
            Files.createTempFile("sdkgen-multipart-accessor-collision-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Multipart collision, version: "1" }
                    paths:
                      /upload:
                        post:
                          operationId: uploadCollision
                          requestBody:
                            required: true
                            content:
                              multipart/form-data:
                                schema: { ${'$'}ref: '#/components/schemas/UploadRequest' }
                          responses: { '204': { description: Uploaded } }
                    components:
                      schemas:
                        UploadRequest:
                          type: object
                          required: [foo-bar, foo_bar, expand]
                          properties:
                            foo-bar: { type: string, format: binary }
                            foo_bar: { type: string }
                            expand: { type: array, items: { type: string } }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "UploadClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val sourceText = rendered.joinToString("\n") { file -> file.bytes.decodeToString() }
        assertTrue(sourceText.contains("name = \"foo-bar\", stream = request.fooBar"))
        assertTrue(sourceText.contains("name = \"foo_bar\", value = request.fooBar2"))
        assertTrue(sourceText.contains("if (request.expand.isEmpty())"))
        assertTrue(sourceText.contains("name = \"expand\", value = \"\""))
        assertTrue(sourceText.contains("name = \"expand\" + \"[\" + index + \"]\""))
        compileGenerated(rendered)
    }

    @Test
    fun formCodecUsesResolvedAccessorsStandardDeepObjectAndCanonicalNumbersAndCompiles() {
        val source =
            Files.createTempFile("sdkgen-form-urlencoded-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Form, version: "1" }
                    paths:
                      /charges:
                        post:
                          operationId: createCharge
                          requestBody:
                            required: true
                            content:
                              application/x-www-form-urlencoded:
                                schema: { ${'$'}ref: '#/components/schemas/ChargeRequest' }
                                encoding:
                                  details: { style: deepObject, explode: true }
                                  expand: { style: deepObject, explode: true }
                                  metadata: { style: deepObject, explode: true }
                                  source: { style: deepObject, explode: true }
                          responses: { '204': { description: Created } }
                    components:
                      schemas:
                        ChargeRequest:
                          type: object
                          additionalProperties: false
                          required: [class, amount, rate]
                          properties:
                            class: { type: string }
                            amount: { type: integer }
                            rate: { type: number }
                            active: { type: boolean }
                            expand: { type: array, items: { type: string } }
                            metadata:
                              anyOf:
                                - type: object
                                  additionalProperties: { type: string }
                                - type: string
                                  enum: [""]
                            source:
                              anyOf:
                                - type: object
                                  additionalProperties: false
                                  properties: { token: { type: string } }
                                - type: string
                            details:
                              type: object
                              additionalProperties: false
                              properties:
                                postal_code: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "ChargeClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val sourceText = rendered.joinToString("\n") { file -> file.bytes.decodeToString() }
        assertTrue(sourceText.contains("FormUrlEncodedBody"))
        assertTrue(sourceText.contains("form.add(\"class\", request.classValue)"))
        assertTrue(sourceText.contains("form.add(\"amount\", request.amount.toString())"))
        assertTrue(sourceText.contains("form.add(\"rate\", request.rate)"))
        assertTrue(sourceText.contains("if (formValue0.isEmpty())"))
        assertTrue(sourceText.contains("form.add(\"expand\", \"\")"))
        assertTrue(sourceText.contains("formValue0.forEachIndexed"))
        assertTrue(sourceText.contains(".forEach { (formKey"))
        assertTrue(sourceText.contains("+ formKey"))
        assertTrue(sourceText.contains("matchedBranches.size == 1"))
        assertTrue(sourceText.contains("Form union value has no selected branch"))
        assertTrue(sourceText.contains("Form map values encoded from a raw JSON object must be JSON primitives"))
        assertTrue(sourceText.contains("[postal_code]"))
        compileGenerated(rendered)
    }

    @Test
    fun referencedAnyOfBranchViewsAreEmittedOnceAndSharedAcrossUnions() {
        val source =
            Files.createTempFile("sdkgen-shared-anyof-view-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Shared anyOf view, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        SharedTool:
                          type: object
                          required: [kind]
                          properties:
                            kind: { type: string }
                        FirstUnion:
                          anyOf:
                            - ${'$'}ref: '#/components/schemas/SharedTool'
                            - type: object
                              required: [first]
                              properties:
                                first: { type: string }
                        SecondUnion:
                          anyOf:
                            - type: object
                              required: [second]
                              properties:
                                second: { type: string }
                            - ${'$'}ref: '#/components/schemas/SharedTool'
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "SharedViewClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val viewDeclarations =
            rendered.flatMap { file ->
                file.bytes
                    .decodeToString()
                    .lineSequence()
                    .filter { line -> line.startsWith("public data class SharedToolView(") }
                    .map { file.path }
            }

        assertEquals(listOf("com/example/generated/SharedTool.kt"), viewDeclarations)
        compileGenerated(rendered)
    }

    @Test
    fun referencedAnyOfBranchWithOnlyOptionalPropertiesEmitsACompilableUsefulView() {
        val source =
            Files.createTempFile("sdkgen-optional-anyof-view-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Optional anyOf view, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        OptionalCutoffs:
                          type: object
                          properties:
                            p50: { type: number }
                            label: { type: string }
                        RoutingPreference:
                          anyOf:
                            - ${'$'}ref: '#/components/schemas/OptionalCutoffs'
                            - type: object
                              required: [mode]
                              properties:
                                mode: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "OptionalViewClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val optionalCutoffs = rendered.single { it.path.endsWith("/OptionalCutoffs.kt") }.bytes.decodeToString()

        compileGenerated(rendered)
        assertTrue(optionalCutoffs.contains("public val p50: Double? = null"))
        assertTrue(optionalCutoffs.contains("public val label: String? = null"))
    }

    @Test
    fun transparentAllOfBranchPreservesNullablePropertyAtEveryEmissionSite() {
        val source =
            Files.createTempFile("sdkgen-transparent-allof-nullable-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Nullable transparent allOf, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        PercentileStats:
                          type: object
                          required: [p50]
                          properties:
                            p50: { type: number }
                        PublicEndpoint:
                          type: object
                          required: [throughput_last_30m]
                          properties:
                            throughput_last_30m:
                              allOf:
                                - ${'$'}ref: '#/components/schemas/PercentileStats'
                                - nullable: true
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "NullableAllOfClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        val publicEndpoint = rendered.single { it.path.endsWith("/PublicEndpoint.kt") }.bytes.decodeToString()

        assertTrue(publicEndpoint.contains("throughputLast30m: PercentileStats?"))
        compileGenerated(rendered)
    }

    @Test
    fun supportRenameLeavesCanonicalSupportNamesAndGeneratedSourcesCompilable() {
        val renamed =
            applyDeclarationAugmentations(
                supportModel(),
                listOf(
                    DeclarationAugmentation(
                        symbolId = "support:presence",
                        resolvedName = "RenamedPresence",
                        source = sourcePointer(),
                    ),
                    DeclarationAugmentation(
                        symbolId = "support:serialization",
                        resolvedName = "RenamedSerialization",
                        source = sourcePointer(),
                    ),
                ),
            )
        val rendered = KotlinPoetEmitter(PACKAGE).render(renamed).files
        val fieldPresence = rendered.single { it.path.endsWith("/FieldPresence.kt") }.bytes.decodeToString()
        val serializationSupport =
            rendered
                .single {
                    it.path.endsWith(
                        "/SerializationSupport.kt",
                    )
                }.bytes
                .decodeToString()

        assertTrue(fieldPresence.contains("enum class FieldPresence"))
        assertTrue(serializationSupport.contains("SdkJson"))
        assertFalse(rendered.any { it.path.endsWith("/RenamedPresence.kt") })
        assertFalse(rendered.any { it.path.endsWith("/RenamedSerialization.kt") })
        compileGenerated(rendered)
    }

    @Test
    fun primitiveOneOfNumericSupportTypesAvoidSchemaNameCollisionsAndCompile() {
        val source =
            Files.createTempFile("sdkgen-primitive-oneof-support-collision-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Primitive support collision, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        SchemaInteger:
                          type: object
                          required: [value]
                          properties:
                            value: { type: integer }
                        SchemaDecimal:
                          type: object
                          required: [value]
                          properties:
                            value: { type: number }
                        Choice:
                          oneOf:
                            - { type: integer }
                            - { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "CollisionClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())

        val rendered = KotlinPoetEmitter(PACKAGE).render(mapping.model).files
        compileGenerated(rendered)
    }

    @Test
    fun modelSerializerLocalsAvoidRawPropertyCollisions() {
        val string = KotlinTypeRef("kotlin", "String")
        val model =
            ModelDeclaration(
                symbolId = "schema:RawPropertyModel",
                order = 0,
                packageName = PACKAGE,
                fileName = "RawPropertyModel",
                resolvedName = "RawPropertyModel",
                kdoc = "Model with raw-shaped properties.",
                fields =
                    listOf(
                        FieldDeclaration("schema:RawPropertyModel/html", 0, "html", "html", string, true, false, ""),
                        FieldDeclaration("schema:RawPropertyModel/raw", 1, "raw", "raw", string, true, false, ""),
                        FieldDeclaration(
                            "schema:RawPropertyModel/rawObject",
                            2,
                            "rawObject",
                            "raw_object",
                            string,
                            true,
                            false,
                            "",
                        ),
                    ),
                dslFunctionName = "rawPropertyModel",
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                0,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "RawPropertyModel", listOf(model)),
                            KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                        ),
                    ),
                ).files
        val source = rendered.single { file -> file.path.endsWith("RawPropertyModel.kt") }.bytes.decodeToString()

        compileGenerated(rendered)
        assertTrue(source.contains("val rawObject2 = jsonDecoder.decodeJsonElement() as? JsonObject"))
    }

    @Test
    fun projectionExcludesRequiredValueBackingCollisionsBeforeEmission() {
        val source =
            Files.createTempFile("sdkgen-required-value-backing-", ".yaml").also { path ->
                path.writeText(
                    """
                    openapi: 3.1.0
                    info: { title: Required value backing, version: "1" }
                    paths: {}
                    components:
                      schemas:
                        IssueEvent:
                          type: object
                          required: [issue_field]
                          properties:
                            issue_field:
                              type: object
                              required: [name]
                              properties:
                                name: { type: string }
                            issue_field_value:
                              type: object
                              required: [value]
                              properties:
                                value: { type: string }
                    """.trimIndent(),
                )
            }
        val document = SemanticAdapter().adapt(source).document
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = PACKAGE,
                    canonicalDocumentUri = document.documentUri,
                    clientName = "IssueEventClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )

        assertTrue(mapping.diagnostics.any { diagnostic -> diagnostic.symbolId == "schema:IssueEvent" })
        compileGenerated(KotlinPoetEmitter(PACKAGE).render(mapping.model).files)
    }

    @Test
    fun generatedUnionSourcesCompileWithLongPredicatesRawFieldNamesAndDistinctEmptyViews() {
        val string = KotlinTypeRef("kotlin", "String")
        val jsonObject = KotlinTypeRef("kotlinx.serialization.json", "JsonObject")
        val primitive =
            PrimitiveOneOfDeclaration(
                symbolId = "schema:LongPredicate",
                order = 0,
                packageName = PACKAGE,
                fileName = "LongPredicate",
                resolvedName = "LongPredicate",
                kdoc = "Long predicate wrapping regression.",
                cases =
                    listOf(
                        PrimitiveOneOfCaseDeclaration(
                            symbolId = "schema:LongPredicate/object",
                            order = 0,
                            resolvedName = "ObjectValue",
                            type = jsonObject,
                            jsonKind = PrimitiveOneOfJsonKind.OBJECT,
                            predicate =
                                JsonBranchPredicate.AllOf(
                                    listOf(
                                        JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.OBJECT),
                                        JsonBranchPredicate.ObjectShape(
                                            requiredNames = (1..18).map { "property$it" },
                                            properties =
                                                (1..18).associate { property ->
                                                    "property$property" to
                                                        JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING)
                                                },
                                            additionalProperties = JsonAdditionalPropertiesPredicate.Closed,
                                        ),
                                    ),
                                ),
                        ),
                    ),
            )
        val rawFieldChoice =
            OneOfDeclaration(
                symbolId = "schema:RawFieldChoice",
                order = 1,
                packageName = PACKAGE,
                fileName = "RawFieldChoice",
                resolvedName = "RawFieldChoice",
                kdoc = "Raw local-name collision regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:RawFieldChoice/raw",
                            order = 0,
                            resolvedName = "RawValue",
                            requiredFields =
                                listOf(
                                    UnionFieldDeclaration("rawValue", "raw_value", string),
                                ),
                        ),
                    ),
            )

        fun emptyBranch(symbolId: String) =
            AnyOfBranchDeclaration(
                symbolId = symbolId,
                order = 0,
                resolvedName = "Branch2",
                propertyName = "branch2",
                fields = emptyList(),
                viewFields = emptyList(),
                shape = AnyOfBranchShape.OBJECT,
                type = jsonObject,
                viewTypeName = "Branch2View",
            )
        val firstAnyOf =
            AnyOfDeclaration(
                "schema:FirstAnyOf",
                2,
                PACKAGE,
                "FirstAnyOf",
                "FirstAnyOf",
                "First empty-object view.",
                listOf(emptyBranch("schema:FirstAnyOf/branch")),
            )
        val secondAnyOf =
            AnyOfDeclaration(
                "schema:SecondAnyOf",
                3,
                PACKAGE,
                "SecondAnyOf",
                "SecondAnyOf",
                "Second empty-object view.",
                listOf(emptyBranch("schema:SecondAnyOf/branch")),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                4,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "LongPredicate", listOf(primitive)),
                            KotlinFileDeclaration(PACKAGE, "RawFieldChoice", listOf(rawFieldChoice)),
                            KotlinFileDeclaration(PACKAGE, "FirstAnyOf", listOf(firstAnyOf)),
                            KotlinFileDeclaration(PACKAGE, "SecondAnyOf", listOf(secondAnyOf)),
                            KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                        ),
                    ),
                ).files
        val emptyViewSources =
            rendered.filter { file -> file.bytes.decodeToString().contains("class Branch2View") }

        val rawChoiceSource = rendered.single { file -> file.path.endsWith("RawFieldChoice.kt") }.bytes.decodeToString()

        assertEquals(2, emptyViewSources.size)
        assertTrue(emptyViewSources.all { file -> !file.bytes.decodeToString().contains("data class Branch2View()") })
        assertTrue(rawChoiceSource.contains("val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject"))
        compileGenerated(rendered)
    }

    @Test
    fun mixedPredicateAndLegacyEmptyObjectOneOfInitializesRawEmptyBeforeCaseMatches() {
        val string = KotlinTypeRef("kotlin", "String")
        val choice =
            OneOfDeclaration(
                symbolId = "schema:MixedPredicateEmptyChoice",
                order = 0,
                packageName = PACKAGE,
                fileName = "MixedPredicateEmptyChoice",
                resolvedName = "MixedPredicateEmptyChoice",
                kdoc = "Mixed predicate and empty-object compile regression.",
                cases =
                    listOf(
                        OneOfCaseDeclaration(
                            symbolId = "schema:MixedPredicateEmptyChoice/value",
                            order = 0,
                            resolvedName = "Value",
                            requiredFields = listOf(UnionFieldDeclaration("value", "value", string)),
                            predicate =
                                JsonBranchPredicate.ObjectShape(
                                    requiredNames = listOf("value"),
                                    properties =
                                        mapOf(
                                            "value" to JsonBranchPredicate.Kind(PrimitiveOneOfJsonKind.STRING),
                                        ),
                                    additionalProperties = JsonAdditionalPropertiesPredicate.Closed,
                                ),
                        ),
                        OneOfCaseDeclaration(
                            symbolId = "schema:MixedPredicateEmptyChoice/empty",
                            order = 1,
                            resolvedName = "Empty",
                            requiredFields = emptyList(),
                            matchesEmptyObject = true,
                        ),
                    ),
            )
        val support =
            SupportDeclaration(
                "support:serialization",
                1,
                PACKAGE,
                "SerializationSupport",
                "SerializationSupport",
                "",
                SupportKind.Serialization,
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "MixedPredicateEmptyChoice", listOf(choice)),
                            KotlinFileDeclaration(PACKAGE, "SerializationSupport", listOf(support)),
                        ),
                    ),
                ).files
        val source =
            rendered
                .single { file -> file.path.endsWith("MixedPredicateEmptyChoice.kt") }
                .bytes
                .decodeToString()

        assertTrue(source.indexOf("val rawEmpty = rawObject.isEmpty()") < source.indexOf("val emptyMatches = rawEmpty"))
        compileGenerated(rendered)
    }

    @Test
    fun optionalCollectionParametersAreNullSafeAndCompile() {
        val stringList =
            KotlinTypeRef(
                "kotlin.collections",
                "List",
                listOf(KotlinTypeRef("kotlin", "String")),
            )
        val operation =
            OperationDeclaration(
                symbolId = "operation:optionalCollection",
                order = 0,
                operationId = "optionalCollection",
                method = "GET",
                path = "/optional-collection",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = KotlinTypeRef("kotlin", "Unit"),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "optionalCollectionRequestCodec",
                responseCodecPropertyName = "optionalCollectionResponseCodec",
                requestCodecConstantName = "OPTIONAL_COLLECTION_REQUEST_CODEC_ID",
                responseCodecConstantName = "OPTIONAL_COLLECTION_RESPONSE_CODEC_ID",
                requestCodecId = "optionalCollection.request",
                responseCodecId = "optionalCollection.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Optional collection parameter regression.",
                parameters =
                    listOf(
                        OperationParameterDeclaration(
                            "labels",
                            OperationParameterLocation.QUERY,
                            stringList,
                            required = false,
                        ),
                    ),
            )
        val client =
            OperationClientDeclaration(
                "client:OptionalCollectionClient",
                0,
                PACKAGE,
                "OptionalCollectionClient",
                "OptionalCollectionClient",
                "Optional collection parameter compile regression client.",
                "OptionalCollectionCodecs",
                listOf(operation),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "OptionalCollectionClient", listOf(client)),
                            KotlinFileDeclaration(
                                PACKAGE,
                                "SerializationSupport",
                                listOf(
                                    SupportDeclaration(
                                        "support:serialization",
                                        0,
                                        PACKAGE,
                                        "SerializationSupport",
                                        "SerializationSupport",
                                        "",
                                        SupportKind.Serialization,
                                    ),
                                ),
                            ),
                        ),
                    ),
                ).files
        val source =
            rendered
                .single { file -> file.path.endsWith("OptionalCollectionClient.kt") }
                .bytes
                .decodeToString()

        assertTrue(source.contains("labels?.map { it.toString() }.orEmpty()"))
        compileGenerated(rendered)
    }

    private fun supportModel(): KotlinDeclarationModel =
        KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    PACKAGE,
                    "FieldPresence",
                    listOf(
                        SupportDeclaration(
                            symbolId = "support:presence",
                            order = 0,
                            packageName = PACKAGE,
                            fileName = "FieldPresence",
                            resolvedName = "FieldPresence",
                            kdoc = "",
                            kind = SupportKind.FieldPresence,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "SerializationSupport",
                    listOf(
                        SupportDeclaration(
                            symbolId = "support:serialization",
                            order = 1,
                            packageName = PACKAGE,
                            fileName = "SerializationSupport",
                            resolvedName = "SerializationSupport",
                            kdoc = "",
                            kind = SupportKind.Serialization,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "Payload",
                    listOf(
                        ModelDeclaration(
                            symbolId = "schema:Payload",
                            order = 2,
                            packageName = PACKAGE,
                            fileName = "Payload",
                            resolvedName = "Payload",
                            kdoc = "Payload model.",
                            fields =
                                listOf(
                                    FieldDeclaration(
                                        symbolId = "schema:Payload/value",
                                        order = 0,
                                        resolvedName = "value",
                                        wireName = "value",
                                        type = KotlinTypeRef("kotlin", "String"),
                                        required = true,
                                        nullable = false,
                                        kdoc = "",
                                    ),
                                ),
                            dslFunctionName = "payload",
                        ),
                    ),
                ),
            ),
        )

    private fun sourcePointer(): SourcePointer = SourcePointer("sdkgen://test", "/", SourceLocation(1, 1, 0))

    private fun collectionField(
        name: String,
        type: KotlinTypeRef,
        order: Int,
        required: Boolean,
        nullable: Boolean = false,
    ): FieldDeclaration =
        FieldDeclaration(
            symbolId = "schema:CollectionOwnership/property:$name",
            order = order,
            resolvedName = name,
            wireName = name,
            type = type,
            required = required,
            nullable = nullable,
            kdoc = "",
        )

    private fun compileGenerated(files: List<RenderedKotlinFile>): Path {
        val root = Files.createTempDirectory("sdkgen-generated-compile-")
        val sourcePaths =
            files.map { rendered ->
                val path = root.resolve(rendered.path)
                path.parent.createDirectories()
                path.writeText(rendered.bytes.decodeToString())
                path.toString()
            }
        val output = root.resolve("out").also { it.createDirectories() }
        val compilerOutput = ByteArrayOutputStream()
        val result =
            K2JVMCompiler().exec(
                PrintStream(compilerOutput),
                "-classpath",
                System.getProperty("java.class.path"),
                "-d",
                output.toString(),
                *sourcePaths.toTypedArray(),
            )
        assertEquals(ExitCode.OK, result, compilerOutput.toString())
        return output
    }

    private fun pageResponseStub(): String =
        """
        package $PACKAGE

        import kotlinx.serialization.KSerializer
        import kotlinx.serialization.descriptors.SerialDescriptor
        import kotlinx.serialization.descriptors.buildClassSerialDescriptor
        import kotlinx.serialization.encoding.Decoder
        import kotlinx.serialization.encoding.Encoder

        data class PageResponse(val data: List<String>, val nextCursor: String?) {
            public object Serializer : KSerializer<PageResponse> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("PageResponse")
                override fun serialize(encoder: Encoder, value: PageResponse) = Unit
                override fun deserialize(decoder: Decoder): PageResponse = TODO()
            }
        }
        """.trimIndent()

    private fun edgeShapeModel(): KotlinDeclarationModel {
        val string = KotlinTypeRef("kotlin", "String")
        val int = KotlinTypeRef("kotlin", "Int")
        val boolean = KotlinTypeRef("kotlin", "Boolean")
        val double = KotlinTypeRef("kotlin", "Double")
        val status = KotlinTypeRef(PACKAGE, "Status")
        val profile = KotlinTypeRef(PACKAGE, "Profile")
        val stringList = KotlinTypeRef("kotlin.collections", "List", listOf(string))
        val payload = KotlinTypeRef(PACKAGE, "Payload")
        val byteStream = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val unit = KotlinTypeRef("kotlin", "Unit")

        return KotlinDeclarationModel(
            listOf(
                file(
                    "FieldPresence",
                    SupportDeclaration(
                        symbolId = "support:presence",
                        order = 0,
                        packageName = PACKAGE,
                        fileName = "FieldPresence",
                        resolvedName = "FieldPresence",
                        kdoc = "",
                        kind = SupportKind.FieldPresence,
                    ),
                ),
                file(
                    "SerializationSupport",
                    SupportDeclaration(
                        symbolId = "support:serialization",
                        order = 0,
                        packageName = PACKAGE,
                        fileName = "SerializationSupport",
                        resolvedName = "SerializationSupport",
                        kdoc = "",
                        kind = SupportKind.Serialization,
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "Status",
                    listOf(
                        OpenEnumDeclaration(
                            "schema:Status",
                            0,
                            PACKAGE,
                            "Status",
                            "Status",
                            "Status enum.",
                            listOf(EnumValueDeclaration("schema:Status/ready", 0, "Ready", "ready", "")),
                        ),
                    ),
                ),
                file(
                    "Profile",
                    ModelDeclaration(
                        "schema:Profile",
                        0,
                        PACKAGE,
                        "Profile",
                        "Profile",
                        "Profile model.",
                        listOf(
                            field("Profile/id", 0, "id", string, required = true),
                        ),
                        "profile",
                    ),
                ),
                file(
                    "AllRequired",
                    ModelDeclaration(
                        "schema:AllRequired",
                        0,
                        PACKAGE,
                        "AllRequired",
                        "AllRequired",
                        "All required primitive model.",
                        listOf(
                            field("AllRequired/count", 0, "count", int, required = true),
                            field("AllRequired/enabled", 1, "enabled", boolean, required = true),
                            field("AllRequired/ratio", 2, "ratio", double, required = true),
                            field("AllRequired/name", 3, "name", string, required = true),
                        ),
                        "allRequired",
                    ),
                ),
                file(
                    "Payload",
                    ModelDeclaration(
                        "schema:Payload",
                        0,
                        PACKAGE,
                        "Payload",
                        "Payload",
                        "Payload model.",
                        listOf(field("Payload/value", 0, "value", string, required = true)),
                        "payload",
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "ChoiceOne",
                    listOf(
                        OneOfDeclaration(
                            "schema:ChoiceOne",
                            0,
                            PACKAGE,
                            "ChoiceOne",
                            "ChoiceOne",
                            "First union.",
                            listOf(
                                OneOfCaseDeclaration(
                                    "schema:ChoiceOne/typed",
                                    0,
                                    "Typed",
                                    listOf(
                                        UnionFieldDeclaration("status", "status", status),
                                        UnionFieldDeclaration("count", "count", int),
                                        UnionFieldDeclaration("items", "items", stringList),
                                        UnionFieldDeclaration("profile", "profile", profile),
                                    ),
                                ),
                                OneOfCaseDeclaration(
                                    "schema:ChoiceOne/name",
                                    1,
                                    "Named",
                                    listOf(UnionFieldDeclaration("name", "name", string)),
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "ChoiceTwo",
                    listOf(
                        AnyOfDeclaration(
                            "schema:ChoiceTwo",
                            0,
                            PACKAGE,
                            "ChoiceTwo",
                            "ChoiceTwo",
                            "Second union.",
                            listOf(
                                valueBranch("Status", status),
                                valueBranch("Count", int),
                                valueBranch("Items", stringList),
                                valueBranch("Profile", profile),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "EdgeClient",
                    listOf(
                        OperationClientDeclaration(
                            "client:EdgeClient",
                            0,
                            PACKAGE,
                            "EdgeClient",
                            "EdgeClient",
                            "Edge client.",
                            "EdgeCodecs",
                            listOf(
                                operation(
                                    id = "optionalBody",
                                    requestType = payload.copy(nullable = true),
                                    responseType = unit,
                                    requestMediaTypes = listOf("application/json"),
                                    responseMediaTypes = emptyList(),
                                    requestBody =
                                        OperationRequestBodyAlternative(
                                            "application/json",
                                            payload,
                                            required = false,
                                        ),
                                ),
                                operation(
                                    id = "bodyless",
                                    requestType = unit,
                                    responseType = unit,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = emptyList(),
                                ),
                                operation(
                                    id = "scalarResponse",
                                    requestType = unit,
                                    responseType = int,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = listOf("application/json"),
                                ),
                                operation(
                                    id = "uploadBinary",
                                    requestType = byteStream,
                                    responseType = unit,
                                    requestMediaTypes = listOf("application/octet-stream"),
                                    responseMediaTypes = emptyList(),
                                ),
                                operation(
                                    id = "downloadBinary",
                                    requestType = unit,
                                    responseType = byteStream,
                                    requestMediaTypes = emptyList(),
                                    responseMediaTypes = listOf("application/octet-stream"),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
        )
    }

    private fun operation(
        id: String,
        requestType: KotlinTypeRef,
        responseType: KotlinTypeRef,
        requestMediaTypes: List<String>,
        responseMediaTypes: List<String>,
        requestBody: OperationRequestBodyAlternative? = null,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:$id",
            order = 0,
            operationId = id,
            method = "POST",
            path = "/$id",
            requestMediaTypes = requestMediaTypes,
            responseMediaTypes = responseMediaTypes,
            successStatusCodes = setOf(200),
            requestType = requestType,
            responseType = responseType,
            requestCodecPropertyName = "${id}RequestCodec",
            responseCodecPropertyName = "${id}ResponseCodec",
            requestCodecConstantName = "${id.uppercase()}_REQUEST_CODEC_ID",
            responseCodecConstantName = "${id.uppercase()}_RESPONSE_CODEC_ID",
            requestCodecId = "$id.request",
            responseCodecId = "$id.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(null, null, null),
            methodKdoc = "Executes '$id'.",
            requestBodyAlternatives = requestBody?.let { listOf(it) }.orEmpty(),
            requestBodyRequired = requestBody?.required == true,
        )

    private fun field(
        symbol: String,
        order: Int,
        name: String,
        type: KotlinTypeRef,
        required: Boolean,
    ): FieldDeclaration = FieldDeclaration(symbol, order, name, name, type, required, type.nullable, "")

    private fun valueBranch(
        name: String,
        type: KotlinTypeRef,
    ): AnyOfBranchDeclaration =
        AnyOfBranchDeclaration(
            symbolId = "schema:ChoiceTwo/$name",
            order = 0,
            resolvedName = name,
            propertyName = name.replaceFirstChar(Char::lowercaseChar),
            fields = emptyList(),
            shape = AnyOfBranchShape.VALUE,
            type = type,
        )

    private fun file(
        name: String,
        declaration: SupportDeclaration,
    ): KotlinFileDeclaration = KotlinFileDeclaration(PACKAGE, name, listOf(declaration))

    private fun file(
        name: String,
        declaration: ModelDeclaration,
    ): KotlinFileDeclaration = KotlinFileDeclaration(PACKAGE, name, listOf(declaration))

    private companion object {
        const val PACKAGE = "com.example.generated"
    }
}
