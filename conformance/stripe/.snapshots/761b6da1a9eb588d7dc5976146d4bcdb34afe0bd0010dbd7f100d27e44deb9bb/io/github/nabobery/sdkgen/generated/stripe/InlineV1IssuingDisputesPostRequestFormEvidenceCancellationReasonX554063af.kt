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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/cancellation_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/cancellation_reason
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33) add(InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063afInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xed892c33")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
