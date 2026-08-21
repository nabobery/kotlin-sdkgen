package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e(
  public val interval: InlineV1CustomersSubscriptionsPostRequestFormIntervalX6333e3ae,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue: InlineV1CustomersSubscriptionsPostRequestFormIntervalX6333e3ae? =
        null

    public var interval: InlineV1CustomersSubscriptionsPostRequestFormIntervalX6333e3ae
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e {
      check(intervalValue != null) { "interval is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e must be a JSON object")
      val interval = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormIntervalX6333e3ae>(rawObject, "interval")
      return InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e(block: InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e = InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
