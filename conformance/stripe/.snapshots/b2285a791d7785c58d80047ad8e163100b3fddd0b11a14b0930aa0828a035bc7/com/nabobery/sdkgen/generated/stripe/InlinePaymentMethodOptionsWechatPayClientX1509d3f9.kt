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
 * The client type that the end customer will pay from
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_wechat_pay/properties/client
 */
@Serializable(with = InlinePaymentMethodOptionsWechatPayClientX1509d3f9.Serializer::class)
public sealed class InlinePaymentMethodOptionsWechatPayClientX1509d3f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `android`.
   */
  public data object Android : InlinePaymentMethodOptionsWechatPayClientX1509d3f9() {
    public override val `value`: String = "android"
  }

  /**
   * Documented value. Wire value: `ios`.
   */
  public data object Ios : InlinePaymentMethodOptionsWechatPayClientX1509d3f9() {
    public override val `value`: String = "ios"
  }

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlinePaymentMethodOptionsWechatPayClientX1509d3f9() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsWechatPayClientX1509d3f9()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsWechatPayClientX1509d3f9 = when (value) {
      Android.value -> Android
      Ios.value -> Ios
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsWechatPayClientX1509d3f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsWechatPayClientX1509d3f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsWechatPayClientX1509d3f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsWechatPayClientX1509d3f9) {
      encoder.encodeString(value.value)
    }
  }
}
