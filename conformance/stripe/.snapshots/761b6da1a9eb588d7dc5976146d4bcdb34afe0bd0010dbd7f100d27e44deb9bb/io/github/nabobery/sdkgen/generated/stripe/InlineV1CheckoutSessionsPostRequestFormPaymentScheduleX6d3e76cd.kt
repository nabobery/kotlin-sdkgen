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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/payment_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/payment_schedule
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `halfyearly`.
   */
  public data object Halfyearly : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd() {
    public override val `value`: String = "halfyearly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `yearly`.
   */
  public data object Yearly : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd() {
    public override val `value`: String = "yearly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd = when (value) {
      Halfyearly.value -> Halfyearly
      Monthly.value -> Monthly
      Quarterly.value -> Quarterly
      Weekly.value -> Weekly
      Yearly.value -> Yearly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd) {
      encoder.encodeString(value.value)
    }
  }
}
