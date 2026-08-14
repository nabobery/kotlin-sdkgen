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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccBranch {
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8,
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccInspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8, matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccInspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccInspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1ccInspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1Xe727b6c8")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X581862f3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
