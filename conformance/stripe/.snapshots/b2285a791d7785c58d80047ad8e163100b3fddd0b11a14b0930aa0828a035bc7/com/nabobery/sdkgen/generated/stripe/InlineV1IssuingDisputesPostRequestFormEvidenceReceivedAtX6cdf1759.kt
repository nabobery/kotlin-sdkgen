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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/received_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/received_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b) add(InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX6cdf1759Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1fe4b78b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
