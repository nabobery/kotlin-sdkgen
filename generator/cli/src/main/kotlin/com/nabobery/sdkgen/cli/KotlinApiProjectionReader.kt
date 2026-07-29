package com.nabobery.sdkgen.cli

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

/**
 * Reads bounded emitted-API evidence and proves that it belongs to the supplied generation manifest.
 *
 * The projection is staged rather than included in generated sources, so its generation binding is
 * load-bearing: both the declaration-model digest and the complete generated-file digest set must equal the
 * corresponding manifest values before any API declaration is classified.
 */
internal object KotlinApiProjectionReader {
    @Suppress("DEPRECATION")
    private val MAPPER = ObjectMapper().enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION)

    private const val SCHEMA_VERSION = "kotlin-public-api/v2"
    private const val MAX_PROJECTION_BYTES = 64 * 1024 * 1024
    private const val MAX_DECLARATIONS = 200_000

    internal fun read(
        path: Path,
        manifest: CompatibilityManifestSnapshot,
    ): KotlinPublicApiEvidence {
        val bytes =
            try {
                Files.newInputStream(path).use { input -> input.readNBytes(MAX_PROJECTION_BYTES + 1) }
            } catch (failure: IOException) {
                throw KotlinApiProjectionInputException("Kotlin API projection cannot be read: $path", failure)
            }
        if (bytes.size > MAX_PROJECTION_BYTES) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection exceeds the maximum size of 64 MiB: $path",
            )
        }

        val root =
            try {
                MAPPER.readTree(bytes)
            } catch (failure: IOException) {
                throw KotlinApiProjectionInputException("Kotlin API projection is not well-formed JSON: $path", failure)
            }?.takeIf(JsonNode::isObject)
                ?: throw KotlinApiProjectionInputException(
                    "Kotlin API projection document must be a JSON object: $path",
                )
        root.requireFields(ROOT_FIELDS, "document", path)
        val schemaVersion = root.requiredText("schemaVersion", "document", path)
        if (schemaVersion != SCHEMA_VERSION) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection declares schemaVersion \"$schemaVersion\", expected \"$SCHEMA_VERSION\": $path",
            )
        }
        validateGeneration(root.get("generation"), manifest, path)

        val declarationNodes = root.requiredArray("declarations", "document", path)
        if (declarationNodes.size > MAX_DECLARATIONS) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection declares ${declarationNodes.size} declarations, " +
                    "above the maximum of $MAX_DECLARATIONS: $path",
            )
        }
        val declarations = declarationNodes.map { node -> declaration(node, path) }
        val duplicates =
            declarations
                .groupBy(KotlinApiDeclaration::qualifiedName)
                .filterValues { entries -> entries.size > 1 }
                .keys
        if (duplicates.isNotEmpty()) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection declares duplicate qualified name(s) " +
                    "${duplicates.sorted().joinToString(", ")}: $path",
            )
        }

        return KotlinPublicApiEvidence(
            projection = KotlinPublicApiProjection(declarations),
            evidence =
                CompatibilityEvidenceReference(
                    kind = "declaration-projection",
                    identity = "projection:${path.fileName}",
                    sha256 = normalizedCompatibilityFingerprint(bytes.decodeToString()),
                ),
        )
    }

    private fun validateGeneration(
        node: JsonNode?,
        manifest: CompatibilityManifestSnapshot,
        path: Path,
    ) {
        val generation =
            node?.takeIf(JsonNode::isObject)
                ?: throw KotlinApiProjectionInputException("Kotlin API projection is missing generation: $path")
        generation.requireFields(GENERATION_FIELDS, "generation", path)
        if (
            generation.requiredText("declarationModelSha256", "generation", path) !=
            manifest.declarationModelSha256
        ) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection declaration model does not match its compatibility manifest: $path",
            )
        }
        val files =
            generation.requiredArray("files", "generation", path).map { file ->
                file.requireFields(FILE_FIELDS, "generation file", path)
                CompatibilityManifestFile(
                    path = file.requiredText("path", "generation file", path),
                    sha256 = file.requiredText("sha256", "generation file", path),
                )
            }
        if (files != manifest.files.sortedBy(CompatibilityManifestFile::path)) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection generated files do not match its compatibility manifest: $path",
            )
        }
    }

    private fun declaration(
        node: JsonNode,
        path: Path,
    ): KotlinApiDeclaration {
        node.requireFields(DECLARATION_FIELDS, "declaration", path)
        val qualifiedName = node.requiredNonBlankText("qualifiedName", "declaration", path)
        val kindName = node.requiredText("kind", qualifiedName, path)
        val kind =
            KotlinApiDeclarationKind.entries.firstOrNull { entry -> entry.wireName == kindName }
                ?: throw KotlinApiProjectionInputException(
                    "Kotlin API projection declaration $qualifiedName declares unknown kind \"$kindName\": $path",
                )

        return KotlinApiDeclaration(
            qualifiedName = qualifiedName,
            kind = kind,
            visibility = node.requiredVisibility(qualifiedName, path),
            modifiers = node.apiModifiers(qualifiedName, path),
            typeParameters = node.textList("typeParameters", qualifiedName, path),
            superTypes = node.requiredArray("superTypes", qualifiedName, path).map { type(it, path) },
            properties =
                node.requiredArray("properties", qualifiedName, path).map { property ->
                    property.requireFields(PROPERTY_FIELDS, "property of $qualifiedName", path)
                    KotlinApiProperty(
                        name = property.requiredText("name", qualifiedName, path),
                        type = type(property.get("type"), path),
                        mutable = property.requiredBoolean("mutable", qualifiedName, path),
                        visibility = property.requiredVisibility(qualifiedName, path),
                    )
                },
            functions =
                node.requiredArray("functions", qualifiedName, path).map { function ->
                    function.requireFields(FUNCTION_FIELDS, "function of $qualifiedName", path)
                    KotlinApiFunction(
                        name = function.requiredText("name", qualifiedName, path),
                        parameters =
                            function.requiredArray("parameters", qualifiedName, path).map { parameter ->
                                parameter.requireFields(PARAMETER_FIELDS, "parameter of $qualifiedName", path)
                                KotlinApiParameter(
                                    name = parameter.requiredText("name", qualifiedName, path),
                                    type = type(parameter.get("type"), path),
                                    hasDefaultValue =
                                        parameter.requiredBoolean("hasDefaultValue", qualifiedName, path),
                                    isVararg = parameter.requiredBoolean("isVararg", qualifiedName, path),
                                )
                            },
                        returnType = type(function.get("returnType"), path),
                        isSuspend = function.requiredBoolean("isSuspend", qualifiedName, path),
                        typeParameters = function.textList("typeParameters", qualifiedName, path),
                        visibility = function.requiredVisibility(qualifiedName, path),
                        receiverType = function.requiredNullableType("receiverType", qualifiedName, path),
                    )
                },
            enumEntries = node.textList("enumEntries", qualifiedName, path),
        )
    }

    private fun type(
        node: JsonNode?,
        path: Path,
    ): KotlinApiType {
        val type =
            node?.takeIf(JsonNode::isObject)
                ?: throw KotlinApiProjectionInputException("Kotlin API projection contains a malformed type: $path")
        type.requireFields(TYPE_FIELDS, "type", path)
        return KotlinApiType(
            packageName = type.requiredText("packageName", "type", path),
            simpleName = type.requiredNonBlankText("simpleName", "type", path),
            arguments = type.requiredArray("arguments", "type", path).map { argument -> type(argument, path) },
            nullable = type.requiredBoolean("nullable", "type", path),
        )
    }

    private fun JsonNode.requireFields(
        expected: Set<String>,
        owner: String,
        path: Path,
    ) {
        if (!isObject) {
            throw KotlinApiProjectionInputException("Kotlin API projection $owner must be an object: $path")
        }
        val unknown = fieldNames().asSequence().toSet() - expected
        if (unknown.isNotEmpty()) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection $owner declares unknown field(s) ${unknown.sorted().joinToString(", ")}: $path",
            )
        }
    }

    private fun JsonNode.requiredArray(
        field: String,
        owner: String,
        path: Path,
    ): List<JsonNode> =
        get(field)?.takeIf(JsonNode::isArray)?.toList()
            ?: throw KotlinApiProjectionInputException(
                "Kotlin API projection $owner is missing array field $field: $path",
            )

    private fun JsonNode.requiredBoolean(
        field: String,
        owner: String,
        path: Path,
    ): Boolean =
        get(field)?.takeIf(JsonNode::isBoolean)?.asBoolean()
            ?: throw KotlinApiProjectionInputException(
                "Kotlin API projection $owner is missing boolean field $field: $path",
            )

    private fun JsonNode.requiredVisibility(
        owner: String,
        path: Path,
    ): String {
        val visibility = requiredText("visibility", owner, path)
        if (visibility !in VISIBILITIES) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection member of $owner has invalid visibility \"$visibility\": $path",
            )
        }
        return visibility
    }

    private fun JsonNode.requiredNullableType(
        field: String,
        owner: String,
        path: Path,
    ): KotlinApiType? {
        val value =
            get(field)
                ?: throw KotlinApiProjectionInputException(
                    "Kotlin API projection member of $owner is missing $field: $path",
                )
        return value.takeUnless(JsonNode::isNull)?.let { type(it, path) }
    }

    private fun JsonNode.apiModifiers(
        owner: String,
        path: Path,
    ): List<String> {
        val modifiers = textList("modifiers", owner, path)
        val invalid = modifiers.toSet() - API_MODIFIERS
        if (invalid.isNotEmpty() || modifiers.distinct().size != modifiers.size) {
            throw KotlinApiProjectionInputException(
                "Kotlin API projection member of $owner has invalid or duplicate modifiers: $path",
            )
        }
        return modifiers
    }

    private fun JsonNode.textList(
        field: String,
        owner: String,
        path: Path,
    ): List<String> =
        requiredArray(field, owner, path).map { entry ->
            entry.takeIf(JsonNode::isTextual)?.asText()
                ?: throw KotlinApiProjectionInputException(
                    "Kotlin API projection $owner field $field must contain only strings: $path",
                )
        }

    private fun JsonNode.requiredText(
        field: String,
        owner: String,
        path: Path,
    ): String =
        get(field)?.takeIf(JsonNode::isTextual)?.asText()
            ?: throw KotlinApiProjectionInputException(
                "Kotlin API projection member of $owner is missing $field: $path",
            )

    private fun JsonNode.requiredNonBlankText(
        field: String,
        owner: String,
        path: Path,
    ): String =
        requiredText(field, owner, path).takeIf(String::isNotBlank)
            ?: throw KotlinApiProjectionInputException(
                "Kotlin API projection member of $owner has blank $field: $path",
            )

    private val ROOT_FIELDS = setOf("schemaVersion", "generation", "declarations")
    private val GENERATION_FIELDS = setOf("declarationModelSha256", "files")
    private val FILE_FIELDS = setOf("path", "sha256")
    private val DECLARATION_FIELDS =
        setOf(
            "qualifiedName",
            "kind",
            "visibility",
            "modifiers",
            "typeParameters",
            "superTypes",
            "properties",
            "functions",
            "enumEntries",
        )
    private val PROPERTY_FIELDS = setOf("name", "type", "mutable", "visibility")
    private val FUNCTION_FIELDS =
        setOf("name", "visibility", "receiverType", "parameters", "returnType", "isSuspend", "typeParameters")
    private val PARAMETER_FIELDS = setOf("name", "type", "hasDefaultValue", "isVararg")
    private val TYPE_FIELDS = setOf("packageName", "simpleName", "arguments", "nullable")
    private val VISIBILITIES = setOf("public", "protected")
    private val API_MODIFIERS = setOf("abstract", "data", "fun", "inner", "open", "sealed", "value")
}

/** Thrown when staged emitted-API evidence is malformed, oversized, or belongs to another generation. */
internal class KotlinApiProjectionInputException(
    message: String,
    cause: Throwable? = null,
) : IllegalArgumentException(message, cause)
