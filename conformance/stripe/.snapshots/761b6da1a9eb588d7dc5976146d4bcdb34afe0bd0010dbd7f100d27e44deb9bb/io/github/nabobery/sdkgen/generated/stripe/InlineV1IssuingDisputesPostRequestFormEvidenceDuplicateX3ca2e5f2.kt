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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Branch {
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869,
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Inspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869, matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Inspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Branch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Branch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Inspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2Inspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X75c8df93")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
