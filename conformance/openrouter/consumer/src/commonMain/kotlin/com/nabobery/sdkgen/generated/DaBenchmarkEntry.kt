package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * A single Design Arena benchmark entry for a specific arena+category
 */
@Serializable(with = DaBenchmarkEntry.Serializer::class)
public class DaBenchmarkEntry(
  /**
   * Arena type (e.g. models, builders, agents)
   */
  public val arena: String,
  /**
   * Category within the arena (e.g. website, gamedev, uicomponent)
   */
  public val category: String,
  /**
   * ELO rating from head-to-head arena battles
   */
  public val elo: Double,
  /**
   * Rank position within this arena+category among models available on OpenRouter (1 = highest ELO)
   */
  public val rank: Int,
  /**
   * Win rate percentage in arena battles
   */
  public val winRate: Double,
) {
  public class Builder {
    private var arenaValue: String? = null

    public var arena: String
      get() = requireNotNull(arenaValue) { "arena is required" }
      set(`value`) {
        arenaValue = value
      }

    private var categoryValue: String? = null

    public var category: String
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var eloValue: Double? = null

    public var elo: Double
      get() = requireNotNull(eloValue) { "elo is required" }
      set(`value`) {
        eloValue = value
      }

    private var rankValue: Int? = null

    public var rank: Int
      get() = requireNotNull(rankValue) { "rank is required" }
      set(`value`) {
        rankValue = value
      }

    private var winRateValue: Double? = null

    public var winRate: Double
      get() = requireNotNull(winRateValue) { "winRate is required" }
      set(`value`) {
        winRateValue = value
      }

    public fun build(): DaBenchmarkEntry {
      check(arenaValue != null) { "arena is required" }
      check(categoryValue != null) { "category is required" }
      check(eloValue != null) { "elo is required" }
      check(rankValue != null) { "rank is required" }
      check(winRateValue != null) { "winRate is required" }
      return DaBenchmarkEntry(
        arena = arena,
        category = category,
        elo = elo,
        rank = rank,
        winRate = winRate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DaBenchmarkEntry = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DaBenchmarkEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DaBenchmarkEntry {
      val jsonDecoder = decoder.requireJsonDecoder("DaBenchmarkEntry")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("DaBenchmarkEntry must be a JSON object")
      val arena = json.decodeRequired<String>(raw, "arena")
      val category = json.decodeRequired<String>(raw, "category")
      val elo = json.decodeRequired<Double>(raw, "elo")
      val rank = json.decodeRequired<Int>(raw, "rank")
      val winRate = json.decodeRequired<Double>(raw, "win_rate")
      return DaBenchmarkEntry(
        arena = arena,
        category = category,
        elo = elo,
        rank = rank,
        winRate = winRate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DaBenchmarkEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("DaBenchmarkEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arena", value.arena)
        put("category", value.category)
        put("elo", json.encodeToJsonElement(value.elo))
        put("rank", json.encodeToJsonElement(value.rank))
        put("win_rate", json.encodeToJsonElement(value.winRate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun daBenchmarkEntry(block: DaBenchmarkEntry.Builder.() -> Unit): DaBenchmarkEntry = DaBenchmarkEntry
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DaBenchmarkEntry is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
