package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.sha256Hex
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray

/**
 * A canonical, signature-aware inventory of the public Kotlin API a generation actually **emitted**.
 *
 * **Why this exists rather than `kotlinApiSha256`.** ADR 0013 made `kotlinApiSha256` the entire evidence source
 * for the compatibility report's `kotlinApi` layer, and that digest is computed from the *declaration model* --
 * upstream of emission. It is therefore structurally blind to any public-API change the emitter introduces on
 * its own. That is not hypothetical: ADR 0015's first partitioning attempt moved nested `public object
 * <Op>FormCodec` declarations inside `private object Partition<N>` holders, deleting 518 public symbols from
 * the generated API, and `kotlinApiSha256` was byte-identical across both the regression and its repair. This
 * projection is built from the KotlinPoet [FileSpec]s that are about to be written, so an emitter-introduced
 * change moves it by construction.
 *
 * **Effective visibility is the whole point.** A `public` member of a `private` enclosing type is not
 * reachable, so [declarations] stops descending at the first non-public type. That single rule is what makes
 * this able to observe the ADR 0015 defect class; a check reading each declaration's own modifiers would report
 * the partitioned codecs as still public, which is exactly what the previous `^  public (const )?val` grep did.
 *
 * **Shape.** The JSON mirrors the CLI's `KotlinPublicApiProjection` model one-for-one, so there is a single
 * shape rather than a writer format and a reader format that can drift. Declarations, and every list within
 * them, are sorted, so the document is stable under emission reordering and a line diff names one subject.
 * KDoc never enters it, so documentation churn cannot move it.
 */
internal object EmittedApiProjection {
    internal const val SCHEMA_VERSION: String = "kotlin-public-api/v2"

    private val JSON = Json { prettyPrint = true }

    internal fun render(
        fileSpecs: List<FileSpec>,
        files: List<RenderedKotlinFile>,
        declarationModelSha256: String,
    ): String =
        JSON.encodeToString(
            JsonObject.serializer(),
            document(fileSpecs, files, declarationModelSha256),
        )

    private fun document(
        fileSpecs: List<FileSpec>,
        files: List<RenderedKotlinFile>,
        declarationModelSha256: String,
    ): JsonObject =
        buildJsonObject {
            put("schemaVersion", SCHEMA_VERSION)
            put(
                "generation",
                buildJsonObject {
                    put("declarationModelSha256", declarationModelSha256)
                    put(
                        "files",
                        JsonArray(
                            files
                                .sortedBy(RenderedKotlinFile::path)
                                .map { file ->
                                    buildJsonObject {
                                        put("path", file.path)
                                        put("sha256", sha256Hex(file.bytes))
                                    }
                                },
                        ),
                    )
                },
            )
            put(
                "declarations",
                JsonArray(
                    fileSpecs
                        .flatMap(::fileDeclarations)
                        .sortedBy { declaration -> declaration["qualifiedName"].toString() },
                ),
            )
        }

    private fun fileDeclarations(file: FileSpec): List<JsonObject> {
        val types = file.members.filterIsInstance<TypeSpec>().flatMap { type -> declarations(file.packageName, type) }
        return types + fileFacade(file)
    }

    /**
     * Kotlin compiles a file's top-level properties and functions into a synthetic `<FileName>Kt` class, and
     * they are every bit as public as a member of a named type -- `SdkJson` is emitted exactly this way. Walking
     * only [FileSpec.members] of type [TypeSpec] would drop them, reintroducing the same blindness this
     * projection exists to remove. Modelling them as one synthetic declaration per file keeps every public
     * symbol addressable by a qualified name, which is what the classifier's canonical-subject grammar needs.
     */
    private fun fileFacade(file: FileSpec): List<JsonObject> {
        val properties = file.members.filterIsInstance<PropertySpec>().filter { spec -> spec.hasApiVisibility }
        val functions = file.members.filterIsInstance<FunSpec>().filter { spec -> spec.hasApiVisibility }
        if (properties.isEmpty() && functions.isEmpty()) return emptyList()

        return listOf(
            buildJsonObject {
                put("qualifiedName", "${file.packageName}.${file.name}Kt")
                put("kind", "object")
                put("visibility", "public")
                putJsonArray("modifiers") {}
                putJsonArray("typeParameters") {}
                put("superTypes", JsonArray(emptyList()))
                put("properties", JsonArray(properties.sortedBy(PropertySpec::name).map(::property)))
                put("functions", JsonArray(functions.map(::function).sortedBy { entry -> entry.toString() }))
                putJsonArray("enumEntries") {}
            },
        )
    }

    private fun declarations(
        qualifier: String,
        type: TypeSpec,
    ): List<JsonObject> {
        // A non-public type takes its whole subtree with it: nothing nested inside it is reachable, however
        // that nested declaration is itself modified.
        if (!type.hasApiVisibility) return emptyList()
        val name = type.name ?: return emptyList()
        val qualifiedName = "$qualifier.$name"

        return buildList {
            add(declaration(qualifiedName, type))
            type.typeSpecs.forEach { nested -> addAll(declarations(qualifiedName, nested)) }
        }
    }

    private fun declaration(
        qualifiedName: String,
        type: TypeSpec,
    ): JsonObject =
        buildJsonObject {
            put("qualifiedName", qualifiedName)
            put("kind", kindOf(type))
            put("visibility", visibilityOf(type.modifiers))
            putJsonArray("modifiers") {
                apiModifiers(type.modifiers).forEach(::add)
            }
            putJsonArray("typeParameters") {
                type.typeVariables
                    .map(::typeVariableSignature)
                    .forEach(::add)
            }
            put(
                "superTypes",
                JsonArray(
                    (listOf(type.superclass) + type.superinterfaces.keys)
                        .map(::typeOf)
                        .distinct()
                        .sortedBy { superType -> superType.toString() },
                ),
            )
            put(
                "properties",
                JsonArray(
                    type.propertySpecs
                        .filter { spec -> spec.hasApiVisibility }
                        .sortedBy(PropertySpec::name)
                        .map(::property),
                ),
            )
            put(
                "functions",
                JsonArray(
                    (type.funSpecs + primaryConstructors(type))
                        .filter { spec -> spec.hasApiVisibility }
                        .map(::function)
                        .sortedBy { entry -> entry.toString() },
                ),
            )
            putJsonArray("enumEntries") {
                type.enumConstants.keys
                    .forEach(::add)
            }
        }

    private fun property(property: PropertySpec): JsonObject =
        buildJsonObject {
            put("name", property.name)
            put("type", typeOf(property.type))
            put("mutable", property.mutable)
            put("visibility", visibilityOf(property.modifiers))
        }

    private fun function(function: FunSpec): JsonObject =
        buildJsonObject {
            put("name", if (function.isConstructor) "<init>" else function.name)
            put("visibility", visibilityOf(function.modifiers))
            function.receiverType?.let { receiver -> put("receiverType", typeOf(receiver)) }
                ?: put("receiverType", JsonNull)
            put(
                "parameters",
                JsonArray(
                    function.parameters.map { parameter ->
                        buildJsonObject {
                            put("name", parameter.name)
                            put("type", typeOf(parameter.type))
                            put("hasDefaultValue", parameter.defaultValue != null)
                            put("isVararg", KModifier.VARARG in parameter.modifiers)
                        }
                    },
                ),
            )
            put("returnType", typeOf(function.returnType))
            put("isSuspend", KModifier.SUSPEND in function.modifiers)
            putJsonArray("typeParameters") {
                function.typeVariables
                    .map(::typeVariableSignature)
                    .forEach(::add)
            }
        }

    /**
     * Decomposes a KotlinPoet type into the package/simple-name/arguments/nullable shape the classifier
     * compares. A type this does not model structurally (a lambda, a type variable, a star projection) degrades
     * to its rendered text rather than being dropped: an unmodellable type must still be *comparable*, or a
     * change to it would be invisible.
     */
    private fun typeOf(type: TypeName): JsonObject =
        when (val bare = type.copy(nullable = false)) {
            is ClassName -> {
                jsonType(bare.packageName, bare.simpleNames.joinToString("."), emptyList(), type.isNullable)
            }

            is ParameterizedTypeName -> {
                jsonType(
                    bare.rawType.packageName,
                    bare.rawType.simpleNames.joinToString("."),
                    bare.typeArguments.map(::typeOf),
                    type.isNullable,
                )
            }

            else -> {
                jsonType("", bare.toString(), emptyList(), type.isNullable)
            }
        }

    private fun jsonType(
        packageName: String,
        simpleName: String,
        arguments: List<JsonObject>,
        nullable: Boolean,
    ): JsonObject =
        buildJsonObject {
            put("packageName", packageName)
            put("simpleName", simpleName)
            put("arguments", JsonArray(arguments))
            put("nullable", nullable)
        }

    private fun kindOf(type: TypeSpec): String =
        when {
            type.enumConstants.isNotEmpty() -> "enum"
            type.kind == TypeSpec.Kind.OBJECT -> "object"
            type.kind == TypeSpec.Kind.INTERFACE && KModifier.SEALED in type.modifiers -> "sealed-interface"
            type.kind == TypeSpec.Kind.INTERFACE -> "interface"
            else -> "class"
        }

    private fun apiModifiers(modifiers: Set<KModifier>): List<String> =
        modifiers
            .filter { modifier -> modifier in API_MODIFIERS }
            .map { modifier -> modifier.name.lowercase() }
            .sorted()

    private fun visibilityOf(modifiers: Set<KModifier>): String =
        if (KModifier.PROTECTED in modifiers) "protected" else "public"

    private fun primaryConstructors(type: TypeSpec): List<FunSpec> {
        type.primaryConstructor?.let { constructor -> return listOf(constructor) }
        val hasSecondaryConstructor = type.funSpecs.any(FunSpec::isConstructor)
        val hasImplicitPublicConstructor =
            type.kind == TypeSpec.Kind.CLASS &&
                KModifier.SEALED !in type.modifiers &&
                !hasSecondaryConstructor
        return if (hasImplicitPublicConstructor) listOf(FunSpec.constructorBuilder().build()) else emptyList()
    }

    private fun typeVariableSignature(variable: TypeVariableName): String =
        buildString {
            append(variable.name)
            append('|')
            append(variable.variance?.name?.lowercase() ?: "invariant")
            append('|')
            append(if (variable.isReified) "reified" else "non-reified")
            append('|')
            append(variable.bounds.joinToString("&") { bound -> typeOf(bound).toString() })
        }

    /**
     * KotlinPoet models "no explicit visibility" as an empty modifier set, and that is `public` in Kotlin.
     * Testing for the *absence* of the non-public modifiers is therefore correct where testing for the presence
     * of [KModifier.PUBLIC] would miss every declaration that simply omits it -- which is most of what this
     * emitter produces, since it relies on the default.
     */
    private val NON_PUBLIC = setOf(KModifier.PRIVATE, KModifier.INTERNAL)
    private val API_MODIFIERS =
        setOf(
            KModifier.ABSTRACT,
            KModifier.DATA,
            KModifier.FUN,
            KModifier.INNER,
            KModifier.OPEN,
            KModifier.SEALED,
            KModifier.VALUE,
        )

    private val TypeSpec.hasApiVisibility: Boolean get() = modifiers.none { modifier -> modifier in NON_PUBLIC }

    private val PropertySpec.hasApiVisibility: Boolean get() = modifiers.none { modifier -> modifier in NON_PUBLIC }

    private val FunSpec.hasApiVisibility: Boolean get() = modifiers.none { modifier -> modifier in NON_PUBLIC }
}
