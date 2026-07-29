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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/mandate_options/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/mandate_options/properties/interval
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb() {
    public override val `value`: String = "sporadic"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb = when (value) {
      Day.value -> Day
      Month.value -> Month
      Sporadic.value -> Sporadic
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXef3167cb) {
      encoder.encodeString(value.value)
    }
  }
}
