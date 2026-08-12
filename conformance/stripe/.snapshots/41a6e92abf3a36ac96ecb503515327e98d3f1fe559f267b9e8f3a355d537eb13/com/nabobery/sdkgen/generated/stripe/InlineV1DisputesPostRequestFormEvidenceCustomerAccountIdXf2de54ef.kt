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

public enum class InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efBranch {
  Branch1,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efNoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efDecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_account_id.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_account_id
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efBranch.Branch1)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214) add(InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efBranch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efNoMatchException("InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214 = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214>()
  return InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54efInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X937dd214")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
