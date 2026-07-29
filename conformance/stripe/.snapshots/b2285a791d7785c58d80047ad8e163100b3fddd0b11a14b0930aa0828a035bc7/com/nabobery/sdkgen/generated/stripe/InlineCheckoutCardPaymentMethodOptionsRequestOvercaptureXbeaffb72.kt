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
 * Request ability to [overcapture](/payments/overcapture) for this CheckoutSession.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/request_overcapture
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72 = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72) {
      encoder.encodeString(value.value)
    }
  }
}
