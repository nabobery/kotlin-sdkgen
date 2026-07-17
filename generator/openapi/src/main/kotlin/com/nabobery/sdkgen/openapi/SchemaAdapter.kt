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
                add(
                    NullabilityOrigin(
                        NullabilitySurface.OPENAPI_3_0_NULLABLE,
                        document.source("$pointer/nullable"),
                    ),
                )
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
): JsonNode {
    val rawReference = branch.get("\$ref")?.textOrNull() ?: return branch
    return try {
        val target = repository.resolveReference(document.canonicalUri, rawReference)
        target.document.root.at(target.pointer)
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
        val types = node.get("type").typeNames().filterNot { it == "null" }
        val normalizedNullability = normalizeNullability(document, pointer, node)
        val properties = adaptProperties(document, pointer, node)
        val compositions =
            buildList {
                adaptComposition(document, pointer, node, "oneOf", CompositionKind.ONE_OF)?.let(::add)
                adaptComposition(document, pointer, node, "anyOf", CompositionKind.ANY_OF)?.let(::add)
                adaptComposition(document, pointer, node, "allOf", CompositionKind.ALL_OF)?.let(::add)
            }
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
                constraints = node.constraints(),
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
                extensions = node.extensions(),
                source = source,
            )
        schemas[requestedId] = schema
        return requestedId
    } finally {
        schemasInProgress.remove(requestedId)
    }
}

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
        val nullability = target?.nullability ?: normalizeNullability(document, propertyPointer, propertyNode).value
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
            extensions = propertyNode.extensions(),
            source = document.source(propertyPointer),
        )
    }
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
        return SchemaRef(targetId, source)
    }

    val id = canonicalSchemaId(document, pointer)
    adaptSchema(document, pointer, node, id, IdentityKind.INLINE)
    return SchemaRef(id, source)
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
    val mappingExtensions = mappingNode?.extensions().orEmpty().mapKeys { (name, _) -> "mapping.$name" }
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
        extensions = (node.extensions() + mappingExtensions).toSortedMap(),
        source = document.source(pointer),
    )
}

private fun adaptEnum(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
): EnumModel? {
    val enumNode = node.get("enum") ?: return null
    if (!enumNode.isArray) return null
    val explicitlyClosed = node.path("x-sdkgen-enum-open").takeIf(JsonNode::isBoolean)?.booleanValue() == false
    return EnumModel(
        values = enumNode.map(JsonNode::toJsonValue),
        openness = if (explicitlyClosed) EnumOpenness.CLOSED else EnumOpenness.OPEN,
        source = document.source("$pointer/enum"),
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
