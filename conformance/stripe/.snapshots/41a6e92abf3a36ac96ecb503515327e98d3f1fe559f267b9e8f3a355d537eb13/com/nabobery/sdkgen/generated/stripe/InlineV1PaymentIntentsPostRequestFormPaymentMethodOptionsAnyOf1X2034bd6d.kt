package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d(
  public val appId: String? = null,
  public val client:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed? = null,
) {
  public class Builder {
    public var appId: String? = null

    public var client: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e? =
        null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d(
      appId = appId,
      client = client,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d(
        appId = rawObject["app_id"]?.let { json.decodeFromJsonElement<String>(it) },
        client = rawObject["client"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsClientX2000807e>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.appId?.let { put("app_id", it) }
        value.client?.let { put("client", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d.build(block)
