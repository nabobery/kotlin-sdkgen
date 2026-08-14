package io.github.nabobery.sdkgen.generated.stripe

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
public data class SubscriptionsResourceBillingSchedulesBillUntilDurationView(
  public val interval:
      InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a,
  @SerialName("interval_count")
  public val intervalCount: Int? = null,
)

/**
 * Configures the `bill_until` date based on the provided `interval` and `interval_count`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_bill_until_duration
 */
@Serializable(with = SubscriptionsResourceBillingSchedulesBillUntilDuration.Serializer::class)
public class SubscriptionsResourceBillingSchedulesBillUntilDuration(
  /**
   * Specifies billing duration. Either `day`, `week`, `month` or `year`.
   */
  public val interval:
      InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a,
  /**
   * The multiplier applied to the interval.
   */
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a? = null

    public var interval:
        InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    /**
     * The multiplier applied to the interval.
     */
    public var intervalCount: Int? = null

    public fun build(): SubscriptionsResourceBillingSchedulesBillUntilDuration {
      check(intervalValue != null) { "interval is required" }
      return SubscriptionsResourceBillingSchedulesBillUntilDuration(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingSchedulesBillUntilDuration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingSchedulesBillUntilDuration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingSchedulesBillUntilDuration {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingSchedulesBillUntilDuration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingSchedulesBillUntilDuration must be a JSON object")
      val interval = json.decodeRequired<InlineSubscriptionsResourceBillingSchedulesBillUntilDurationIntervalXafce0a8a>(rawObject, "interval")
      return SubscriptionsResourceBillingSchedulesBillUntilDuration(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingSchedulesBillUntilDuration) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingSchedulesBillUntilDuration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingSchedulesBillUntilDuration(block: SubscriptionsResourceBillingSchedulesBillUntilDuration.Builder.() -> Unit): SubscriptionsResourceBillingSchedulesBillUntilDuration = SubscriptionsResourceBillingSchedulesBillUntilDuration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceBillingSchedulesBillUntilDuration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
