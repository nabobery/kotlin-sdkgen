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
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType() {
    public override val `value`: String = "refusal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType =
      when (value) {
      Refusal.value -> Refusal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesRefusalContentPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
