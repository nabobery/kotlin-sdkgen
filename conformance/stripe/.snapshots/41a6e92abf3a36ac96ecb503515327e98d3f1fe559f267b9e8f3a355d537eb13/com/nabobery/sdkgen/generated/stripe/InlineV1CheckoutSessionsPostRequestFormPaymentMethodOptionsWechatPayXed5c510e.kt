package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/wechat_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/wechat_pay
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e(
  public val client: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsClientX84a5ff04,
  public val appId: String? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc2862318? = null,
) {
  public class Builder {
    private var clientValue:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsClientX84a5ff04? = null

    public var client: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsClientX84a5ff04
      get() = requireNotNull(clientValue) { "client is required" }
      set(`value`) {
        clientValue = value
      }

    public var appId: String? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc2862318? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e {
      check(clientValue != null) { "client is required" }
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e(
        client = client,
        appId = appId,
        setupFutureUsage = setupFutureUsage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e must be a JSON object")
      val client = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsClientX84a5ff04>(rawObject, "client")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e(
        client = client,
        appId = rawObject["app_id"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc2862318>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("client", json.encodeToJsonElement(value.client))
        value.appId?.let { put("app_id", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
