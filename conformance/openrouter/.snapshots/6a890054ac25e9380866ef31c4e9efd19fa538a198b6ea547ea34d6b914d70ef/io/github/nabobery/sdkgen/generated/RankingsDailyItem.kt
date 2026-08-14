package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyItem
 */
@Serializable(with = RankingsDailyItem.Serializer::class)
public class RankingsDailyItem(
  /**
   * UTC calendar date the row is aggregated over (YYYY-MM-DD).
   */
  public val date: String,
  /**
   * Model variant permaslug (e.g. `openai/gpt-4o-2024-05-13`, `openai/gpt-4o-2024-05-13:free`). Non-default variants
   * include a `:variant` suffix and are ranked as their own entry. The reserved value `other` denotes the aggregated
   * row covering every model outside the daily top 50 for that date — always sorted last within its date.
   */
  public val modelPermaslug: String,
  /**
   * Sum of `prompt_tokens + completion_tokens` for the day, returned as a decimal string so 64-bit values are not
   * truncated.
   */
  public val totalTokens: String,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var modelPermaslugValue: String? = null

    public var modelPermaslug: String
      get() = requireNotNull(modelPermaslugValue) { "modelPermaslug is required" }
      set(`value`) {
        modelPermaslugValue = value
      }

    private var totalTokensValue: String? = null

    public var totalTokens: String
      get() = requireNotNull(totalTokensValue) { "totalTokens is required" }
      set(`value`) {
        totalTokensValue = value
      }

    public fun build(): RankingsDailyItem {
      check(dateValue != null) { "date is required" }
      check(modelPermaslugValue != null) { "modelPermaslug is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return RankingsDailyItem(
        date = date,
        modelPermaslug = modelPermaslug,
        totalTokens = totalTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RankingsDailyItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RankingsDailyItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RankingsDailyItem {
      val jsonDecoder = decoder.requireJsonDecoder("RankingsDailyItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RankingsDailyItem must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val modelPermaslug = json.decodeRequired<String>(rawObject, "model_permaslug")
      val totalTokens = json.decodeRequired<String>(rawObject, "total_tokens")
      return RankingsDailyItem(
        date = date,
        modelPermaslug = modelPermaslug,
        totalTokens = totalTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RankingsDailyItem) {
      val jsonEncoder = encoder.requireJsonEncoder("RankingsDailyItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("model_permaslug", value.modelPermaslug)
        put("total_tokens", value.totalTokens)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rankingsDailyItem(block: RankingsDailyItem.Builder.() -> Unit): RankingsDailyItem = RankingsDailyItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RankingsDailyItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
