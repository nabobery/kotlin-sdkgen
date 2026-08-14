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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Branch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9NoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9DecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/state.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/state
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Branch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Branch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9 {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9NoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac>()
  return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X1ddda8ac")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
