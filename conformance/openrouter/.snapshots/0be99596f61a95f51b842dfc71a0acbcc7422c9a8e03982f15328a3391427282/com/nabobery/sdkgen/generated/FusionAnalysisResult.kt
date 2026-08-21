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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult
 */
@Serializable(with = FusionAnalysisResult.Serializer::class)
public class FusionAnalysisResult(
  blindSpots: List<String>,
  consensus: List<String>,
  contradictions: List<InlineFusionAnalysisResultContradictionsItemX8aec6ddb>,
  partialCoverage: List<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f>,
  uniqueInsights: List<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e>,
) {
  public val blindSpots: List<String> = blindSpots.toList()

  public val consensus: List<String> = consensus.toList()

  public val contradictions: List<InlineFusionAnalysisResultContradictionsItemX8aec6ddb> =
      contradictions.toList()

  public val partialCoverage: List<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f> =
      partialCoverage.toList()

  public val uniqueInsights: List<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e> =
      uniqueInsights.toList()

  public class Builder {
    private var blindSpotsValue: List<String>? = null

    public var blindSpots: List<String>
      get() = requireNotNull(blindSpotsValue) { "blindSpots is required" }.toList()
      set(`value`) {
        blindSpotsValue = value.toList()
      }

    private var consensusValue: List<String>? = null

    public var consensus: List<String>
      get() = requireNotNull(consensusValue) { "consensus is required" }.toList()
      set(`value`) {
        consensusValue = value.toList()
      }

    private var contradictionsValue: List<InlineFusionAnalysisResultContradictionsItemX8aec6ddb>? =
        null

    public var contradictions: List<InlineFusionAnalysisResultContradictionsItemX8aec6ddb>
      get() = requireNotNull(contradictionsValue) { "contradictions is required" }.toList()
      set(`value`) {
        contradictionsValue = value.toList()
      }

    private var partialCoverageValue: List<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f>?
        = null

    public var partialCoverage: List<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f>
      get() = requireNotNull(partialCoverageValue) { "partialCoverage is required" }.toList()
      set(`value`) {
        partialCoverageValue = value.toList()
      }

    private var uniqueInsightsValue: List<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e>? =
        null

    public var uniqueInsights: List<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e>
      get() = requireNotNull(uniqueInsightsValue) { "uniqueInsights is required" }.toList()
      set(`value`) {
        uniqueInsightsValue = value.toList()
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

  internal object Serializer : KSerializer<FusionAnalysisResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionAnalysisResult {
      val jsonDecoder = decoder.requireJsonDecoder("FusionAnalysisResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionAnalysisResult must be a JSON object")
      val blindSpots = json.decodeRequired<List<String>>(rawObject, "blind_spots")
      val consensus = json.decodeRequired<List<String>>(rawObject, "consensus")
      val contradictions = json.decodeRequired<List<InlineFusionAnalysisResultContradictionsItemX8aec6ddb>>(rawObject, "contradictions")
      val partialCoverage = json.decodeRequired<List<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f>>(rawObject, "partial_coverage")
      val uniqueInsights = json.decodeRequired<List<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e>>(rawObject, "unique_insights")
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

public fun fusionAnalysisResult(block: FusionAnalysisResult.Builder.() -> Unit): FusionAnalysisResult = FusionAnalysisResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionAnalysisResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
