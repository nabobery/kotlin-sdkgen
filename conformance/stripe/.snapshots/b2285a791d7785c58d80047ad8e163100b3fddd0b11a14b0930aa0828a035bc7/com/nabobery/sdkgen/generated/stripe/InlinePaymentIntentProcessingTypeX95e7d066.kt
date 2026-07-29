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
 * Type of the payment method for which payment is in `processing` state, one of `card`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_processing/properties/type
 */
@Serializable(with = InlinePaymentIntentProcessingTypeX95e7d066.Serializer::class)
public sealed class InlinePaymentIntentProcessingTypeX95e7d066 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePaymentIntentProcessingTypeX95e7d066() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentProcessingTypeX95e7d066()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentProcessingTypeX95e7d066 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentProcessingTypeX95e7d066> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentProcessingTypeX95e7d066", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentProcessingTypeX95e7d066 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentProcessingTypeX95e7d066) {
      encoder.encodeString(value.value)
    }
  }
}
