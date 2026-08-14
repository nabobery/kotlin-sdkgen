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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 * /properties/payment_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 * /properties/payment_schedule
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `combined`.
   */
  public data object Combined : InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924() {
    public override val `value`: String = "combined"
  }

  /**
   * Documented value. Wire value: `interval`.
   */
  public data object Interval : InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924() {
    public override val `value`: String = "interval"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924() {
    public override val `value`: String = "sporadic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924 = when (value) {
      Combined.value -> Combined
      Interval.value -> Interval
      Sporadic.value -> Sporadic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentScheduleXac898924) {
      encoder.encodeString(value.value)
    }
  }
}
