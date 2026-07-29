package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.JsonValue
import java.security.MessageDigest
import kotlin.random.Random

internal data class KotlinDeclarationModel(
    val files: List<KotlinFileDeclaration>,
) {
    fun normalized(): KotlinDeclarationModel =
        copy(
            files =
                files
                    .map(KotlinFileDeclaration::normalized)
                    .sortedBy(KotlinFileDeclaration::path),
        )

    fun shuffled(seed: Int): KotlinDeclarationModel {
        val random = Random(seed)

        fun FormValueDeclaration.shuffled(): FormValueDeclaration =
            when (this) {
                is FormValueDeclaration.Scalar -> {
                    this
                }

                is FormValueDeclaration.Array -> {
                    FormValueDeclaration.Array(element.shuffled())
                }

                is FormValueDeclaration.Map -> {
                    FormValueDeclaration.Map(value.shuffled(), valuesAreJsonElements)
                }

                is FormValueDeclaration.Union -> {
                    FormValueDeclaration.Union(
                        branches.map { branch -> branch.copy(value = branch.value.shuffled()) },
                    )
                }

                is FormValueDeclaration.Object -> {
                    FormValueDeclaration.Object(
                        fields.shuffled(random).map { field ->
                            FormFieldDeclaration(
                                wireName = field.wireName,
                                accessorName = field.accessorName,
                                type = field.type,
                                required = field.required,
                                value = field.value.shuffled(),
                            )
                        },
                    )
                }
            }

        fun OperationRequestBodyAlternative.shuffled(): OperationRequestBodyAlternative =
            OperationRequestBodyAlternative(
                mediaType = mediaType,
                type = type,
                multipartParts = multipartParts,
                formFields =
                    formFields.shuffled(random).map { field ->
                        FormFieldDeclaration(
                            wireName = field.wireName,
                            accessorName = field.accessorName,
                            type = field.type,
                            required = field.required,
                            value = field.value.shuffled(),
                        )
                    },
                required = required,
            )

        fun OperationDeclaration.shuffled(): OperationDeclaration =
            OperationDeclaration(
                symbolId = symbolId,
                order = order,
                operationId = operationId,
                method = method,
                path = path,
                requestMediaTypes = requestMediaTypes,
                responseMediaTypes = responseMediaTypes,
                successStatusCodes = successStatusCodes,
                requestType = requestType,
                responseType = responseType,
                requestCodecPropertyName = requestCodecPropertyName,
                responseCodecPropertyName = responseCodecPropertyName,
                requestCodecConstantName = requestCodecConstantName,
                responseCodecConstantName = responseCodecConstantName,
                requestCodecId = requestCodecId,
                responseCodecId = responseCodecId,
                responseMode = responseMode,
                deadlines = deadlines,
                methodKdoc = methodKdoc,
                parameters = parameters,
                requestBodyAlternatives = requestBodyAlternatives.map { alternative -> alternative.shuffled() },
                responseAlternatives = responseAlternatives,
                security = security,
                safety = safety,
                idempotency = idempotency,
                retry = retry,
                pagination = pagination,
                streaming = streaming,
                operationIdentity = operationIdentity,
                requestBodyRequired = requestBodyRequired,
            )

        return copy(
            files =
                files.shuffled(random).map { file ->
                    file.copy(
                        declarations =
                            file.declarations.shuffled(random).map { declaration ->
                                when (declaration) {
                                    is ModelDeclaration -> {
                                        declaration.copy(fields = declaration.fields.shuffled(random))
                                    }

                                    is OpenEnumDeclaration -> {
                                        declaration.copy(values = declaration.values.shuffled(random))
                                    }

                                    is OneOfDeclaration -> {
                                        declaration.copy(cases = declaration.cases.shuffled(random))
                                    }

                                    is PrimitiveOneOfDeclaration -> {
                                        declaration.copy(cases = declaration.cases.shuffled(random))
                                    }

                                    is AnyOfDeclaration -> {
                                        declaration.copy(branches = declaration.branches.shuffled(random))
                                    }

                                    is SupportDeclaration -> {
                                        declaration
                                    }

                                    is OperationClientDeclaration -> {
                                        declaration.copy(
                                            operations =
                                                declaration.operations
                                                    .shuffled(random)
                                                    .map { operation -> operation.shuffled() },
                                            subClients = declaration.subClients.shuffled(random),
                                        )
                                    }
                                }
                            },
                    )
                },
        )
    }

    fun digest(): String = sha256Hex(normalized().canonicalText().encodeToByteArray())

    private fun canonicalText(): String =
        buildString {
            files.forEach { file ->
                append("file|").append(file.path).append('\n')
                file.declarations.forEach { declaration ->
                    append(declaration.canonicalText()).append('\n')
                }
            }
        }
}

internal data class KotlinFileDeclaration(
    val packageName: String,
    val fileName: String,
    val declarations: List<Declaration>,
) {
    val path: String = packageName.replace('.', '/') + "/$fileName.kt"

    fun normalized(): KotlinFileDeclaration =
        copy(
            declarations =
                declarations
                    .map { declaration ->
                        when (declaration) {
                            is ModelDeclaration -> {
                                declaration.copy(
                                    fields =
                                        declaration.fields.sortedWith(
                                            compareBy(FieldDeclaration::order, FieldDeclaration::symbolId),
                                        ),
                                )
                            }

                            is OpenEnumDeclaration -> {
                                declaration.copy(
                                    values =
                                        declaration.values.sortedWith(
                                            compareBy(EnumValueDeclaration::order, EnumValueDeclaration::symbolId),
                                        ),
                                )
                            }

                            is OneOfDeclaration -> {
                                declaration.copy(
                                    cases =
                                        declaration.cases.sortedWith(
                                            compareBy(OneOfCaseDeclaration::order, OneOfCaseDeclaration::symbolId),
                                        ),
                                )
                            }

                            is PrimitiveOneOfDeclaration -> {
                                declaration.copy(
                                    cases =
                                        declaration.cases.sortedWith(
                                            compareBy(
                                                PrimitiveOneOfCaseDeclaration::order,
                                                PrimitiveOneOfCaseDeclaration::symbolId,
                                            ),
                                        ),
                                )
                            }

                            is AnyOfDeclaration -> {
                                declaration.copy(
                                    branches =
                                        declaration.branches.sortedWith(
                                            compareBy(AnyOfBranchDeclaration::order, AnyOfBranchDeclaration::symbolId),
                                        ),
                                )
                            }

                            is SupportDeclaration -> {
                                declaration
                            }

                            is OperationClientDeclaration -> {
                                declaration.copy(
                                    operations =
                                        declaration.operations.sortedWith(
                                            compareBy(OperationDeclaration::order, OperationDeclaration::symbolId),
                                        ),
                                    subClients =
                                        declaration.subClients.sortedWith(
                                            compareBy(
                                                OperationClientGroupRef::packageName,
                                                OperationClientGroupRef::className,
                                            ),
                                        ),
                                )
                            }
                        }
                    }.sortedWith(compareBy(Declaration::order, Declaration::symbolId)),
        )
}

internal sealed interface Declaration {
    val symbolId: String
    val order: Int
    val packageName: String
    val fileName: String
    val resolvedName: String
    val kdoc: String
}

internal data class ModelDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val fields: List<FieldDeclaration>,
    val dslFunctionName: String,
    val additionalProperties: AdditionalPropertiesDeclaration? = null,
    val auxiliaryModels: List<SimpleModelDeclaration> = emptyList(),
    val usesFieldState: Boolean = false,
) : Declaration

/**
 * A generated catch-all property for an object that declares both fixed properties and
 * `additionalProperties`. The value type carries nullability so codecs can distinguish a
 * missing dynamic member from an explicitly-null one.
 */
internal data class AdditionalPropertiesDeclaration(
    val resolvedName: String,
    val valueType: KotlinTypeRef,
    val valuesAreJsonElements: Boolean,
    val fixedWireNames: Set<String>,
    val kdoc: String,
)

internal data class SimpleModelDeclaration(
    val resolvedName: String,
    val kdoc: String,
    val fields: List<SimpleFieldDeclaration>,
)

internal data class SimpleFieldDeclaration(
    val resolvedName: String,
    val wireName: String,
    val type: KotlinTypeRef,
    val kdoc: String,
)

internal data class FieldDeclaration(
    val symbolId: String,
    val order: Int,
    val resolvedName: String,
    val wireName: String,
    val type: KotlinTypeRef,
    val required: Boolean,
    val nullable: Boolean,
    val kdoc: String,
)

internal data class OpenEnumDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val values: List<EnumValueDeclaration>,
) : Declaration

internal data class EnumValueDeclaration(
    val symbolId: String,
    val order: Int,
    val resolvedName: String,
    val wireValue: String,
    val kdoc: String,
)

internal data class OneOfDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val cases: List<OneOfCaseDeclaration>,
) : Declaration

internal data class OneOfCaseDeclaration(
    val symbolId: String,
    val order: Int,
    val resolvedName: String,
    val requiredFields: List<UnionFieldDeclaration>,
    val matchFields: List<UnionFieldDeclaration> = requiredFields,
    val matchesEmptyObject: Boolean = false,
    val predicate: JsonBranchPredicate? = null,
)

internal data class PrimitiveOneOfDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val cases: List<PrimitiveOneOfCaseDeclaration>,
) : Declaration

internal data class PrimitiveOneOfCaseDeclaration(
    val symbolId: String,
    val order: Int,
    val resolvedName: String,
    val type: KotlinTypeRef,
    val jsonKind: PrimitiveOneOfJsonKind,
    val predicate: JsonBranchPredicate = JsonBranchPredicate.Kind(jsonKind),
)

/**
 * Exact raw-JSON membership test for a closed `oneOf` branch. It deliberately carries schema
 * assertions rather than Kotlin types: branch selection must not depend on serializer leniency.
 */
internal sealed interface JsonBranchPredicate {
    data object AnyValue : JsonBranchPredicate

    /** A branch with unsupported assertions that must never be selected permissively. */
    data object NeverMatch : JsonBranchPredicate

    data class Kind(
        val kind: PrimitiveOneOfJsonKind,
    ) : JsonBranchPredicate

    data class AllOf(
        val predicates: List<JsonBranchPredicate>,
    ) : JsonBranchPredicate

    data class AnyOf(
        val predicates: List<JsonBranchPredicate>,
    ) : JsonBranchPredicate

    data class Constant(
        val value: JsonValue,
    ) : JsonBranchPredicate

    data class Enumeration(
        val values: List<JsonValue>,
    ) : JsonBranchPredicate

    data class Numeric(
        val minimum: String? = null,
        val maximum: String? = null,
        val exclusiveMinimum: String? = null,
        val exclusiveMaximum: String? = null,
        val multipleOf: String? = null,
    ) : JsonBranchPredicate

    data class StringShape(
        val minLength: Int? = null,
        val maxLength: Int? = null,
        val format: JsonStringFormat? = null,
    ) : JsonBranchPredicate

    data class ArrayShape(
        val minItems: Int? = null,
        val maxItems: Int? = null,
        val uniqueItems: Boolean = false,
        val item: JsonBranchPredicate? = null,
    ) : JsonBranchPredicate

    data class ObjectShape(
        val requiredNames: List<String>,
        val properties: Map<String, JsonBranchPredicate>,
        val additionalProperties: JsonAdditionalPropertiesPredicate,
    ) : JsonBranchPredicate
}

internal enum class JsonStringFormat {
    DATE,
    DATE_TIME,
}

internal sealed interface JsonAdditionalPropertiesPredicate {
    data object Open : JsonAdditionalPropertiesPredicate

    data object Closed : JsonAdditionalPropertiesPredicate

    data class Typed(
        val predicate: JsonBranchPredicate,
    ) : JsonAdditionalPropertiesPredicate
}

internal enum class PrimitiveOneOfJsonKind {
    NULL,
    STRING,
    INTEGER,
    NUMBER,
    BOOLEAN,
    ARRAY,
    OBJECT,
}

internal data class AnyOfDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val branches: List<AnyOfBranchDeclaration>,
    val branchEnumName: String = "${resolvedName}Branch",
    val inspectionName: String = "${resolvedName}Inspection",
) : Declaration

internal data class AnyOfBranchDeclaration(
    val symbolId: String,
    val order: Int,
    val resolvedName: String,
    val propertyName: String,
    val fields: List<UnionFieldDeclaration>,
    val viewFields: List<UnionFieldDeclaration> = fields,
    val shape: AnyOfBranchShape = AnyOfBranchShape.OBJECT,
    val type: KotlinTypeRef? = null,
    val maxItems: Int? = null,
    val viewTypeName: String = "${resolvedName}View",
    val viewFileName: String? = null,
)

internal enum class AnyOfBranchShape {
    OBJECT,
    VALUE,
}

internal data class UnionFieldDeclaration(
    val resolvedName: String,
    val wireName: String,
    val type: KotlinTypeRef,
    val expectedStringValue: String? = null,
    val expectedStringValues: List<String> = listOfNotNull(expectedStringValue),
    val required: Boolean = true,
)

internal data class SupportDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val kind: SupportKind,
) : Declaration

internal enum class SupportKind {
    FieldPresence,
    Serialization,
}

/**
 * A reference from a root [OperationClientDeclaration] facade to one per-tag/resource sub-client it exposes
 * as a lazily-initialized property (see task T3: partition the generated client by tag/resource).
 */
internal data class OperationClientGroupRef(
    val packageName: String,
    val className: String,
    val accessorName: String,
    val kdoc: String = "",
)

internal class OperationClientDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val codecsObjectName: String,
    operations: List<OperationDeclaration>,
    securitySchemes: Map<String, OperationSecuritySchemeDeclaration> = emptyMap(),
    subClients: List<OperationClientGroupRef> = emptyList(),
    val preserveOperationMetadataNames: Boolean = false,
) : Declaration {
    val operations: List<OperationDeclaration> = operations.toList()
    val securitySchemes: Map<String, OperationSecuritySchemeDeclaration> = securitySchemes.toMap()

    /**
     * Non-empty only on the root facade client: one entry per generated sub-client the facade exposes as a
     * lazily-initialized property. A facade declaration otherwise carries no [operations] of its own.
     */
    val subClients: List<OperationClientGroupRef> = subClients.toList()

    fun copy(
        symbolId: String = this.symbolId,
        order: Int = this.order,
        packageName: String = this.packageName,
        fileName: String = this.fileName,
        resolvedName: String = this.resolvedName,
        kdoc: String = this.kdoc,
        codecsObjectName: String = this.codecsObjectName,
        operations: List<OperationDeclaration> = this.operations,
        securitySchemes: Map<String, OperationSecuritySchemeDeclaration> = this.securitySchemes,
        subClients: List<OperationClientGroupRef> = this.subClients,
        preserveOperationMetadataNames: Boolean = this.preserveOperationMetadataNames,
    ): OperationClientDeclaration =
        OperationClientDeclaration(
            symbolId,
            order,
            packageName,
            fileName,
            resolvedName,
            kdoc,
            codecsObjectName,
            operations,
            securitySchemes,
            subClients,
            preserveOperationMetadataNames,
        )
}

/**
 * A single operation hosted by an [OperationClientDeclaration]. Codec property/constant names,
 * request/response shapes, and deadlines are scoped per operation so that a second operation is
 * additive to the client rather than a breaking reshape of the declaration.
 */
internal sealed interface ResponseSelectorDeclaration {
    data class ExactStatus(
        val code: Int,
    ) : ResponseSelectorDeclaration

    data class StatusRange(
        val firstInclusive: Int,
        val lastInclusive: Int,
    ) : ResponseSelectorDeclaration

    data object Default : ResponseSelectorDeclaration
}

internal class OperationResponseAlternative(
    val selector: ResponseSelectorDeclaration,
    mediaTypes: List<String>,
    val type: KotlinTypeRef,
    val mode: OperationResponseMode = OperationResponseMode.BUFFERED,
) {
    val mediaTypes: List<String> = mediaTypes.toList()

    override fun equals(other: Any?): Boolean =
        other is OperationResponseAlternative &&
            selector == other.selector &&
            mediaTypes == other.mediaTypes &&
            type == other.type &&
            mode == other.mode

    override fun hashCode(): Int = arrayOf(selector, mediaTypes, type, mode).contentHashCode()

    override fun toString(): String =
        "OperationResponseAlternative(selector=$selector, mediaTypes=$mediaTypes, type=$type, mode=$mode)"
}

internal fun unrepresentableRawResponseAlternative(
    alternatives: List<OperationResponseAlternative>,
    successStatusCodes: Set<Int>,
): OperationResponseAlternative? =
    alternatives.firstOrNull { alternative ->
        alternative.type.isSdkByteStream() &&
            HTTP_STATUS_CODES.any { statusCode ->
                alternative.canBeSelectedFor(statusCode, alternatives) && statusCode !in successStatusCodes
            }
    }

internal fun OperationDeclaration.unrepresentableRawResponseAlternative(): OperationResponseAlternative? =
    unrepresentableRawResponseAlternative(responseAlternatives, successStatusCodes)

internal fun OperationDeclaration.hasCompatibleOrdinaryResponseShape(): Boolean {
    if (responseAlternatives.isEmpty()) return true
    return selectableSuccessfulResponseAlternatives()
        .map { alternative -> alternative.type to alternative.mode }
        .distinct()
        .size <= 1
}

internal fun OperationDeclaration.incompatibleOrdinaryResponseShapeDiagnostic(): String {
    val shapes =
        selectableSuccessfulResponseAlternatives()
            .map { alternative -> "${alternative.type} (${alternative.mode})" }
            .distinct()
            .sorted()
            .joinToString()
    return "Operation '$operationIdentity' has incompatible successful response shapes: $shapes. " +
        "The ordinary body-returning method and derived pagination/streaming helpers are not generated; use the " +
        "typed withResponse API when available."
}

private fun OperationDeclaration.selectableSuccessfulResponseAlternatives(): List<OperationResponseAlternative> =
    responseAlternatives.filter { alternative ->
        HTTP_STATUS_CODES.any { statusCode ->
            statusCode.isSuccessful(successStatusCodes) &&
                alternative.canBeSelectedFor(statusCode, responseAlternatives)
        }
    }

private fun Int.isSuccessful(configuredSuccessStatusCodes: Set<Int>): Boolean =
    this in 200..299 || this in configuredSuccessStatusCodes

internal fun rawResponseAlternativeDiagnostic(
    operationIdentity: String,
    alternative: OperationResponseAlternative,
    successStatusCodes: Set<Int>,
): String =
    "Operation '$operationIdentity' declares raw SdkByteStream response alternative ${alternative.selector}, " +
        "which can match a status outside successStatusCodes=${successStatusCodes.sorted()}; raw response bodies may " +
        "only be transferred for alternatives whose every matched status is declared successful."

internal fun OperationDeclaration.rawResponseAlternativeDiagnostic(alternative: OperationResponseAlternative): String =
    rawResponseAlternativeDiagnostic(operationIdentity, alternative, successStatusCodes)

private fun OperationResponseAlternative.canBeSelectedFor(
    statusCode: Int,
    alternatives: List<OperationResponseAlternative>,
): Boolean {
    if (!selector.matches(statusCode)) return false
    val precedence = selector.precedence()
    return alternatives.none { candidate ->
        candidate.selector.precedence() < precedence && candidate.selector.matches(statusCode)
    }
}

private fun ResponseSelectorDeclaration.matches(statusCode: Int): Boolean =
    when (this) {
        is ResponseSelectorDeclaration.ExactStatus -> statusCode == code
        is ResponseSelectorDeclaration.StatusRange -> statusCode in firstInclusive..lastInclusive
        ResponseSelectorDeclaration.Default -> true
    }

private fun ResponseSelectorDeclaration.precedence(): Int =
    when (this) {
        is ResponseSelectorDeclaration.ExactStatus -> 0
        is ResponseSelectorDeclaration.StatusRange -> 1
        ResponseSelectorDeclaration.Default -> 2
    }

private fun KotlinTypeRef.isSdkByteStream(): Boolean =
    packageName == "com.nabobery.sdkgen.runtime" && simpleName == "SdkByteStream"

private val HTTP_STATUS_CODES: IntRange = 100..599

internal class OperationSecuritySchemeRef(
    val schemeId: String,
    scopes: List<String> = emptyList(),
) {
    val scopes: List<String> = scopes.toList()

    override fun equals(other: Any?): Boolean =
        other is OperationSecuritySchemeRef && schemeId == other.schemeId && scopes == other.scopes

    override fun hashCode(): Int = 31 * schemeId.hashCode() + scopes.hashCode()

    override fun toString(): String = "OperationSecuritySchemeRef(schemeId=$schemeId, scopes=$scopes)"
}

internal class OperationSecurityRequirement(
    schemes: List<OperationSecuritySchemeRef>,
) {
    val schemes: List<OperationSecuritySchemeRef> = schemes.toList()

    override fun equals(other: Any?): Boolean = other is OperationSecurityRequirement && schemes == other.schemes

    override fun hashCode(): Int = schemes.hashCode()

    override fun toString(): String = "OperationSecurityRequirement(schemes=$schemes)"
}

internal sealed interface OperationSecuritySchemeDeclaration {
    data class ApiKey(
        val location: OperationParameterLocation,
        val parameterName: String,
    ) : OperationSecuritySchemeDeclaration

    data object HttpBasic : OperationSecuritySchemeDeclaration

    data class HttpBearer(
        val scheme: String = "Bearer",
    ) : OperationSecuritySchemeDeclaration

    data class Unsupported(
        val kind: String,
    ) : OperationSecuritySchemeDeclaration
}

internal data class OperationSafetyDeclaration(
    val safe: Boolean = false,
    val idempotent: Boolean = false,
)

internal data class IdempotencyDeclaration(
    val keyHeader: String,
    val clientGenerated: Boolean,
)

internal data class BackoffDeclaration(
    val baseDelayMillis: Long,
    val multiplier: Double,
    val maxDelayMillis: Long,
)

internal class RetryDeclaration(
    retryableStatusCodes: List<ResponseSelectorDeclaration> = emptyList(),
    val retryConnectionErrors: Boolean = false,
    val maxAttempts: Int? = null,
    val backoff: BackoffDeclaration? = null,
) {
    val retryableStatusCodes: List<ResponseSelectorDeclaration> = retryableStatusCodes.toList()
}

internal sealed interface PaginationDeclaration {
    val responseItemsPath: String
    val itemType: KotlinTypeRef?

    data class CursorToken(
        val requestCursorParam: String,
        val requestLimitParam: String?,
        override val responseItemsPath: String,
        val responseNextCursorPath: String,
        override val itemType: KotlinTypeRef? = null,
    ) : PaginationDeclaration

    /**
     * The next page is sourced from the RFC 8288 `Link` response header's `rel="next"` target rather than any body
     * field (see [com.nabobery.sdkgen.model.PaginationModel.HeaderNextUrl]) — unlike [CursorToken], there is no
     * request cursor/limit parameter and no response next-value pointer.
     */
    data class HeaderNextUrl(
        override val responseItemsPath: String,
        override val itemType: KotlinTypeRef? = null,
    ) : PaginationDeclaration
}

internal sealed interface StreamingDeclaration {
    data class ServerSentEvents(
        val terminalSentinel: String?,
        val requestFlag: String? = null,
        val responseContentType: String = "text/event-stream",
    ) : StreamingDeclaration
}

internal enum class OperationParameterLocation {
    PATH,
    QUERY,
    HEADER,
    COOKIE,
}

internal data class OperationParameterDeclaration(
    val name: String,
    val location: OperationParameterLocation,
    val type: KotlinTypeRef,
    val required: Boolean,
    val style: String? = null,
    val explode: Boolean? = null,
    val serialization: ParameterSerialization = ParameterSerialization.Repeated,
    val kdoc: String = "",
)

internal sealed interface ParameterSerialization {
    data object Repeated : ParameterSerialization

    data object CommaJoined : ParameterSerialization

    /** Non-standard Stripe convention: `name[0]=first&name[1]=second` for deepObject arrays. */
    data object StripeCompatibleIndexedArray : ParameterSerialization

    /** Non-standard Stripe convention: deepObject scalars are sent as ordinary `name=value` query pairs. */
    data object StripeCompatibleScalar : ParameterSerialization

    /** Stripe-compatible scalar fallback for value unions; object branches are rejected at call time. */
    data object StripeCompatibleJsonScalar : ParameterSerialization

    /**
     * A `oneOf` over primitive scalars and primitive arrays, projected from the union's retained `raw` JSON.
     * A scalar branch contributes one wire value and an array branch one per element, so the caller's branch
     * choice is not observable in the request. See ADR-0016.
     *
     * This object carries no location, and the two locations do not accept the same branches. Query `form` with
     * `explode: true` is a repeated key and takes either shape; a path segment is a single value and takes only
     * the scalar shape, so `StandardProjection` rejects an array branch there rather than emitting a call that
     * compiles and then throws from `renderPathTemplate`.
     */
    data object PrimitiveUnion : ParameterSerialization

    data class DeepObject(
        val properties: List<DeepObjectParameterPropertyDeclaration>,
        val additionalProperties: DeepObjectAdditionalPropertiesDeclaration? = null,
    ) : ParameterSerialization
}

internal data class DeepObjectParameterPropertyDeclaration(
    val wireName: String,
    val accessorName: String,
    val required: Boolean,
)

internal enum class DeepObjectAdditionalPropertiesSerialization {
    JSON_PRIMITIVE_CONTENT,
    OPEN_ENUM_VALUE,
    TO_STRING,
}

internal data class DeepObjectAdditionalPropertiesDeclaration(
    val accessorName: String,
    val serialization: DeepObjectAdditionalPropertiesSerialization,
)

internal class MultipartPartDeclaration(
    val wireName: String,
    val accessorName: String,
    val type: KotlinTypeRef,
    val required: Boolean,
    val contentType: String,
    val indexedElements: Boolean = false,
    headers: Map<String, JsonValue> = emptyMap(),
) {
    val headers: Map<String, JsonValue> = headers.toMap()
}

internal enum class FormScalarKind {
    STRING,
    INTEGER,
    NUMBER,
    BOOLEAN,
    OPEN_ENUM,
}

internal enum class FormWireKind {
    STRING,
    INTEGER,
    NUMBER,
    BOOLEAN,
    OBJECT,
    ARRAY,
}

internal data class FormUnionBranch(
    val accessorName: String,
    val kind: FormWireKind,
    val value: FormValueDeclaration,
)

internal sealed interface FormValueDeclaration {
    data class Scalar(
        val kind: FormScalarKind,
    ) : FormValueDeclaration

    data class Array(
        val element: FormValueDeclaration,
    ) : FormValueDeclaration

    data class Map(
        val value: FormValueDeclaration,
        val valuesAreJsonElements: Boolean = false,
    ) : FormValueDeclaration

    class Union(
        branches: List<FormUnionBranch>,
    ) : FormValueDeclaration {
        val branches: List<FormUnionBranch> = branches.toList()
    }

    class Object(
        fields: List<FormFieldDeclaration>,
    ) : FormValueDeclaration {
        val fields: List<FormFieldDeclaration> = fields.toList()
    }
}

internal class FormFieldDeclaration(
    val wireName: String,
    val accessorName: String,
    val type: KotlinTypeRef,
    val required: Boolean,
    val value: FormValueDeclaration,
)

internal class OperationRequestBodyAlternative(
    val mediaType: String,
    val type: KotlinTypeRef,
    multipartParts: List<MultipartPartDeclaration> = emptyList(),
    formFields: List<FormFieldDeclaration> = emptyList(),
    val required: Boolean = false,
) {
    val multipartParts: List<MultipartPartDeclaration> = multipartParts.toList()
    val formFields: List<FormFieldDeclaration> = formFields.toList()
}

internal class OperationDeclaration(
    val symbolId: String,
    val order: Int,
    val operationId: String,
    val method: String,
    val path: String,
    requestMediaTypes: List<String>,
    responseMediaTypes: List<String>,
    successStatusCodes: Set<Int>,
    val requestType: KotlinTypeRef,
    val responseType: KotlinTypeRef,
    val requestCodecPropertyName: String,
    val responseCodecPropertyName: String,
    val requestCodecConstantName: String,
    val responseCodecConstantName: String,
    val requestCodecId: String,
    val responseCodecId: String,
    val responseMode: OperationResponseMode,
    val deadlines: OperationDeadlines,
    val methodKdoc: String,
    parameters: List<OperationParameterDeclaration> = emptyList(),
    requestBodyAlternatives: List<OperationRequestBodyAlternative> = emptyList(),
    responseAlternatives: List<OperationResponseAlternative> = emptyList(),
    security: List<OperationSecurityRequirement> = emptyList(),
    val safety: OperationSafetyDeclaration = OperationSafetyDeclaration(),
    val idempotency: IdempotencyDeclaration? = null,
    val retry: RetryDeclaration = RetryDeclaration(),
    val pagination: PaginationDeclaration? = null,
    val streaming: StreamingDeclaration? = null,
    /** Original OpenAPI operation identity, retained separately from the Kotlin member name. */
    val operationIdentity: String = operationId,
    /** Whether the operation's request body must be present when a body is modeled. */
    val requestBodyRequired: Boolean = false,
    /**
     * The decoded element type of the operation's streaming (SSE) success alternative, populated only when
     * [responseMode] is [OperationResponseMode.MIXED]. [responseType] and [responseAlternatives] on a `MIXED`
     * operation describe only its buffered (JSON) surface — the same shape a `BUFFERED`-only operation would have —
     * so the ordinary body-returning method, `withResponse`, and every existing typed-error/codec code path work
     * unchanged; this field is consulted only by the dedicated streaming entry point (`fooStream()`) to type its
     * cold `Flow` and locate its event codec.
     */
    val streamResponseType: KotlinTypeRef? = null,
) {
    val requestMediaTypes: List<String> = requestMediaTypes.toList()
    val responseMediaTypes: List<String> = responseMediaTypes.toList()
    val successStatusCodes: Set<Int> = successStatusCodes.toSet()
    val parameters: List<OperationParameterDeclaration> = parameters.toList()
    val requestBodyAlternatives: List<OperationRequestBodyAlternative> = requestBodyAlternatives.toList()
    val responseAlternatives: List<OperationResponseAlternative> = responseAlternatives.toList()
    val security: List<OperationSecurityRequirement> = security.toList()
}

internal enum class OperationResponseMode {
    BUFFERED,
    STREAMING,
    MIXED,
}

internal data class OperationDeadlines(
    val totalMillis: Long?,
    val attemptMillis: Long?,
    val idleMillis: Long?,
)

internal data class KotlinTypeRef(
    val packageName: String,
    val simpleName: String,
    val arguments: List<KotlinTypeRef> = emptyList(),
    val nullable: Boolean = false,
)

internal fun KotlinDeclarationModel.rewriteTypeReferences(
    renames: Map<Pair<String, String>, String>,
): KotlinDeclarationModel {
    fun KotlinTypeRef.rewritten(): KotlinTypeRef =
        copy(
            simpleName = renames[packageName to simpleName] ?: simpleName,
            arguments = arguments.map { argument -> argument.rewritten() },
        )

    fun SimpleFieldDeclaration.rewritten(): SimpleFieldDeclaration = copy(type = type.rewritten())

    fun FieldDeclaration.rewritten(): FieldDeclaration = copy(type = type.rewritten())

    fun UnionFieldDeclaration.rewritten(): UnionFieldDeclaration = copy(type = type.rewritten())

    fun AnyOfBranchDeclaration.rewritten(): AnyOfBranchDeclaration =
        copy(
            fields = fields.map { field -> field.rewritten() },
            viewFields = viewFields.map { field -> field.rewritten() },
            type = type?.rewritten(),
        )

    fun OperationResponseAlternative.rewritten(): OperationResponseAlternative =
        OperationResponseAlternative(
            selector = selector,
            mediaTypes = mediaTypes,
            type = type.rewritten(),
            mode = mode,
        )

    fun MultipartPartDeclaration.rewritten(): MultipartPartDeclaration =
        MultipartPartDeclaration(
            wireName = wireName,
            accessorName = accessorName,
            type = type.rewritten(),
            required = required,
            contentType = contentType,
            indexedElements = indexedElements,
            headers = headers,
        )

    fun FormValueDeclaration.rewritten(): FormValueDeclaration =
        when (this) {
            is FormValueDeclaration.Scalar -> {
                this
            }

            is FormValueDeclaration.Array -> {
                FormValueDeclaration.Array(element.rewritten())
            }

            is FormValueDeclaration.Map -> {
                FormValueDeclaration.Map(value.rewritten())
            }

            is FormValueDeclaration.Union -> {
                FormValueDeclaration.Union(
                    branches.map { branch -> branch.copy(value = branch.value.rewritten()) },
                )
            }

            is FormValueDeclaration.Object -> {
                FormValueDeclaration.Object(
                    fields.map { field ->
                        FormFieldDeclaration(
                            wireName = field.wireName,
                            accessorName = field.accessorName,
                            type = field.type.rewritten(),
                            required = field.required,
                            value = field.value.rewritten(),
                        )
                    },
                )
            }
        }

    fun FormFieldDeclaration.rewritten(): FormFieldDeclaration =
        FormFieldDeclaration(
            wireName = wireName,
            accessorName = accessorName,
            type = type.rewritten(),
            required = required,
            value = value.rewritten(),
        )

    fun OperationRequestBodyAlternative.rewritten(): OperationRequestBodyAlternative =
        OperationRequestBodyAlternative(
            mediaType = mediaType,
            type = type.rewritten(),
            multipartParts = multipartParts.map { part -> part.rewritten() },
            formFields = formFields.map { field -> field.rewritten() },
            required = required,
        )

    fun OperationDeclaration.rewritten(): OperationDeclaration =
        OperationDeclaration(
            symbolId = symbolId,
            order = order,
            operationId = operationId,
            method = method,
            path = path,
            requestMediaTypes = requestMediaTypes,
            responseMediaTypes = responseMediaTypes,
            successStatusCodes = successStatusCodes,
            requestType = requestType.rewritten(),
            responseType = responseType.rewritten(),
            requestCodecPropertyName = requestCodecPropertyName,
            responseCodecPropertyName = responseCodecPropertyName,
            requestCodecConstantName = requestCodecConstantName,
            responseCodecConstantName = responseCodecConstantName,
            requestCodecId = requestCodecId,
            responseCodecId = responseCodecId,
            responseMode = responseMode,
            deadlines = deadlines,
            methodKdoc = methodKdoc,
            parameters =
                parameters.map { parameter ->
                    parameter.copy(type = parameter.type.rewritten())
                },
            requestBodyAlternatives =
                requestBodyAlternatives.map { alternative -> alternative.rewritten() },
            responseAlternatives =
                responseAlternatives.map { alternative -> alternative.rewritten() },
            security = security,
            safety = safety,
            idempotency = idempotency,
            retry = retry,
            pagination =
                when (val value = pagination) {
                    is PaginationDeclaration.CursorToken -> value.copy(itemType = value.itemType?.rewritten())
                    is PaginationDeclaration.HeaderNextUrl -> value.copy(itemType = value.itemType?.rewritten())
                    null -> null
                },
            streaming = streaming,
            operationIdentity = operationIdentity,
            requestBodyRequired = requestBodyRequired,
            streamResponseType = streamResponseType?.rewritten(),
        )

    fun Declaration.rewritten(): Declaration =
        when (this) {
            is ModelDeclaration -> {
                copy(
                    fields = fields.map { field -> field.rewritten() },
                    additionalProperties =
                        additionalProperties?.copy(
                            valueType = additionalProperties.valueType.rewritten(),
                        ),
                    auxiliaryModels =
                        auxiliaryModels.map { auxiliary ->
                            auxiliary.copy(fields = auxiliary.fields.map { field -> field.rewritten() })
                        },
                )
            }

            is OpenEnumDeclaration -> {
                this
            }

            is OneOfDeclaration -> {
                copy(
                    cases =
                        cases.map { case ->
                            case.copy(
                                requiredFields = case.requiredFields.map { field -> field.rewritten() },
                                matchFields = case.matchFields.map { field -> field.rewritten() },
                            )
                        },
                )
            }

            is PrimitiveOneOfDeclaration -> {
                copy(cases = cases.map { case -> case.copy(type = case.type.rewritten()) })
            }

            is AnyOfDeclaration -> {
                copy(branches = branches.map { branch -> branch.rewritten() })
            }

            is SupportDeclaration -> {
                this
            }

            is OperationClientDeclaration -> {
                copy(operations = operations.map { operation -> operation.rewritten() })
            }
        }

    return copy(
        files =
            files.map { file ->
                file.copy(declarations = file.declarations.map { declaration -> declaration.rewritten() })
            },
    )
}

internal fun sanitizeKDoc(value: String): String =
    value
        .lineSequence()
        .joinToString("\n") { line -> line.trimEnd() }
        .replace("*/", "*&#47;")

private fun Declaration.canonicalText(): String =
    when (this) {
        is ModelDeclaration -> {
            buildString {
                append("model|").append(commonText())
                fields.forEach { field ->
                    append("|field:")
                        .append(field.symbolId)
                        .append(':')
                        .append(field.order)
                        .append(':')
                        .append(field.resolvedName)
                        .append(':')
                        .append(field.wireName)
                        .append(':')
                        .append(field.type.canonicalText())
                        .append(':')
                        .append(field.required)
                        .append(':')
                        .append(field.nullable)
                        .append(':')
                        .append(sanitizeKDoc(field.kdoc))
                }
                additionalProperties?.let { additional ->
                    append("|additional:")
                        .append(additional.resolvedName)
                        .append(':')
                        .append(additional.valueType.canonicalText())
                        .append(':')
                        .append(additional.valuesAreJsonElements)
                        .append(':')
                        .append(additional.fixedWireNames.sorted().joinToString(","))
                        .append(':')
                        .append(sanitizeKDoc(additional.kdoc))
                }
                append("|dsl:").append(dslFunctionName)
                auxiliaryModels.forEach { auxiliary ->
                    append("|aux:").append(auxiliary.resolvedName).append(':').append(sanitizeKDoc(auxiliary.kdoc))
                    auxiliary.fields.forEach { field ->
                        append("|aux-field:")
                            .append(field.resolvedName)
                            .append(':')
                            .append(field.wireName)
                            .append(':')
                            .append(field.type.canonicalText())
                            .append(':')
                            .append(sanitizeKDoc(field.kdoc))
                    }
                }
            }
        }

        is OpenEnumDeclaration -> {
            buildString {
                append("enum|").append(commonText())
                values.forEach { value ->
                    append("|value:")
                        .append(value.symbolId)
                        .append(':')
                        .append(value.order)
                        .append(':')
                        .append(value.resolvedName)
                        .append(':')
                        .append(value.wireValue)
                        .append(':')
                        .append(sanitizeKDoc(value.kdoc))
                }
            }
        }

        is OneOfDeclaration -> {
            buildString {
                append("oneof|").append(commonText())
                cases.forEach { case ->
                    append("|case:")
                        .append(case.symbolId)
                        .append(':')
                        .append(case.order)
                        .append(':')
                        .append(case.resolvedName)
                        .append(":empty=")
                        .append(case.matchesEmptyObject)
                        .append(":predicate=")
                        .append(case.predicate?.canonicalText())
                    case.requiredFields.forEach { field -> append("|required:").append(field.canonicalText()) }
                    case.matchFields.forEach { field -> append("|match:").append(field.canonicalText()) }
                }
            }
        }

        is PrimitiveOneOfDeclaration -> {
            buildString {
                append("primitive-oneof|").append(commonText())
                cases.forEach { case ->
                    append("|case:")
                        .append(case.symbolId)
                        .append(':')
                        .append(case.order)
                        .append(':')
                        .append(case.resolvedName)
                        .append(':')
                        .append(case.type.canonicalText())
                        .append(':')
                        .append(case.jsonKind)
                        .append(':')
                        .append(case.predicate.canonicalText())
                }
            }
        }

        is AnyOfDeclaration -> {
            buildString {
                append("anyof|")
                    .append(commonText())
                    .append("|branch-enum:")
                    .append(branchEnumName)
                    .append("|inspection:")
                    .append(inspectionName)
                branches.forEach { branch ->
                    append("|branch:")
                        .append(branch.symbolId)
                        .append(':')
                        .append(branch.order)
                        .append(':')
                        .append(branch.resolvedName)
                        .append(':')
                        .append(branch.propertyName)
                        .append(':')
                        .append(branch.shape)
                        .append(':')
                        .append(branch.type?.canonicalText().orEmpty())
                        .append(':')
                        .append(branch.maxItems)
                        .append(':')
                        .append(branch.viewTypeName)
                    branch.fields.forEach { field -> append("|match:").append(field.canonicalText()) }
                    branch.viewFields.forEach { field -> append("|view:").append(field.canonicalText()) }
                }
            }
        }

        is SupportDeclaration -> {
            "support|${commonText()}|$kind"
        }

        is OperationClientDeclaration -> {
            buildString {
                append("operation-client|").append(commonText()).append("|codecs:").append(codecsObjectName)
                append("|preserve-operation-metadata-names:").append(preserveOperationMetadataNames)
                securitySchemes.toSortedMap().forEach { (schemeId, scheme) ->
                    append("|security-scheme:").append(schemeId).append(':').append(scheme)
                }
                subClients
                    .sortedWith(compareBy(OperationClientGroupRef::packageName, OperationClientGroupRef::className))
                    .forEach { subClient ->
                        append("|sub-client:")
                            .append(subClient.packageName)
                            .append(':')
                            .append(subClient.className)
                            .append(':')
                            .append(subClient.accessorName)
                            .append(':')
                            .append(sanitizeKDoc(subClient.kdoc))
                    }
                operations.forEach { operation ->
                    append("|operation:")
                        .append(operation.symbolId)
                        .append(':')
                        .append(operation.order)
                        .append(':')
                        .append(operation.operationId)
                        .append(':')
                        .append(operation.method)
                        .append(':')
                        .append(operation.path)
                        .append(':')
                        .append(operation.requestMediaTypes.joinToString(","))
                        .append(':')
                        .append(operation.responseMediaTypes.joinToString(","))
                        .append(':')
                        .append(operation.successStatusCodes.sorted().joinToString(","))
                        .append(':')
                        .append(operation.requestType.canonicalText())
                        .append(':')
                        .append(operation.responseType.canonicalText())
                        .append(':')
                        .append(operation.requestCodecPropertyName)
                        .append(':')
                        .append(operation.responseCodecPropertyName)
                        .append(':')
                        .append(operation.requestCodecConstantName)
                        .append(':')
                        .append(operation.responseCodecConstantName)
                        .append(':')
                        .append(operation.requestCodecId)
                        .append(':')
                        .append(operation.responseCodecId)
                        .append(':')
                        .append(operation.responseMode)
                        .append(':')
                        .append(operation.operationIdentity)
                        .append(':')
                        .append(operation.requestBodyRequired)
                        .append(':')
                        .append(operation.deadlines.totalMillis)
                        .append(':')
                        .append(operation.deadlines.attemptMillis)
                        .append(':')
                        .append(operation.deadlines.idleMillis)
                        .append(':')
                        .append(sanitizeKDoc(operation.methodKdoc))
                    operation.parameters.forEach { parameter ->
                        append("|parameter:")
                            .append(parameter.name)
                            .append(':')
                            .append(parameter.location)
                            .append(':')
                            .append(parameter.type.canonicalText())
                            .append(':')
                            .append(parameter.required)
                            .append(':')
                            .append(parameter.style)
                            .append(':')
                            .append(parameter.explode)
                    }
                    operation.requestBodyAlternatives.forEach { alternative ->
                        append("|request-body:")
                            .append(alternative.mediaType)
                            .append(':')
                            .append(alternative.type.canonicalText())
                            .append(':')
                            .append(alternative.required)
                        alternative.multipartParts.forEach { part ->
                            append("|multipart-part:")
                                .append(part.wireName)
                                .append(':')
                                .append(part.type.canonicalText())
                                .append(':')
                                .append(part.required)
                                .append(':')
                                .append(part.contentType)
                                .append(':')
                                .append(part.indexedElements)
                                .append(':')
                                .append(part.accessorName)
                                .append(':')
                                .append(
                                    part.headers.keys
                                        .sorted()
                                        .joinToString(","),
                                )
                        }
                        alternative.formFields
                            .sortedWith(compareBy(FormFieldDeclaration::wireName, FormFieldDeclaration::accessorName))
                            .forEach { field ->
                                append("|form-field:").append(field.canonicalText())
                            }
                    }
                    operation.responseAlternatives.forEach { alternative ->
                        append("|response-alternative:")
                            .append(alternative.selector)
                            .append(':')
                            .append(alternative.mediaTypes.joinToString(","))
                            .append(':')
                            .append(alternative.type.canonicalText())
                            .append(':')
                            .append(alternative.mode)
                    }
                    operation.security.forEach { requirement ->
                        append("|security:")
                        requirement.schemes.forEach { scheme ->
                            append(scheme.schemeId).append('[').append(scheme.scopes.joinToString(",")).append(']')
                        }
                    }
                    append("|safety:").append(operation.safety)
                    append("|idempotency:").append(operation.idempotency)
                    append("|retry:").append(operation.retry.canonicalText())
                    append("|pagination:").append(operation.pagination)
                    append("|streaming:").append(operation.streaming)
                }
            }
        }
    }

private fun Declaration.commonText(): String =
    listOf(
        symbolId,
        order,
        packageName,
        fileName,
        resolvedName,
        sanitizeKDoc(kdoc),
    ).joinToString("|")

private fun KotlinTypeRef.canonicalText(): String =
    buildString {
        append(packageName).append('.').append(simpleName)
        if (arguments.isNotEmpty()) {
            append('<').append(arguments.joinToString(",") { it.canonicalText() }).append('>')
        }
        if (nullable) append('?')
    }

private fun RetryDeclaration.canonicalText(): String =
    buildString {
        append(retryableStatusCodes.joinToString(","))
        append(':').append(retryConnectionErrors)
        append(':').append(maxAttempts)
        append(':').append(backoff)
    }

private fun UnionFieldDeclaration.canonicalText(): String =
    "$resolvedName:$wireName:${type.canonicalText()}:${expectedStringValues.joinToString(",")}:$required"

private fun FormFieldDeclaration.canonicalText(): String =
    "$wireName:$accessorName:${type.canonicalText()}:$required:${value.canonicalText()}"

private fun JsonBranchPredicate.canonicalText(): String =
    when (this) {
        JsonBranchPredicate.AnyValue -> {
            "any"
        }

        JsonBranchPredicate.NeverMatch -> {
            "never"
        }

        is JsonBranchPredicate.Kind -> {
            "kind:$kind"
        }

        is JsonBranchPredicate.AllOf -> {
            "all(${predicates.joinToString(",") { it.canonicalText() }})"
        }

        is JsonBranchPredicate.AnyOf -> {
            "anyOf(${predicates.joinToString(",") { it.canonicalText() }})"
        }

        is JsonBranchPredicate.Constant -> {
            "const:${value.canonicalText()}"
        }

        is JsonBranchPredicate.Enumeration -> {
            "enum:${values.joinToString(",") { it.canonicalText() }}"
        }

        is JsonBranchPredicate.Numeric -> {
            "numeric:$minimum:$maximum:$exclusiveMinimum:$exclusiveMaximum:$multipleOf"
        }

        is JsonBranchPredicate.StringShape -> {
            "string:$minLength:$maxLength:$format"
        }

        is JsonBranchPredicate.ArrayShape -> {
            "array:$minItems:$maxItems:$uniqueItems:${item?.canonicalText()}"
        }

        is JsonBranchPredicate.ObjectShape -> {
            "object:${requiredNames.joinToString(
                ",",
            )}:${properties.toSortedMap().entries.joinToString(",") { (name, predicate) ->
                "$name=${predicate.canonicalText()}"
            }}:${additionalProperties.canonicalText()}"
        }
    }

private fun JsonAdditionalPropertiesPredicate.canonicalText(): String =
    when (this) {
        JsonAdditionalPropertiesPredicate.Open -> "open"
        JsonAdditionalPropertiesPredicate.Closed -> "closed"
        is JsonAdditionalPropertiesPredicate.Typed -> "typed:${predicate.canonicalText()}"
    }

internal fun JsonValue.canonicalText(): String =
    when (this) {
        JsonValue.Null -> "null"

        is JsonValue.BooleanValue -> "boolean:$value"

        is JsonValue.NumberValue -> "number:$lexicalValue"

        is JsonValue.StringValue -> "string:$value"

        is JsonValue.ArrayValue -> "array:${values.joinToString(",") { it.canonicalText() }}"

        is JsonValue.ObjectValue -> "object:${properties.toSortedMap().entries.joinToString(
            ",",
        ) { (name, value) -> "$name=${value.canonicalText()}" }}"
    }

private fun FormValueDeclaration.canonicalText(): String =
    when (this) {
        is FormValueDeclaration.Scalar -> {
            "scalar:$kind"
        }

        is FormValueDeclaration.Array -> {
            "array:${element.canonicalText()}"
        }

        is FormValueDeclaration.Map -> {
            "map:$valuesAreJsonElements:${value.canonicalText()}"
        }

        is FormValueDeclaration.Union -> {
            "union:${branches.joinToString(",") { branch ->
                "${branch.accessorName}:${branch.kind}:${branch.value.canonicalText()}"
            }}"
        }

        is FormValueDeclaration.Object -> {
            "object:${
                fields
                    .sortedWith(compareBy(FormFieldDeclaration::wireName, FormFieldDeclaration::accessorName))
                    .joinToString(",") { it.canonicalText() }
            }"
        }
    }

internal fun sha256Hex(bytes: ByteArray): String =
    MessageDigest
        .getInstance("SHA-256")
        .digest(bytes)
        .joinToString("") { byte -> "%02x".format(byte) }
