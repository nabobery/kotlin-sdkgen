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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_invoice_item_period_resource_period_
 * end
 */
@Serializable(with = SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd.Serializer::class)
public class SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd(
  /**
   * Select how to calculate the end of the invoice item period.
   */
  public val type: InlineSubscriptionScheduleb51cTypeX539790cb,
  /**
   * A precise Unix timestamp for the end of the invoice item period. Must be greater than or equal to `period.start`.
   */
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineSubscriptionScheduleb51cTypeX539790cb? = null

    public var type: InlineSubscriptionScheduleb51cTypeX539790cb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * A precise Unix timestamp for the end of the invoice item period. Must be greater than or equal to `period.start`.
     */
    public var timestamp: Int? = null

    public fun build(): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd {
      check(typeValue != null) { "type is required" }
      return SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd must be a JSON object")
      val type = json.decodeRequired<InlineSubscriptionScheduleb51cTypeX539790cb>(rawObject, "type")
      return SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd(block: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd.Builder.() -> Unit): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd = SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
