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
 * The billing mode of the quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_subscription_data_billing_mode
 */
@Serializable(with = QuotesResourceSubscriptionDataBillingMode.Serializer::class)
public class QuotesResourceSubscriptionDataBillingMode(
  /**
   * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
   */
  public val type: InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824,
  public val flexible: SubscriptionsResourceBillingModeFlexible? = null,
) {
  public class Builder {
    private var typeValue: InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824? = null

    public var type: InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: SubscriptionsResourceBillingModeFlexible? = null

    public fun build(): QuotesResourceSubscriptionDataBillingMode {
      check(typeValue != null) { "type is required" }
      return QuotesResourceSubscriptionDataBillingMode(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceSubscriptionDataBillingMode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<QuotesResourceSubscriptionDataBillingMode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceSubscriptionDataBillingMode {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceSubscriptionDataBillingMode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceSubscriptionDataBillingMode must be a JSON object")
      val type = json.decodeRequired<InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824>(rawObject, "type")
      return QuotesResourceSubscriptionDataBillingMode(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<SubscriptionsResourceBillingModeFlexible>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceSubscriptionDataBillingMode) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceSubscriptionDataBillingMode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceSubscriptionDataBillingMode(block: QuotesResourceSubscriptionDataBillingMode.Builder.() -> Unit): QuotesResourceSubscriptionDataBillingMode = QuotesResourceSubscriptionDataBillingMode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceSubscriptionDataBillingMode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
