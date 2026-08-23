package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/fraudulent/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/fraudulent/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73) add("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2Xbac1cc73")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
