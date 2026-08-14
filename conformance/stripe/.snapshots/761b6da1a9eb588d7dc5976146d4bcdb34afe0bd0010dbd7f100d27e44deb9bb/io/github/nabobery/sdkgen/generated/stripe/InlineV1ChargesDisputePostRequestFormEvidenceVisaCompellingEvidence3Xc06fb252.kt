package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252(
  public val disputedTransaction:
      InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1? = null,
  priorUndisputedTransactions: List<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32>? = null,
) {
  public val priorUndisputedTransactions:
      List<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32>? =
      priorUndisputedTransactions?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var disputedTransaction:
        InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1? = null

    private var priorUndisputedTransactionsValue:
        List<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32>? =
        null

    public var priorUndisputedTransactions:
        List<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32>?
      get() = priorUndisputedTransactionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        priorUndisputedTransactionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252 = InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252(
      disputedTransaction = disputedTransaction,
      priorUndisputedTransactions = priorUndisputedTransactions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252 must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252(
        disputedTransaction = rawObject["disputed_transaction"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1>(it) },
        priorUndisputedTransactions = rawObject["prior_undisputed_transactions"]?.let { json.decodeFromJsonElement<List<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.disputedTransaction?.let { put("disputed_transaction", json.encodeToJsonElement(it)) }
        value.priorUndisputedTransactions?.let { put("prior_undisputed_transactions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252(block: InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252 = InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252.build(block)
