package com.nabobery.sdkgen.model

/**
 * A schema's identity within a [SemanticDocument], stable across adaptation runs for a given
 * input. Two schemas share a [SchemaId] if and only if they represent the same OpenAPI schema
 * node — either the same named component schema entry, or the same inline location.
 */
@JvmInline
public value class SchemaId(
    public val value: String,
) : Comparable<SchemaId> {
    public override fun compareTo(other: SchemaId): Int = value.compareTo(other.value)

    public override fun toString(): String = value
}

/** A 1-based line/column position paired with a 0-based byte offset into the source document. */
public data class SourceLocation(
    public val line: Int,
    public val column: Int,
    public val byteOffset: Long,
)

/**
 * Traces a [MaterialNode] back to the exact byte range in the original input that produced it.
 * `documentUri` identifies which staged source document (root, reference, or overlay result)
 * the node came from; `jsonPointer` is the RFC 6901 pointer within that document.
 */
public data class SourcePointer(
    public val documentUri: String,
    public val jsonPointer: String,
    public val location: SourceLocation,
)

/**
 * A JSON value carried through the semantic model without loss — used for defaults, examples,
 * enum members, and vendor extensions. Distinct from Kotlin's native types so that adaptation
 * never has to decide a target representation before the declaration/emission stage decides it.
 */
public sealed interface JsonValue {
    public data object Null : JsonValue

    public data class BooleanValue(
        val value: Boolean,
    ) : JsonValue

    /** Preserves the lexical form of the source number (e.g. `1.0` vs `1`, exact precision). */
    public data class NumberValue(
        val lexicalValue: String,
    ) : JsonValue

    public data class StringValue(
        val value: String,
    ) : JsonValue

    public data class ArrayValue(
        val values: List<JsonValue>,
    ) : JsonValue

    public data class ObjectValue(
        val properties: Map<String, JsonValue>,
    ) : JsonValue
}

/**
 * How a [SchemaModel] acquired its [SchemaId]: whether it is a named component-schema
 * definition ([COMPONENT]), a schema written inline at its point of use ([INLINE]), or a schema
 * that originates outside the root document's own component set ([EXTERNAL], e.g. resolved
 * through a reference into a separate staged document). Paired with [SchemaModel.referenceTarget]:
 * a schema that is itself a bare `$ref` wrapper carries the referenced id there while its own
 * `identityKind` still reflects where the `$ref` node itself was written.
 */
public enum class IdentityKind {
    COMPONENT,
    INLINE,
    EXTERNAL,
}

public enum class AcquisitionPolicy {
    LOCAL_FILE,
}

/** Whether a property or parameter must appear in a valid instance (independent of [Nullability]). */
public enum class Requiredness {
    REQUIRED,
    OPTIONAL,
}

/** Whether an explicit JSON `null` is a valid value once the property is present (independent of [Requiredness]). */
public enum class Nullability {
    NULLABLE,
    NON_NULL,
}

/**
 * The three ways a property can occur in a JSON instance. [Requiredness] and [Nullability] each
 * describe one axis of a schema's *contract*; `PresenceState` describes what a given property
 * declaration actually admits as a set of concrete instance shapes, which is not a simple product
 * of the other two:
 * - [ABSENT]: the key is missing entirely. Only possible when [Requiredness] is `OPTIONAL`.
 * - [NULL]: the key is present with a JSON `null` value. Only possible when [Nullability] is
 *   `NULLABLE`.
 * - [VALUE]: the key is present with a non-null value matching the property's schema.
 *
 * [PropertyModel.presenceStates] lists exactly the subset of these three states a given property
 * allows — e.g. a required-but-nullable property allows `[NULL, VALUE]` but never `ABSENT`.
 */
public enum class PresenceState {
    ABSENT,
    NULL,
    VALUE,
}

/** Which OpenAPI/JSON Schema syntax contributed a [Nullability.NULLABLE] verdict for a schema. */
public enum class NullabilitySurface {
    OPENAPI_3_0_NULLABLE,
    JSON_SCHEMA_TYPE_ARRAY,
    NULL_COMPOSITION,
}

/**
 * One syntactic source of a schema's nullability, kept even after normalization so diagnostics and
 * tooling can point at the exact keyword (`nullable: true`, `type: [x, "null"]`, or a `null` branch
 * in a composition) that made a schema nullable. A schema may carry more than one origin.
 */
public data class NullabilityOrigin(
    public val surface: NullabilitySurface,
    public override val source: SourcePointer,
) : MaterialNode

public enum class EnumOpenness {
    OPEN,
    CLOSED,
}

public enum class CompositionKind {
    ONE_OF,
    ANY_OF,
    ALL_OF,
}

public enum class ParameterLocation {
    PATH,
    QUERY,
    HEADER,
    COOKIE,
}

public enum class StatusSelectorKind {
    EXACT,
    RANGE,
    DEFAULT,
}

public enum class DiagnosticSeverity {
    ERROR,
    WARNING,
    INFO,
}

/** The adaptation stage a [Diagnostic] was raised in, from raw bytes toward the semantic model. */
public enum class DiagnosticPhase {
    ACQUISITION,
    PARSE,
    ADAPTATION,
    NORMALIZATION,
}

/**
 * Stable, machine-matchable identifiers for every diagnosis the OpenAPI adapter can raise.
 * Notes on codes whose trigger is not evident from the name alone:
 * - [ONE_OF_NULL_AMBIGUOUS]: a `oneOf` composition has zero or more than one null-accepting
 *   branch (a bare `type: "null"` branch, the legacy nullable marker, or an unconstrained branch
 *   that itself accepts `null`). Exactly one such branch is required to infer [Nullability]
 *   unambiguously from a `oneOf`; this code marks the case left as non-nullable instead.
 * - [LEGACY_NULLABLE_COMPOSITION]: a pre-3.1-style `nullable: true` sibling to a composition
 *   keyword was honored, but the combination is deprecated and flagged for visibility.
 * - [SCHEMA_ADAPTATION_FAILED] / [OPERATION_ADAPTATION_FAILED]: adaptation of one schema or
 *   operation failed and was omitted from the document; the diagnostic is the caller's only
 *   record that the omission was deliberate rather than silent (see
 *   `AdaptationMetrics.silentSchemaOmissions` in the `openapi` module).
 * - [PARSER_RESOLVED_MESSAGE] / [PARSER_UNRESOLVED_MESSAGE]: warnings surfaced verbatim from the
 *   underlying swagger-parser's resolved and unresolved parse passes, respectively.
 * - [OPENAPI_3_0_DOCUMENT_NORMALIZED]: the document declares `openapi: 3.0.x`; SDKGen normalizes
 *   its 3.0-only constructs (`nullable`, boolean `exclusiveMinimum`/`exclusiveMaximum`, nullable
 *   `$ref` siblings, nullable enums, nullable compositions) to OpenAPI 3.1 semantics at the
 *   ingestion seam. A 3.1 document never raises this code.
 * - [NULLABLE_REFERENCE_SIBLING]: `nullable: true` sits alongside a `$ref` (invalid in OpenAPI
 *   3.0, where sibling keywords next to `$ref` are ignored by the spec). SDKGen never drops this
 *   silently: it wraps the reference so the use site is nullable while the referenced schema
 *   itself is untouched, equivalent to `allOf: [{ $ref }]` with `nullable: true` on the wrapper.
 * - [NULLABLE_ENUM_NULL_INJECTED]: `nullable: true` sits alongside `enum`, but the enum's value
 *   set does not already list `null`. SDKGen injects `null` into the allowed value set instead of
 *   leaving the schema nullable while its own enum would reject the null value.
 * - [NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE]: `nullable: true` sits on a schema whose only content
 *   is `oneOf`/`anyOf`/`allOf` (no own `type`). There is no lossless 3.1 mapping: for
 *   `oneOf`/`anyOf`, SDKGen's policy is to add an explicit `type: "null"` branch to the
 *   composition; for `allOf`, no branch can be added without making the composition
 *   unsatisfiable, so only the schema-level nullability flag is preserved. Either way this code
 *   is raised so the widened validation is never silent.
 * - [EXCLUSIVE_BOUND_NORMALIZED]: a boolean `exclusiveMinimum`/`exclusiveMaximum` (OpenAPI 3.0)
 *   was normalized to the OpenAPI 3.1 numeric form, or a boolean `false` marker was normalized
 *   away as a no-op. Numeric (3.1-native) exclusive bounds never raise this code.
 * - [NULLABLE_TYPE_NORMALIZED]: a typed OpenAPI 3.0 schema's `nullable: true` was mapped to the
 *   semantic equivalent of a 3.1 type union containing `null`.
 * - [CONTENT_KEYWORD_NORMALIZED]: OpenAPI 3.0 `format: byte` or `format: binary` was mapped to
 *   JSON Schema 2020-12 `contentEncoding` or `contentMediaType` semantics.
 */
public enum class DiagnosticCode {
    AMBIGUOUS_PARAMETER_SCHEMA_AND_CONTENT,
    EXCLUSIVE_BOUND_NORMALIZED,
    INVALID_CANONICAL_EXTENSION,
    INVALID_DISCRIMINATOR_MAPPING,
    LEGACY_NULLABLE_COMPOSITION,
    NULLABLE_COMPOSED_SCHEMA_WITHOUT_TYPE,
    NULLABLE_ENUM_NULL_INJECTED,
    NULLABLE_REFERENCE_SIBLING,
    NULLABLE_TYPE_NORMALIZED,
    NON_STANDARD_PARAMETER_SERIALIZATION_EXTENSION,
    CONTENT_KEYWORD_NORMALIZED,
    ONE_OF_NULL_AMBIGUOUS,
    OPENAPI_3_0_DOCUMENT_NORMALIZED,
    OPERATION_ADAPTATION_FAILED,
    PARSER_RESOLVED_MESSAGE,
    PARSER_UNRESOLVED_MESSAGE,
    SCHEMA_ADAPTATION_FAILED,
    UNRESOLVED_REFERENCE,
    UNSUPPORTED_BOOLEAN_SCHEMA,
    UNSUPPORTED_PARAMETER_CONTENT_SERIALIZATION,
    UNSUPPORTED_PARAMETER_STYLE,
    UNSUPPORTED_PARAMETER_STYLE_SCHEMA_KIND,
    UNSUPPORTED_SCHEMA_KEYWORD,
}

/**
 * Common supertype for every node in the semantic model. The one guarantee it carries is
 * traceability: every node — down to individual properties and diagnostics — knows the exact
 * [SourcePointer] in the original input it was adapted from.
 */
public sealed interface MaterialNode {
    public val source: SourcePointer
}

public data class SourceDocumentIdentity(
    public val canonicalUri: String,
    public val sha256: String,
    public val contentLength: Long,
    public val acquisitionPolicy: AcquisitionPolicy,
    public override val source: SourcePointer,
) : MaterialNode

public data class SchemaRef(
    public val schemaId: SchemaId,
    public override val source: SourcePointer,
) : MaterialNode

public data class EnumModel(
    public val values: List<JsonValue>,
    public val openness: EnumOpenness,
    public override val source: SourcePointer,
) : MaterialNode

public data class DiscriminatorModel(
    public val propertyName: String,
    public val mapping: Map<String, SchemaId>,
    public val unmappedBranches: List<SchemaId>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

public data class CompositionModel(
    public val kind: CompositionKind,
    public val branches: List<SchemaRef>,
    public val discriminator: DiscriminatorModel?,
    public override val source: SourcePointer,
) : MaterialNode

public data class PropertyOwnership(
    public val propertyName: String,
    public val ownerSchemaId: SchemaId,
    public val constraints: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

/**
 * A single property on an object schema. [requiredness] and [nullability] state the contract;
 * [presenceStates] is the derived, authoritative set of instance shapes the property actually
 * admits (see [PresenceState]) and is what emission should consult rather than re-deriving the
 * combination itself.
 */
public data class PropertyModel(
    public val name: String,
    public val schema: SchemaRef,
    public val requiredness: Requiredness,
    public val nullability: Nullability,
    public val presenceStates: List<PresenceState>,
    public val readOnly: Boolean,
    public val writeOnly: Boolean,
    public val description: String?,
    public val deprecated: Boolean,
    public val defaultValue: JsonValue?,
    public val examples: List<JsonValue>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

/**
 * The three ways an object schema treats properties not named in [SchemaModel.properties]:
 * rejected entirely ([Closed]), accepted as arbitrary [JsonValue] with no schema constraint
 * ([FreeForm]), or accepted so long as each value matches [Typed.valueSchema]. A `null`
 * [SchemaModel.additionalProperties] is distinct from all three — it means the keyword was absent
 * from the source and the OpenAPI-default (open, unconstrained) behavior applies implicitly.
 */
public sealed interface AdditionalPropertiesModel : MaterialNode {
    public data class Closed(
        override val source: SourcePointer,
    ) : AdditionalPropertiesModel

    public data class FreeForm(
        override val source: SourcePointer,
    ) : AdditionalPropertiesModel

    public data class Typed(
        public val valueSchema: SchemaRef,
        public override val source: SourcePointer,
    ) : AdditionalPropertiesModel
}

/**
 * The normalized representation of one OpenAPI/JSON Schema schema node. [id] is stable per
 * [IdentityKind] (see [IdentityKind] for how identity is assigned); [referenceTarget] is non-null
 * when this node wraps a `$ref`. Callers resolve structural shape through [referenceTarget], but
 * must accumulate annotation semantics such as [nullability] across the wrapper chain — notably
 * for normalized OpenAPI 3.0 nullable `$ref` siblings. [nullability] is the single normalized
 * verdict; the syntactic evidence behind it is preserved separately in [nullabilityOrigins].
 */
public data class SchemaModel(
    public val id: SchemaId,
    public val identityKind: IdentityKind,
    public val referenceTarget: SchemaId?,
    public val types: List<String>,
    public val format: String?,
    public val nullability: Nullability,
    public val nullabilityOrigins: List<NullabilityOrigin>,
    public val description: String?,
    public val deprecated: Boolean,
    public val readOnly: Boolean,
    public val writeOnly: Boolean,
    public val constraints: Map<String, JsonValue>,
    public val defaultValue: JsonValue?,
    public val examples: List<JsonValue>,
    public val enum: EnumModel?,
    public val properties: List<PropertyModel>,
    public val items: SchemaRef?,
    public val additionalProperties: AdditionalPropertiesModel?,
    public val compositions: List<CompositionModel>,
    public val allOfPropertyOwnership: List<PropertyOwnership>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
    /** True only for the JSON Schema `type: "null"` assertion; distinct from an unconstrained `{}` schema. */
    public val acceptsOnlyNull: Boolean = false,
    /** JSON Schema 2020-12 content encoding, including normalized OpenAPI 3.0 `format: byte` as `base64`. */
    public val contentEncoding: String? = null,
    /** JSON Schema 2020-12 content media type, including normalized OpenAPI 3.0 binary string schemas. */
    public val contentMediaType: String? = null,
    /** Property names asserted by this schema's own `required` keyword, including inherited-only constraints. */
    public val requiredPropertyNames: List<String> = emptyList(),
) : MaterialNode

public data class EncodingModel(
    public val partName: String,
    public val contentType: String?,
    public val headers: Map<String, JsonValue>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
    public val style: String? = null,
    public val explode: Boolean? = null,
    public val allowReserved: Boolean? = null,
) : MaterialNode

public data class MediaTypeModel(
    public val mediaType: String,
    public val schema: SchemaRef?,
    public val encoding: List<EncodingModel>,
    public val example: JsonValue?,
    public val examples: Map<String, JsonValue>,
    public val extensions: Map<String, JsonValue>,
    public val streaming: Boolean,
    public override val source: SourcePointer,
) : MaterialNode

public data class ParameterModel(
    public val name: String,
    public val location: ParameterLocation,
    public val requiredness: Requiredness,
    public val style: String?,
    public val explode: Boolean?,
    public val schema: SchemaRef?,
    public val content: List<MediaTypeModel>,
    public val description: String?,
    public val deprecated: Boolean,
    public val examples: Map<String, JsonValue>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

public data class RequestBodyModel(
    public val requiredness: Requiredness,
    public val description: String?,
    public val content: List<MediaTypeModel>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

public data class HeaderModel(
    public val name: String,
    public val requiredness: Requiredness,
    public val schema: SchemaRef?,
    public val description: String?,
    public val deprecated: Boolean,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

public data class ResponseModel(
    public val selector: String,
    public val selectorKind: StatusSelectorKind,
    public val description: String?,
    public val content: List<MediaTypeModel>,
    public val headers: List<HeaderModel>,
    public val links: Map<String, JsonValue>,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
) : MaterialNode

public data class SecurityRequirementModel(
    public val schemes: Map<String, List<String>>,
    public val anonymous: Boolean,
    public override val source: SourcePointer,
) : MaterialNode

/** The OpenAPI security-scheme kind retained by the adapter for contract-owned client configuration. */
public enum class SecuritySchemeKind {
    API_KEY,
    HTTP,
    OAUTH2,
    OPEN_ID_CONNECT,
    MUTUAL_TLS,
}

/**
 * One contract-owned OpenAPI security scheme. Credential material never enters this model; it is supplied at runtime
 * through a generated client's credential-provider map.
 */
public data class SecuritySchemeModel(
    public val kind: SecuritySchemeKind,
    public val parameterName: String? = null,
    public val location: ParameterLocation? = null,
    public val scheme: String? = null,
    public val bearerFormat: String? = null,
    public val openIdConnectUrl: String? = null,
    public override val source: SourcePointer,
) : MaterialNode

/** An immutable RFC 6901 JSON Pointer with decoded property-name [segments]. */
public data class JsonPointer(
    public val value: String,
) {
    init {
        require(value.startsWith('/')) { "JSON Pointer must begin with '/'" }
        require(!Regex("~(?![01])").containsMatchIn(value)) {
            "JSON Pointer must contain only valid escapes '~0' and '~1'"
        }
    }

    public val segments: List<String>
        get() =
            value.drop(1).split('/').map { encoded ->
                encoded.replace("~1", "/").replace("~0", "~")
            }

    public override fun toString(): String = value
}

/** Canonical operation pagination metadata adapted from `x-sdkgen-pagination`. */
public sealed interface PaginationModel {
    public data class Cursor(
        public val requestCursor: String,
        public val requestLimit: String?,
        public val responseItems: JsonPointer,
        public val responseNextCursor: JsonPointer,
    ) : PaginationModel

    /**
     * The next page is sourced from the RFC 8288 `Link` response header's `rel="next"` target rather than any
     * body field, so — unlike [Cursor] — there is no request cursor/limit parameter and no response next-value
     * pointer: only [responseItems] locates the item list in the decoded body.
     */
    public data class HeaderNextUrl(
        public val responseItems: JsonPointer,
    ) : PaginationModel
}

/** Canonical operation streaming metadata adapted from `x-sdkgen-streaming`. */
public sealed interface StreamingModel {
    public data class Sse(
        public val requestFlag: String?,
        public val responseContentType: String,
        public val sentinel: String?,
    ) : StreamingModel
}

/** Canonical client-generated idempotency-key metadata adapted from `x-sdkgen-idempotency`. */
public data class IdempotencyModel(
    public val keyHeader: String,
    public val clientGenerated: Boolean,
)

public data class OperationModel(
    public val operationId: String,
    public val method: String,
    public val path: String,
    public val description: String?,
    public val deprecated: Boolean,
    public val parameters: List<ParameterModel>,
    public val requestBody: RequestBodyModel?,
    public val responses: List<ResponseModel>,
    public val securityAlternatives: List<SecurityRequirementModel>,
    public val pagination: PaginationModel?,
    public val streaming: StreamingModel?,
    public val idempotency: IdempotencyModel?,
    public val extensions: Map<String, JsonValue>,
    public override val source: SourcePointer,
    /** OpenAPI `tags` declared on this operation, in document order. Empty when the operation is untagged. */
    public val tags: List<String> = emptyList(),
) : MaterialNode

/**
 * A recorded adaptation event, always carrying enough context to act on: [message] describes what
 * was observed, [remediation] describes what the input author should do about it, and
 * [MaterialNode.source] pins the exact location. [DiagnosticSeverity.ERROR] diagnostics indicate a
 * schema or operation was omitted from the document rather than represented incorrectly — see
 * [DiagnosticCode] for which codes carry that meaning.
 */
public data class Diagnostic(
    public val code: DiagnosticCode,
    public val severity: DiagnosticSeverity,
    public val phase: DiagnosticPhase,
    public val message: String,
    public val remediation: String,
    public override val source: SourcePointer,
    /** Stable semantic symbol identity when the diagnostic can be tied to one operation or schema. */
    public val relatedSymbolId: String? = null,
) : MaterialNode

/**
 * The complete, adapter-agnostic representation of one OpenAPI document (root document plus every
 * document it references), produced by [com.nabobery.sdkgen.openapi.SemanticAdapter.adapt]. This
 * is the sole input to declaration projection and Kotlin emission — nothing downstream reads the
 * original OpenAPI source. [schemas] and [operations] hold only what was successfully adapted;
 * [diagnostics] records everything that was not, so the two collections together — not
 * [schemas]/[operations] alone — describe the full outcome of adaptation.
 */
public data class SemanticDocument(
    public val documentUri: String,
    public val title: String?,
    public val version: String?,
    public val sourceDocuments: List<SourceDocumentIdentity>,
    public val schemas: Map<SchemaId, SchemaModel>,
    public val operations: List<OperationModel>,
    public val securityAlternatives: List<SecurityRequirementModel>,
    public val extensions: Map<String, JsonValue>,
    public val diagnostics: List<Diagnostic>,
    public override val source: SourcePointer,
    public val securitySchemes: Map<String, SecuritySchemeModel> = emptyMap(),
) : MaterialNode
