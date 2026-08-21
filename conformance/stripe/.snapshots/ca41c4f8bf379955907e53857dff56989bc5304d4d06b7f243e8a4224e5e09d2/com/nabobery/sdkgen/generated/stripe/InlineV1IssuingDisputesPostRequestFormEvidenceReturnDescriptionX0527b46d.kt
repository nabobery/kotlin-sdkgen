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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_descriptio
 * n.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_descriptio
 * n
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46d(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX0527b46dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X968e25ff")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
