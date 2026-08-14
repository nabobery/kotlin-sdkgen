package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksDAItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksDAItem
 */
@Serializable(with = UnifiedBenchmarksDaItem.Serializer::class)
public class UnifiedBenchmarksDaItem(
  /**
   * Arena this ranking belongs to.
   */
  public val arena: String,
  /**
   * Average generation time in milliseconds.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val avgGenerationTimeMs: Double?,
  /**
   * Category within the arena.
   */
  public val category: String,
  /**
   * Human-readable model name from Design Arena.
   */
  public val displayName: String,
  /**
   * ELO rating from head-to-head arena battles.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val elo: Double,
  /**
   * Stable OpenRouter model identifier when mapped; otherwise the upstream Design Arena model id.
   */
  public val modelPermaslug: String,
  public val pricing: UnifiedBenchmarkPricing?,
  /**
   * Benchmark source discriminator.
   */
  public val source: InlineUnifiedBenchmarksDaItemSourceX6401fb53,
  /**
   * Placement distribution from tournament matches.
   */
  public val tournamentStats: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8,
  /**
   * Win rate as a percentage (0–100).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
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

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var eloValue: Double? = null

    public var elo: Double
      get() = requireNotNull(eloValue) { "elo is required" }
      set(`value`) {
        eloValue = value
      }

    private var modelPermaslugValue: String? = null

    public var modelPermaslug: String
      get() = requireNotNull(modelPermaslugValue) { "modelPermaslug is required" }
      set(`value`) {
        modelPermaslugValue = value
      }

    private var sourceValue: InlineUnifiedBenchmarksDaItemSourceX6401fb53? = null

    public var source: InlineUnifiedBenchmarksDaItemSourceX6401fb53
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var tournamentStatsValue: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8? = null

    public var tournamentStats: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8
      get() = requireNotNull(tournamentStatsValue) { "tournamentStats is required" }
      set(`value`) {
        tournamentStatsValue = value
      }

    private var winRateValue: Double? = null

    public var winRate: Double
      get() = requireNotNull(winRateValue) { "winRate is required" }
      set(`value`) {
        winRateValue = value
      }

    private var avgGenerationTimeMsState: FieldState<Double?> = FieldState.Absent

    /**
     * Average generation time in milliseconds.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var avgGenerationTimeMs: Double?
      get() = avgGenerationTimeMsState.valueOrNull()
      set(`value`) {
        avgGenerationTimeMsState = value.toNullableFieldState()
      }

    private var pricingState: FieldState<UnifiedBenchmarkPricing?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pricing: UnifiedBenchmarkPricing?
      get() = pricingState.valueOrNull()
      set(`value`) {
        pricingState = value.toNullableFieldState()
      }

    public fun build(): UnifiedBenchmarksDaItem {
      check(arenaValue != null) { "arena is required" }
      check(categoryValue != null) { "category is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(eloValue != null) { "elo is required" }
      check(modelPermaslugValue != null) { "modelPermaslug is required" }
      check(sourceValue != null) { "source is required" }
      check(tournamentStatsValue != null) { "tournamentStats is required" }
      check(winRateValue != null) { "winRate is required" }
      check(avgGenerationTimeMsState !== FieldState.Absent) { "avgGenerationTimeMs is required, even when null" }
      check(pricingState !== FieldState.Absent) { "pricing is required, even when null" }
      return UnifiedBenchmarksDaItem(
        arena = arena,
        avgGenerationTimeMs = avgGenerationTimeMsState.valueOrNull(),
        category = category,
        displayName = displayName,
        elo = elo,
        modelPermaslug = modelPermaslug,
        pricing = pricingState.valueOrNull(),
        source = source,
        tournamentStats = tournamentStats,
        winRate = winRate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnifiedBenchmarksDaItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnifiedBenchmarksDaItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnifiedBenchmarksDaItem {
      val jsonDecoder = decoder.requireJsonDecoder("UnifiedBenchmarksDaItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnifiedBenchmarksDaItem must be a JSON object")
      val arena = json.decodeRequired<String>(rawObject, "arena")
      val category = json.decodeRequired<String>(rawObject, "category")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val elo = json.decodeRequired<Double>(rawObject, "elo")
      val modelPermaslug = json.decodeRequired<String>(rawObject, "model_permaslug")
      val source = json.decodeRequired<InlineUnifiedBenchmarksDaItemSourceX6401fb53>(rawObject, "source")
      val tournamentStats = json.decodeRequired<InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8>(rawObject, "tournament_stats")
      val winRate = json.decodeRequired<Double>(rawObject, "win_rate")
      if (!rawObject.containsKey("avg_generation_time_ms")) {
        throw SerializationException("UnifiedBenchmarksDaItem is missing required property 'avg_generation_time_ms'")
      }
      val avgGenerationTimeMs = rawObject["avg_generation_time_ms"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pricing")) {
        throw SerializationException("UnifiedBenchmarksDaItem is missing required property 'pricing'")
      }
      val pricing = rawObject["pricing"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<UnifiedBenchmarkPricing?>(requireNotNull(element)) }
      return UnifiedBenchmarksDaItem(
        arena = arena,
        avgGenerationTimeMs = avgGenerationTimeMs,
        category = category,
        displayName = displayName,
        elo = elo,
        modelPermaslug = modelPermaslug,
        pricing = pricing,
        source = source,
        tournamentStats = tournamentStats,
        winRate = winRate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnifiedBenchmarksDaItem) {
      val jsonEncoder = encoder.requireJsonEncoder("UnifiedBenchmarksDaItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arena", value.arena)
        put("avg_generation_time_ms", value.avgGenerationTimeMs?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("category", value.category)
        put("display_name", value.displayName)
        put("elo", json.encodeToJsonElement(value.elo))
        put("model_permaslug", value.modelPermaslug)
        put("pricing", value.pricing?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("source", json.encodeToJsonElement(value.source))
        put("tournament_stats", json.encodeToJsonElement(value.tournamentStats))
        put("win_rate", json.encodeToJsonElement(value.winRate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unifiedBenchmarksDaItem(block: UnifiedBenchmarksDaItem.Builder.() -> Unit): UnifiedBenchmarksDaItem = UnifiedBenchmarksDaItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnifiedBenchmarksDaItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("UnifiedBenchmarksDaItem property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
