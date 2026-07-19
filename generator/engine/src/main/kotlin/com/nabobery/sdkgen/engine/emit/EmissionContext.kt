package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName

/**
 * A single rendered Kotlin source file: its module-relative path and its UTF-8 encoded contents.
 */
internal data class RenderedKotlinFile(
    val path: String,
    val bytes: ByteArray,
)

/**
 * Dispatches a normalized [KotlinDeclarationModel] to the per-[com.nabobery.sdkgen.engine.declarations.Declaration]
 * family emitters (see `ModelEmitter.kt`, `UnionEmitter.kt`, `EnumEmitter.kt`, `OperationEmitter.kt`,
 * `SupportEmitter.kt`) and hosts the ClassName/MemberName/type-conversion utilities they share.
 */
internal class EmissionContext(
    internal val generatedPackage: String = "com.nabobery.sdkgen.generated",
    internal val customSerializerTypes: Set<String> = emptySet(),
) {
    fun render(model: KotlinDeclarationModel): List<RenderedKotlinFile> =
        model.normalized().files.map { file ->
            val builder = FileSpec.builder(file.packageName, file.fileName)
            file.declarations.forEach { declaration ->
                when (declaration) {
                    is ModelDeclaration -> emitModel(builder, declaration)
                    is OpenEnumDeclaration -> builder.addType(openEnum(declaration))
                    is OneOfDeclaration -> emitOneOf(builder, declaration)
                    is AnyOfDeclaration -> emitAnyOf(builder, declaration)
                    is SupportDeclaration -> emitSupport(builder, declaration)
                    is OperationClientDeclaration -> emitOperationClient(builder, declaration)
                }
            }
            RenderedKotlinFile(file.path, wrapGeneratedKotlin(builder.build().toString()).encodeToByteArray())
        }

    internal val fieldState: ClassName = ClassName(generatedPackage, "FieldState")
    internal val fieldPresence: ClassName = ClassName(generatedPackage, "FieldPresence")
}

private const val GENERATED_LINE_LIMIT = 120

private data class GeneratedLineBreak(
    val end: Int,
    val next: Int,
)

private fun wrapGeneratedKotlin(source: String): String =
    source
        .split('\n')
        .flatMap(::wrapGeneratedLine)
        .joinToString("\n")

private fun wrapGeneratedLine(line: String): List<String> {
    if (line.length <= GENERATED_LINE_LIMIT) return listOf(line)
    val content = line.trimStart()
    val indent = line.substring(0, line.length - content.length)
    if (content.startsWith("*")) return wrapGeneratedKDocLine(line, indent, content)

    findGeneratedLineBreak(line)?.let { split ->
        val left = line.substring(0, split.end).trimEnd()
        val right = indent + "  " + line.substring(split.next).trimStart()
        return wrapGeneratedLine(left) + wrapGeneratedLine(right)
    }
    splitGeneratedStringLiteral(line, indent)?.let { split ->
        return wrapGeneratedLine(split.first) + wrapGeneratedLine(split.second)
    }
    return listOf(line)
}

private fun wrapGeneratedKDocLine(
    line: String,
    indent: String,
    content: String,
): List<String> {
    val prefix = "$indent* "
    var remaining = content.removePrefix("*").trimStart()
    if (remaining.isEmpty()) return listOf(line)
    val lines = mutableListOf<String>()
    while (remaining.isNotEmpty()) {
        val available = GENERATED_LINE_LIMIT - prefix.length
        val splitAt =
            if (remaining.length <= available) {
                remaining.length
            } else {
                remaining.lastIndexOf(' ', available).takeIf { it > 0 } ?: available
            }
        lines += prefix + remaining.substring(0, splitAt).trimEnd()
        remaining = remaining.substring(splitAt).trimStart()
    }
    return lines
}

private fun findGeneratedLineBreak(line: String): GeneratedLineBreak? {
    val tokens = listOf(", ", " = ", " + ", " ?: ", " && ", " || ", " -> ", " { ", ".")
    var inString = false
    var escaped = false
    var best: GeneratedLineBreak? = null
    var index = 0
    while (index < line.length) {
        val character = line[index]
        if (character == '"' && !escaped) inString = !inString
        if (!inString) {
            tokens.forEach { token ->
                val numericDot =
                    token == "." &&
                        index > 0 &&
                        index + 1 < line.length &&
                        line[index - 1].isDigit() &&
                        line[index + 1].isDigit()
                val chainedSafeCallDot = token == "." && index > 0 && line[index - 1] == '?'
                if (!numericDot && !chainedSafeCallDot &&
                    line.startsWith(token, index) && index + token.length <= GENERATED_LINE_LIMIT
                ) {
                    val end = if (token == ".") index else index + token.length
                    val next = if (token == ".") index else index + token.length
                    val candidate = GeneratedLineBreak(end, next)
                    if (best == null || candidate.end > best.end) best = candidate
                }
            }
        }
        escaped = character == '\\' && !escaped
        if (character != '\\') escaped = false
        index += 1
    }
    return best
}

private data class GeneratedStringSplit(
    val first: String,
    val second: String,
)

private fun splitGeneratedStringLiteral(
    line: String,
    indent: String,
): GeneratedStringSplit? {
    var index = 0
    while (index < line.length) {
        if (line[index] != '"') {
            index += 1
            continue
        }
        val start = index
        index += 1
        var escaped = false
        while (index < line.length) {
            val character = line[index]
            if (character == '"' && !escaped) break
            escaped = character == '\\' && !escaped
            if (character != '\\') escaped = false
            index += 1
        }
        if (index >= line.length) return null
        val literal = line.substring(start + 1, index)
        val splitAt =
            literal
                .lastIndexOf(' ', GENERATED_LINE_LIMIT - line.substring(0, start + 1).length - 4)
                .takeIf { it > 0 }
                ?: literal.indexOf(' ')
        if (splitAt > 0) {
            val firstLiteral = literal.substring(0, splitAt + 1)
            val secondLiteral = literal.substring(splitAt + 1)
            return GeneratedStringSplit(
                first = line.substring(0, start + 1) + firstLiteral + "\" +",
                second = indent + "  \"" + secondLiteral + line.substring(index),
            )
        }
        index += 1
    }
    return null
}

internal fun serializableWith(serializer: ClassName): AnnotationSpec =
    AnnotationSpec
        .builder(SERIALIZABLE)
        .addMember("with = %T::class", serializer)
        .build()

internal fun serialName(value: String): AnnotationSpec =
    AnnotationSpec
        .builder(SERIAL_NAME)
        .addMember("%S", value)
        .build()

internal fun KotlinTypeRef.toTypeName(): TypeName {
    val raw =
        when ("$packageName.$simpleName") {
            "kotlin.Boolean" -> BOOLEAN
            "kotlin.Double" -> DOUBLE
            "kotlin.Int" -> INT
            "kotlin.String" -> STRING
            "kotlin.collections.List" -> LIST
            else -> ClassName(packageName, simpleName)
        }
    val converted = if (arguments.isEmpty()) raw else raw.parameterizedBy(arguments.map { it.toTypeName() })
    return converted.copy(nullable = nullable)
}

internal val STAR = com.squareup.kotlinpoet.STAR
internal val SERIALIZABLE = ClassName("kotlinx.serialization", "Serializable")
internal val SERIAL_NAME = ClassName("kotlinx.serialization", "SerialName")
internal val K_SERIALIZER = ClassName("kotlinx.serialization", "KSerializer")
internal val SERIALIZATION_EXCEPTION = ClassName("kotlinx.serialization", "SerializationException")
internal val SERIAL_DESCRIPTOR = ClassName("kotlinx.serialization.descriptors", "SerialDescriptor")
internal val PRIMITIVE_KIND = ClassName("kotlinx.serialization.descriptors", "PrimitiveKind")
internal val PRIMITIVE_SERIAL_DESCRIPTOR = ClassName("kotlinx.serialization.descriptors", "PrimitiveSerialDescriptor")
internal val DECODER = ClassName("kotlinx.serialization.encoding", "Decoder")
internal val ENCODER = ClassName("kotlinx.serialization.encoding", "Encoder")
internal val JSON = ClassName("kotlinx.serialization.json", "Json")
internal val JSON_ARRAY = ClassName("kotlinx.serialization.json", "JsonArray")
internal val JSON_DECODER = ClassName("kotlinx.serialization.json", "JsonDecoder")
internal val JSON_ELEMENT = ClassName("kotlinx.serialization.json", "JsonElement")
internal val JSON_ENCODER = ClassName("kotlinx.serialization.json", "JsonEncoder")
internal val JSON_NULL = ClassName("kotlinx.serialization.json", "JsonNull")
internal val JSON_OBJECT = ClassName("kotlinx.serialization.json", "JsonObject")
internal val JSON_OBJECT_BUILDER = ClassName("kotlinx.serialization.json", "JsonObjectBuilder")
internal val JSON_PRIMITIVE = ClassName("kotlinx.serialization.json", "JsonPrimitive")
internal val LAZY_THREAD_SAFETY_MODE = ClassName("kotlin", "LazyThreadSafetyMode")
internal val CALL_OPTIONS = ClassName("com.nabobery.sdkgen.runtime", "CallOptions")
internal val KOTLINX_SERIALIZATION_CODEC = ClassName("com.nabobery.sdkgen.runtime", "KotlinxSerializationCodec")
internal val MEDIA_TYPE_CODEC = ClassName("com.nabobery.sdkgen.runtime", "MediaTypeCodec")
internal val MEDIA_TYPE_CODEC_REGISTRY = ClassName("com.nabobery.sdkgen.runtime", "MediaTypeCodecRegistry")
internal val SET = ClassName("kotlin.collections", "Set")
internal val OPERATION_METADATA = ClassName("com.nabobery.sdkgen.runtime", "OperationMetadata")
internal val RESPONSE_ALTERNATIVE = ClassName("com.nabobery.sdkgen.runtime", "ResponseAlternative")
internal val RESPONSE_SELECTOR = ClassName("com.nabobery.sdkgen.runtime", "ResponseSelector")
internal val SECURITY_REQUIREMENT = ClassName("com.nabobery.sdkgen.runtime", "SecurityRequirement")
internal val SECURITY_SCHEME_REF = ClassName("com.nabobery.sdkgen.runtime", "SecuritySchemeRef")
internal val OPERATION_SAFETY = ClassName("com.nabobery.sdkgen.runtime", "OperationSafety")
internal val IDEMPOTENCY_DESCRIPTOR = ClassName("com.nabobery.sdkgen.runtime", "IdempotencyDescriptor")
internal val RETRY_DESCRIPTOR = ClassName("com.nabobery.sdkgen.runtime", "RetryDescriptor")
internal val BACKOFF_HINTS = ClassName("com.nabobery.sdkgen.runtime", "BackoffHints")
internal val PAGINATION_DESCRIPTOR = ClassName("com.nabobery.sdkgen.runtime", "PaginationDescriptor")
internal val PROPERTY_PATH = ClassName("com.nabobery.sdkgen.runtime", "PropertyPath")
internal val STREAMING_DESCRIPTOR = ClassName("com.nabobery.sdkgen.runtime", "StreamingDescriptor")
internal val SDK_DEADLINES = ClassName("com.nabobery.sdkgen.runtime", "SdkDeadlines")
internal val SDK_EXECUTOR = ClassName("com.nabobery.sdkgen.runtime", "SdkExecutor")
internal val SDK_AUTHENTICATION = ClassName("com.nabobery.sdkgen.runtime", "SdkAuthentication")
internal val SDK_RESPONSE_RESULT = ClassName("com.nabobery.sdkgen.runtime", "SdkResponseResult")
internal val SDK_RESPONSE_DECODE_RESULT = ClassName("com.nabobery.sdkgen.runtime", "SdkResponseDecodeResult")
internal val SDK_RESPONSE_ALTERNATIVE_DECODER =
    ClassName("com.nabobery.sdkgen.runtime", "SdkResponseAlternativeDecoder")
internal val CREDENTIAL_PROVIDER = ClassName("com.nabobery.sdkgen.runtime.auth", "CredentialProvider")
internal val SECURITY_SCHEME = ClassName("com.nabobery.sdkgen.runtime.auth", "SecurityScheme")
internal val SECURITY_SCHEME_AUTHENTICATION =
    ClassName("com.nabobery.sdkgen.runtime.auth", "SecuritySchemeAuthentication")
internal val SECURITY_SCHEME_BINDING = ClassName("com.nabobery.sdkgen.runtime.auth", "SecuritySchemeBinding")
internal val TRUSTED_HOSTS = ClassName("com.nabobery.sdkgen.runtime.auth", "TrustedHosts")
internal val SDK_EXECUTION_REQUEST = ClassName("com.nabobery.sdkgen.runtime", "SdkExecutionRequest")
internal val SDK_RESPONSE_MODE = ClassName("com.nabobery.sdkgen.runtime", "SdkResponseMode")
internal val SDK_REQUEST_BODY = ClassName("com.nabobery.sdkgen.runtime", "SdkRequestBody")
internal val SDK_BYTE_STREAM = ClassName("com.nabobery.sdkgen.runtime", "SdkByteStream")
internal val FLOW = ClassName("kotlinx.coroutines.flow", "Flow")
internal val SSE_EVENT = ClassName("com.nabobery.sdkgen.runtime.streaming", "SseEvent")
internal val SSE_FLOW = MemberName("com.nabobery.sdkgen.runtime.streaming", "sseFlow")
internal val DECODE_DATA = MemberName("com.nabobery.sdkgen.runtime.streaming", "decodeData")
internal val PAGINATION_ENGINE = ClassName("com.nabobery.sdkgen.runtime.pagination", "PaginationEngine")
internal val PAGE = ClassName("com.nabobery.sdkgen.runtime.pagination", "Page")
internal val PAGE_ENVELOPE = ClassName("com.nabobery.sdkgen.runtime.pagination", "PageEnvelope")
internal val PAGE_REQUEST = ClassName("com.nabobery.sdkgen.runtime.pagination", "PageRequest")
internal val SDK_HEADER = ClassName("com.nabobery.sdkgen.runtime", "SdkHeader")
internal val SDK_REQUEST_PARAMETER = ClassName("com.nabobery.sdkgen.runtime", "SdkRequestParameter")
internal val SDK_PARAMETER_LOCATION = ClassName("com.nabobery.sdkgen.runtime", "SdkParameterLocation")
internal val SDK_TRANSPORT = ClassName("com.nabobery.sdkgen.runtime", "SdkTransport")
internal val MULTIPART_BODY = ClassName("com.nabobery.sdkgen.runtime.bodies", "MultipartBody")
internal val BUILD_JSON_OBJECT = MemberName("kotlinx.serialization.json", "buildJsonObject")
internal val PUT = MemberName("kotlinx.serialization.json", "put")
internal val DECODE_FROM_JSON_ELEMENT = MemberName("kotlinx.serialization.json", "decodeFromJsonElement")
internal val ENCODE_TO_JSON_ELEMENT = MemberName("kotlinx.serialization.json", "encodeToJsonElement")
internal val BUILTIN_SERIALIZER = MemberName("kotlinx.serialization.builtins", "serializer")
internal val NULLABLE_SERIALIZER = MemberName("kotlinx.serialization.builtins", "nullable")
internal val LIST_SERIALIZER = MemberName("kotlinx.serialization.builtins", "ListSerializer")
internal val MAP_SERIALIZER = MemberName("kotlinx.serialization.builtins", "MapSerializer")
