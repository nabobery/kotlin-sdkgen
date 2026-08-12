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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X7dc0147d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
