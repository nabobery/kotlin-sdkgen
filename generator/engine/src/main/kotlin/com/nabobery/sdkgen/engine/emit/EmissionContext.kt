@file:Suppress("ktlint:standard:max-line-length")

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
            RenderedKotlinFile(file.path, builder.build().toString().encodeToByteArray())
        }

    internal val fieldState: ClassName = ClassName(generatedPackage, "FieldState")
    internal val fieldPresence: ClassName = ClassName(generatedPackage, "FieldPresence")
    internal val oneOfNoMatch: ClassName = ClassName(generatedPackage, "OneOfNoMatchException")
    internal val oneOfAmbiguity: ClassName = ClassName(generatedPackage, "OneOfAmbiguityException")
    internal val anyOfNoMatch: ClassName = ClassName(generatedPackage, "AnyOfNoMatchException")
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
    return if (arguments.isEmpty()) raw else raw.parameterizedBy(arguments.map { it.toTypeName() })
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
internal val OPERATION_METADATA = ClassName("com.nabobery.sdkgen.runtime", "OperationMetadata")
internal val SDK_DEADLINES = ClassName("com.nabobery.sdkgen.runtime", "SdkDeadlines")
internal val SDK_EXECUTOR = ClassName("com.nabobery.sdkgen.runtime", "SdkExecutor")
internal val SDK_RESPONSE_MODE = ClassName("com.nabobery.sdkgen.runtime", "SdkResponseMode")
internal val SDK_TRANSPORT = ClassName("com.nabobery.sdkgen.runtime", "SdkTransport")
internal val BUILD_JSON_OBJECT = MemberName("kotlinx.serialization.json", "buildJsonObject")
internal val PUT = MemberName("kotlinx.serialization.json", "put")
internal val DECODE_FROM_JSON_ELEMENT = MemberName("kotlinx.serialization.json", "decodeFromJsonElement")
internal val ENCODE_TO_JSON_ELEMENT = MemberName("kotlinx.serialization.json", "encodeToJsonElement")
