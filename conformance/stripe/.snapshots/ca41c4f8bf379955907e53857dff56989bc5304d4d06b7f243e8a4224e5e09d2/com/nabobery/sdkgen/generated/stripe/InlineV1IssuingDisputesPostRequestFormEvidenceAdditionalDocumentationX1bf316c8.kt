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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/additional_documentatio
 * n.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/additional_documentatio
 * n
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xb5de5b68")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
