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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-insights-subject-stats/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-insights-subject-stats/items
 */
@Serializable(with = InlineApiInsightsSubjectStatsItemXbcc77c8a.Serializer::class)
public class InlineApiInsightsSubjectStatsItemXbcc77c8a(
  public val lastRateLimitedTimestamp: String? = null,
  public val lastRequestTimestamp: String? = null,
  public val rateLimitedRequestCount: Int? = null,
  public val subjectId: Long? = null,
  public val subjectName: String? = null,
  public val subjectType: String? = null,
  public val totalRequestCount: Int? = null,
) {
  public class Builder {
    public var lastRateLimitedTimestamp: String? = null

    public var lastRequestTimestamp: String? = null

    public var rateLimitedRequestCount: Int? = null

    public var subjectId: Long? = null

    public var subjectName: String? = null

    public var subjectType: String? = null

    public var totalRequestCount: Int? = null

    public fun build(): InlineApiInsightsSubjectStatsItemXbcc77c8a = InlineApiInsightsSubjectStatsItemXbcc77c8a(
      lastRateLimitedTimestamp = lastRateLimitedTimestamp,
      lastRequestTimestamp = lastRequestTimestamp,
      rateLimitedRequestCount = rateLimitedRequestCount,
      subjectId = subjectId,
      subjectName = subjectName,
      subjectType = subjectType,
      totalRequestCount = totalRequestCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiInsightsSubjectStatsItemXbcc77c8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApiInsightsSubjectStatsItemXbcc77c8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiInsightsSubjectStatsItemXbcc77c8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiInsightsSubjectStatsItemXbcc77c8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiInsightsSubjectStatsItemXbcc77c8a must be a JSON object")
      return InlineApiInsightsSubjectStatsItemXbcc77c8a(
        lastRateLimitedTimestamp = rawObject["last_rate_limited_timestamp"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastRequestTimestamp = rawObject["last_request_timestamp"]?.let { json.decodeFromJsonElement<String>(it) },
        rateLimitedRequestCount = rawObject["rate_limited_request_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        subjectId = rawObject["subject_id"]?.let { json.decodeFromJsonElement<Long>(it) },
        subjectName = rawObject["subject_name"]?.let { json.decodeFromJsonElement<String>(it) },
        subjectType = rawObject["subject_type"]?.let { json.decodeFromJsonElement<String>(it) },
        totalRequestCount = rawObject["total_request_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsSubjectStatsItemXbcc77c8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiInsightsSubjectStatsItemXbcc77c8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lastRateLimitedTimestamp?.let { put("last_rate_limited_timestamp", it) }
        value.lastRequestTimestamp?.let { put("last_request_timestamp", it) }
        value.rateLimitedRequestCount?.let { put("rate_limited_request_count", json.encodeToJsonElement(it)) }
        value.subjectId?.let { put("subject_id", json.encodeToJsonElement(it)) }
        value.subjectName?.let { put("subject_name", it) }
        value.subjectType?.let { put("subject_type", it) }
        value.totalRequestCount?.let { put("total_request_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiInsightsSubjectStatsItemXbcc77c8a(block: InlineApiInsightsSubjectStatsItemXbcc77c8a.Builder.() -> Unit): InlineApiInsightsSubjectStatsItemXbcc77c8a = InlineApiInsightsSubjectStatsItemXbcc77c8a.build(block)
