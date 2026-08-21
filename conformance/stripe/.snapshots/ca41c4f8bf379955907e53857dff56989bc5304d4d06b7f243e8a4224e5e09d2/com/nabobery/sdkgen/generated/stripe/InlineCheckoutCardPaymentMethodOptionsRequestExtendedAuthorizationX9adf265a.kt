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
 * Request ability to [capture beyond the standard authorization validity window](/payments/extended-authorization) for
 * this CheckoutSession.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/request_extended_aut
 * horization
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a) {
      encoder.encodeString(value.value)
    }
  }
}
