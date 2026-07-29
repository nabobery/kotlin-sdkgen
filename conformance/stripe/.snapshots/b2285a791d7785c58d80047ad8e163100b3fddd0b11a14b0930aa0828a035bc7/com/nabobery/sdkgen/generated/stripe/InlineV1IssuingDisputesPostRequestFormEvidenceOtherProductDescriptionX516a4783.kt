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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Branch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX516a4783Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X6378a431")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
