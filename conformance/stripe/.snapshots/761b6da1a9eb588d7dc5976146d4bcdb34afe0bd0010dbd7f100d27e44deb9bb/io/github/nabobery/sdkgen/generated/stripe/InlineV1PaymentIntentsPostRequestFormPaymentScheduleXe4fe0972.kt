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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/payment_schedu
 * le.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/payment_schedu
 * le
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `halfyearly`.
   */
  public data object Halfyearly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972() {
    public override val `value`: String = "halfyearly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `yearly`.
   */
  public data object Yearly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972() {
    public override val `value`: String = "yearly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972 = when (value) {
      Halfyearly.value -> Halfyearly
      Monthly.value -> Monthly
      Quarterly.value -> Quarterly
      Weekly.value -> Weekly
      Yearly.value -> Yearly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentScheduleXe4fe0972) {
      encoder.encodeString(value.value)
    }
  }
}
