package com.nabobery.sdkgen.generated

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

public enum class PreferredMinThroughputBranch {
  Branch1,
  PercentileThroughputCutoffs,
  Branch3,
}

public sealed class PreferredMinThroughputDecodingException(
  message: String,
) : SerializationException(message)

public class PreferredMinThroughputNoMatchException(
  message: String,
) : PreferredMinThroughputDecodingException(message)

internal data class PreferredMinThroughputInspection(
  public val matchesBranch1: Boolean,
  public val matchesPercentileThroughputCutoffs: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPercentileThroughputCutoffs, matchesBranch3).count { it }
}

/**
 * Preferred minimum throughput (in tokens per second). Can be a number (applies to p50) or an object with
 * percentile-specific cutoffs. Endpoints below the threshold(s) may still be used, but are deprioritized in routing.
 * When using fallback models, this may cause a fallback model to be used instead of the primary model if it meets the
 * threshold.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PreferredMinThroughput
 */
@Serializable(with = PreferredMinThroughput.Serializer::class)
public class PreferredMinThroughput internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: PreferredMinThroughputInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val percentileThroughputCutoffs: PercentileThroughputCutoffs? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPercentileThroughputCutoffs) json.decodeFromJsonElement<PercentileThroughputCutoffs>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<PreferredMinThroughputBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(PreferredMinThroughputBranch.Branch1)
      if (inspection.matchesPercentileThroughputCutoffs) add(PreferredMinThroughputBranch.PercentileThroughputCutoffs)
      if (inspection.matchesBranch3) add(PreferredMinThroughputBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): PreferredMinThroughput {
      val inspection = inspectPreferredMinThroughput(raw)
      if (inspection.matchCount == 0) {
        throw PreferredMinThroughputNoMatchException("PreferredMinThroughput matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return PreferredMinThroughput(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<PreferredMinThroughput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PreferredMinThroughput {
      val jsonDecoder = decoder.requireJsonDecoder("PreferredMinThroughput")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: PreferredMinThroughput) {
      encoder.requireJsonEncoder("PreferredMinThroughput").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectPreferredMinThroughput(element: JsonElement): PreferredMinThroughputInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesPercentileThroughputCutoffs = element.isJsonDecodable<PercentileThroughputCutoffs>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return PreferredMinThroughputInspection(
    matchesBranch1 = matchesBranch1,
    matchesPercentileThroughputCutoffs = matchesPercentileThroughputCutoffs,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesPercentileThroughputCutoffs) add("PercentileThroughputCutoffs: value does not match PercentileThroughputCutoffs")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
