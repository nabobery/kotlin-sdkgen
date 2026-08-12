package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineUnifiedBenchmarksResponseDataItemX1b147adaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineUnifiedBenchmarksResponseDataItemX1b147adaNoMatchException(
  message: String,
) : InlineUnifiedBenchmarksResponseDataItemX1b147adaDecodingException(message)

public class InlineUnifiedBenchmarksResponseDataItemX1b147adaAmbiguityException(
  message: String,
) : InlineUnifiedBenchmarksResponseDataItemX1b147adaDecodingException(message)

public class InlineUnifiedBenchmarksResponseDataItemX1b147adaBranchValidationException(
  message: String,
) : InlineUnifiedBenchmarksResponseDataItemX1b147adaDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksResponse/properties/data/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksResponse/properties/data/items
 */
@Serializable(with = InlineUnifiedBenchmarksResponseDataItemX1b147adaSerializer::class)
public sealed interface InlineUnifiedBenchmarksResponseDataItemX1b147ada {
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
    public val source: InlineUnifiedBenchmarksAaItemSourceX724e0cad,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUnifiedBenchmarksResponseDataItemX1b147ada {
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
        source: InlineUnifiedBenchmarksAaItemSourceX724e0cad,
      ): UnifiedBenchmarksAaItem {
        val raw = buildJsonObject {
          put("agentic_index", SdkJson.encodeToJsonElement(agenticIndex))
          put("coding_index", SdkJson.encodeToJsonElement(codingIndex))
          put("display_name", displayName)
          put("intelligence_index", SdkJson.encodeToJsonElement(intelligenceIndex))
          put("model_permaslug", modelPermaslug)
          put("pricing", SdkJson.encodeToJsonElement(pricing))
          put("source", SdkJson.encodeToJsonElement(source))
        }
        val inspection = inspectInlineUnifiedBenchmarksResponseDataItemX1b147ada(raw)
        if (inspection.size == 0) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaNoMatchException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.unifiedBenchmarksAaItemMatches) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaBranchValidationException("UnifiedBenchmarksAaItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaAmbiguityException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return UnifiedBenchmarksAaItem(
          agenticIndex = agenticIndex,
          codingIndex = codingIndex,
          displayName = displayName,
          intelligenceIndex = intelligenceIndex,
          modelPermaslug = modelPermaslug,
          pricing = pricing,
          source = source,
          raw = raw,
        )
      }
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
    public val source: InlineUnifiedBenchmarksDaItemSourceX6401fb53,
    public val tournamentStats: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8,
    public val winRate: Double,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUnifiedBenchmarksResponseDataItemX1b147ada {
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
        source: InlineUnifiedBenchmarksDaItemSourceX6401fb53,
        tournamentStats: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8,
        winRate: Double,
      ): UnifiedBenchmarksDaItem {
        val raw = buildJsonObject {
          put("arena", arena)
          put("avg_generation_time_ms", SdkJson.encodeToJsonElement(avgGenerationTimeMs))
          put("category", category)
          put("display_name", displayName)
          put("elo", SdkJson.encodeToJsonElement(elo))
          put("model_permaslug", modelPermaslug)
          put("pricing", SdkJson.encodeToJsonElement(pricing))
          put("source", SdkJson.encodeToJsonElement(source))
          put("tournament_stats", SdkJson.encodeToJsonElement(tournamentStats))
          put("win_rate", SdkJson.encodeToJsonElement(winRate))
        }
        val inspection = inspectInlineUnifiedBenchmarksResponseDataItemX1b147ada(raw)
        if (inspection.size == 0) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaNoMatchException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.unifiedBenchmarksDaItemMatches) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaBranchValidationException("UnifiedBenchmarksDaItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUnifiedBenchmarksResponseDataItemX1b147adaAmbiguityException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
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
          raw = raw,
        )
      }
    }
  }
}

internal object InlineUnifiedBenchmarksResponseDataItemX1b147adaSerializer : KSerializer<InlineUnifiedBenchmarksResponseDataItemX1b147ada> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksResponseDataItemX1b147ada {
    val jsonDecoder = decoder.requireJsonDecoder("InlineUnifiedBenchmarksResponseDataItemX1b147ada")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineUnifiedBenchmarksResponseDataItemX1b147adaNoMatchException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched 0 branches: expected JSON object")
    val matches = inspectInlineUnifiedBenchmarksResponseDataItemX1b147ada(rawObject)
    if (matches.size == 0) {
      throw InlineUnifiedBenchmarksResponseDataItemX1b147adaNoMatchException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineUnifiedBenchmarksResponseDataItemX1b147adaAmbiguityException("InlineUnifiedBenchmarksResponseDataItemX1b147ada matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.unifiedBenchmarksAaItemMatches -> InlineUnifiedBenchmarksResponseDataItemX1b147ada.UnifiedBenchmarksAaItem(agenticIndex = matches.agenticIndex, codingIndex = matches.codingIndex, displayName = requireNotNull(matches.displayName), intelligenceIndex = matches.intelligenceIndex, modelPermaslug = requireNotNull(matches.modelPermaslug), pricing = matches.pricing, source = requireNotNull(matches.sourceState1), raw = rawObject)
      matches.unifiedBenchmarksDaItemMatches -> InlineUnifiedBenchmarksResponseDataItemX1b147ada.UnifiedBenchmarksDaItem(arena = requireNotNull(matches.arena), avgGenerationTimeMs = matches.avgGenerationTimeMs, category = requireNotNull(matches.category), displayName = requireNotNull(matches.displayName), elo = requireNotNull(matches.elo), modelPermaslug = requireNotNull(matches.modelPermaslug), pricing = matches.pricing, source = requireNotNull(matches.sourceState3), tournamentStats = requireNotNull(matches.tournamentStats), winRate = requireNotNull(matches.winRate), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksResponseDataItemX1b147ada) {
    encoder.requireJsonEncoder("InlineUnifiedBenchmarksResponseDataItemX1b147ada").encodeJsonElement(value.raw)
  }
}

internal data class InlineUnifiedBenchmarksResponseDataItemX1b147adaInspection(
  public val sourceState1: InlineUnifiedBenchmarksAaItemSourceX724e0cad?,
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
  public val sourceState2: InlineUnifiedBenchmarksAaItemSourceX724e0cad?,
  public val sourceState2Decoded: Boolean,
  public val sourceState2Matches: Boolean,
  public val sourceState3: InlineUnifiedBenchmarksDaItemSourceX6401fb53?,
  public val sourceState3Decoded: Boolean,
  public val sourceState3Matches: Boolean,
  public val arena: String?,
  public val arenaDecoded: Boolean,
  public val avgGenerationTimeMs: Double?,
  public val avgGenerationTimeMsPresent: Boolean,
  public val avgGenerationTimeMsDecoded: Boolean,
  public val category: String?,
  public val categoryDecoded: Boolean,
  public val elo: Double?,
  public val eloDecoded: Boolean,
  public val sourceState4: InlineUnifiedBenchmarksDaItemSourceX6401fb53?,
  public val sourceState4Decoded: Boolean,
  public val sourceState4Matches: Boolean,
  public val tournamentStats: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8?,
  public val tournamentStatsDecoded: Boolean,
  public val winRate: Double?,
  public val winRateDecoded: Boolean,
  public val unifiedBenchmarksAaItemMatches: Boolean,
  public val unifiedBenchmarksDaItemMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (unifiedBenchmarksAaItemMatches) add("UnifiedBenchmarksAaItem")
      if (unifiedBenchmarksDaItemMatches) add("UnifiedBenchmarksDaItem")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineUnifiedBenchmarksResponseDataItemX1b147ada(rawObject: JsonObject): InlineUnifiedBenchmarksResponseDataItemX1b147adaInspection {
  val sourceState1Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUnifiedBenchmarksAaItemSourceX724e0cad>(element) } }
  val sourceState1 = sourceState1Result?.getOrNull()
  val sourceState1Decoded = sourceState1Result?.isSuccess == true
  val sourceState1Matches = (rawObject.stringValue("source") == "artificial-analysis") && sourceState1Decoded
  val agenticIndexResult = rawObject["agentic_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double?>(element) } }
  val agenticIndex = agenticIndexResult?.getOrNull()
  val agenticIndexPresent = rawObject.containsKey("agentic_index")
  val agenticIndexDecoded = agenticIndexResult?.isSuccess == true
  val codingIndexResult = rawObject["coding_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double?>(element) } }
  val codingIndex = codingIndexResult?.getOrNull()
  val codingIndexPresent = rawObject.containsKey("coding_index")
  val codingIndexDecoded = codingIndexResult?.isSuccess == true
  val displayNameResult = rawObject["display_name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val displayName = displayNameResult?.getOrNull()
  val displayNameDecoded = displayNameResult?.isSuccess == true
  val intelligenceIndexResult = rawObject["intelligence_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double?>(element) } }
  val intelligenceIndex = intelligenceIndexResult?.getOrNull()
  val intelligenceIndexPresent = rawObject.containsKey("intelligence_index")
  val intelligenceIndexDecoded = intelligenceIndexResult?.isSuccess == true
  val modelPermaslugResult = rawObject["model_permaslug"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val modelPermaslug = modelPermaslugResult?.getOrNull()
  val modelPermaslugDecoded = modelPermaslugResult?.isSuccess == true
  val pricingResult = rawObject["pricing"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<UnifiedBenchmarkPricing?>(element) } }
  val pricing = pricingResult?.getOrNull()
  val pricingPresent = rawObject.containsKey("pricing")
  val pricingDecoded = pricingResult?.isSuccess == true
  val sourceState2Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUnifiedBenchmarksAaItemSourceX724e0cad>(element) } }
  val sourceState2 = sourceState2Result?.getOrNull()
  val sourceState2Decoded = sourceState2Result?.isSuccess == true
  val sourceState2Matches = (rawObject.stringValue("source") == "artificial-analysis") && sourceState2Decoded
  val sourceState3Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUnifiedBenchmarksDaItemSourceX6401fb53>(element) } }
  val sourceState3 = sourceState3Result?.getOrNull()
  val sourceState3Decoded = sourceState3Result?.isSuccess == true
  val sourceState3Matches = (rawObject.stringValue("source") == "design-arena") && sourceState3Decoded
  val arenaResult = rawObject["arena"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val arena = arenaResult?.getOrNull()
  val arenaDecoded = arenaResult?.isSuccess == true
  val avgGenerationTimeMsResult = rawObject["avg_generation_time_ms"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double?>(element) } }
  val avgGenerationTimeMs = avgGenerationTimeMsResult?.getOrNull()
  val avgGenerationTimeMsPresent = rawObject.containsKey("avg_generation_time_ms")
  val avgGenerationTimeMsDecoded = avgGenerationTimeMsResult?.isSuccess == true
  val categoryResult = rawObject["category"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val category = categoryResult?.getOrNull()
  val categoryDecoded = categoryResult?.isSuccess == true
  val eloResult = rawObject["elo"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val elo = eloResult?.getOrNull()
  val eloDecoded = eloResult?.isSuccess == true
  val sourceState4Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUnifiedBenchmarksDaItemSourceX6401fb53>(element) } }
  val sourceState4 = sourceState4Result?.getOrNull()
  val sourceState4Decoded = sourceState4Result?.isSuccess == true
  val sourceState4Matches = (rawObject.stringValue("source") == "design-arena") && sourceState4Decoded
  val tournamentStatsResult = rawObject["tournament_stats"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8>(element) } }
  val tournamentStats = tournamentStatsResult?.getOrNull()
  val tournamentStatsDecoded = tournamentStatsResult?.isSuccess == true
  val winRateResult = rawObject["win_rate"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val winRate = winRateResult?.getOrNull()
  val winRateDecoded = winRateResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val unifiedBenchmarksAaItemMatches = matchesInlineUnifiedBenchmarksResponseDataItemX1b147adaUnifiedBenchmarksAaItemBranch(rawObject) && (sourceState1Matches)
  val unifiedBenchmarksDaItemMatches = matchesInlineUnifiedBenchmarksResponseDataItemX1b147adaUnifiedBenchmarksDaItemBranch(rawObject) && (sourceState3Matches)
  return InlineUnifiedBenchmarksResponseDataItemX1b147adaInspection(
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
    sourceState3 = sourceState3,
    sourceState3Decoded = sourceState3Decoded,
    sourceState3Matches = sourceState3Matches,
    arena = arena,
    arenaDecoded = arenaDecoded,
    avgGenerationTimeMs = avgGenerationTimeMs,
    avgGenerationTimeMsPresent = avgGenerationTimeMsPresent,
    avgGenerationTimeMsDecoded = avgGenerationTimeMsDecoded,
    category = category,
    categoryDecoded = categoryDecoded,
    elo = elo,
    eloDecoded = eloDecoded,
    sourceState4 = sourceState4,
    sourceState4Decoded = sourceState4Decoded,
    sourceState4Matches = sourceState4Matches,
    tournamentStats = tournamentStats,
    tournamentStatsDecoded = tournamentStatsDecoded,
    winRate = winRate,
    winRateDecoded = winRateDecoded,
    unifiedBenchmarksAaItemMatches = unifiedBenchmarksAaItemMatches,
    unifiedBenchmarksDaItemMatches = unifiedBenchmarksDaItemMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!unifiedBenchmarksAaItemMatches) add("UnifiedBenchmarksAaItem: branch predicate did not match properties 'source'")
      if (!unifiedBenchmarksDaItemMatches) add("UnifiedBenchmarksDaItem: branch predicate did not match properties 'source'")
    },
  )
}

private fun matchesInlineUnifiedBenchmarksResponseDataItemX1b147adaUnifiedBenchmarksAaItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("agentic_index") && (rawObject as JsonObject).containsKey("coding_index") && (rawObject as JsonObject).containsKey("display_name") && (rawObject as JsonObject).containsKey("intelligence_index") && (rawObject as JsonObject).containsKey("model_permaslug") && (rawObject as JsonObject).containsKey("pricing") && (rawObject as JsonObject).containsKey("source") && ((rawObject as JsonObject)["agentic_index"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["coding_index"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["display_name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["intelligence_index"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["model_permaslug"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["pricing"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("completion") && (property as JsonObject).containsKey("prompt") && ((property as JsonObject)["completion"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["prompt"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["source"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"artificial-analysis\"")))) } ?: true))))

private fun matchesInlineUnifiedBenchmarksResponseDataItemX1b147adaUnifiedBenchmarksDaItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("arena") && (rawObject as JsonObject).containsKey("avg_generation_time_ms") && (rawObject as JsonObject).containsKey("category") && (rawObject as JsonObject).containsKey("display_name") && (rawObject as JsonObject).containsKey("elo") && (rawObject as JsonObject).containsKey("model_permaslug") && (rawObject as JsonObject).containsKey("pricing") && (rawObject as JsonObject).containsKey("source") && (rawObject as JsonObject).containsKey("tournament_stats") && (rawObject as JsonObject).containsKey("win_rate") && ((rawObject as JsonObject)["arena"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["avg_generation_time_ms"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["category"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["display_name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["elo"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((rawObject as JsonObject)["model_permaslug"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["pricing"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("completion") && (property as JsonObject).containsKey("prompt") && ((property as JsonObject)["completion"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["prompt"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["source"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"design-arena\"")))) } ?: true) && ((rawObject as JsonObject)["tournament_stats"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("first_place") && (property as JsonObject).containsKey("fourth_place") && (property as JsonObject).containsKey("second_place") && (property as JsonObject).containsKey("third_place") && (property as JsonObject).containsKey("total") && ((property as JsonObject)["first_place"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["fourth_place"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["second_place"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["third_place"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["total"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) } ?: true) && ((rawObject as JsonObject)["win_rate"]?.let { property -> property.isJsonSchemaNumber() } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
