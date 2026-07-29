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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val onDemand:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e? = null,
  public val preferredLocale:
      InlineV1SetupIntentsConfirmPostRequestFormPreferredLocaleXb031fe53? = null,
  public val subscriptions:
      InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a? = null,
) {
  public class Builder {
    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var onDemand:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e? = null

    public var preferredLocale: InlineV1SetupIntentsConfirmPostRequestFormPreferredLocaleXb031fe53?
        = null

    public var subscriptions: InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd(
      currency = currency,
      onDemand = onDemand,
      preferredLocale = preferredLocale,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        onDemand = rawObject["on_demand"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsOnDemandX9078cf4e>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPreferredLocaleXb031fe53>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", it) }
        value.onDemand?.let { put("on_demand", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd.build(block)
