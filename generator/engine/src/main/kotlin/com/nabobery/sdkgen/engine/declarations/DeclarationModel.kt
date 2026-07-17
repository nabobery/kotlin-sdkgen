package com.nabobery.sdkgen.engine.declarations

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

internal data class OperationClientDeclaration(
    override val symbolId: String,
    override val order: Int,
    override val packageName: String,
    override val fileName: String,
    override val resolvedName: String,
    override val kdoc: String,
    val codecsObjectName: String,
    val operations: List<OperationDeclaration>,
) : Declaration

/**
 * A single operation hosted by an [OperationClientDeclaration]. Codec property/constant names,
 * request/response shapes, and deadlines are scoped per operation so that a second operation is
 * additive to the client rather than a breaking reshape of the declaration.
 */
internal data class OperationDeclaration(
    val symbolId: String,
    val order: Int,
    val operationId: String,
    val method: String,
    val path: String,
    val requestMediaTypes: List<String>,
    val responseMediaTypes: List<String>,
    val successStatusCodes: Set<Int>,
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
)

internal enum class OperationResponseMode {
    BUFFERED,
    STREAMING,
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
)

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
                        .append(operation.deadlines.totalMillis)
                        .append(':')
                        .append(operation.deadlines.attemptMillis)
                        .append(':')
                        .append(operation.deadlines.idleMillis)
                        .append(':')
                        .append(sanitizeKDoc(operation.methodKdoc))
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
    }

private fun UnionFieldDeclaration.canonicalText(): String =
    "$resolvedName:$wireName:${type.canonicalText()}:${expectedStringValue.orEmpty()}"

internal fun sha256Hex(bytes: ByteArray): String =
    MessageDigest
        .getInstance("SHA-256")
        .digest(bytes)
        .joinToString("") { byte -> "%02x".format(byte) }
