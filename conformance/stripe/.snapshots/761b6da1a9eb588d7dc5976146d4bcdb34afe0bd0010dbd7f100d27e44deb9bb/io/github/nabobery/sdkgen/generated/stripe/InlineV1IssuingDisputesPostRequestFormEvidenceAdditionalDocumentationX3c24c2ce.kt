package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1) add(InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceBranch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ceInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1) add("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X48fb2dd1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
