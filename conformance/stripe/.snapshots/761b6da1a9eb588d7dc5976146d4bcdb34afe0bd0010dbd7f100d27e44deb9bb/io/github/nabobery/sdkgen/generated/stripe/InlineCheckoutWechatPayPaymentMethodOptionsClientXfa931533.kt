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
 * The client type that the end customer will pay from
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_wechat_pay_payment_method_options/properties/client
 */
@Serializable(with = InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533.Serializer::class)
public sealed class InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `android`.
   */
  public data object Android : InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533() {
    public override val `value`: String = "android"
  }

  /**
   * Documented value. Wire value: `ios`.
   */
  public data object Ios : InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533() {
    public override val `value`: String = "ios"
  }

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533 = when (value) {
      Android.value -> Android
      Ios.value -> Ios
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533) {
      encoder.encodeString(value.value)
    }
  }
}
