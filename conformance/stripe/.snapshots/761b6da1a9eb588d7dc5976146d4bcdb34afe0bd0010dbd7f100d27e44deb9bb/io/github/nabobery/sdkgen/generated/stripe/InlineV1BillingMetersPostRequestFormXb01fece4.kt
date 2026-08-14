package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormXb01fece4.Serializer::class)
public class InlineV1BillingMetersPostRequestFormXb01fece4(
  /**
   * The default settings to aggregate a meter's events with.
   */
  public val defaultAggregation: InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8,
  /**
   * The meter’s name. Not visible to the customer.
   */
  public val displayName: String,
  /**
   * The name of the meter event to record usage for. Corresponds with the `event_name` field on meter events.
   */
  public val eventName: String,
  /**
   * Fields that specify how to map a meter event to a customer.
   */
  public val customerMapping: InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5? = null,
  /**
   * The time window which meter events have been pre-aggregated for, if any.
   */
  public val eventTimeWindow: InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9? = null,
  expand: List<String>? = null,
  /**
   * Fields that specify how to calculate a meter event's value.
   */
  public val valueSettings: InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var defaultAggregationValue:
        InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8? = null

    public var defaultAggregation: InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8
      get() = requireNotNull(defaultAggregationValue) { "defaultAggregation is required" }
      set(`value`) {
        defaultAggregationValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var eventNameValue: String? = null

    public var eventName: String
      get() = requireNotNull(eventNameValue) { "eventName is required" }
      set(`value`) {
        eventNameValue = value
      }

    /**
     * Fields that specify how to map a meter event to a customer.
     */
    public var customerMapping: InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5? = null

    /**
     * The time window which meter events have been pre-aggregated for, if any.
     */
    public var eventTimeWindow: InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9? = null

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
     * Fields that specify how to calculate a meter event's value.
     */
    public var valueSettings: InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3? = null

    public fun build(): InlineV1BillingMetersPostRequestFormXb01fece4 {
      check(defaultAggregationValue != null) { "defaultAggregation is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(eventNameValue != null) { "eventName is required" }
      return InlineV1BillingMetersPostRequestFormXb01fece4(
        defaultAggregation = defaultAggregation,
        displayName = displayName,
        eventName = eventName,
        customerMapping = customerMapping,
        eventTimeWindow = eventTimeWindow,
        expand = expand,
        valueSettings = valueSettings,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingMetersPostRequestFormXb01fece4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormXb01fece4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormXb01fece4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMetersPostRequestFormXb01fece4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingMetersPostRequestFormXb01fece4 must be a JSON object")
      val defaultAggregation = json.decodeRequired<InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8>(rawObject, "default_aggregation")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val eventName = json.decodeRequired<String>(rawObject, "event_name")
      return InlineV1BillingMetersPostRequestFormXb01fece4(
        defaultAggregation = defaultAggregation,
        displayName = displayName,
        eventName = eventName,
        customerMapping = rawObject["customer_mapping"]?.let { json.decodeFromJsonElement<InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5>(it) },
        eventTimeWindow = rawObject["event_time_window"]?.let { json.decodeFromJsonElement<InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        valueSettings = rawObject["value_settings"]?.let { json.decodeFromJsonElement<InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersPostRequestFormXb01fece4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMetersPostRequestFormXb01fece4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_aggregation", json.encodeToJsonElement(value.defaultAggregation))
        put("display_name", value.displayName)
        put("event_name", value.eventName)
        value.customerMapping?.let { put("customer_mapping", json.encodeToJsonElement(it)) }
        value.eventTimeWindow?.let { put("event_time_window", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.valueSettings?.let { put("value_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingMetersPostRequestFormXb01fece4(block: InlineV1BillingMetersPostRequestFormXb01fece4.Builder.() -> Unit): InlineV1BillingMetersPostRequestFormXb01fece4 = InlineV1BillingMetersPostRequestFormXb01fece4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingMetersPostRequestFormXb01fece4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
