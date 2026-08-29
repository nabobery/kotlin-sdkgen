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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eBranch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eNoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eDecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/customer_device_id.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/customer_device_id
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eBranch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7) add(InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eNoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7 = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7>()
  return InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
