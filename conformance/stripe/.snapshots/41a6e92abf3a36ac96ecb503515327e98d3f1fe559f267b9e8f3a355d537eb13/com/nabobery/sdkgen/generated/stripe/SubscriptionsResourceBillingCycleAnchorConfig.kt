package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SubscriptionsResourceBillingCycleAnchorConfigView(
  @SerialName("day_of_month")
  public val dayOfMonth: Int,
  public val hour: Int? = null,
  public val minute: Int? = null,
  public val month: Int? = null,
  public val second: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_cycle_anchor_config
 */
@Serializable(with = SubscriptionsResourceBillingCycleAnchorConfig.Serializer::class)
public class SubscriptionsResourceBillingCycleAnchorConfig(
  /**
   * The day of the month of the billing_cycle_anchor.
   */
  public val dayOfMonth: Int,
  /**
   * The hour of the day of the billing_cycle_anchor.
   */
  public val hour: Int? = null,
  /**
   * The minute of the hour of the billing_cycle_anchor.
   */
  public val minute: Int? = null,
  /**
   * The month to start full cycle billing periods.
   */
  public val month: Int? = null,
  /**
   * The second of the minute of the billing_cycle_anchor.
   */
  public val second: Int? = null,
) {
  public class Builder {
    private var dayOfMonthValue: Int? = null

    public var dayOfMonth: Int
      get() = requireNotNull(dayOfMonthValue) { "dayOfMonth is required" }
      set(`value`) {
        dayOfMonthValue = value
      }

    /**
     * The hour of the day of the billing_cycle_anchor.
     */
    public var hour: Int? = null

    /**
     * The minute of the hour of the billing_cycle_anchor.
     */
    public var minute: Int? = null

    /**
     * The month to start full cycle billing periods.
     */
    public var month: Int? = null

    /**
     * The second of the minute of the billing_cycle_anchor.
     */
    public var second: Int? = null

    public fun build(): SubscriptionsResourceBillingCycleAnchorConfig {
      check(dayOfMonthValue != null) { "dayOfMonth is required" }
      return SubscriptionsResourceBillingCycleAnchorConfig(
        dayOfMonth = dayOfMonth,
        hour = hour,
        minute = minute,
        month = month,
        second = second,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingCycleAnchorConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingCycleAnchorConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingCycleAnchorConfig {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingCycleAnchorConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingCycleAnchorConfig must be a JSON object")
      val dayOfMonth = json.decodeRequired<Int>(rawObject, "day_of_month")
      return SubscriptionsResourceBillingCycleAnchorConfig(
        dayOfMonth = dayOfMonth,
        hour = rawObject["hour"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        minute = rawObject["minute"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        month = rawObject["month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        second = rawObject["second"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingCycleAnchorConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingCycleAnchorConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("day_of_month", json.encodeToJsonElement(value.dayOfMonth))
        value.hour?.let { put("hour", json.encodeToJsonElement(it)) }
        value.minute?.let { put("minute", json.encodeToJsonElement(it)) }
        value.month?.let { put("month", json.encodeToJsonElement(it)) }
        value.second?.let { put("second", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingCycleAnchorConfig(block: SubscriptionsResourceBillingCycleAnchorConfig.Builder.() -> Unit): SubscriptionsResourceBillingCycleAnchorConfig = SubscriptionsResourceBillingCycleAnchorConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceBillingCycleAnchorConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
