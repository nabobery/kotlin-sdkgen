package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_evidence_visa_compelling_evidence3
 */
@Serializable(with = DisputeEnhancedEvidenceVisaCompellingEvidence3.Serializer::class)
public class DisputeEnhancedEvidenceVisaCompellingEvidence3(
  priorUndisputedTransactions: List<DisputeVisaCompellingEvidence3PriorUndisputedTransaction>,
  /**
   * Disputed transaction details for Visa Compelling Evidence 3.0 evidence submission.
   */
  public val disputedTransaction:
      InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3? = null,
) {
  /**
   * List of exactly two prior undisputed transaction objects for Visa Compelling Evidence 3.0 evidence submission.
   */
  public val priorUndisputedTransactions:
      List<DisputeVisaCompellingEvidence3PriorUndisputedTransaction> =
      priorUndisputedTransactions.toList()

  public class Builder {
    private var priorUndisputedTransactionsValue:
        List<DisputeVisaCompellingEvidence3PriorUndisputedTransaction>? = null

    public var priorUndisputedTransactions:
        List<DisputeVisaCompellingEvidence3PriorUndisputedTransaction>
      get() = requireNotNull(priorUndisputedTransactionsValue) { "priorUndisputedTransactions is required" }.toList()
      set(`value`) {
        priorUndisputedTransactionsValue = value.toList()
      }

    /**
     * Disputed transaction details for Visa Compelling Evidence 3.0 evidence submission.
     */
    public var disputedTransaction:
        InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3? = null

    public fun build(): DisputeEnhancedEvidenceVisaCompellingEvidence3 {
      check(priorUndisputedTransactionsValue != null) { "priorUndisputedTransactions is required" }
      return DisputeEnhancedEvidenceVisaCompellingEvidence3(
        priorUndisputedTransactions = priorUndisputedTransactions,
        disputedTransaction = disputedTransaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEnhancedEvidenceVisaCompellingEvidence3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputeEnhancedEvidenceVisaCompellingEvidence3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEnhancedEvidenceVisaCompellingEvidence3 {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEvidenceVisaCompellingEvidence3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEnhancedEvidenceVisaCompellingEvidence3 must be a JSON object")
      val priorUndisputedTransactions = json.decodeRequired<List<DisputeVisaCompellingEvidence3PriorUndisputedTransaction>>(rawObject, "prior_undisputed_transactions")
      return DisputeEnhancedEvidenceVisaCompellingEvidence3(
        priorUndisputedTransactions = priorUndisputedTransactions,
        disputedTransaction = rawObject["disputed_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDisputeEnhancedEvidenceVisaCompellingEvidence3DisputedTransactionX4a7101f3?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEnhancedEvidenceVisaCompellingEvidence3) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEvidenceVisaCompellingEvidence3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prior_undisputed_transactions", json.encodeToJsonElement(value.priorUndisputedTransactions))
        value.disputedTransaction?.let { put("disputed_transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeEnhancedEvidenceVisaCompellingEvidence3(block: DisputeEnhancedEvidenceVisaCompellingEvidence3.Builder.() -> Unit): DisputeEnhancedEvidenceVisaCompellingEvidence3 = DisputeEnhancedEvidenceVisaCompellingEvidence3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeEnhancedEvidenceVisaCompellingEvidence3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
