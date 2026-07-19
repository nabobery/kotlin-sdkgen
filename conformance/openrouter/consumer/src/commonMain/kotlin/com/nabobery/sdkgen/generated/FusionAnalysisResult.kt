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
 * Structured analysis produced by the fusion judge model.
 */
@Serializable(with = FusionAnalysisResult.Serializer::class)
public class FusionAnalysisResult(
  blindSpots: List<String>,
  consensus: List<String>,
  contradictions: List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems>,
  partialCoverage: List<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems>,
  uniqueInsights: List<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems>,
) {
  public val blindSpots: List<String> = blindSpots.toList()

  public val consensus: List<String> = consensus.toList()

  public val contradictions:
      List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems> =
      contradictions.toList()

  public val partialCoverage:
      List<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems> =
      partialCoverage.toList()

  public val uniqueInsights:
      List<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems> =
      uniqueInsights.toList()

  public class Builder {
    private var blindSpotsValue: List<String>? = null

    public var blindSpots: List<String>
      get() = requireNotNull(blindSpotsValue) { "blindSpots is required" }
      set(`value`) {
        blindSpotsValue = value
      }

    private var consensusValue: List<String>? = null

    public var consensus: List<String>
      get() = requireNotNull(consensusValue) { "consensus is required" }
      set(`value`) {
        consensusValue = value
      }

    private var contradictionsValue:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems>? = null

    public var contradictions:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems>
      get() = requireNotNull(contradictionsValue) { "contradictions is required" }
      set(`value`) {
        contradictionsValue = value
      }

    private var partialCoverageValue:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems>? = null

    public var partialCoverage:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems>
      get() = requireNotNull(partialCoverageValue) { "partialCoverage is required" }
      set(`value`) {
        partialCoverageValue = value
      }

    private var uniqueInsightsValue:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems>? = null

    public var uniqueInsights:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems>
      get() = requireNotNull(uniqueInsightsValue) { "uniqueInsights is required" }
      set(`value`) {
        uniqueInsightsValue = value
      }

    public fun build(): FusionAnalysisResult {
      check(blindSpotsValue != null) { "blindSpots is required" }
      check(consensusValue != null) { "consensus is required" }
      check(contradictionsValue != null) { "contradictions is required" }
      check(partialCoverageValue != null) { "partialCoverage is required" }
      check(uniqueInsightsValue != null) { "uniqueInsights is required" }
      return FusionAnalysisResult(
        blindSpots = blindSpots,
        consensus = consensus,
        contradictions = contradictions,
        partialCoverage = partialCoverage,
        uniqueInsights = uniqueInsights,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionAnalysisResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FusionAnalysisResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionAnalysisResult {
      val jsonDecoder = decoder.requireJsonDecoder("FusionAnalysisResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FusionAnalysisResult must be a JSON object")
      val blindSpots = json.decodeRequired<List<String>>(raw, "blind_spots")
      val consensus = json.decodeRequired<List<String>>(raw, "consensus")
      val contradictions = json
        .decodeRequired<List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems>>(raw,
          "contradictions")
      val partialCoverage = json
        .decodeRequired<List<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems>>(raw,
          "partial_coverage")
      val uniqueInsights = json
        .decodeRequired<List<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems>>(raw,
          "unique_insights")
      return FusionAnalysisResult(
        blindSpots = blindSpots,
        consensus = consensus,
        contradictions = contradictions,
        partialCoverage = partialCoverage,
        uniqueInsights = uniqueInsights,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionAnalysisResult) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionAnalysisResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("blind_spots", json.encodeToJsonElement(value.blindSpots))
        put("consensus", json.encodeToJsonElement(value.consensus))
        put("contradictions", json.encodeToJsonElement(value.contradictions))
        put("partial_coverage", json.encodeToJsonElement(value.partialCoverage))
        put("unique_insights", json.encodeToJsonElement(value.uniqueInsights))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionAnalysisResult(block: FusionAnalysisResult.Builder.() -> Unit): FusionAnalysisResult =
  FusionAnalysisResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionAnalysisResult is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
