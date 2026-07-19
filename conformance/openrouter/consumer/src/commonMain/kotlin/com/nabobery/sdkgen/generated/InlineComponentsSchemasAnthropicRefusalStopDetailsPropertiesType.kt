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
 */
@Serializable(with = InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType() {
    public override val `value`: String = "refusal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType =
      when (value) {
      Refusal.value -> Refusal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
