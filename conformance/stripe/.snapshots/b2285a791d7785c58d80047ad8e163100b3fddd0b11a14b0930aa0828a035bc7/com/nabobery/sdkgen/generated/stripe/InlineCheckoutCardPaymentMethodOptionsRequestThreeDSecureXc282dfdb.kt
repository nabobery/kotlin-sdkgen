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
 * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based
 * on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if you wish
 * to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided, this value
 * defaults to `automatic`. Read our guide on [manually requesting 3D
 * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on how
 * this configuration interacts with Radar and our SCA Engine.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/request_three_d_secu
 * re
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb() {
    public override val `value`: String = "any"
  }

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb() {
    public override val `value`: String = "challenge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb = when (value) {
      Any.value -> Any
      Automatic.value -> Automatic
      Challenge.value -> Challenge
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb) {
      encoder.encodeString(value.value)
    }
  }
}
