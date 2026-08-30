package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/campaign-summary/properties/alert_stats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/campaign-summary/properties/alert_stats
 */
@Serializable(with = InlineCampaignSummaryAlertStatsXa8748d5f.Serializer::class)
public class InlineCampaignSummaryAlertStatsXa8748d5f(
  /**
   * The number of closed alerts
   */
  public val closedCount: Int,
  /**
   * The number of in-progress alerts
   */
  public val inProgressCount: Int,
  /**
   * The number of open alerts
   */
  public val openCount: Int,
) {
  public class Builder {
    private var closedCountValue: Int? = null

    public var closedCount: Int
      get() = requireNotNull(closedCountValue) { "closedCount is required" }
      set(`value`) {
        closedCountValue = value
      }

    private var inProgressCountValue: Int? = null

    public var inProgressCount: Int
      get() = requireNotNull(inProgressCountValue) { "inProgressCount is required" }
      set(`value`) {
        inProgressCountValue = value
      }

    private var openCountValue: Int? = null

    public var openCount: Int
      get() = requireNotNull(openCountValue) { "openCount is required" }
      set(`value`) {
        openCountValue = value
      }

    public fun build(): InlineCampaignSummaryAlertStatsXa8748d5f {
      check(closedCountValue != null) { "closedCount is required" }
      check(inProgressCountValue != null) { "inProgressCount is required" }
      check(openCountValue != null) { "openCount is required" }
      return InlineCampaignSummaryAlertStatsXa8748d5f(
        closedCount = closedCount,
        inProgressCount = inProgressCount,
        openCount = openCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCampaignSummaryAlertStatsXa8748d5f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCampaignSummaryAlertStatsXa8748d5f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCampaignSummaryAlertStatsXa8748d5f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCampaignSummaryAlertStatsXa8748d5f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCampaignSummaryAlertStatsXa8748d5f must be a JSON object")
      val closedCount = json.decodeRequired<Int>(rawObject, "closed_count")
      val inProgressCount = json.decodeRequired<Int>(rawObject, "in_progress_count")
      val openCount = json.decodeRequired<Int>(rawObject, "open_count")
      return InlineCampaignSummaryAlertStatsXa8748d5f(
        closedCount = closedCount,
        inProgressCount = inProgressCount,
        openCount = openCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCampaignSummaryAlertStatsXa8748d5f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCampaignSummaryAlertStatsXa8748d5f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("closed_count", json.encodeToJsonElement(value.closedCount))
        put("in_progress_count", json.encodeToJsonElement(value.inProgressCount))
        put("open_count", json.encodeToJsonElement(value.openCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCampaignSummaryAlertStatsXa8748d5f(block: InlineCampaignSummaryAlertStatsXa8748d5f.Builder.() -> Unit): InlineCampaignSummaryAlertStatsXa8748d5f = InlineCampaignSummaryAlertStatsXa8748d5f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCampaignSummaryAlertStatsXa8748d5f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
