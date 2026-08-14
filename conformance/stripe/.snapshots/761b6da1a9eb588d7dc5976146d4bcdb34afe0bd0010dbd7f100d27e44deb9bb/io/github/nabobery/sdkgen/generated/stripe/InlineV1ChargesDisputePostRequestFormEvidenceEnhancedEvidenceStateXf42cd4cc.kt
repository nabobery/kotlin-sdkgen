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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccBranch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccNoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccDecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/state.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/state
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccBranch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccNoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1 = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1>()
  return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4ccInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xadd8b9b1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
