package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meter_events/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meter_events/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema
 */
@Serializable(with = InlineV1BillingMeterEventsPostRequestFormXce007751.Serializer::class)
public class InlineV1BillingMeterEventsPostRequestFormXce007751(
  /**
   * The name of the meter event. Corresponds with the `event_name` field on a meter.
   */
  public val eventName: String,
  payload: Map<String, String>,
  expand: List<String>? = null,
  /**
   * A unique identifier for the event. If not provided, one is generated. We recommend using UUID-like identifiers.
   * Stripe enforces uniqueness within a rolling period of at least 24 hours. The enforcement of uniqueness primarily
   * addresses issues arising from accidental retries or other problems occurring within extremely brief time intervals.
   * This approach helps prevent duplicate entries and ensures data integrity in high-frequency operations.
   */
  public val identifier: String? = null,
  /**
   * The time of the event. Measured in seconds since the Unix epoch. Must be within the past 35 calendar days or up to
   * 5 minutes in the future. Defaults to current timestamp if not specified.
   */
  public val timestamp: Int? = null,
) {
  /**
   * The payload of the event. This must contain the fields corresponding to a meter's
   * `customer_mapping.event_payload_key` (default is `stripe_customer_id`) and `value_settings.event_payload_key`
   * (default is `value`). Read more about the
   * [payload](https://docs.stripe.com/billing/subscriptions/usage-based/meters/configure#meter-configuration-attributes
   * ).
   */
  public val payload: Map<String, String> = payload.toMap()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var eventNameValue: String? = null

    public var eventName: String
      get() = requireNotNull(eventNameValue) { "eventName is required" }
      set(`value`) {
        eventNameValue = value
      }

    private var payloadValue: Map<String, String>? = null

    public var payload: Map<String, String>
      get() = requireNotNull(payloadValue) { "payload is required" }.toMap()
      set(`value`) {
        payloadValue = value.toMap()
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A unique identifier for the event. If not provided, one is generated. We recommend using UUID-like identifiers.
     * Stripe enforces uniqueness within a rolling period of at least 24 hours. The enforcement of uniqueness primarily
     * addresses issues arising from accidental retries or other problems occurring within extremely brief time
     * intervals. This approach helps prevent duplicate entries and ensures data integrity in high-frequency operations.
     */
    public var identifier: String? = null

    /**
     * The time of the event. Measured in seconds since the Unix epoch. Must be within the past 35 calendar days or up
     * to 5 minutes in the future. Defaults to current timestamp if not specified.
     */
    public var timestamp: Int? = null

    public fun build(): InlineV1BillingMeterEventsPostRequestFormXce007751 {
      check(eventNameValue != null) { "eventName is required" }
      check(payloadValue != null) { "payload is required" }
      return InlineV1BillingMeterEventsPostRequestFormXce007751(
        eventName = eventName,
        payload = payload,
        expand = expand,
        identifier = identifier,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingMeterEventsPostRequestFormXce007751 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingMeterEventsPostRequestFormXce007751> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingMeterEventsPostRequestFormXce007751 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMeterEventsPostRequestFormXce007751")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingMeterEventsPostRequestFormXce007751 must be a JSON object")
      val eventName = json.decodeRequired<String>(rawObject, "event_name")
      val payload = json.decodeRequired<Map<String, String>>(rawObject, "payload")
      return InlineV1BillingMeterEventsPostRequestFormXce007751(
        eventName = eventName,
        payload = payload,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        identifier = rawObject["identifier"]?.let { json.decodeFromJsonElement<String>(it) },
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMeterEventsPostRequestFormXce007751) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMeterEventsPostRequestFormXce007751")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("event_name", value.eventName)
        put("payload", json.encodeToJsonElement(value.payload))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.identifier?.let { put("identifier", it) }
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingMeterEventsPostRequestFormXce007751(block: InlineV1BillingMeterEventsPostRequestFormXce007751.Builder.() -> Unit): InlineV1BillingMeterEventsPostRequestFormXce007751 = InlineV1BillingMeterEventsPostRequestFormXce007751.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingMeterEventsPostRequestFormXce007751 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
