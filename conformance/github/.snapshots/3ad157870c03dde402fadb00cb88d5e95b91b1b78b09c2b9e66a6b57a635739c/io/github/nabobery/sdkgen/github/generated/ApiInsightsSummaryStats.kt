package io.github.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * API Insights usage summary stats for an organization
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-insights-summary-stats
 */
@Serializable(with = ApiInsightsSummaryStats.Serializer::class)
public class ApiInsightsSummaryStats(
  /**
   * The total number of requests that were rate limited within the queried time period
   */
  public val rateLimitedRequestCount: Long? = null,
  /**
   * The total number of requests within the queried time period
   */
  public val totalRequestCount: Long? = null,
) {
  public class Builder {
    /**
     * The total number of requests that were rate limited within the queried time period
     */
    public var rateLimitedRequestCount: Long? = null

    /**
     * The total number of requests within the queried time period
     */
    public var totalRequestCount: Long? = null

    public fun build(): ApiInsightsSummaryStats = ApiInsightsSummaryStats(
      rateLimitedRequestCount = rateLimitedRequestCount,
      totalRequestCount = totalRequestCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApiInsightsSummaryStats = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApiInsightsSummaryStats> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApiInsightsSummaryStats {
      val jsonDecoder = decoder.requireJsonDecoder("ApiInsightsSummaryStats")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApiInsightsSummaryStats must be a JSON object")
      return ApiInsightsSummaryStats(
        rateLimitedRequestCount = rawObject["rate_limited_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
        totalRequestCount = rawObject["total_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApiInsightsSummaryStats) {
      val jsonEncoder = encoder.requireJsonEncoder("ApiInsightsSummaryStats")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.rateLimitedRequestCount?.let { put("rate_limited_request_count", json.encodeToJsonElement(it)) }
        value.totalRequestCount?.let { put("total_request_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun apiInsightsSummaryStats(block: ApiInsightsSummaryStats.Builder.() -> Unit): ApiInsightsSummaryStats = ApiInsightsSummaryStats.build(block)
