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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00edInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X5e3724ea")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
