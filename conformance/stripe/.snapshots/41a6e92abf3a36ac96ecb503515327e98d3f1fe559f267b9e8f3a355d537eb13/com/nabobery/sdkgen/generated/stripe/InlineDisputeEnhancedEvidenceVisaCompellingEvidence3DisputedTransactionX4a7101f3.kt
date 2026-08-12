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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Branch {
  DisputeVisaCompellingEvidence3DisputedTransaction,
}

public sealed class InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3NoMatchException(
  message: String,
) : InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3DecodingException(message)

internal data class InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Inspection(
  public val matchesDisputeVisaCompellingEvidence3DisputedTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesDisputeVisaCompellingEvidence3DisputedTransaction).count { it }
}

/**
 * Disputed transaction details for Visa Compelling Evidence 3.0 evidence submission.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_evidence_visa_compelling_evidence3/properties/dispu
 * ted_transaction
 */
@Serializable(with = InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3.Serializer::class)
public class InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Inspection,
) {
  public val disputeVisaCompellingEvidence3DisputedTransaction:
      DisputeVisaCompellingEvidence3DisputedTransactionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDisputeVisaCompellingEvidence3DisputedTransaction) json.decodeFromJsonElement<DisputeVisaCompellingEvidence3DisputedTransactionView>(raw) else null }

  public val matchedBranches:
      Set<InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Branch>
    get() = buildSet {
      if (inspection.matchesDisputeVisaCompellingEvidence3DisputedTransaction) add(InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Branch.DisputeVisaCompellingEvidence3DisputedTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3 {
      val inspection = inspectInlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3NoMatchException("InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3) {
      encoder.requireJsonEncoder("InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3(element: JsonElement): InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Inspection {
  val raw = element as? JsonObject ?: return InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Inspection(
    matchesDisputeVisaCompellingEvidence3DisputedTransaction = false,
    failures = listOf("DisputeVisaCompellingEvidence3DisputedTransaction: expected JSON object"),
  )
  val matchesDisputeVisaCompellingEvidence3DisputedTransaction = true
  return InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3Inspection(
    matchesDisputeVisaCompellingEvidence3DisputedTransaction = matchesDisputeVisaCompellingEvidence3DisputedTransaction,
    failures = buildList {
      if (!matchesDisputeVisaCompellingEvidence3DisputedTransaction) add("DisputeVisaCompellingEvidence3DisputedTransaction: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
