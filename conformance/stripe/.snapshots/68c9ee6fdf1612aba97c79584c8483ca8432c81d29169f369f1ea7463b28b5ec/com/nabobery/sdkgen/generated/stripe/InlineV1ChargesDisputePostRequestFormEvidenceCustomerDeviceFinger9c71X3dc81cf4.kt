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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Branch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4NoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4DecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/customer_device_fingerprint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/customer_device_fingerprint
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Branch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Branch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4 {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4NoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50 = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50>()
  return InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X445eff50")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
