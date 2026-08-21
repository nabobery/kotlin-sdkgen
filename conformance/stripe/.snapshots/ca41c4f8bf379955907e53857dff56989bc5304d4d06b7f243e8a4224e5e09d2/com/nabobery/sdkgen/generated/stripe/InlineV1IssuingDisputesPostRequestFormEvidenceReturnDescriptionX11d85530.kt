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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X9841e3e7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
