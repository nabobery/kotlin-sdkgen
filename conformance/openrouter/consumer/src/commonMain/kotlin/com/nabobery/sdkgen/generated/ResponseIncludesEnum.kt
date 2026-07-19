package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ResponseIncludesEnum.
 */
@Serializable(with = ResponseIncludesEnum.Serializer::class)
public sealed class ResponseIncludesEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_search_call.results`.
   */
  public data object FileSearchCallResults : ResponseIncludesEnum() {
    public override val `value`: String = "file_search_call.results"
  }

  /**
   * Documented value. Wire value: `message.input_image.image_url`.
   */
  public data object MessageInputImageImageUrl : ResponseIncludesEnum() {
    public override val `value`: String = "message.input_image.image_url"
  }

  /**
   * Documented value. Wire value: `computer_call_output.output.image_url`.
   */
  public data object ComputerCallOutputOutputImageUrl : ResponseIncludesEnum() {
    public override val `value`: String = "computer_call_output.output.image_url"
  }

  /**
   * Documented value. Wire value: `reasoning.encrypted_content`.
   */
  public data object ReasoningEncryptedContent : ResponseIncludesEnum() {
    public override val `value`: String = "reasoning.encrypted_content"
  }

  /**
   * Documented value. Wire value: `code_interpreter_call.outputs`.
   */
  public data object CodeInterpreterCallOutputs : ResponseIncludesEnum() {
    public override val `value`: String = "code_interpreter_call.outputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ResponseIncludesEnum()

  public companion object {
    public fun fromValue(`value`: String): ResponseIncludesEnum = when (value) {
      FileSearchCallResults.value -> FileSearchCallResults
      MessageInputImageImageUrl.value -> MessageInputImageImageUrl
      ComputerCallOutputOutputImageUrl.value -> ComputerCallOutputOutputImageUrl
      ReasoningEncryptedContent.value -> ReasoningEncryptedContent
      CodeInterpreterCallOutputs.value -> CodeInterpreterCallOutputs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ResponseIncludesEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ResponseIncludesEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ResponseIncludesEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ResponseIncludesEnum) {
      encoder.encodeString(value.value)
    }
  }
}
