@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.DiscriminatorModel
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.NullabilityOrigin
import com.nabobery.sdkgen.model.NullabilitySurface
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.PropertyOwnership
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SourcePointer
import java.util.TreeMap
import kotlin.coroutines.cancellation.CancellationException

private val UNSUPPORTED_SCHEMA_KEYWORDS =
    sortedSetOf(
        "\$dynamicRef",
        "contains",
        "dependentSchemas",
        "else",
        "if",
        "patternProperties",
        "prefixItems",
        "then",
    )

private data class NormalizedNullability(
    val value: Nullability,
    val origins: List<NullabilityOrigin>,
)

private data class OneOfNullBranch(
    val isLegacy: Boolean,
    val sourcePointer: String,
)

private fun AdaptationContext.normalizeNullability(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): NormalizedNullability {
    val origins =
        buildList {
            if (node.path("nullable").booleanOrFalse()) {
                val nullablePointer = "$pointer/nullable"
                add(
                    NullabilityOrigin(
                        NullabilitySurface.OPENAPI_3_0_NULLABLE,
                        document.source(nullablePointer),
                    ),
                )
                if (normalizesOpenApi30 && node.has("type")) {
                    addDiagnostic(
                        code = DiagnosticCode.NULLABLE_TYPE_NORMALIZED,
                        message =
                            "'nullable: true' on a typed OpenAPI 3.0 schema was normalized to nullable " +
                                "OpenAPI 3.1 type-union semantics.",
                        remediation = "Replace 'nullable: true' with a type array containing 'null' in OpenAPI 3.1.",
                        phase = DiagnosticPhase.NORMALIZATION,
                        source = document.source(nullablePointer),
                        severity = DiagnosticSeverity.INFO,
                    )
                }
            }
            node.get("type")?.takeIf(JsonNode::isArray)?.forEachIndexed { index, typeNode ->
                if (typeNode.textOrNull() == "null") {
                    add(
                        NullabilityOrigin(
                            NullabilitySurface.JSON_SCHEMA_TYPE_ARRAY,
                            document.source("$pointer/type/$index"),
                        ),
                    )
                }
            }
            addAll(normalizeAnyOfNullability(document, pointer, node))
            addAll(normalizeOneOfNullability(document, pointer, node))
        }
    return NormalizedNullability(
        value = if (origins.isEmpty()) Nullability.NON_NULL else Nullability.NULLABLE,
        origins = origins,
    )
}

/**
 * `anyOf` keeps its original, permissive semantics: the composed value is nullable as soon as
 * *any* branch structurally accepts `null` (a standard `type: "null"` branch, or the exact
 * legacy lone `nullable: true` marker branch preserved for OpenAPI 3.0 compatibility).
 */
private fun AdaptationContext.normalizeAnyOfNullability(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): List<NullabilityOrigin> =
    buildList {
        node.get("anyOf")?.takeIf(JsonNode::isArray)?.forEachIndexed { index, branch ->
            val standardNullBranch = branch.get("type").typeNames() == listOf("null")
            val legacyNullBranch =
                branch.isObject && branch.size() == 1 && branch.path("nullable").booleanOrFalse()
            if (standardNullBranch || legacyNullBranch) {
                val sourcePointer =
                    if (standardNullBranch) {
                        "$pointer/anyOf/$index/type"
                    } else {
                        "$pointer/anyOf/$index/nullable"
                    }
                add(NullabilityOrigin(NullabilitySurface.NULL_COMPOSITION, document.source(sourcePointer)))
                if (legacyNullBranch) {
                    addDiagnostic(
                        code = DiagnosticCode.LEGACY_NULLABLE_COMPOSITION,
                        message =
                            "A lone legacy 'nullable: true' anyOf branch is treated as null-only " +
                                "by the SDKGen compatibility policy.",
                        remediation =
                            "Replace the branch with 'type: null' in OpenAPI 3.1 or apply a reviewed overlay.",
                        phase = DiagnosticPhase.NORMALIZATION,
                        source = document.source(sourcePointer),
                        severity = DiagnosticSeverity.WARNING,
                    )
                }
            }
        }
    }

/**
 * `oneOf` cannot inherit `anyOf`'s permissive rule: a non-discriminated `oneOf` requires exactly
 * one structural match, so `null` is only unambiguously part of the composed value when exactly
 * one branch accepts it. A branch accepts `null` when it is a standard `type: "null"` branch, the
 * exact legacy lone `nullable: true` marker, an unconstrained schema (`{}` or boolean `true`), or a
 * `$ref` branch whose resolved target itself accepts `null` under the same rule. Zero or multiple
 * null-accepting branches are ambiguous: they are reported as a typed diagnostic and the schema
 * stays non-nullable rather than silently guessing.
 */
private fun AdaptationContext.normalizeOneOfNullability(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): List<NullabilityOrigin> {
    val branchesNode = node.get("oneOf")?.takeIf(JsonNode::isArray) ?: return emptyList()
    val nullBranches =
        branchesNode.mapIndexedNotNull { index, branch ->
            val resolved = resolveOneOfBranchForNullCheck(document, branch)
            val standardNullBranch = resolved.get("type").typeNames() == listOf("null")
            val legacyNullBranch =
                resolved.isObject && resolved.size() == 1 && resolved.path("nullable").booleanOrFalse()
            val unconstrainedBranch =
                (resolved.isObject && resolved.size() == 0) || (resolved.isBoolean && resolved.booleanValue())
            if (!standardNullBranch && !legacyNullBranch && !unconstrainedBranch) return@mapIndexedNotNull null
            val sourcePointer =
                when {
                    branch.has("\$ref") -> "$pointer/oneOf/$index/\$ref"
                    standardNullBranch -> "$pointer/oneOf/$index/type"
                    legacyNullBranch -> "$pointer/oneOf/$index/nullable"
                    else -> "$pointer/oneOf/$index"
                }
            OneOfNullBranch(isLegacy = legacyNullBranch, sourcePointer = sourcePointer)
        }
    return when (nullBranches.size) {
        0 -> {
            emptyList()
        }

        1 -> {
            val branch = nullBranches.single()
            buildList {
                add(NullabilityOrigin(NullabilitySurface.NULL_COMPOSITION, document.source(branch.sourcePointer)))
                if (branch.isLegacy) {
                    addDiagnostic(
                        code = DiagnosticCode.LEGACY_NULLABLE_COMPOSITION,
                        message =
                            "A lone legacy 'nullable: true' oneOf branch is treated as null-only " +
                                "by the SDKGen compatibility policy.",
                        remediation =
                            "Replace the branch with 'type: null' in OpenAPI 3.1 or apply a reviewed overlay.",
                        phase = DiagnosticPhase.NORMALIZATION,
                        source = document.source(branch.sourcePointer),
                        severity = DiagnosticSeverity.WARNING,
                    )
                }
            }
        }

        else -> {
            addDiagnostic(
                code = DiagnosticCode.ONE_OF_NULL_AMBIGUOUS,
                message =
                    "oneOf declares ${nullBranches.size} branches that accept null " +
                        "(SDKGEN-NORMALIZE-ONEOF-NULL-AMBIGUOUS); exactly one null-accepting branch " +
                        "is required for unambiguous nullability.",
                remediation =
                    "Rewrite the oneOf so exactly one branch accepts null, or apply an overlay " +
                        "that resolves the ambiguity explicitly.",
                phase = DiagnosticPhase.NORMALIZATION,
                source = document.source("$pointer/oneOf"),
                severity = DiagnosticSeverity.ERROR,
            )
            emptyList()
        }
    }
}

/**
 * Resolves a single hop of a `$ref` oneOf branch so referenced branches participate in the
 * null-acceptance count on the same footing as inline branches. Falls back to the raw branch node
 * when there is no reference, or when the reference cannot be resolved (that failure is reported
 * elsewhere, by the ordinary reference-resolution path).
 */
private fun AdaptationContext.resolveOneOfBranchForNullCheck(
    document: SourceDocument,
    branch: JsonNode,
    visited: MutableSet<String> = mutableSetOf(),
): JsonNode {
    val rawReference = branch.get("\$ref")?.textOrNull() ?: return branch
    val key = "${document.canonicalUri}#$rawReference"
    if (!visited.add(key)) return branch
    return try {
        val target = repository.resolveReference(document.canonicalUri, rawReference)
        val targetNode = target.document.root.at(target.pointer)
        if (normalizesOpenApi30) {
            resolveOneOfBranchForNullCheck(target.document, targetNode, visited)
        } else {
            targetNode
        }
    } catch (cancellation: CancellationException) {
        throw cancellation
    } catch (failure: Throwable) {
        branch
    }
}

internal fun AdaptationContext.adaptSchema(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    requestedId: SchemaId = canonicalSchemaId(document, pointer),
    identityKind: IdentityKind = IdentityKind.INLINE,
): SchemaId {
    schemas[requestedId]?.let { return it.id }
    if (!schemasInProgress.add(requestedId)) return requestedId

    try {
        val source = document.source(pointer)
        diagnoseUnsupportedSchemaConstructs(document, pointer, node)
        val referenceTarget =
            node.get("\$ref")?.textOrNull()?.let { rawReference ->
                resolveSchemaReference(document, pointer, rawReference)
            }
        if (referenceTarget != null && node.path("nullable").booleanOrFalse() && normalizesOpenApi30) {
            diagnoseNullableReferenceSibling(document, pointer)
        }
        val rawTypes = node.get("type").typeNames()
        val types = rawTypes.filterNot { it == "null" }
        val acceptsOnlyNull = rawTypes == listOf("null")
        val contentKeywords = normalizeContentKeywords(document, pointer, node)
        val normalizedNullability = normalizeNullability(document, pointer, node)
        val properties = adaptProperties(document, pointer, node)
        val rawCompositions =
            buildList {
                adaptComposition(document, pointer, node, "oneOf", CompositionKind.ONE_OF)?.let(::add)
                adaptComposition(document, pointer, node, "anyOf", CompositionKind.ANY_OF)?.let(::add)
                adaptComposition(document, pointer, node, "allOf", CompositionKind.ALL_OF)?.let(::add)
            }
        val compositions =
            applyNullableCompositionPolicy(document, pointer, node, rawCompositions)
        val schema =
            SchemaModel(
                id = requestedId,
                identityKind = identityKind,
                referenceTarget = referenceTarget,
                types = types.sorted(),
                format = node.path("format").textOrNull(),
                nullability = normalizedNullability.value,
                nullabilityOrigins = normalizedNullability.origins,
                description = node.path("description").textOrNull(),
                deprecated = node.path("deprecated").booleanOrFalse(),
                readOnly = node.path("readOnly").booleanOrFalse(),
                writeOnly = node.path("writeOnly").booleanOrFalse(),
                constraints = normalizeConstraints(document, pointer, node),
                defaultValue = node.get("default")?.toJsonValue(),
                examples = node.examples(),
                enum = adaptEnum(document, pointer, node),
                properties = properties,
                items =
                    node.get("items")?.let { items ->
                        adaptSchemaUse(document, "$pointer/items", items)
                    },
                additionalProperties = adaptAdditionalProperties(document, pointer, node),
                compositions = compositions,
                allOfPropertyOwnership = allOfOwnership(compositions),
                extensions = node.nonCanonicalExtensions(),
                source = source,
                acceptsOnlyNull = acceptsOnlyNull,
                contentEncoding = contentKeywords.encoding,
                contentMediaType = contentKeywords.mediaType,
                requiredPropertyNames =
                    node
                        .get("required")
                        ?.mapNotNull(JsonNode::textOrNull)
                        ?.distinct()
                        ?.sorted()
                        .orEmpty(),
            )
        schemas[requestedId] = schema
        return requestedId
    } finally {
        schemasInProgress.remove(requestedId)
    }
}

private data class ContentKeywords(
    val encoding: String?,
    val mediaType: String?,
)

/** Maps OpenAPI 3.0 string formats to their OpenAPI 3.1 JSON Schema content-keyword equivalents. */
private fun AdaptationContext.normalizeContentKeywords(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): ContentKeywords {
    val nativeEncoding = node.path("contentEncoding").textOrNull()
    val nativeMediaType = node.path("contentMediaType").textOrNull()
    if (!normalizesOpenApi30 || node.path("type").textOrNull() != "string") {
        return ContentKeywords(nativeEncoding, nativeMediaType)
    }
    val format = node.path("format").textOrNull()
    val normalized =
        when (format) {
            "byte" -> ContentKeywords(nativeEncoding ?: "base64", nativeMediaType)
            "binary" -> ContentKeywords(nativeEncoding, nativeMediaType ?: "application/octet-stream")
            else -> return ContentKeywords(nativeEncoding, nativeMediaType)
        }
    addDiagnostic(
        code = DiagnosticCode.CONTENT_KEYWORD_NORMALIZED,
        message =
            "OpenAPI 3.0 'format: $format' was normalized to OpenAPI 3.1 content-keyword semantics " +
                "(contentEncoding=${normalized.encoding ?: "-"}, contentMediaType=${normalized.mediaType ?: "-"}).",
        remediation = "Use the corresponding contentEncoding/contentMediaType keyword directly in OpenAPI 3.1.",
        phase = DiagnosticPhase.NORMALIZATION,
        source = document.source("$pointer/format"),
        severity = DiagnosticSeverity.INFO,
    )
    return normalized
}

/**
 * Builds a schema's constraint map, normalizing OpenAPI 3.0's boolean `exclusiveMinimum`/
 * `exclusiveMaximum` forms to the OpenAPI 3.1 JSON Schema 2020-12 numeric forms (see the OAI
 * migration guide). Every other constraint keyword passes through unchanged.
 */
private fun AdaptationContext.normalizeConstraints(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): Map<String, JsonValue> {
    if (!normalizesOpenApi30) return node.constraints()
    val values = sortedMapOf<String, JsonValue>()
    val exclusiveBoundFields = setOf("exclusiveMinimum", "exclusiveMaximum", "minimum", "maximum")
    CONSTRAINT_FIELDS
        .filterNot { it in exclusiveBoundFields }
        .forEach { field -> node.get(field)?.let { values[field] = it.toJsonValue() } }
    normalizeExclusiveBound(document, pointer, node, bound = "minimum", exclusiveField = "exclusiveMinimum", values)
    normalizeExclusiveBound(document, pointer, node, bound = "maximum", exclusiveField = "exclusiveMaximum", values)
    return values
}

/**
 * Normalizes one exclusive-bound pair (`minimum`/`exclusiveMinimum` or `maximum`/`exclusiveMaximum`).
 * A numeric [exclusiveField] is already OpenAPI 3.1-native and passes through untouched with no
 * diagnostic. A boolean [exclusiveField] is OpenAPI 3.0 syntax and is normalized:
 * - `true` with a [bound] sibling -> the numeric 3.1 form `exclusiveField: <bound value>` ([bound]
 *   itself is dropped, since it described the same edge the boolean was modifying).
 * - `true` without a [bound] sibling -> invalid input with no numeric value to derive; the boolean
 *   marker is dropped and a warning records the loss rather than guessing a bound.
 * - `false` -> a no-op in OpenAPI 3.0 (the bound stays inclusive); the boolean marker is dropped
 *   and [bound], if present, passes through unchanged.
 */
private fun AdaptationContext.normalizeExclusiveBound(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    bound: String,
    exclusiveField: String,
    values: MutableMap<String, JsonValue>,
) {
    val exclusiveNode = node.get(exclusiveField)
    val boundNode = node.get(bound)
    val exclusivePointer = "$pointer/${escapePointerSegment(exclusiveField)}"
    when {
        exclusiveNode == null -> {
            boundNode?.let { values[bound] = it.toJsonValue() }
        }

        !exclusiveNode.isBoolean -> {
            values[exclusiveField] = exclusiveNode.toJsonValue()
            boundNode?.let { values[bound] = it.toJsonValue() }
        }

        exclusiveNode.booleanValue() && boundNode != null -> {
            values[exclusiveField] = boundNode.toJsonValue()
            addDiagnostic(
                code = DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED,
                message =
                    "Boolean '$exclusiveField: true' with '$bound: ${boundNode.asText()}' (OpenAPI 3.0) was " +
                        "normalized to the OpenAPI 3.1 numeric form '$exclusiveField: ${boundNode.asText()}'.",
                remediation = "No action required; this is a lossless, well-defined migration-guide mapping.",
                phase = DiagnosticPhase.NORMALIZATION,
                source = document.source(exclusivePointer),
                severity = DiagnosticSeverity.INFO,
            )
        }

        exclusiveNode.booleanValue() -> {
            addDiagnostic(
                code = DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED,
                message =
                    "'$exclusiveField: true' has no '$bound' sibling to derive a numeric bound from; the " +
                        "boolean marker was dropped rather than guessing a value.",
                remediation = "Add an explicit '$bound' alongside '$exclusiveField', or use the OpenAPI 3.1 numeric form directly.",
                phase = DiagnosticPhase.NORMALIZATION,
                source = document.source(exclusivePointer),
                severity = DiagnosticSeverity.WARNING,
            )
        }

        else -> {
            boundNode?.let { values[bound] = it.toJsonValue() }
            addDiagnostic(
                code = DiagnosticCode.EXCLUSIVE_BOUND_NORMALIZED,
                message = "'$exclusiveField: false' (OpenAPI 3.0) is a no-op and was normalized away; '$bound' remains inclusive.",
                remediation = "No action required.",
                phase = DiagnosticPhase.NORMALIZATION,
                source = document.source(exclusivePointer),
                severity = DiagnosticSeverity.INFO,
            )
        }
    }
}

/**
 * Applies the SDKGen policy for `nullable: true` set directly on a schema whose only content is
 * one or more compositions (`oneOf`/`anyOf`/`allOf`) and that carries no own `type`: there is no
 * lossless OpenAPI 3.1 mapping for this shape (see [DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE]).
 * For `oneOf`/`anyOf`, an explicit `type: "null"`-equivalent branch is added so downstream
 * consumers that walk composition branches see the null option explicitly, unless a null-accepting
 * branch is already present. For `allOf`, no branch is added (doing so would make every allOf
 * branch's constraints jointly unsatisfiable by `null`); only the diagnostic is raised.
 */
private fun AdaptationContext.applyNullableCompositionPolicy(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    compositions: List<CompositionModel>,
): List<CompositionModel> {
    val ownNullable = node.path("nullable").booleanOrFalse()
    val hasOwnType = node.get("type") != null
    if (!normalizesOpenApi30 || !ownNullable || hasOwnType || compositions.isEmpty()) return compositions
    val nullablePointer = "$pointer/nullable"
    return compositions.map { composition ->
        when (composition.kind) {
            CompositionKind.ONE_OF, CompositionKind.ANY_OF -> {
                val field = if (composition.kind == CompositionKind.ONE_OF) "oneOf" else "anyOf"
                val alreadyHasNullBranch = hasExplicitNullBranch(document, node, field)
                addDiagnostic(
                    code = DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE,
                    message =
                        "'nullable: true' alongside '$field' (with no own 'type') has no clean OpenAPI 3.1 " +
                            if (alreadyHasNullBranch) {
                                "mapping; the existing explicit null branch is retained."
                            } else {
                                "mapping; SDKGen's policy adds an explicit null-only branch to '$field'."
                            },
                    remediation = "Use an explicit null branch without the legacy nullable keyword in OpenAPI 3.1.",
                    phase = DiagnosticPhase.NORMALIZATION,
                    source = document.source(nullablePointer),
                    severity = DiagnosticSeverity.WARNING,
                )
                if (alreadyHasNullBranch) {
                    composition
                } else {
                    composition.copy(
                        branches =
                            composition.branches +
                                syntheticNullBranch(
                                    document,
                                    pointer,
                                    field,
                                    nullablePointer,
                                ),
                    )
                }
            }

            CompositionKind.ALL_OF -> {
                addDiagnostic(
                    code = DiagnosticCode.NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE,
                    message =
                        "'nullable: true' alongside 'allOf' (with no own 'type') has no clean OpenAPI 3.1 mapping: " +
                            "a null branch cannot be added to 'allOf' without making it unsatisfiable. Nullability " +
                            "is preserved only at the schema level; 'allOf' itself is left unchanged.",
                    remediation = "Wrap the allOf composition in an explicit nullable union outside allOf, or apply a reviewed overlay.",
                    phase = DiagnosticPhase.NORMALIZATION,
                    source = document.source(nullablePointer),
                    severity = DiagnosticSeverity.WARNING,
                )
                composition
            }
        }
    }
}

/** Whether [field] (`oneOf`/`anyOf`) on [node] already contains a recognized null-accepting branch. */
private fun AdaptationContext.hasExplicitNullBranch(
    document: SourceDocument,
    node: JsonNode,
    field: String,
): Boolean {
    val branches = node.get(field)?.takeIf(JsonNode::isArray) ?: return false
    return branches.any { branch ->
        val resolved = resolveOneOfBranchForNullCheck(document, branch)
        resolved.get("type").typeNames() == listOf("null") ||
            (resolved.isObject && resolved.size() == 1 && resolved.path("nullable").booleanOrFalse())
    }
}

/** Registers (idempotently) and returns a reference to a synthetic `type: "null"`-equivalent branch schema. */
private fun AdaptationContext.syntheticNullBranch(
    document: SourceDocument,
    pointer: String,
    field: String,
    nullablePointer: String,
): SchemaRef {
    val branchPointer = "$pointer/$field/x-sdkgen-normalized-null-branch"
    val branchId = canonicalSchemaId(document, branchPointer)
    val branchSource = document.source(nullablePointer)
    schemas.putIfAbsent(branchId, nullOnlySchema(branchId, branchSource))
    return SchemaRef(branchId, branchSource)
}

/** A true null-only [SchemaModel], kept distinct from an unconstrained empty schema. */
private fun nullOnlySchema(
    id: SchemaId,
    source: SourcePointer,
): SchemaModel =
    SchemaModel(
        id = id,
        identityKind = IdentityKind.INLINE,
        referenceTarget = null,
        types = emptyList(),
        format = null,
        nullability = Nullability.NON_NULL,
        nullabilityOrigins = emptyList(),
        description = null,
        deprecated = false,
        readOnly = false,
        writeOnly = false,
        constraints = emptyMap(),
        defaultValue = null,
        examples = emptyList(),
        enum = null,
        properties = emptyList(),
        items = null,
        additionalProperties = null,
        compositions = emptyList(),
        allOfPropertyOwnership = emptyList(),
        extensions = emptyMap(),
        source = source,
        acceptsOnlyNull = true,
    )

private fun AdaptationContext.diagnoseUnsupportedSchemaConstructs(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
) {
    if (node.isBoolean) {
        addDiagnostic(
            code = DiagnosticCode.UNSUPPORTED_BOOLEAN_SCHEMA,
            message = "Boolean JSON Schema values are not yet represented by the Phase 1 semantic model.",
            remediation = "Replace the boolean schema with an equivalent object schema or apply an overlay before normalization.",
            phase = DiagnosticPhase.NORMALIZATION,
            source = document.source(pointer),
        )
        return
    }
    UNSUPPORTED_SCHEMA_KEYWORDS.filter(node::has).forEach { keyword ->
        addDiagnostic(
            code = DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD,
            message = "Schema keyword '$keyword' is not yet represented by the Phase 1 semantic model.",
            remediation = "Rewrite '$keyword' using the supported OpenRouter subset or apply an explicit overlay.",
            phase = DiagnosticPhase.NORMALIZATION,
            source = document.source("$pointer/${escapePointerSegment(keyword)}"),
        )
    }
}

private fun AdaptationContext.adaptProperties(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): List<PropertyModel> {
    val properties = node.get("properties") ?: return emptyList()
    if (!properties.isObject) return emptyList()
    val required =
        node
            .get("required")
            ?.mapNotNull(JsonNode::textOrNull)
            ?.toSet()
            .orEmpty()
    return properties.fieldNames().asSequence().toList().sorted().map { name ->
        val propertyPointer = "$pointer/properties/${escapePointerSegment(name)}"
        val propertyNode = properties.get(name)
        val schemaRef = adaptSchemaUse(document, propertyPointer, propertyNode)
        val target = schemas[schemaRef.schemaId]
        val requiredness = if (name in required) Requiredness.REQUIRED else Requiredness.OPTIONAL
        val nullability =
            if (target != null && referenceChainIsNullable(target)) {
                Nullability.NULLABLE
            } else {
                target?.nullability ?: normalizeNullability(document, propertyPointer, propertyNode).value
            }
        PropertyModel(
            name = name,
            schema = schemaRef,
            requiredness = requiredness,
            nullability = nullability,
            presenceStates = presenceStates(requiredness, nullability),
            readOnly = propertyNode.path("readOnly").booleanOrFalse(),
            writeOnly = propertyNode.path("writeOnly").booleanOrFalse(),
            description = propertyNode.path("description").textOrNull(),
            deprecated = propertyNode.path("deprecated").booleanOrFalse(),
            defaultValue = propertyNode.get("default")?.toJsonValue(),
            examples = propertyNode.examples(),
            extensions = propertyNode.nonCanonicalExtensions(),
            source = document.source(propertyPointer),
        )
    }
}

private fun AdaptationContext.referenceChainIsNullable(schema: SchemaModel): Boolean {
    var current = schema
    val visited = mutableSetOf<SchemaId>()
    while (visited.add(current.id)) {
        if (current.nullability == Nullability.NULLABLE) return true
        val targetId = current.referenceTarget ?: return false
        current = schemas[targetId] ?: return false
    }
    return false
}

internal fun AdaptationContext.adaptSchemaUse(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): SchemaRef {
    val source = document.source(pointer)
    val rawReference = node.get("\$ref")?.textOrNull()
    if (rawReference != null) {
        val targetId =
            try {
                resolveSchemaReference(document, pointer, rawReference)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                val diagnosticId = SchemaId("diagnostic:${document.canonicalUri}#$pointer")
                addDiagnostic(
                    code = DiagnosticCode.UNRESOLVED_REFERENCE,
                    message = "Cannot resolve '$rawReference': ${failure.message}",
                    source = document.source("$pointer/\$ref"),
                )
                schemas.putIfAbsent(
                    diagnosticId,
                    SchemaModel(
                        id = diagnosticId,
                        identityKind = IdentityKind.INLINE,
                        referenceTarget = null,
                        types = emptyList(),
                        format = null,
                        nullability = Nullability.NON_NULL,
                        nullabilityOrigins = emptyList(),
                        description = null,
                        deprecated = false,
                        readOnly = false,
                        writeOnly = false,
                        constraints = emptyMap(),
                        defaultValue = null,
                        examples = emptyList(),
                        enum = null,
                        properties = emptyList(),
                        items = null,
                        additionalProperties = null,
                        compositions = emptyList(),
                        allOfPropertyOwnership = emptyList(),
                        extensions = emptyMap(),
                        source = source,
                    ),
                )
                diagnosticId
            }
        if (normalizesOpenApi30 && node.path("nullable").booleanOrFalse()) {
            val wrapperId = canonicalSchemaId(document, pointer)
            adaptSchema(document, pointer, node, wrapperId, IdentityKind.INLINE)
            return SchemaRef(wrapperId, source)
        }
        return SchemaRef(targetId, source)
    }

    val id = canonicalSchemaId(document, pointer)
    adaptSchema(document, pointer, node, id, IdentityKind.INLINE)
    return SchemaRef(id, source)
}

/** Emits the required warning for the invalid-but-common OpenAPI 3.0 nullable `$ref` sibling. */
private fun AdaptationContext.diagnoseNullableReferenceSibling(
    document: SourceDocument,
    pointer: String,
) {
    addDiagnostic(
        code = DiagnosticCode.NULLABLE_REFERENCE_SIBLING,
        message =
            "'nullable: true' alongside '\$ref' is invalid in OpenAPI 3.0 (sibling keywords next to '\$ref' " +
                "are ignored); SDKGen treats it as a nullable reference wrapper instead of dropping it silently.",
        remediation =
            "Rewrite as 'allOf: [{ \$ref: ... }]' with 'nullable: true' on the wrapper, " +
                "or use OpenAPI 3.1's type/null union directly.",
        phase = DiagnosticPhase.NORMALIZATION,
        source = document.source("$pointer/nullable"),
        severity = DiagnosticSeverity.WARNING,
    )
}

private fun AdaptationContext.resolveSchemaReference(
    document: SourceDocument,
    pointer: String,
    rawReference: String,
): SchemaId {
    val target = repository.resolveReference(document.canonicalUri, rawReference)
    val targetId = canonicalSchemaId(target.document, target.pointer)
    val targetNode = target.document.root.at(target.pointer)
    val identityKind =
        when {
            target.document.canonicalUri != rootDocument.canonicalUri -> IdentityKind.EXTERNAL
            target.pointer.startsWith("/components/schemas/") -> IdentityKind.COMPONENT
            else -> IdentityKind.INLINE
        }
    if (targetId !in schemas && targetId !in schemasInProgress) {
        adaptSchema(target.document, target.pointer, targetNode, targetId, identityKind)
    }
    return targetId
}

private fun AdaptationContext.adaptComposition(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    field: String,
    kind: CompositionKind,
): CompositionModel? {
    val branchesNode = node.get(field) ?: return null
    if (!branchesNode.isArray) return null
    val branches =
        branchesNode.mapIndexed { index, branch ->
            adaptSchemaUse(document, "$pointer/$field/$index", branch)
        }
    val discriminator =
        if (kind == CompositionKind.ONE_OF) {
            adaptDiscriminator(document, pointer, node.get("discriminator"), branches)
        } else {
            null
        }
    return CompositionModel(
        kind = kind,
        branches = branches,
        discriminator = discriminator,
        source = document.source("$pointer/$field"),
    )
}

private fun AdaptationContext.adaptDiscriminator(
    document: SourceDocument,
    schemaPointer: String,
    node: JsonNode?,
    branches: List<SchemaRef>,
): DiscriminatorModel? {
    if (node == null || !node.isObject) return null
    val pointer = "$schemaPointer/discriminator"
    val mapping = TreeMap<String, SchemaId>()
    val mappingNode = node.get("mapping")?.takeIf(JsonNode::isObject)
    mappingNode?.properties()?.forEach { (wireValue, referenceNode) ->
        if (!wireValue.startsWith("x-")) {
            val rawReference = referenceNode.textValue()
            try {
                val target = repository.resolveReference(document.canonicalUri, rawReference)
                mapping[wireValue] = canonicalSchemaId(target.document, target.pointer)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                addDiagnostic(
                    code = DiagnosticCode.INVALID_DISCRIMINATOR_MAPPING,
                    message = "Cannot resolve discriminator mapping '$wireValue' -> '$rawReference': ${failure.message}",
                    source = document.source("$pointer/mapping/${escapePointerSegment(wireValue)}"),
                )
            }
        }
    }
    val mappingExtensions = mappingNode?.nonCanonicalExtensions().orEmpty().mapKeys { (name, _) -> "mapping.$name" }
    val mappedIds = mapping.values.toSet()
    return DiscriminatorModel(
        propertyName = node.path("propertyName").asText(),
        mapping = mapping,
        unmappedBranches =
            branches
                .map(SchemaRef::schemaId)
                .filterNot(mappedIds::contains)
                .distinct()
                .sorted(),
        extensions = (node.nonCanonicalExtensions() + mappingExtensions).toSortedMap(),
        source = document.source(pointer),
    )
}

/**
 * Adapts an `enum` keyword. In OpenAPI 3.0 normalization mode, when the containing schema uses
 * `nullable: true` but its wire value set does not already list `null`, `null` is injected and
 * [DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED] records the change - `nullable: true` combined
 * with an `enum` that omits `null` is a common generator bug (the schema claims to accept `null`
 * but its own enum constraint would reject it), so SDKGen fixes the value set instead of leaving
 * the two keywords in silent contradiction.
 */
private fun AdaptationContext.adaptEnum(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): EnumModel? {
    val enumNode = node.get("enum") ?: return null
    if (!enumNode.isArray) return null
    val explicitlyClosed = node.path("x-sdkgen-enum-open").takeIf(JsonNode::isBoolean)?.booleanValue() == false
    val values = enumNode.map(JsonNode::toJsonValue)
    val enumPointer = "$pointer/enum"
    val withNull =
        if (normalizesOpenApi30 && node.path("nullable").booleanOrFalse() && JsonValue.Null !in values) {
            addDiagnostic(
                code = DiagnosticCode.NULLABLE_ENUM_NULL_INJECTED,
                message =
                    "'nullable: true' is set but 'enum' does not list 'null'; SDKGen injects 'null' into the " +
                        "allowed value set instead of leaving the schema nullable while its own enum rejects null.",
                remediation = "Add 'null' to the 'enum' array explicitly, matching OpenAPI 3.1 JSON Schema semantics.",
                phase = DiagnosticPhase.NORMALIZATION,
                source = document.source(enumPointer),
                severity = DiagnosticSeverity.INFO,
            )
            values + JsonValue.Null
        } else {
            values
        }
    return EnumModel(
        values = withNull,
        openness = if (explicitlyClosed) EnumOpenness.CLOSED else EnumOpenness.OPEN,
        source = document.source(enumPointer),
    )
}

private fun AdaptationContext.adaptAdditionalProperties(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): AdditionalPropertiesModel? {
    val additional = node.get("additionalProperties") ?: return null
    val source = document.source("$pointer/additionalProperties")
    return when {
        additional.isBoolean && additional.booleanValue() -> {
            AdditionalPropertiesModel.FreeForm(source)
        }

        additional.isBoolean -> {
            AdditionalPropertiesModel.Closed(source)
        }

        additional.isObject -> {
            AdditionalPropertiesModel.Typed(
                valueSchema = adaptSchemaUse(document, "$pointer/additionalProperties", additional),
                source = source,
            )
        }

        else -> {
            null
        }
    }
}

private fun AdaptationContext.allOfOwnership(compositions: List<CompositionModel>): List<PropertyOwnership> =
    compositions
        .asSequence()
        .filter { it.kind == CompositionKind.ALL_OF }
        .flatMap { it.branches.asSequence() }
        .flatMap { branch ->
            schemas[branch.schemaId]?.properties.orEmpty().asSequence().map { property ->
                PropertyOwnership(
                    propertyName = property.name,
                    ownerSchemaId = branch.schemaId,
                    constraints = schemas[property.schema.schemaId]?.constraints.orEmpty(),
                    source = property.source,
                )
            }
        }.sortedWith(compareBy(PropertyOwnership::propertyName, { it.ownerSchemaId.value }))
        .toList()

private fun presenceStates(
    requiredness: Requiredness,
    nullability: Nullability,
): List<PresenceState> =
    buildList {
        if (requiredness == Requiredness.OPTIONAL) add(PresenceState.ABSENT)
        if (nullability == Nullability.NULLABLE) add(PresenceState.NULL)
        add(PresenceState.VALUE)
    }
