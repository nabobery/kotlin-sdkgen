package io.github.nabobery.sdkgen.github.generated

import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-insights-time-stats/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-insights-time-stats/items
 */
@Serializable(with = InlineApiInsightsTimeStatsItemXb07aa413.Serializer::class)
public class InlineApiInsightsTimeStatsItemXb07aa413(
  public val rateLimitedRequestCount: Long? = null,
  public val timestamp: String? = null,
  public val totalRequestCount: Long? = null,
) {
  public class Builder {
    public var rateLimitedRequestCount: Long? = null

    public var timestamp: String? = null

    public var totalRequestCount: Long? = null

    public fun build(): InlineApiInsightsTimeStatsItemXb07aa413 = InlineApiInsightsTimeStatsItemXb07aa413(
      rateLimitedRequestCount = rateLimitedRequestCount,
      timestamp = timestamp,
      totalRequestCount = totalRequestCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiInsightsTimeStatsItemXb07aa413 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApiInsightsTimeStatsItemXb07aa413> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiInsightsTimeStatsItemXb07aa413 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiInsightsTimeStatsItemXb07aa413")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiInsightsTimeStatsItemXb07aa413 must be a JSON object")
      return InlineApiInsightsTimeStatsItemXb07aa413(
        rateLimitedRequestCount = rawObject["rate_limited_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<String>(it) },
        totalRequestCount = rawObject["total_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsTimeStatsItemXb07aa413) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiInsightsTimeStatsItemXb07aa413")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.rateLimitedRequestCount?.let { put("rate_limited_request_count", json.encodeToJsonElement(it)) }
        value.timestamp?.let { put("timestamp", it) }
        value.totalRequestCount?.let { put("total_request_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiInsightsTimeStatsItemXb07aa413(block: InlineApiInsightsTimeStatsItemXb07aa413.Builder.() -> Unit): InlineApiInsightsTimeStatsItemXb07aa413 = InlineApiInsightsTimeStatsItemXb07aa413.build(block)
