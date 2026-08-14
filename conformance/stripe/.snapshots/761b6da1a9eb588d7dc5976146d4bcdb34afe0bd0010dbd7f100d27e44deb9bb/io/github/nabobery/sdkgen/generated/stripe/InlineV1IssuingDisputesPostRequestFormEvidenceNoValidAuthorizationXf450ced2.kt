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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Branch {
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Inspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Inspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d) add(InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc) add(InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Inspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2Inspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xf4e118cc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
