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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/on_demand/properties/purchase_interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/on_demand/properties/purchase_interval
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalXb830f611) {
      encoder.encodeString(value.value)
    }
  }
}
