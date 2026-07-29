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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/received_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/received_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02) add(InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X581e8b02")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
