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

public enum class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Branch {
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9NoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Inspection(
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Inspection,
) {
  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6) add(InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd) add(InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9 {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9NoMatchException("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Inspection {
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd>()
  return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceX108ef6c9Inspection(
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd,
    failures = buildList {
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf2Xd8b448dd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
