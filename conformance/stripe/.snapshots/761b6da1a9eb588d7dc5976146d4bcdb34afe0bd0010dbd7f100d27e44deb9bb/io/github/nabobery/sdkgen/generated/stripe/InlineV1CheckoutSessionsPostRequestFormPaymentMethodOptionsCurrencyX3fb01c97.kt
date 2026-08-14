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
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/currency.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/currency
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cad`.
   */
  public data object Cad : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97() {
    public override val `value`: String = "cad"
  }

  /**
   * Documented value. Wire value: `usd`.
   */
  public data object Usd : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97() {
    public override val `value`: String = "usd"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97 = when (value) {
      Cad.value -> Cad
      Usd.value -> Usd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97) {
      encoder.encodeString(value.value)
    }
  }
}
