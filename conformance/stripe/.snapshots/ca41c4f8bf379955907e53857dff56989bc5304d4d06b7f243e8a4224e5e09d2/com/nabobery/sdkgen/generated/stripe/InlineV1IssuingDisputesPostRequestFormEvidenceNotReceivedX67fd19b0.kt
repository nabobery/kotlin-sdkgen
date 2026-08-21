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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Branch {
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294,
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Inspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294:
      Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294, matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Inspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Inspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0Inspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2Xe59a49a0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
