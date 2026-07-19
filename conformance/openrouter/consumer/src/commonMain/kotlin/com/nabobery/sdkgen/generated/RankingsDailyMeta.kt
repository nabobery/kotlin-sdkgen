package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyMeta.
 */
@Serializable(with = RankingsDailyMeta.Serializer::class)
public class RankingsDailyMeta(
  /**
   * ISO-8601 timestamp of when the response was generated. Reflects data-freshness because the underlying materialized
   * view continuously ingests upstream events.
   */
  public val asOf: String,
  /**
   * Resolved end of the date window (UTC, inclusive).
   */
  public val endDate: String,
  /**
   * Resolved start of the date window (UTC, inclusive).
   */
  public val startDate: String,
  /**
   * Dataset version. Field names and grain are stable for the life of `v1`.
   */
  public val version: InlineComponentsSchemasRankingsDailyMetaPropertiesVersion,
) {
  public class Builder {
    private var asOfValue: String? = null

    public var asOf: String
      get() = requireNotNull(asOfValue) { "asOf is required" }
      set(`value`) {
        asOfValue = value
      }

    private var endDateValue: String? = null

    public var endDate: String
      get() = requireNotNull(endDateValue) { "endDate is required" }
      set(`value`) {
        endDateValue = value
      }

    private var startDateValue: String? = null

    public var startDate: String
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    private var versionValue: InlineComponentsSchemasRankingsDailyMetaPropertiesVersion? = null

    public var version: InlineComponentsSchemasRankingsDailyMetaPropertiesVersion
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public fun build(): RankingsDailyMeta {
      check(asOfValue != null) { "asOf is required" }
      check(endDateValue != null) { "endDate is required" }
      check(startDateValue != null) { "startDate is required" }
      check(versionValue != null) { "version is required" }
      return RankingsDailyMeta(
        asOf = asOf,
        endDate = endDate,
        startDate = startDate,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RankingsDailyMeta = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RankingsDailyMeta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RankingsDailyMeta {
      val jsonDecoder = decoder.requireJsonDecoder("RankingsDailyMeta")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("RankingsDailyMeta must be a JSON object")
      val asOf = json.decodeRequired<String>(raw, "as_of")
      val endDate = json.decodeRequired<String>(raw, "end_date")
      val startDate = json.decodeRequired<String>(raw, "start_date")
      val version = json.decodeRequired<InlineComponentsSchemasRankingsDailyMetaPropertiesVersion>(raw, "version")
      return RankingsDailyMeta(
        asOf = asOf,
        endDate = endDate,
        startDate = startDate,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RankingsDailyMeta) {
      val jsonEncoder = encoder.requireJsonEncoder("RankingsDailyMeta")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("as_of", value.asOf)
        put("end_date", value.endDate)
        put("start_date", value.startDate)
        put("version", json.encodeToJsonElement(value.version))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rankingsDailyMeta(block: RankingsDailyMeta.Builder.() -> Unit): RankingsDailyMeta = RankingsDailyMeta
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RankingsDailyMeta is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
