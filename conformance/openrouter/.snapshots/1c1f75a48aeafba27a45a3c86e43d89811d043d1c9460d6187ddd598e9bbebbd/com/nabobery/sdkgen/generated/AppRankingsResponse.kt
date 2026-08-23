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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AppRankingsResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AppRankingsResponse
 */
@Serializable(with = AppRankingsResponse.Serializer::class)
public class AppRankingsResponse(
  `data`: List<AppRankingsItem>,
  public val meta: RankingsDailyMeta,
) {
  /**
   * Apps ranked per the requested `sort`, re-numbered 1..N after category filtering. `popular` sorts by `total_tokens`
   * descending; `trending` sorts by absolute excess token growth descending and may return fewer than `limit` rows when
   * few apps are growing.
   */
  public val `data`: List<AppRankingsItem> = data.toList()

  public class Builder {
    private var dataValue: List<AppRankingsItem>? = null

    public var `data`: List<AppRankingsItem>
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

    public fun build(): AppRankingsResponse {
      check(dataValue != null) { "data is required" }
      check(metaValue != null) { "meta is required" }
      return AppRankingsResponse(
        data = data,
        meta = meta,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AppRankingsResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AppRankingsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AppRankingsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("AppRankingsResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AppRankingsResponse must be a JSON object")
      val data = json.decodeRequired<List<AppRankingsItem>>(rawObject, "data")
      val meta = json.decodeRequired<RankingsDailyMeta>(rawObject, "meta")
      return AppRankingsResponse(
        data = data,
        meta = meta,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AppRankingsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("AppRankingsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("meta", json.encodeToJsonElement(value.meta))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun appRankingsResponse(block: AppRankingsResponse.Builder.() -> Unit): AppRankingsResponse = AppRankingsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AppRankingsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
