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
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card/properties/payment_ty
 * pe.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card/properties/payment_ty
 * pe
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3.Serializer::class)
public sealed class InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_off`.
   */
  public data object OneOff : InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3() {
    public override val `value`: String = "one_off"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3() {
    public override val `value`: String = "recurring"
  }

  /**
   * Documented value. Wire value: `setup_one_off`.
   */
  public data object SetupOneOff : InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3() {
    public override val `value`: String = "setup_one_off"
  }

  /**
   * Documented value. Wire value: `setup_recurring`.
   */
  public data object SetupRecurring : InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3() {
    public override val `value`: String = "setup_recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3 = when (value) {
      OneOff.value -> OneOff
      Recurring.value -> Recurring
      SetupOneOff.value -> SetupOneOff
      SetupRecurring.value -> SetupRecurring
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3) {
      encoder.encodeString(value.value)
    }
  }
}
