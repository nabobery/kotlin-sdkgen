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
 * start
 */
@Serializable(with = SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart.Serializer::class)
public class SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart(
  /**
   * Select how to calculate the start of the invoice item period.
   */
  public val type: InlineSubscriptionSchedule3ea0TypeX230daed6,
  /**
   * A precise Unix timestamp for the start of the invoice item period. Must be less than or equal to `period.end`.
   */
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineSubscriptionSchedule3ea0TypeX230daed6? = null

    public var type: InlineSubscriptionSchedule3ea0TypeX230daed6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * A precise Unix timestamp for the start of the invoice item period. Must be less than or equal to `period.end`.
     */
    public var timestamp: Int? = null

    public fun build(): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart {
      check(typeValue != null) { "type is required" }
      return SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart must be a JSON object")
      val type = json.decodeRequired<InlineSubscriptionSchedule3ea0TypeX230daed6>(rawObject, "type")
      return SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart(block: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart.Builder.() -> Unit): SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart = SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
