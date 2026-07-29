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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_subscription_presentment_details
 */
@Serializable(with = SubscriptionsResourceSubscriptionPresentmentDetails.Serializer::class)
public class SubscriptionsResourceSubscriptionPresentmentDetails(
  /**
   * Currency used for customer payments.
   */
  public val presentmentCurrency: String,
) {
  public class Builder {
    private var presentmentCurrencyValue: String? = null

    public var presentmentCurrency: String
      get() = requireNotNull(presentmentCurrencyValue) { "presentmentCurrency is required" }
      set(`value`) {
        presentmentCurrencyValue = value
      }

    public fun build(): SubscriptionsResourceSubscriptionPresentmentDetails {
      check(presentmentCurrencyValue != null) { "presentmentCurrency is required" }
      return SubscriptionsResourceSubscriptionPresentmentDetails(
        presentmentCurrency = presentmentCurrency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceSubscriptionPresentmentDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionsResourceSubscriptionPresentmentDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceSubscriptionPresentmentDetails {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceSubscriptionPresentmentDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceSubscriptionPresentmentDetails must be a JSON object")
      val presentmentCurrency = json.decodeRequired<String>(rawObject, "presentment_currency")
      return SubscriptionsResourceSubscriptionPresentmentDetails(
        presentmentCurrency = presentmentCurrency,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceSubscriptionPresentmentDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceSubscriptionPresentmentDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("presentment_currency", value.presentmentCurrency)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceSubscriptionPresentmentDetails(block: SubscriptionsResourceSubscriptionPresentmentDetails.Builder.() -> Unit): SubscriptionsResourceSubscriptionPresentmentDetails = SubscriptionsResourceSubscriptionPresentmentDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceSubscriptionPresentmentDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
