package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-insights-route-stats/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-insights-route-stats/items
 */
@Serializable(with = InlineApiInsightsRouteStatsItemXe25fcfac.Serializer::class)
public class InlineApiInsightsRouteStatsItemXe25fcfac(
  /**
   * The API path's route template
   */
  public val apiRoute: String? = null,
  /**
   * The HTTP method
   */
  public val httpMethod: String? = null,
  public val lastRateLimitedTimestamp: String? = null,
  public val lastRequestTimestamp: String? = null,
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
     * The API path's route template
     */
    public var apiRoute: String? = null

    /**
     * The HTTP method
     */
    public var httpMethod: String? = null

    public var lastRateLimitedTimestamp: String? = null

    public var lastRequestTimestamp: String? = null

    /**
     * The total number of requests that were rate limited within the queried time period
     */
    public var rateLimitedRequestCount: Long? = null

    /**
     * The total number of requests within the queried time period
     */
    public var totalRequestCount: Long? = null

    public fun build(): InlineApiInsightsRouteStatsItemXe25fcfac = InlineApiInsightsRouteStatsItemXe25fcfac(
      apiRoute = apiRoute,
      httpMethod = httpMethod,
      lastRateLimitedTimestamp = lastRateLimitedTimestamp,
      lastRequestTimestamp = lastRequestTimestamp,
      rateLimitedRequestCount = rateLimitedRequestCount,
      totalRequestCount = totalRequestCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiInsightsRouteStatsItemXe25fcfac = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApiInsightsRouteStatsItemXe25fcfac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiInsightsRouteStatsItemXe25fcfac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiInsightsRouteStatsItemXe25fcfac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiInsightsRouteStatsItemXe25fcfac must be a JSON object")
      return InlineApiInsightsRouteStatsItemXe25fcfac(
        apiRoute = rawObject["api_route"]?.let { json.decodeFromJsonElement<String>(it) },
        httpMethod = rawObject["http_method"]?.let { json.decodeFromJsonElement<String>(it) },
        lastRateLimitedTimestamp = rawObject["last_rate_limited_timestamp"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastRequestTimestamp = rawObject["last_request_timestamp"]?.let { json.decodeFromJsonElement<String>(it) },
        rateLimitedRequestCount = rawObject["rate_limited_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
        totalRequestCount = rawObject["total_request_count"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsRouteStatsItemXe25fcfac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiInsightsRouteStatsItemXe25fcfac")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.apiRoute?.let { put("api_route", it) }
        value.httpMethod?.let { put("http_method", it) }
        value.lastRateLimitedTimestamp?.let { put("last_rate_limited_timestamp", it) }
        value.lastRequestTimestamp?.let { put("last_request_timestamp", it) }
        value.rateLimitedRequestCount?.let { put("rate_limited_request_count", json.encodeToJsonElement(it)) }
        value.totalRequestCount?.let { put("total_request_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiInsightsRouteStatsItemXe25fcfac(block: InlineApiInsightsRouteStatsItemXe25fcfac.Builder.() -> Unit): InlineApiInsightsRouteStatsItemXe25fcfac = InlineApiInsightsRouteStatsItemXe25fcfac.build(block)
