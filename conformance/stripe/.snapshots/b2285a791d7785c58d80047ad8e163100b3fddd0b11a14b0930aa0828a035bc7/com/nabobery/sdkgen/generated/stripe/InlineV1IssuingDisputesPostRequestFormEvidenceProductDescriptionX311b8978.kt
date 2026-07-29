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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d) add(InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX311b8978Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X83bf908d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
