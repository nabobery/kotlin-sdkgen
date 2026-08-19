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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicRefusalStopDetails/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicRefusalStopDetails/properties/type
 */
@Serializable(with = InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a.Serializer::class)
public sealed class InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a() {
    public override val `value`: String = "refusal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a = when (value) {
      Refusal.value -> Refusal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicRefusalStopDetailsTypeX3ff6dc3a) {
      encoder.encodeString(value.value)
    }
  }
}
