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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Branch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96NoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96DecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/customer_email_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/customer_email_address
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Branch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Branch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96 {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96NoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b>()
  return InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X20e27f0b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
