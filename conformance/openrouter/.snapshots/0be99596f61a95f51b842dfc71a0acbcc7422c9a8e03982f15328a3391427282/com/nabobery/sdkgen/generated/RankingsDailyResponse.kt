package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyResponse
 */
@Serializable(with = RankingsDailyResponse.Serializer::class)
public class RankingsDailyResponse(
  `data`: List<RankingsDailyItem>,
  public val meta: RankingsDailyMeta,
) {
  /**
   * Up to 51 rows per day — the top 50 public models by `total_tokens` for each UTC calendar date in the window, plus
   * one aggregated `other` row summing every model outside that top 50 (omitted when the long tail is empty). Rows are
   * sorted by `date` ascending, then by `total_tokens` descending, with `other` pinned last within its date. Ties
   * between real models break alphabetically on `model_permaslug` so the order is stable across requests.
   */
  public val `data`: List<RankingsDailyItem> = data.toList()

  public class Builder {
    private var dataValue: List<RankingsDailyItem>? = null

    public var `data`: List<RankingsDailyItem>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var metaValue: RankingsDailyMeta? = null

    public var meta: RankingsDailyMeta
      get() = requireNotNull(metaValue) { "meta is required" }
      set(`value`) {
        metaValue = value
      }

    public fun build(): RankingsDailyResponse {
      check(dataValue != null) { "data is required" }
      check(metaValue != null) { "meta is required" }
      return RankingsDailyResponse(
        data = data,
        meta = meta,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RankingsDailyResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RankingsDailyResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RankingsDailyResponse {
      val jsonDecoder = decoder.requireJsonDecoder("RankingsDailyResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RankingsDailyResponse must be a JSON object")
      val data = json.decodeRequired<List<RankingsDailyItem>>(rawObject, "data")
      val meta = json.decodeRequired<RankingsDailyMeta>(rawObject, "meta")
      return RankingsDailyResponse(
        data = data,
        meta = meta,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RankingsDailyResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("RankingsDailyResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("meta", json.encodeToJsonElement(value.meta))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rankingsDailyResponse(block: RankingsDailyResponse.Builder.() -> Unit): RankingsDailyResponse = RankingsDailyResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RankingsDailyResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
