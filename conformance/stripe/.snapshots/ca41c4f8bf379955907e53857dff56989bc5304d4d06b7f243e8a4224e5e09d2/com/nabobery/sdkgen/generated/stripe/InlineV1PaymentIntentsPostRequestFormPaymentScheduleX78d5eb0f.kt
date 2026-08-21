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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/pa
 * yment_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/pa
 * yment_schedule
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `adhoc`.
   */
  public data object Adhoc : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "adhoc"
  }

  /**
   * Documented value. Wire value: `annual`.
   */
  public data object Annual : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "annual"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `fortnightly`.
   */
  public data object Fortnightly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "fortnightly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `semi_annual`.
   */
  public data object SemiAnnual : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "semi_annual"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f = when (value) {
      Value.value -> Value
      Adhoc.value -> Adhoc
      Annual.value -> Annual
      Daily.value -> Daily
      Fortnightly.value -> Fortnightly
      Monthly.value -> Monthly
      Quarterly.value -> Quarterly
      SemiAnnual.value -> SemiAnnual
      Weekly.value -> Weekly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX78d5eb0f) {
      encoder.encodeString(value.value)
    }
  }
}
