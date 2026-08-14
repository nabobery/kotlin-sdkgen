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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/cancellation_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/cancellation_reason
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105) add(InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105) add("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xe2af0105")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
