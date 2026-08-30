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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0/properties/client.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0/properties/client
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `android`.
   */
  public data object Android : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e() {
    public override val `value`: String = "android"
  }

  /**
   * Documented value. Wire value: `ios`.
   */
  public data object Ios : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e() {
    public override val `value`: String = "ios"
  }

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e = when (value) {
      Android.value -> Android
      Ios.value -> Ios
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e) {
      encoder.encodeString(value.value)
    }
  }
}
