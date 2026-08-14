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
 * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based
 * on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if you wish
 * to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided, this value
 * defaults to `automatic`. Read our guide on [manually requesting 3D
 * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on how
 * this configuration interacts with Radar and our SCA Engine.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/request_three_
 * d_secure
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4() {
    public override val `value`: String = "any"
  }

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4() {
    public override val `value`: String = "challenge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4 = when (value) {
      Any.value -> Any
      Automatic.value -> Automatic
      Challenge.value -> Challenge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4) {
      encoder.encodeString(value.value)
    }
  }
}
