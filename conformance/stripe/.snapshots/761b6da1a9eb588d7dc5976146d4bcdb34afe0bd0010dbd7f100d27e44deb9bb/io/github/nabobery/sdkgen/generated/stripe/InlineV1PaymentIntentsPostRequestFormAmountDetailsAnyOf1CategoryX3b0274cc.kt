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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/paypal/properties/category.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/paypal/properties/category
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `digital_goods`.
   */
  public data object DigitalGoods : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc() {
    public override val `value`: String = "digital_goods"
  }

  /**
   * Documented value. Wire value: `donation`.
   */
  public data object Donation : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc() {
    public override val `value`: String = "donation"
  }

  /**
   * Documented value. Wire value: `physical_goods`.
   */
  public data object PhysicalGoods : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc() {
    public override val `value`: String = "physical_goods"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc = when (value) {
      DigitalGoods.value -> DigitalGoods
      Donation.value -> Donation
      PhysicalGoods.value -> PhysicalGoods
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc) {
      encoder.encodeString(value.value)
    }
  }
}
