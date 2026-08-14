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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/returned_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/returned_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588) add(InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X831b1588")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
