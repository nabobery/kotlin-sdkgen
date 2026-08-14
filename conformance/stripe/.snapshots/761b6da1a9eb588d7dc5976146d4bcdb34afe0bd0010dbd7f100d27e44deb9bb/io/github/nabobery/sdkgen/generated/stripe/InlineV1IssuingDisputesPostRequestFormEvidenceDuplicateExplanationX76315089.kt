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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Branch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X7bf8eb92")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
