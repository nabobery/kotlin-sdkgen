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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesRefusalContent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesRefusalContent/properties/type
 */
@Serializable(with = InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe.Serializer::class)
public sealed class InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe() {
    public override val `value`: String = "refusal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe = when (value) {
      Refusal.value -> Refusal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe) {
      encoder.encodeString(value.value)
    }
  }
}
