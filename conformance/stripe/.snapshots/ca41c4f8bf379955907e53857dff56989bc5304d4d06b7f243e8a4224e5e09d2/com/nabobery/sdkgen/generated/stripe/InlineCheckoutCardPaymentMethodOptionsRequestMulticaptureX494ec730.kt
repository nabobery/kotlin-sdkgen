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
 * Request ability to make [multiple captures](/payments/multicapture) for this CheckoutSession.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/request_multicapture
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730 = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730) {
      encoder.encodeString(value.value)
    }
  }
}
