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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment
 * _schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment
 * _schedule
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `combined`.
   */
  public data object Combined : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053() {
    public override val `value`: String = "combined"
  }

  /**
   * Documented value. Wire value: `interval`.
   */
  public data object Interval : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053() {
    public override val `value`: String = "interval"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053() {
    public override val `value`: String = "sporadic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053 = when (value) {
      Combined.value -> Combined
      Interval.value -> Interval
      Sporadic.value -> Sporadic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053) {
      encoder.encodeString(value.value)
    }
  }
}
