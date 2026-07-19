@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.model.AcquisitionPolicy
import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.Diagnostic
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.DiscriminatorModel
import com.nabobery.sdkgen.model.EncodingModel
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.EnumOpenness
import com.nabobery.sdkgen.model.HeaderModel
import com.nabobery.sdkgen.model.IdentityKind
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.Nullability
import com.nabobery.sdkgen.model.NullabilityOrigin
import com.nabobery.sdkgen.model.NullabilitySurface
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.ParameterLocation
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.PresenceState
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.PropertyOwnership
import com.nabobery.sdkgen.model.RequestBodyModel
import com.nabobery.sdkgen.model.Requiredness
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SecurityRequirementModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceDocumentIdentity
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.model.StatusSelectorKind
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.media.Schema
import io.swagger.v3.parser.OpenAPIV3Parser
import io.swagger.v3.parser.core.models.ParseOptions
import java.nio.file.Path
import java.util.Collections
import java.util.IdentityHashMap
import java.util.TreeMap
import kotlin.coroutines.cancellation.CancellationException

/**
 * Coverage counters for one [SemanticAdapter.adapt] run, independent of the produced
 * [SemanticDocument]. These exist because a document's `schemas`/`operations` collections alone
 * cannot distinguish "the input had nothing more to represent" from "something was dropped without
 * a trace" — the counters make that distinction auditable.
 *
 * [silentSchemaOmissions] and [silentOperationOmissions] are the load-bearing signal: each is the
 * count of `#/components/schemas` entries (respectively operations) that were neither represented
 * in the resulting document nor accounted for by a diagnostic. A non-zero value means adaptation
 * has a coverage gap that produces no diagnostic trail — every other counter in this class exists
 * to make that computation possible, but these two derived properties are what callers (in
 * particular verification tooling) should assert against directly. In Phase 1, a healthy adapter
 * run keeps both at zero.
 */
public data class AdaptationMetrics(
    public val componentSchemasTotal: Int,
    public val componentSchemasRepresented: Int,
    public val componentSchemasDiagnosed: Int,
    public val operationsTotal: Int,
    public val operationsRepresented: Int,
    public val operationsDiagnosed: Int,
    public val inlineSchemas: Int,
    public val sourceMappedNodes: Int,
    public val unresolvedParserMessages: Int,
    public val resolvedParserMessages: Int,
    public val resolvedSharedIdentityTargets: Int,
) {
    public val silentSchemaOmissions: Int
        get() = componentSchemasTotal - componentSchemasRepresented - componentSchemasDiagnosed

    public val silentOperationOmissions: Int
        get() = operationsTotal - operationsRepresented - operationsDiagnosed
}

/** The outcome of one [SemanticAdapter.adapt] call: the document itself plus its coverage metrics. */
public data class AdaptationResult(
    public val document: SemanticDocument,
    public val metrics: AdaptationMetrics,
)

/**
 * Converts an OpenAPI 3.x document on disk into a [SemanticDocument]. Adaptation parses the input
 * through two independent swagger-parser views — an unresolved view (references left as `$ref`,
 * used to establish canonical schema identity) and a fully resolved view (references inlined, used
 * to walk composition branches and detect schemas shared by more than one reference) — and merges
 * their findings; neither view alone is authoritative for the resulting document. Per-schema and
 * per-operation adaptation failures are caught and converted into diagnostics rather than aborting
 * the whole run: a single malformed schema does not prevent every other schema in the document
 * from being represented. [CancellationException] is the one exception never caught this way — it
 * always propagates by identity so coroutine cancellation of the generation pipeline is never
 * mistaken for, or masked by, an ordinary adaptation failure.
 */
public class SemanticAdapter {
    /** @throws IllegalStateException if the underlying swagger-parser cannot open [path] at all. */
    public fun adapt(
        path: Path,
        rootCanonicalUri: String? = null,
    ): AdaptationResult {
        val repository = SourceRepository.load(path, rootCanonicalUri = rootCanonicalUri)
        val rootDocument = repository.rootDocument()
        val unresolved = parse(path, resolve = false)
        val resolved = parse(path, resolve = true)
        check(unresolved.openAPI != null) {
            "swagger-parser unresolved view failed: ${unresolved.messages.orEmpty().joinToString(" | ")}"
        }
        check(resolved.openAPI != null) {
            "swagger-parser resolved view failed: ${resolved.messages.orEmpty().joinToString(" | ")}"
        }

        val state = AdaptationContext(repository, rootDocument)
        val root = rootDocument.root
        val componentSchemas = root.path("components").path("schemas")
        var representedComponents = 0
        var diagnosedComponents = 0
        if (componentSchemas.isObject) {
            componentSchemas.fieldNames().asSequence().toList().sorted().forEach { name ->
                val pointer = "/components/schemas/${escapePointerSegment(name)}"
                val node = componentSchemas.get(name)
                val represented =
                    adaptComponentSchema(
                        state = state,
                        document = rootDocument,
                        pointer = pointer,
                        node = node,
                        name = name,
                        requestedId = state.canonicalSchemaId(rootDocument, pointer),
                    )
                if (represented) {
                    representedComponents += 1
                } else {
                    diagnosedComponents += 1
                }
            }
        }

        val operations = state.adaptOperations(root)
        val totalOperations = countOperations(root)
        val diagnosedOperations =
            state.diagnostics
                .mapNotNull { diagnostic -> diagnostic.relatedSymbolId?.takeIf { it.startsWith("operation:") } }
                .distinct()
                .size
        val representedOperations = operations.size

        unresolved.messages.orEmpty().sorted().forEach { message ->
            state.addDiagnostic(
                code = DiagnosticCode.PARSER_UNRESOLVED_MESSAGE,
                message = message,
                source = rootDocument.source(""),
                severity = DiagnosticSeverity.WARNING,
                phase = DiagnosticPhase.PARSE,
                remediation = "Inspect the parser detail and update the contract if it indicates unsupported or invalid syntax.",
            )
        }
        resolved.messages.orEmpty().sorted().forEach { message ->
            state.addDiagnostic(
                code = DiagnosticCode.PARSER_RESOLVED_MESSAGE,
                message = message,
                source = rootDocument.source(""),
                severity = DiagnosticSeverity.WARNING,
                phase = DiagnosticPhase.PARSE,
                remediation = "Inspect the parser detail and update the contract if it indicates unsupported or invalid syntax.",
            )
        }

        val document =
            SemanticDocument(
                documentUri = rootDocument.canonicalUri,
                title = root.path("info").path("title").textOrNull(),
                version = root.path("info").path("version").textOrNull(),
                sourceDocuments =
                    repository.documents
                        .map { document ->
                            SourceDocumentIdentity(
                                canonicalUri = document.canonicalUri,
                                sha256 = document.sha256,
                                contentLength = document.contentLength,
                                acquisitionPolicy = AcquisitionPolicy.LOCAL_FILE,
                                source = document.source(""),
                            )
                        }.sortedBy(SourceDocumentIdentity::canonicalUri),
                schemas = state.schemas.toSortedMap(),
                operations =
                    operations.sortedWith(
                        compareBy(OperationModel::path, OperationModel::method, OperationModel::operationId),
                    ),
                securityAlternatives = state.adaptSecurity(root.get("security"), rootDocument, "/security"),
                extensions = root.nonCanonicalExtensions(),
                diagnostics =
                    state.diagnostics.sortedWith(
                        compareBy({
                            it.source.documentUri
                        }, { it.source.jsonPointer }, Diagnostic::code),
                    ),
                source = rootDocument.source(""),
                securitySchemes =
                    state.adaptSecuritySchemes(
                        root.path("components").path("securitySchemes"),
                        rootDocument,
                        "/components/securitySchemes",
                    ),
            )
        val componentTotal = componentSchemas.takeIf(JsonNode::isObject)?.size() ?: 0
        return AdaptationResult(
            document = document,
            metrics =
                AdaptationMetrics(
                    componentSchemasTotal = componentTotal,
                    componentSchemasRepresented = representedComponents,
                    componentSchemasDiagnosed = diagnosedComponents,
                    operationsTotal = totalOperations,
                    operationsRepresented = representedOperations,
                    operationsDiagnosed = diagnosedOperations,
                    inlineSchemas = document.schemas.values.count { it.identityKind == IdentityKind.INLINE },
                    sourceMappedNodes = repository.documents.sumOf { it.locations.size },
                    unresolvedParserMessages = unresolved.messages.orEmpty().size,
                    resolvedParserMessages = resolved.messages.orEmpty().size,
                    resolvedSharedIdentityTargets = countSharedResolvedIdentityTargets(resolved.openAPI),
                ),
        )
    }

    private fun parse(
        path: Path,
        resolve: Boolean,
    ) = OpenAPIV3Parser().readLocation(
        path.toRealPath().toUri().toString(),
        null,
        ParseOptions().apply {
            setResolve(resolve)
            setResolveFully(resolve)
            setResolveCombinators(false)
        },
    )

    private fun countSharedResolvedIdentityTargets(openApi: OpenAPI): Int {
        val components =
            openApi.components
                ?.schemas
                .orEmpty()
                .values
                .filterNotNull()
        val occurrenceCounts = IdentityHashMap<Schema<*>, Int>()
        val visited = Collections.newSetFromMap(IdentityHashMap<Schema<*>, Boolean>())

        fun visit(schema: Schema<*>) {
            if (!visited.add(schema)) return
            val children =
                buildList {
                    schema.properties
                        ?.values
                        ?.filterNotNull()
                        ?.let(::addAll)
                    schema.items?.let(::add)
                    schema.oneOf?.filterNotNull()?.let(::addAll)
                    schema.anyOf?.filterNotNull()?.let(::addAll)
                    schema.allOf?.filterNotNull()?.let(::addAll)
                    schema.not?.let(::add)
                    (schema.additionalProperties as? Schema<*>)?.let(::add)
                }
            children.forEach { child ->
                occurrenceCounts[child] = (occurrenceCounts[child] ?: 0) + 1
                visit(child)
            }
        }

        components.forEach(::visit)
        return occurrenceCounts.values.count { it >= 2 }
    }

    private fun countOperations(root: JsonNode): Int {
        val methods = HTTP_METHODS.toSet()
        val paths = root.path("paths")
        if (!paths.isObject) return 0
        return paths.properties().asSequence().sumOf { (_, pathItem) ->
            pathItem.fieldNames().asSequence().count { it.lowercase() in methods }
        }
    }
}

/**
 * Adapts a single component schema, converting any failure into a [DiagnosticCode.SCHEMA_ADAPTATION_FAILED]
 * diagnostic. [CancellationException] is never converted: it is rethrown by identity so that generation
 * cancellation is never mistaken for an ordinary adaptation failure.
 *
 * @return `true` when the schema was represented, `false` when a diagnostic was recorded instead.
 */
internal fun adaptComponentSchema(
    state: AdaptationContext,
    document: SourceDocument,
    pointer: String,
    node: JsonNode,
    name: String,
    requestedId: SchemaId,
): Boolean {
    try {
        state.adaptSchema(
            document = document,
            pointer = pointer,
            node = node,
            requestedId = requestedId,
            identityKind = IdentityKind.COMPONENT,
        )
        return true
    } catch (cancellation: CancellationException) {
        throw cancellation
    } catch (failure: Throwable) {
        state.addDiagnostic(
            code = DiagnosticCode.SCHEMA_ADAPTATION_FAILED,
            message = "Component schema '$name' could not be adapted: ${failure.message}",
            source = document.source(pointer),
            relatedSymbolId = "schema:$name",
        )
        return false
    }
}
