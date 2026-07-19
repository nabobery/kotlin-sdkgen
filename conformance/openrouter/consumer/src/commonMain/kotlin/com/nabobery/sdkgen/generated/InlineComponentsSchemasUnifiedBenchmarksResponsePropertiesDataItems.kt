package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsDecodingException(message)

public class InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksResponse/properties/data/items.
 */
@Serializable(with = InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems.Serializer::class)
public sealed interface InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class UnifiedBenchmarksAaItem internal constructor(
    public val agenticIndex: Double?,
    public val codingIndex: Double?,
    public val displayName: String,
    public val intelligenceIndex: Double?,
    public val modelPermaslug: String,
    public val pricing: UnifiedBenchmarkPricing?,
    public val source: InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        agenticIndex: Double?,
        codingIndex: Double?,
        displayName: String,
        intelligenceIndex: Double?,
        modelPermaslug: String,
        pricing: UnifiedBenchmarkPricing?,
        source: InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource,
      ): UnifiedBenchmarksAaItem = UnifiedBenchmarksAaItem(
        agenticIndex = agenticIndex,
        codingIndex = codingIndex,
        displayName = displayName,
        intelligenceIndex = intelligenceIndex,
        modelPermaslug = modelPermaslug,
        pricing = pricing,
        source = source,
        raw = buildJsonObject {
          put("agentic_index", SdkJson.encodeToJsonElement(agenticIndex))
          put("coding_index", SdkJson.encodeToJsonElement(codingIndex))
          put("display_name", displayName)
          put("intelligence_index", SdkJson.encodeToJsonElement(intelligenceIndex))
          put("model_permaslug", modelPermaslug)
          put("pricing", SdkJson.encodeToJsonElement(pricing))
          put("source", "artificial-analysis")
        },
      )
    }
  }

  public class UnifiedBenchmarksDaItem internal constructor(
    public val arena: String,
    public val avgGenerationTimeMs: Double?,
    public val category: String,
    public val displayName: String,
    public val elo: Double,
    public val modelPermaslug: String,
    public val pricing: UnifiedBenchmarkPricing?,
    public val source: InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource,
    public val tournamentStats:
        InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesTournamentStats,
    public val winRate: Double,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arena: String,
        avgGenerationTimeMs: Double?,
        category: String,
        displayName: String,
        elo: Double,
        modelPermaslug: String,
        pricing: UnifiedBenchmarkPricing?,
        source: InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource,
        tournamentStats: InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesTournamentStats,
        winRate: Double,
      ): UnifiedBenchmarksDaItem = UnifiedBenchmarksDaItem(
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
        raw = buildJsonObject {
          put("arena", arena)
          put("avg_generation_time_ms", SdkJson.encodeToJsonElement(avgGenerationTimeMs))
          put("category", category)
          put("display_name", displayName)
          put("elo", SdkJson.encodeToJsonElement(elo))
          put("model_permaslug", modelPermaslug)
          put("pricing", SdkJson.encodeToJsonElement(pricing))
          put("source", "design-arena")
          put("tournament_stats", SdkJson.encodeToJsonElement(tournamentStats))
          put("win_rate", SdkJson.encodeToJsonElement(winRate))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsNoMatchException("InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsNoMatchException("InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsAmbiguityException("InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.sourceState1Matches && matches.agenticIndexPresent && matches.agenticIndexDecoded && matches
          .codingIndexPresent && matches.codingIndexDecoded && matches.displayNameDecoded && matches
            .intelligenceIndexPresent && matches.intelligenceIndexDecoded && matches.modelPermaslugDecoded && matches
              .pricingPresent && matches.pricingDecoded -> UnifiedBenchmarksAaItem(agenticIndex = matches.agenticIndex,
                codingIndex = matches.codingIndex, displayName = requireNotNull(matches.displayName),
                  intelligenceIndex = matches.intelligenceIndex, modelPermaslug = requireNotNull(matches
                    .modelPermaslug), pricing = matches.pricing, source = requireNotNull(matches.sourceState1), raw =
                      raw)
        matches.sourceState2Matches && matches.arenaDecoded && matches.avgGenerationTimeMsPresent && matches
          .avgGenerationTimeMsDecoded && matches.categoryDecoded && matches.displayNameDecoded && matches.eloDecoded &&
            matches.modelPermaslugDecoded && matches.pricingPresent && matches.pricingDecoded && matches
              .tournamentStatsDecoded && matches.winRateDecoded -> UnifiedBenchmarksDaItem(arena =
                requireNotNull(matches.arena), avgGenerationTimeMs = matches.avgGenerationTimeMs, category =
                  requireNotNull(matches.category), displayName = requireNotNull(matches.displayName), elo =
                    requireNotNull(matches.elo), modelPermaslug = requireNotNull(matches.modelPermaslug), pricing =
                      matches.pricing, source = requireNotNull(matches.sourceState2), tournamentStats =
                        requireNotNull(matches.tournamentStats), winRate = requireNotNull(matches.winRate), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsInspection(
  public val sourceState1: InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource?,
  public val sourceState1Decoded: Boolean,
  public val sourceState1Matches: Boolean,
  public val agenticIndex: Double?,
  public val agenticIndexPresent: Boolean,
  public val agenticIndexDecoded: Boolean,
  public val codingIndex: Double?,
  public val codingIndexPresent: Boolean,
  public val codingIndexDecoded: Boolean,
  public val displayName: String?,
  public val displayNameDecoded: Boolean,
  public val intelligenceIndex: Double?,
  public val intelligenceIndexPresent: Boolean,
  public val intelligenceIndexDecoded: Boolean,
  public val modelPermaslug: String?,
  public val modelPermaslugDecoded: Boolean,
  public val pricing: UnifiedBenchmarkPricing?,
  public val pricingPresent: Boolean,
  public val pricingDecoded: Boolean,
  public val sourceState2: InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource?,
  public val sourceState2Decoded: Boolean,
  public val sourceState2Matches: Boolean,
  public val arena: String?,
  public val arenaDecoded: Boolean,
  public val avgGenerationTimeMs: Double?,
  public val avgGenerationTimeMsPresent: Boolean,
  public val avgGenerationTimeMsDecoded: Boolean,
  public val category: String?,
  public val categoryDecoded: Boolean,
  public val elo: Double?,
  public val eloDecoded: Boolean,
  public val tournamentStats:
      InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesTournamentStats?,
  public val tournamentStatsDecoded: Boolean,
  public val winRate: Double?,
  public val winRateDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (sourceState1Matches && agenticIndexPresent && agenticIndexDecoded && codingIndexPresent &&
        codingIndexDecoded && displayNameDecoded && intelligenceIndexPresent && intelligenceIndexDecoded &&
          modelPermaslugDecoded && pricingPresent && pricingDecoded) add("UnifiedBenchmarksAaItem")
      if (sourceState2Matches && arenaDecoded && avgGenerationTimeMsPresent && avgGenerationTimeMsDecoded &&
        categoryDecoded && displayNameDecoded && eloDecoded && modelPermaslugDecoded && pricingPresent &&
          pricingDecoded && tournamentStatsDecoded && winRateDecoded) add("UnifiedBenchmarksDaItem")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItems(raw: JsonObject): InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsInspection {
  val sourceState1Result = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasUnifiedBenchmarksAaItemPropertiesSource>(element) } }
  val sourceState1 = sourceState1Result?.getOrNull()
  val sourceState1Decoded = sourceState1Result?.isSuccess == true
  val sourceState1Matches = raw.stringValue("source") == "artificial-analysis" && sourceState1Decoded
  val agenticIndexResult = raw["agentic_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double?>(element) } }
  val agenticIndex = agenticIndexResult?.getOrNull()
  val agenticIndexPresent = raw.containsKey("agentic_index")
  val agenticIndexDecoded = agenticIndexResult?.isSuccess == true
  val codingIndexResult = raw["coding_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double?>(element) } }
  val codingIndex = codingIndexResult?.getOrNull()
  val codingIndexPresent = raw.containsKey("coding_index")
  val codingIndexDecoded = codingIndexResult?.isSuccess == true
  val displayNameResult = raw["display_name"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val displayName = displayNameResult?.getOrNull()
  val displayNameDecoded = displayNameResult?.isSuccess == true
  val intelligenceIndexResult = raw["intelligence_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double?>(element) } }
  val intelligenceIndex = intelligenceIndexResult?.getOrNull()
  val intelligenceIndexPresent = raw.containsKey("intelligence_index")
  val intelligenceIndexDecoded = intelligenceIndexResult?.isSuccess == true
  val modelPermaslugResult = raw["model_permaslug"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val modelPermaslug = modelPermaslugResult?.getOrNull()
  val modelPermaslugDecoded = modelPermaslugResult?.isSuccess == true
  val pricingResult = raw["pricing"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<UnifiedBenchmarkPricing?>(element) } }
  val pricing = pricingResult?.getOrNull()
  val pricingPresent = raw.containsKey("pricing")
  val pricingDecoded = pricingResult?.isSuccess == true
  val sourceState2Result = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesSource>(element) } }
  val sourceState2 = sourceState2Result?.getOrNull()
  val sourceState2Decoded = sourceState2Result?.isSuccess == true
  val sourceState2Matches = raw.stringValue("source") == "design-arena" && sourceState2Decoded
  val arenaResult = raw["arena"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val arena = arenaResult?.getOrNull()
  val arenaDecoded = arenaResult?.isSuccess == true
  val avgGenerationTimeMsResult = raw["avg_generation_time_ms"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double?>(element) } }
  val avgGenerationTimeMs = avgGenerationTimeMsResult?.getOrNull()
  val avgGenerationTimeMsPresent = raw.containsKey("avg_generation_time_ms")
  val avgGenerationTimeMsDecoded = avgGenerationTimeMsResult?.isSuccess == true
  val categoryResult = raw["category"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val category = categoryResult?.getOrNull()
  val categoryDecoded = categoryResult?.isSuccess == true
  val eloResult = raw["elo"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val elo = eloResult?.getOrNull()
  val eloDecoded = eloResult?.isSuccess == true
  val tournamentStatsResult = raw["tournament_stats"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasUnifiedBenchmarksDaItemPropertiesTournamentStats>(element) } }
  val tournamentStats = tournamentStatsResult?.getOrNull()
  val tournamentStatsDecoded = tournamentStatsResult?.isSuccess == true
  val winRateResult = raw["win_rate"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val winRate = winRateResult?.getOrNull()
  val winRateDecoded = winRateResult?.isSuccess == true
  return InlineComponentsSchemasUnifiedBenchmarksResponsePropertiesDataItemsInspection(
    sourceState1 = sourceState1,
    sourceState1Decoded = sourceState1Decoded,
    sourceState1Matches = sourceState1Matches,
    agenticIndex = agenticIndex,
    agenticIndexPresent = agenticIndexPresent,
    agenticIndexDecoded = agenticIndexDecoded,
    codingIndex = codingIndex,
    codingIndexPresent = codingIndexPresent,
    codingIndexDecoded = codingIndexDecoded,
    displayName = displayName,
    displayNameDecoded = displayNameDecoded,
    intelligenceIndex = intelligenceIndex,
    intelligenceIndexPresent = intelligenceIndexPresent,
    intelligenceIndexDecoded = intelligenceIndexDecoded,
    modelPermaslug = modelPermaslug,
    modelPermaslugDecoded = modelPermaslugDecoded,
    pricing = pricing,
    pricingPresent = pricingPresent,
    pricingDecoded = pricingDecoded,
    sourceState2 = sourceState2,
    sourceState2Decoded = sourceState2Decoded,
    sourceState2Matches = sourceState2Matches,
    arena = arena,
    arenaDecoded = arenaDecoded,
    avgGenerationTimeMs = avgGenerationTimeMs,
    avgGenerationTimeMsPresent = avgGenerationTimeMsPresent,
    avgGenerationTimeMsDecoded = avgGenerationTimeMsDecoded,
    category = category,
    categoryDecoded = categoryDecoded,
    elo = elo,
    eloDecoded = eloDecoded,
    tournamentStats = tournamentStats,
    tournamentStatsDecoded = tournamentStatsDecoded,
    winRate = winRate,
    winRateDecoded = winRateDecoded,
    failures = buildList {
      if (!sourceState1Matches || !agenticIndexPresent || !agenticIndexDecoded || !codingIndexPresent ||
        !codingIndexDecoded || !displayNameDecoded || !intelligenceIndexPresent || !intelligenceIndexDecoded ||
          !modelPermaslugDecoded || !pricingPresent ||
            !pricingDecoded) add("UnifiedBenchmarksAaItem: required properties 'source' and 'agentic_index' and " +
              "'coding_index' and 'display_name' and 'intelligence_index' and 'model_permaslug' and 'pricing' do not " +
              "match their declared types")
      if (!sourceState2Matches || !arenaDecoded || !avgGenerationTimeMsPresent || !avgGenerationTimeMsDecoded ||
        !categoryDecoded || !displayNameDecoded || !eloDecoded || !modelPermaslugDecoded || !pricingPresent ||
          !pricingDecoded || !tournamentStatsDecoded ||
            !winRateDecoded) add("UnifiedBenchmarksDaItem: required properties 'source' and 'arena' and " +
              "'avg_generation_time_ms' and 'category' and 'display_name' and 'elo' and 'model_permaslug' and " +
              "'pricing' and 'tournament_stats' and 'win_rate' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
