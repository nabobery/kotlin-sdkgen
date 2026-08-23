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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/canceled_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/canceled_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1dbf879f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
