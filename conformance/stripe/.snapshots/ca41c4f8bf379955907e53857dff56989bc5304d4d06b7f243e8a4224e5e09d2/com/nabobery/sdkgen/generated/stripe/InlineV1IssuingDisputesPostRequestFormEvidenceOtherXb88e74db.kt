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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbBranch {
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf,
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbInspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf, matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbInspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbInspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74dbInspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf2X7f6d6046")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
