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

public enum class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Branch {
  Branch1,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566NoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/customer_purchase_ip.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/customer_purchase_ip
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Branch.Branch1)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0) add(InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566 {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566NoMatchException("InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0 = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0>()
  return InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X504f18d0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
