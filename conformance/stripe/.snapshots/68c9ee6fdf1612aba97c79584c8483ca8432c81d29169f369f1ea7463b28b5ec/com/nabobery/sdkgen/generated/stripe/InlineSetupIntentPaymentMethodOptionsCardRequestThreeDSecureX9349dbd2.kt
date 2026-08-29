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
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card/properties/request_three_d_
 * secure
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2() {
    public override val `value`: String = "any"
  }

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2() {
    public override val `value`: String = "challenge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2 = when (value) {
      Any.value -> Any
      Automatic.value -> Automatic
      Challenge.value -> Challenge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2) {
      encoder.encodeString(value.value)
    }
  }
}
