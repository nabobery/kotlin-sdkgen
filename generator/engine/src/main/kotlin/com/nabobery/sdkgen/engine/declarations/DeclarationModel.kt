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

                                    is AnyOfDeclaration -> {
                                        declaration.copy(branches = declaration.branches.shuffled(random))
                                    }

                                    is SupportDeclaration -> {
                                        declaration
                                    }

                                    is OperationClientDeclaration -> {
                                        declaration.copy(operations = declaration.operations.shuffled(random))
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
    val auxiliaryModels: List<SimpleModelDeclaration> = emptyList(),
    val usesFieldState: Boolean = false,
) : Declaration

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
)

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
    val shape: AnyOfBranchShape = AnyOfBranchShape.OBJECT,
    val type: KotlinTypeRef? = null,
    val maxItems: Int? = null,
    val viewTypeName: String = "${resolvedName}View",
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
) : Declaration {
    val operations: List<OperationDeclaration> = operations.toList()
    val securitySchemes: Map<String, OperationSecuritySchemeDeclaration> = securitySchemes.toMap()

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
    data class CursorToken(
        val requestCursorParam: String,
        val requestLimitParam: String?,
        val responseItemsPath: String,
        val responseNextCursorPath: String,
        val itemType: KotlinTypeRef? = null,
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
)

internal class MultipartPartDeclaration(
    val name: String,
    val type: KotlinTypeRef,
    val required: Boolean,
    val contentType: String,
    headers: Map<String, JsonValue> = emptyMap(),
    val propertyName: String = KotlinNameResolver.memberName(name),
) {
    val headers: Map<String, JsonValue> = headers.toMap()
}

internal class OperationRequestBodyAlternative(
    val mediaType: String,
    val type: KotlinTypeRef,
    multipartParts: List<MultipartPartDeclaration> = emptyList(),
    val required: Boolean = false,
) {
    val multipartParts: List<MultipartPartDeclaration> = multipartParts.toList()
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
            name = name,
            type = type.rewritten(),
            required = required,
            contentType = contentType,
            headers = headers,
            propertyName = propertyName,
        )

    fun OperationRequestBodyAlternative.rewritten(): OperationRequestBodyAlternative =
        OperationRequestBodyAlternative(
            mediaType = mediaType,
            type = type.rewritten(),
            multipartParts = multipartParts.map { part -> part.rewritten() },
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
                    null -> null
                },
            streaming = streaming,
            operationIdentity = operationIdentity,
            requestBodyRequired = requestBodyRequired,
        )

    fun Declaration.rewritten(): Declaration =
        when (this) {
            is ModelDeclaration -> {
                copy(
                    fields = fields.map { field -> field.rewritten() },
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

internal fun sanitizeKDoc(value: String): String = value.replace("*/", "*&#47;")

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
                    case.requiredFields.forEach { field -> append("|required:").append(field.canonicalText()) }
                    case.matchFields.forEach { field -> append("|match:").append(field.canonicalText()) }
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
                    branch.fields.forEach { field -> append('|').append(field.canonicalText()) }
                }
            }
        }

        is SupportDeclaration -> {
            "support|${commonText()}|$kind"
        }

        is OperationClientDeclaration -> {
            buildString {
                append("operation-client|").append(commonText()).append("|codecs:").append(codecsObjectName)
                securitySchemes.toSortedMap().forEach { (schemeId, scheme) ->
                    append("|security-scheme:").append(schemeId).append(':').append(scheme)
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
                                .append(part.name)
                                .append(':')
                                .append(part.type.canonicalText())
                                .append(':')
                                .append(part.required)
                                .append(':')
                                .append(part.contentType)
                                .append(':')
                                .append(part.propertyName)
                                .append(':')
                                .append(
                                    part.headers.keys
                                        .sorted()
                                        .joinToString(","),
                                )
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
    "$resolvedName:$wireName:${type.canonicalText()}:${expectedStringValue.orEmpty()}"

internal fun sha256Hex(bytes: ByteArray): String =
    MessageDigest
        .getInstance("SHA-256")
        .digest(bytes)
        .joinToString("") { byte -> "%02x".format(byte) }
