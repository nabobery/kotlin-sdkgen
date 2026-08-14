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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Branch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25NoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25DecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/line1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/line1
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Branch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Branch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25 {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25NoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac>()
  return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X8b79e0ac")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
