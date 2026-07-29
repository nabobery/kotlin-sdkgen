package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Configuration overrides for this collection, such as tipping, surcharging, and customer cancellation settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/collect_config
 */
@Serializable(with = InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2.Serializer::class)
public class InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2(
  public val allowRedisplay:
      InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4? = null,
  public val enableCustomerCancellation: Boolean? = null,
  public val skipTipping: Boolean? = null,
  public val tipping:
      InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80? = null,
) {
  public class Builder {
    public var allowRedisplay: InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4?
        = null

    public var enableCustomerCancellation: Boolean? = null

    public var skipTipping: Boolean? = null

    public var tipping: InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80?
        = null

    public fun build(): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2 = InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2(
      allowRedisplay = allowRedisplay,
      enableCustomerCancellation = enableCustomerCancellation,
      skipTipping = skipTipping,
      tipping = tipping,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2 must be a JSON object")
      return InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2(
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4>(it) },
        enableCustomerCancellation = rawObject["enable_customer_cancellation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        skipTipping = rawObject["skip_tipping"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        tipping = rawObject["tipping"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.enableCustomerCancellation?.let { put("enable_customer_cancellation", json.encodeToJsonElement(it)) }
        value.skipTipping?.let { put("skip_tipping", json.encodeToJsonElement(it)) }
        value.tipping?.let { put("tipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2(block: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2.Builder.() -> Unit): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2 = InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2.build(block)
