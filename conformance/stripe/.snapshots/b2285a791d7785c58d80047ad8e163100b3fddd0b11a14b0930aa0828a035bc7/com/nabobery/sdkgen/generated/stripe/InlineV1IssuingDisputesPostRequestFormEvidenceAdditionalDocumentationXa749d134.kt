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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Branch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X4d0bfd99")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
