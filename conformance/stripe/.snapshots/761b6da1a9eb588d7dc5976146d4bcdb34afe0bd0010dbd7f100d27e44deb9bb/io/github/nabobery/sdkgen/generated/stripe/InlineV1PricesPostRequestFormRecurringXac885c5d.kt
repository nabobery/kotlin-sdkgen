package io.github.nabobery.sdkgen.generated.stripe

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
 * The recurring components of a price such as `interval` and `usage_type`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/recurring
 */
@Serializable(with = InlineV1PricesPostRequestFormRecurringXac885c5d.Serializer::class)
public class InlineV1PricesPostRequestFormRecurringXac885c5d(
  public val interval: InlineV1PricesPostRequestFormRecurringIntervalX60c57f03,
  public val intervalCount: Int? = null,
  public val meter: String? = null,
  public val usageType: InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3? = null,
) {
  public class Builder {
    private var intervalValue: InlineV1PricesPostRequestFormRecurringIntervalX60c57f03? = null

    public var interval: InlineV1PricesPostRequestFormRecurringIntervalX60c57f03
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public var meter: String? = null

    public var usageType: InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3? = null

    public fun build(): InlineV1PricesPostRequestFormRecurringXac885c5d {
      check(intervalValue != null) { "interval is required" }
      return InlineV1PricesPostRequestFormRecurringXac885c5d(
        interval = interval,
        intervalCount = intervalCount,
        meter = meter,
        usageType = usageType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormRecurringXac885c5d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormRecurringXac885c5d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormRecurringXac885c5d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormRecurringXac885c5d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormRecurringXac885c5d must be a JSON object")
      val interval = json.decodeRequired<InlineV1PricesPostRequestFormRecurringIntervalX60c57f03>(rawObject, "interval")
      return InlineV1PricesPostRequestFormRecurringXac885c5d(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        meter = rawObject["meter"]?.let { json.decodeFromJsonElement<String>(it) },
        usageType = rawObject["usage_type"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormRecurringXac885c5d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormRecurringXac885c5d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
        value.meter?.let { put("meter", it) }
        value.usageType?.let { put("usage_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesPostRequestFormRecurringXac885c5d(block: InlineV1PricesPostRequestFormRecurringXac885c5d.Builder.() -> Unit): InlineV1PricesPostRequestFormRecurringXac885c5d = InlineV1PricesPostRequestFormRecurringXac885c5d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PricesPostRequestFormRecurringXac885c5d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
