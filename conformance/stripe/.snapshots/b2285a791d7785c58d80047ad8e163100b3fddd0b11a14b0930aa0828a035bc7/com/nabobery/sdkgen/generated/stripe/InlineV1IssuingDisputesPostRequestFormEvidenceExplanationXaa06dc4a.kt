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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7) add(InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X59ea68e7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
