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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc) {
      encoder.encodeString(value.value)
    }
  }
}
