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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Branch {
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7,
  InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Inspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7, matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Inspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3:
      InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7) add(InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3) add(InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Inspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726Inspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xce58edc7")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3) add("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2906eaa3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
