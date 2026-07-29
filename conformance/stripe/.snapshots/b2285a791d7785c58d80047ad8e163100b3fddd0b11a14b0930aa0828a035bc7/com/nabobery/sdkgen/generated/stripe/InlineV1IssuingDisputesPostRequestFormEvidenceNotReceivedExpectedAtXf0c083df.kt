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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/expected_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/expected_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfBranch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083dfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X2c611cb2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
