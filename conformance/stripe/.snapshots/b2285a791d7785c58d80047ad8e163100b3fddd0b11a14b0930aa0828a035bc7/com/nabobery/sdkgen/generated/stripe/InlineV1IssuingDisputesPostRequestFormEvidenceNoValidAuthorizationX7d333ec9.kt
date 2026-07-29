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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Branch {
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Inspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Inspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c) add(InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0) add(InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Inspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9Inspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xe572b9c0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
