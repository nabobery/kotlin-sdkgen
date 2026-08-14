package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_amount_details_line_item/properties/object
 */
@Serializable(with = InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062.Serializer::class)
public sealed class InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_intent_amount_details_line_item`.
   */
  public data object PaymentIntentAmountDetailsLineItem : InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062() {
    public override val `value`: String = "payment_intent_amount_details_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062 = when (value) {
      PaymentIntentAmountDetailsLineItem.value -> PaymentIntentAmountDetailsLineItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062) {
      encoder.encodeString(value.value)
    }
  }
}
