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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5a5f0a21")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
