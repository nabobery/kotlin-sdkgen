package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-insights-user-stats/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-insights-user-stats/items
 */
@Serializable(with = InlineApiInsightsUserStatsItemX8975ed91.Serializer::class)
public class InlineApiInsightsUserStatsItemX8975ed91(
  public val actorId: Long? = null,
  public val actorName: String? = null,
  public val actorType: String? = null,
  public val integrationId: Long? = null,
  public val lastRateLimitedTimestamp: String? = null,
  public val lastRequestTimestamp: String? = null,
  public val oauthApplicationId: Long? = null,
  public val rateLimitedRequestCount: Int? = null,
  public val totalRequestCount: Int? = null,
) {
  public class Builder {
    public var actorId: Long? = null

    public var actorName: String? = null

    public var actorType: String? = null

    public var integrationId: Long? = null

    public var lastRateLimitedTimestamp: String? = null

    public var lastRequestTimestamp: String? = null

    public var oauthApplicationId: Long? = null

    public var rateLimitedRequestCount: Int? = null

    public var totalRequestCount: Int? = null

    public fun build(): InlineApiInsightsUserStatsItemX8975ed91 = InlineApiInsightsUserStatsItemX8975ed91(
      actorId = actorId,
      actorName = actorName,
      actorType = actorType,
      integrationId = integrationId,
      lastRateLimitedTimestamp = lastRateLimitedTimestamp,
      lastRequestTimestamp = lastRequestTimestamp,
      oauthApplicationId = oauthApplicationId,
      rateLimitedRequestCount = rateLimitedRequestCount,
      totalRequestCount = totalRequestCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiInsightsUserStatsItemX8975ed91 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApiInsightsUserStatsItemX8975ed91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiInsightsUserStatsItemX8975ed91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiInsightsUserStatsItemX8975ed91")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiInsightsUserStatsItemX8975ed91 must be a JSON object")
      return InlineApiInsightsUserStatsItemX8975ed91(
        actorId = rawObject["actor_id"]?.let { json.decodeFromJsonElement<Long>(it) },
        actorName = rawObject["actor_name"]?.let { json.decodeFromJsonElement<String>(it) },
        actorType = rawObject["actor_type"]?.let { json.decodeFromJsonElement<String>(it) },
        integrationId = rawObject["integration_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(element) },
        lastRateLimitedTimestamp = rawObject["last_rate_limited_timestamp"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastRequestTimestamp = rawObject["last_request_timestamp"]?.let { json.decodeFromJsonElement<String>(it) },
        oauthApplicationId = rawObject["oauth_application_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(element) },
        rateLimitedRequestCount = rawObject["rate_limited_request_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalRequestCount = rawObject["total_request_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsUserStatsItemX8975ed91) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiInsightsUserStatsItemX8975ed91")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actorId?.let { put("actor_id", json.encodeToJsonElement(it)) }
        value.actorName?.let { put("actor_name", it) }
        value.actorType?.let { put("actor_type", it) }
        value.integrationId?.let { put("integration_id", json.encodeToJsonElement(it)) }
        value.lastRateLimitedTimestamp?.let { put("last_rate_limited_timestamp", it) }
        value.lastRequestTimestamp?.let { put("last_request_timestamp", it) }
        value.oauthApplicationId?.let { put("oauth_application_id", json.encodeToJsonElement(it)) }
        value.rateLimitedRequestCount?.let { put("rate_limited_request_count", json.encodeToJsonElement(it)) }
        value.totalRequestCount?.let { put("total_request_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiInsightsUserStatsItemX8975ed91(block: InlineApiInsightsUserStatsItemX8975ed91.Builder.() -> Unit): InlineApiInsightsUserStatsItemX8975ed91 = InlineApiInsightsUserStatsItemX8975ed91.build(block)
