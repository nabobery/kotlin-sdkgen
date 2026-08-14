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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/expected_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/expected_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032) add("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xad682032")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
