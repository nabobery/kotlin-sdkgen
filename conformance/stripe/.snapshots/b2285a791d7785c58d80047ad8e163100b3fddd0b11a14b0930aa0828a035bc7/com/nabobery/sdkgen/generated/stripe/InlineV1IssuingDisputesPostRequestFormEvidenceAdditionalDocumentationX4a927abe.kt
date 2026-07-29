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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeBranch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abeInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2Xcf921afb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
