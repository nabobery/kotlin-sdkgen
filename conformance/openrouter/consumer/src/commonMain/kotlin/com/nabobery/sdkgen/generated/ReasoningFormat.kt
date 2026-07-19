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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningFormat.
 */
@Serializable(with = ReasoningFormat.Serializer::class)
public sealed class ReasoningFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : ReasoningFormat() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `openai-responses-v1`.
   */
  public data object OpenaiResponsesV1 : ReasoningFormat() {
    public override val `value`: String = "openai-responses-v1"
  }

  /**
   * Documented value. Wire value: `azure-openai-responses-v1`.
   */
  public data object AzureOpenaiResponsesV1 : ReasoningFormat() {
    public override val `value`: String = "azure-openai-responses-v1"
  }

  /**
   * Documented value. Wire value: `xai-responses-v1`.
   */
  public data object XaiResponsesV1 : ReasoningFormat() {
    public override val `value`: String = "xai-responses-v1"
  }

  /**
   * Documented value. Wire value: `anthropic-claude-v1`.
   */
  public data object AnthropicClaudeV1 : ReasoningFormat() {
    public override val `value`: String = "anthropic-claude-v1"
  }

  /**
   * Documented value. Wire value: `google-gemini-v1`.
   */
  public data object GoogleGeminiV1 : ReasoningFormat() {
    public override val `value`: String = "google-gemini-v1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ReasoningFormat()

  public companion object {
    public fun fromValue(`value`: String): ReasoningFormat = when (value) {
      Unknown.value -> Unknown
      OpenaiResponsesV1.value -> OpenaiResponsesV1
      AzureOpenaiResponsesV1.value -> AzureOpenaiResponsesV1
      XaiResponsesV1.value -> XaiResponsesV1
      AnthropicClaudeV1.value -> AnthropicClaudeV1
      GoogleGeminiV1.value -> GoogleGeminiV1
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ReasoningFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ReasoningFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ReasoningFormat = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ReasoningFormat) {
      encoder.encodeString(value.value)
    }
  }
}
