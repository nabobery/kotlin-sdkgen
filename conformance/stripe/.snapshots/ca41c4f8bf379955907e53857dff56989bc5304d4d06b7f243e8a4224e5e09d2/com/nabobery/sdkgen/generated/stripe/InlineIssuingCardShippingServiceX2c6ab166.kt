package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Shipment service, such as `standard` or `express`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/service
 */
@Serializable(with = InlineIssuingCardShippingServiceX2c6ab166.Serializer::class)
public sealed class InlineIssuingCardShippingServiceX2c6ab166 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `express`.
   */
  public data object Express : InlineIssuingCardShippingServiceX2c6ab166() {
    public override val `value`: String = "express"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineIssuingCardShippingServiceX2c6ab166() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineIssuingCardShippingServiceX2c6ab166() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingServiceX2c6ab166()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingServiceX2c6ab166 = when (value) {
      Express.value -> Express
      Priority.value -> Priority
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingServiceX2c6ab166> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingServiceX2c6ab166", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingServiceX2c6ab166 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingServiceX2c6ab166) {
      encoder.encodeString(value.value)
    }
  }
}
