package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active users. Chinese consumers
 * can use WeChat Pay to pay for goods and services inside of businesses' apps and websites. WeChat Pay users buy most
 * frequently in gaming, e-commerce, travel, online education, and food/nutrition. Check this
 * [page](https://docs.stripe.com/payments/wechat-pay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/wechat_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormWechatPayDisplayPreferenceX8af1719f? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormWechatPayDisplayPreferenceX8af1719f? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8 = InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormWechatPayDisplayPreferenceX8af1719f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8(block: InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8 = InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXeeceb7b8.build(block)
