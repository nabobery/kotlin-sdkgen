package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class PreferredMaxLatencyBranch {
  Branch1,
  PercentileLatencyCutoffs,
  Branch3,
}

public sealed class PreferredMaxLatencyDecodingException(
  message: String,
) : SerializationException(message)

public class PreferredMaxLatencyNoMatchException(
  message: String,
) : PreferredMaxLatencyDecodingException(message)

internal data class PreferredMaxLatencyInspection(
  public val matchesBranch1: Boolean,
  public val matchesPercentileLatencyCutoffs: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPercentileLatencyCutoffs, matchesBranch3).count { it }
}

/**
 * Preferred maximum latency (in seconds). Can be a number (applies to p50) or an object with percentile-specific
 * cutoffs. Endpoints above the threshold(s) may still be used, but are deprioritized in routing. When using fallback
 * models, this may cause a fallback model to be used instead of the primary model if it meets the threshold.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PreferredMaxLatency
 */
@Serializable(with = PreferredMaxLatency.Serializer::class)
public class PreferredMaxLatency internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: PreferredMaxLatencyInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val percentileLatencyCutoffs: PercentileLatencyCutoffs? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPercentileLatencyCutoffs) json.decodeFromJsonElement<PercentileLatencyCutoffs>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<PreferredMaxLatencyBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(PreferredMaxLatencyBranch.Branch1)
      if (inspection.matchesPercentileLatencyCutoffs) add(PreferredMaxLatencyBranch.PercentileLatencyCutoffs)
      if (inspection.matchesBranch3) add(PreferredMaxLatencyBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): PreferredMaxLatency {
      val inspection = inspectPreferredMaxLatency(raw)
      if (inspection.matchCount == 0) {
        throw PreferredMaxLatencyNoMatchException("PreferredMaxLatency matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return PreferredMaxLatency(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<PreferredMaxLatency> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PreferredMaxLatency {
      val jsonDecoder = decoder.requireJsonDecoder("PreferredMaxLatency")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: PreferredMaxLatency) {
      encoder.requireJsonEncoder("PreferredMaxLatency").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectPreferredMaxLatency(element: JsonElement): PreferredMaxLatencyInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesPercentileLatencyCutoffs = element.isJsonDecodable<PercentileLatencyCutoffs>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return PreferredMaxLatencyInspection(
    matchesBranch1 = matchesBranch1,
    matchesPercentileLatencyCutoffs = matchesPercentileLatencyCutoffs,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesPercentileLatencyCutoffs) add("PercentileLatencyCutoffs: value does not match PercentileLatencyCutoffs")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
