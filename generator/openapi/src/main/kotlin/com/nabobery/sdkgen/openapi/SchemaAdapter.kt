@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.AllOfPropertyResolution
import com.nabobery.sdkgen.model.AllOfResolutionSource
import com.nabobery.sdkgen.model.AllOfResolutionStrategy
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
import com.nabobery.sdkgen.openapi.overlays.DocumentCodec
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

/** A standard OpenAPI 3.1 `{ type: "null" }` branch. */
private fun JsonNode.isStandardNullBranch(): Boolean = get("type").typeNames() == listOf("null")

/**
 * The exact legacy lone `{ nullable: true }` marker branch: an object whose only member is
 * `nullable: true`, recognized as null-accepting under the SDKGen OpenAPI 3.0 compatibility policy.
 */
private fun JsonNode.isLegacyLoneNullableBranch(): Boolean =
    isObject && size() == 1 && path("nullable").booleanOrFalse()

/** An unconstrained branch (`{}` or boolean `true`) that structurally admits any value, including `null`. */
private fun JsonNode.isUnconstrainedBranch(): Boolean = (isObject && size() == 0) || (isBoolean && booleanValue())

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
            val standardNullBranch = branch.isStandardNullBranch()
            val legacyNullBranch = branch.isLegacyLoneNullableBranch()
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
            val standardNullBranch = resolved.isStandardNullBranch()
            val legacyNullBranch = resolved.isLegacyLoneNullableBranch()
            val unconstrainedBranch = resolved.isUnconstrainedBranch()
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
        val allOfPropertyResolutions = adaptAllOfPropertyResolutions(document, pointer, node, compositions)
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
                allOfPropertyResolutions = allOfPropertyResolutions,
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

private fun AdaptationContext.adaptAllOfPropertyResolutions(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    compositions: List<CompositionModel>,
): List<AllOfPropertyResolution> {
    val extensionPointer = "$pointer/x-sdkgen-allof-resolution"
    val extension = node.get("x-sdkgen-allof-resolution") ?: return emptyList()
    val allOf =
        node.get("allOf")?.takeIf(JsonNode::isArray)
            ?: invalidAllOfResolution(extensionPointer, "requires a schema with an array-valued allOf")
    if (compositions.count { it.kind == CompositionKind.ALL_OF } != 1) {
        invalidAllOfResolution(extensionPointer, "requires exactly one allOf composition")
    }
    if (!extension.isObject) invalidAllOfResolution(extensionPointer, "must be an object")
    requireAllOfFields(extension, extensionPointer, setOf("properties"))
    val propertiesPointer = "$extensionPointer/properties"
    val properties = extension.get("properties") ?: invalidAllOfResolution(propertiesPointer, "is required")
    if (!properties.isObject) invalidAllOfResolution(propertiesPointer, "must be an object")

    return properties
        .properties()
        .asSequence()
        .toList()
        .sortedBy { it.key }
        .map { (propertyName, entry) ->
            val entryPointer = "$propertiesPointer/${escapePointerSegment(propertyName)}"
            if (!entry.isObject) invalidAllOfResolution(entryPointer, "must be an object")
            requireAllOfFields(entry, entryPointer, setOf("strategy", "source"))
            val strategyPointer = "$entryPointer/strategy"
            val strategy = entry.get("strategy")
            if (strategy?.textOrNull() != "unionSupersede") {
                invalidAllOfResolution(strategyPointer, "must equal 'unionSupersede'")
            }
            val sourcePointer = "$entryPointer/source"
            val source = entry.get("source") ?: invalidAllOfResolution(sourcePointer, "is required")
            if (!source.isObject) invalidAllOfResolution(sourcePointer, "must be an object")
            requireAllOfFields(
                source,
                sourcePointer,
                setOf("ref", "inlineSchemaSha256", "propertySchemaSha256"),
            )
            // Enforce the ref/inline XOR by JSON field *presence* before validating either field's value,
            // so a malformed second identity (e.g. a valid 'ref' beside a non-textual 'inlineSchemaSha256')
            // can never be silently ignored and accepted as the other form.
            val hasRef = source.has("ref")
            val hasInline = source.has("inlineSchemaSha256")
            if (hasRef == hasInline) {
                invalidAllOfResolution(sourcePointer, "must contain exactly one of 'ref' or 'inlineSchemaSha256'")
            }
            val ref =
                if (hasRef) {
                    source.get("ref")?.textOrNull()?.takeIf(String::isNotEmpty)
                        ?: invalidAllOfResolution("$sourcePointer/ref", "must be a non-empty string")
                } else {
                    null
                }
            val inlineDigest =
                if (hasInline) {
                    requireSha256Field(
                        source,
                        "$sourcePointer/inlineSchemaSha256",
                        "inlineSchemaSha256",
                    )
                } else {
                    null
                }
            val propertyDigest =
                requireSha256Field(source, "$sourcePointer/propertySchemaSha256", "propertySchemaSha256")
            val matches =
                allOf
                    .mapIndexed { index, branch -> index to branch }
                    .filter { (_, branch) ->
                        when {
                            ref != null -> {
                                branch.get("\$ref")?.textOrNull() == ref
                            }

                            else -> {
                                branch.get("\$ref") == null &&
                                    resolvedSchemaDigest(document, branch) == inlineDigest
                            }
                        }
                    }
            if (matches.size != 1) {
                // Name every candidate so an overlay author (or a digest-shift after a resolved-form change)
                // can re-derive the correct election without reverse-engineering the canonical form.
                val candidates =
                    allOf
                        .mapIndexed { index, branch ->
                            val identity =
                                branch.get("\$ref")?.textOrNull()
                                    ?: "inlineSchemaSha256=${resolvedSchemaDigest(document, branch)}"
                            "allOf/$index: $identity"
                        }.joinToString("; ")
                invalidAllOfResolution(
                    sourcePointer,
                    "selected exactly one allOf branch but matched ${matches.size} (candidates: $candidates)",
                )
            }
            val (branchIndex, branch) = matches.single()
            // Follow the branch's full $ref/alias chain (not just one hop) so a property declared behind an
            // alias binds, and require an unambiguous declaration when more than one chain layer declares it.
            val candidates = collectChainProperties(document, "$pointer/allOf/$branchIndex", branch, propertyName)
            if (candidates.isEmpty()) {
                invalidAllOfResolution(
                    sourcePointer,
                    "property '$propertyName' is missing from the selected allOf branch and its reference chain",
                )
            }
            val digestsByForm = candidates.associateBy { resolvedSchemaDigest(it.document, it.node) }
            if (digestsByForm.size > 1) {
                invalidAllOfResolution(
                    sourcePointer,
                    "property '$propertyName' is declared ambiguously across the selected allOf branch reference " +
                        "chain (${digestsByForm.keys.sorted().joinToString(", ")})",
                )
            }
            val (actualPropertyDigest, selectedProperty) = digestsByForm.entries.single().toPair()
            if (actualPropertyDigest != propertyDigest) {
                invalidAllOfResolution(
                    "$sourcePointer/propertySchemaSha256",
                    "does not match the resolved schema of property '$propertyName' at " +
                        "'${selectedProperty.document.canonicalUri}#${selectedProperty.pointer}' " +
                        "(expected $actualPropertyDigest)",
                )
            }
            // Resolve the winning branch's declaration of the property to the semantic-model SchemaId the
            // adapter assigned it, so the engine's strict resolver can elect this branch by matching an
            // operand's identity directly — never by re-digesting the adapted model (whose structural digest
            // could not agree with the source-byte propertySchemaSha256 computed here). The single allOf
            // composition's branches are 1:1 with the raw allOf array indices (see adaptComposition), so
            // branchIndex names the same branch on both sides.
            val allOfComposition = compositions.single { it.kind == CompositionKind.ALL_OF }
            // An accepted audited extension must bind exactly once: a validated entry whose winning branch
            // cannot be resolved to a semantic property SchemaId would otherwise carry a null election that the
            // resolver silently ignores — the override would validate, then do nothing, and the conflict would
            // surface as an ordinary blocker with the audit apparently in place. Fail adaptation instead.
            val winningBranchRef =
                allOfComposition.branches.getOrNull(branchIndex)
                    ?: invalidAllOfResolution(
                        sourcePointer,
                        "selected allOf branch index $branchIndex has no adapted composition branch",
                    )
            val winningPropertySchemaId =
                branchPropertySchemaId(winningBranchRef.schemaId, propertyName, mutableSetOf())
                    ?: invalidAllOfResolution(
                        sourcePointer,
                        "property '$propertyName' could not be bound to a semantic schema id on the selected " +
                            "allOf branch '${winningBranchRef.schemaId.value}'",
                    )
            AllOfPropertyResolution(
                propertyName = propertyName,
                strategy = AllOfResolutionStrategy.UNION_SUPERSEDE,
                branch =
                    ref?.let(AllOfResolutionSource::Referenced)
                        ?: AllOfResolutionSource.Inline(inlineDigest!!),
                propertySchemaSha256 = propertyDigest,
                source = document.source(entryPointer),
                winningPropertySchemaId = winningPropertySchemaId,
            )
        }
}

/**
 * The semantic [SchemaId] the adapter assigned to the selected allOf branch's declaration of
 * [propertyName]: the property declared directly on [branchSchemaId], else the same lookup across a
 * `$ref`/alias wrapper or a nested `allOf` branch subtree. Returns `null` when no single semantic node
 * carries the property; the caller then FAILS adaptation (an accepted audited election must bind exactly
 * once — [AllOfPropertyResolution.winningPropertySchemaId] is non-null by contract), rather than
 * producing an entry the engine would have to ignore.
 */
private fun AdaptationContext.branchPropertySchemaId(
    branchSchemaId: SchemaId,
    propertyName: String,
    visited: MutableSet<SchemaId>,
): SchemaId? {
    val schema = schemas[branchSchemaId] ?: return null
    if (!visited.add(schema.id)) return null
    schema.properties.firstOrNull { it.name == propertyName }?.let { return it.schema.schemaId }
    schema.referenceTarget?.let { return branchPropertySchemaId(it, propertyName, visited) }
    return schema.compositions
        .filter { it.kind == CompositionKind.ALL_OF }
        .flatMap { it.branches }
        .mapNotNull { branchPropertySchemaId(it.schemaId, propertyName, visited) }
        .singleOrNull()
}

private fun requireAllOfFields(
    node: JsonNode,
    pointer: String,
    allowed: Set<String>,
) {
    node.fieldNames().asSequence().filterNot(allowed::contains).sorted().firstOrNull()?.let { field ->
        invalidAllOfResolution("$pointer/${escapePointerSegment(field)}", "is not a supported field")
    }
}

private fun isSha256(value: String?): Boolean = value != null && Regex("^[0-9a-f]{64}$").matches(value)

private fun requireSha256Field(
    source: JsonNode,
    pointer: String,
    field: String,
): String {
    val value = source.get(field)?.textOrNull()
    if (value == null || !isSha256(value)) {
        invalidAllOfResolution(pointer, "must be exactly 64 lowercase hexadecimal characters")
    }
    return value
}

/** One layer of a branch reference chain that declares the audited property. */
private data class ChainProperty(
    val document: SourceDocument,
    val pointer: String,
    val node: JsonNode,
)

/**
 * Walks the selected allOf branch and returns every layer that declares [propertyName] under its own
 * `properties`. The walk follows three structural relations — the SAME ones the semantic-side
 * [branchPropertySchemaId] traverses, so validation and id-binding agree on what a branch "declares":
 * - the node's own `properties/[propertyName]`;
 * - each `$ref`/alias hop, resolved against the document that declared it so external references use their
 *   own base URI;
 * - every branch of a nested `allOf` (a property may live only inside a deeper allOf layer).
 * Reference cycles terminate deterministically: a `$ref` target whose canonical `<documentUri>#<pointer>`
 * id has already been visited ends that path (the finite JSON tree bounds the non-`$ref` recursion). The
 * caller requires the returned layers to agree on a single resolved property form (see
 * [resolvedSchemaDigest]); a genuinely ambiguous chain is reported rather than silently resolved.
 */
private fun AdaptationContext.collectChainProperties(
    startDocument: SourceDocument,
    startPointer: String,
    startNode: JsonNode,
    propertyName: String,
): List<ChainProperty> {
    val results = mutableListOf<ChainProperty>()
    val visited = mutableSetOf<String>()

    fun walk(
        document: SourceDocument,
        pointer: String,
        node: JsonNode,
    ) {
        node.get("properties")?.takeIf(JsonNode::isObject)?.get(propertyName)?.let { property ->
            results +=
                ChainProperty(
                    document = document,
                    pointer = "$pointer/properties/${escapePointerSegment(propertyName)}",
                    node = property,
                )
        }
        node.get("allOf")?.takeIf(JsonNode::isArray)?.forEachIndexed { index, branch ->
            walk(document, "$pointer/allOf/$index", branch)
        }
        val rawReference = node.get("\$ref")?.textOrNull() ?: return
        val resolved =
            try {
                repository.resolveReference(document.canonicalUri, rawReference)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                invalidAllOfResolution(
                    "$pointer/\$ref",
                    "cannot resolve '$rawReference': ${failure.message}",
                )
            }
        if (!visited.add("${resolved.document.canonicalUri}#${resolved.pointer}")) return
        walk(resolved.document, resolved.pointer, resolved.document.root.at(resolved.pointer))
    }

    walk(startDocument, startPointer, startNode)
    return results
}

/**
 * The SHA-256, over UTF-8, of the *resolved structural form* of [node] (see [resolvedSchemaForm]):
 * canonical JSON — object keys sorted, no insignificant whitespace, via [DocumentCodec.canonicalJson]
 * — of the schema with every `$ref` replaced by the content of its target, transitively. This is the
 * exact representation an overlay author's `inlineSchemaSha256`/`propertySchemaSha256` must reproduce,
 * so mutating a referenced target without touching the `$ref` text still shifts the digest and fails
 * the audit closed.
 */
private fun AdaptationContext.resolvedSchemaDigest(
    document: SourceDocument,
    node: JsonNode,
): String =
    DocumentCodec.sha256(
        DocumentCodec.canonicalJson(resolvedSchemaForm(document, node, mutableSetOf())).encodeToByteArray(),
    )

/**
 * Builds the resolved structural form of [node]: a JSON tree in which every `$ref` is replaced,
 * transitively, by the content of its target. Each reference resolves against the document that
 * declared it. When a `$ref` is reached whose canonical target id (`<documentUri>#<pointer>`) is
 * already being resolved on the current path, it is a cycle and is substituted with the deterministic
 * token object `{ "$sdkgen-allof-resolution-cycle": "<documentUri>#<pointer>" }` instead of recursing
 * forever; an unresolvable `$ref` is likewise substituted with
 * `{ "$sdkgen-allof-resolution-unresolved-ref": "<raw reference>" }`. Sibling keywords declared
 * alongside a `$ref` apply conjunctively: when a sibling and the resolved target declare the same
 * keyword, both values are preserved in a `$sdkgen-allof-resolution-conjunction` token.
 */
private fun AdaptationContext.resolvedSchemaForm(
    document: SourceDocument,
    node: JsonNode,
    activeReferences: MutableSet<String>,
): JsonNode =
    when {
        node.isObject -> {
            val rawReference = node.get("\$ref").textOrNull()
            if (rawReference != null) {
                resolvedReferenceForm(document, node, rawReference, activeReferences)
            } else {
                val result = DocumentCodec.objectNode()
                node.properties().forEach { (name, value) ->
                    result.set<JsonNode>(name, resolvedSchemaForm(document, value, activeReferences))
                }
                result
            }
        }

        node.isArray -> {
            val result = DocumentCodec.arrayNode()
            node.forEach { result.add(resolvedSchemaForm(document, it, activeReferences)) }
            result
        }

        else -> {
            node.deepCopy()
        }
    }

private fun AdaptationContext.resolvedReferenceForm(
    document: SourceDocument,
    node: JsonNode,
    rawReference: String,
    activeReferences: MutableSet<String>,
): JsonNode {
    val resolved =
        try {
            repository.resolveReference(document.canonicalUri, rawReference)
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            return DocumentCodec.objectNode().put("\$sdkgen-allof-resolution-unresolved-ref", rawReference)
        }
    val canonicalId = "${resolved.document.canonicalUri}#${resolved.pointer}"
    if (!activeReferences.add(canonicalId)) {
        return DocumentCodec.objectNode().put("\$sdkgen-allof-resolution-cycle", canonicalId)
    }
    val targetForm =
        try {
            resolvedSchemaForm(resolved.document, resolved.document.root.at(resolved.pointer), activeReferences)
        } finally {
            activeReferences.remove(canonicalId)
        }
    val siblings = node.properties().filter { (name, _) -> name != "\$ref" }
    if (siblings.isEmpty() || targetForm !is ObjectNode) return targetForm
    val merged = DocumentCodec.objectNode()
    targetForm.properties().forEach { (name, value) -> merged.set<JsonNode>(name, value) }
    siblings.forEach { (name, value) ->
        val resolvedSibling = resolvedSchemaForm(document, value, activeReferences)
        val shadowed = merged.get(name)
        if (shadowed == null) {
            merged.set<JsonNode>(name, resolvedSibling)
        } else {
            // JSON Schema applies `$ref` siblings CONJUNCTIVELY — both the target's keyword and the sibling's
            // constrain the value. The digest form must keep both: a last-wins replacement would drop the
            // target's declaration from the hashed bytes, and a mutation of that shadowed keyword could then
            // drift without shifting the digest, silently weakening the fail-closed audit guarantee.
            merged.set<JsonNode>(
                name,
                DocumentCodec
                    .objectNode()
                    .set<ObjectNode>(
                        "\$sdkgen-allof-resolution-conjunction",
                        DocumentCodec.arrayNode().add(shadowed).add(resolvedSibling),
                    ),
            )
        }
    }
    return merged
}

private fun invalidAllOfResolution(
    pointer: String,
    reason: String,
): Nothing = throw CanonicalExtensionAdaptationException(pointer, reason)

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
        resolved.isStandardNullBranch() || resolved.isLegacyLoneNullableBranch()
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
            message = "Boolean JSON Schema values are not yet represented by the semantic model.",
            remediation = "Replace the boolean schema with an equivalent object schema or apply an overlay before normalization.",
            phase = DiagnosticPhase.NORMALIZATION,
            source = document.source(pointer),
        )
        return
    }
    UNSUPPORTED_SCHEMA_KEYWORDS.filter(node::has).forEach { keyword ->
        addDiagnostic(
            code = DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD,
            message = "Schema keyword '$keyword' is not yet represented by the semantic model.",
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

/**
 * Branch indices whose *direct* legacy lone `{ nullable: true }` marker is canonicalized to a
 * null-only branch, making the marker semantically identical to a `{ type: "null" }` branch (the
 * OpenAPI 3.1 idiom) instead of surviving as an empty value branch with no exact JSON kind.
 *
 * `anyOf` is permissive, mirroring [normalizeAnyOfNullability]: every direct marker qualifies.
 * `oneOf` mirrors [normalizeOneOfNullability]'s exactly-one rule: markers are canonicalized only
 * when the `oneOf` has exactly one null-accepting branch overall, so an ambiguous `oneOf` (which
 * stays non-nullable and is reported) is left untouched. Only direct inline markers are considered;
 * `$ref` branches are never expanded here, so which branches are *recognized* is not broadened.
 */
private fun AdaptationContext.canonicalLegacyNullBranchIndices(
    document: SourceDocument,
    node: JsonNode,
    field: String,
    kind: CompositionKind,
): Set<Int> {
    if (kind == CompositionKind.ALL_OF) return emptySet()
    val branches = node.get(field)?.takeIf(JsonNode::isArray) ?: return emptySet()
    val directLegacyMarkers =
        branches
            .withIndex()
            .filter { (_, branch) -> branch.isLegacyLoneNullableBranch() }
            .map { it.index }
            .toSet()
    if (directLegacyMarkers.isEmpty()) return emptySet()
    return when (kind) {
        CompositionKind.ANY_OF -> {
            directLegacyMarkers
        }

        CompositionKind.ONE_OF -> {
            if (oneOfNullAcceptingBranchCount(document, branches) == 1) directLegacyMarkers else emptySet()
        }

        CompositionKind.ALL_OF -> {
            emptySet()
        }
    }
}

/** Counts `oneOf` branches that accept `null` under [normalizeOneOfNullability]'s exact recognition rule. */
private fun AdaptationContext.oneOfNullAcceptingBranchCount(
    document: SourceDocument,
    branches: JsonNode,
): Int =
    branches.count { branch ->
        val resolved = resolveOneOfBranchForNullCheck(document, branch)
        resolved.isStandardNullBranch() || resolved.isLegacyLoneNullableBranch() || resolved.isUnconstrainedBranch()
    }

/**
 * Authoritatively installs and returns a reference to a null-only branch schema at [branchPointer],
 * standing in for the empty value schema a raw `{ nullable: true }` marker would otherwise adapt into.
 * The identity and source match [adaptSchemaUse]'s so provenance and discriminator branch ids are stable.
 *
 * Canonicalization is order-independent: if an alphabetically-earlier component `$ref`s this branch
 * pointer directly, the ordinary adaptation of the lone marker may already occupy [branchPointer]'s
 * canonical id. Because a `$ref` links to `schemas` by id (see [adaptSchemaUse]/[resolveSchemaReference])
 * rather than copying, overwriting the shared entry here re-points that alias at the canonical null-only
 * model too. The overwrite is guarded: the only replaceable pre-existing value is the ordinary,
 * typeless adaptation of *this exact* lone `{ nullable: true }` marker; anything else fails loudly.
 */
private fun AdaptationContext.nullOnlyBranchRef(
    document: SourceDocument,
    branchPointer: String,
    branchNode: JsonNode,
): SchemaRef {
    val source = document.source(branchPointer)
    val id = canonicalSchemaId(document, branchPointer)
    val existing = schemas[id]
    if (existing == null || !existing.acceptsOnlyNull) {
        if (existing != null) {
            require(branchNode.isLegacyLoneNullableBranch()) {
                "Refusing to canonicalize null-only branch at '$id': raw branch node is not a lone " +
                    "'{ nullable: true }' marker."
            }
            require(existing.isOrdinaryLoneNullableAdaptation()) {
                "Refusing to overwrite schema at '$id' during null-only branch canonicalization: the " +
                    "existing entry is not the ordinary adaptation of a lone '{ nullable: true }' marker."
            }
        }
        schemas[id] = nullOnlySchema(id, source)
    }
    return SchemaRef(id, source)
}

/**
 * The ordinary adaptation of a lone `{ nullable: true }` marker: a typeless, contentless schema that is
 * nullable purely via the OpenAPI 3.0 marker and carries no other assertions. This is the only value
 * [nullOnlyBranchRef] is permitted to replace when canonicalizing a branch identity.
 */
private fun SchemaModel.isOrdinaryLoneNullableAdaptation(): Boolean =
    !acceptsOnlyNull &&
        referenceTarget == null &&
        types.isEmpty() &&
        format == null &&
        properties.isEmpty() &&
        compositions.isEmpty() &&
        items == null &&
        additionalProperties == null &&
        enum == null &&
        constraints.isEmpty() &&
        requiredPropertyNames.isEmpty() &&
        nullability == Nullability.NULLABLE

private fun AdaptationContext.adaptComposition(
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    field: String,
    kind: CompositionKind,
): CompositionModel? {
    val branchesNode = node.get(field) ?: return null
    if (!branchesNode.isArray) return null
    val canonicalNullBranchIndices = canonicalLegacyNullBranchIndices(document, node, field, kind)
    val branches =
        branchesNode.mapIndexed { index, branch ->
            val branchPointer = "$pointer/$field/$index"
            if (index in canonicalNullBranchIndices) {
                nullOnlyBranchRef(document, branchPointer, branch)
            } else {
                adaptSchemaUse(document, branchPointer, branch)
            }
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
