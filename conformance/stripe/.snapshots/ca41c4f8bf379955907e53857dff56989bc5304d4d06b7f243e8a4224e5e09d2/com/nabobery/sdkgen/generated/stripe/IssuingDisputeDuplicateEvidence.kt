package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_duplicate_evidence
 */
@Serializable(with = IssuingDisputeDuplicateEvidence.Serializer::class)
public class IssuingDisputeDuplicateEvidence(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
   * dispute.
   */
  public val additionalDocumentation:
      InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67? = null,
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the card statement showing that the
   * product had already been paid for.
   */
  public val cardStatement: InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb? = null,
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the receipt showing that the product
   * had been paid for in cash.
   */
  public val cashReceipt: InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c? = null,
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Image of the front and back of the check that
   * was used to pay for the product.
   */
  public val checkImage: InlineIssuingDisputeDuplicateEvidenceCheckImageX4d2bc900? = null,
  /**
   * Explanation of why the cardholder is disputing this transaction.
   */
  public val explanation: String? = null,
  /**
   * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two or more transactions that
   * are copies of each other, this is original undisputed one.
   */
  public val originalTransaction: String? = null,
) {
  public class Builder {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public var additionalDocumentation:
        InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67? = null

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the card statement showing that the
     * product had already been paid for.
     */
    public var cardStatement: InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb? = null

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the receipt showing that the product
     * had been paid for in cash.
     */
    public var cashReceipt: InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c? = null

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Image of the front and back of the check that
     * was used to pay for the product.
     */
    public var checkImage: InlineIssuingDisputeDuplicateEvidenceCheckImageX4d2bc900? = null

    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public var explanation: String? = null

    /**
     * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two or more transactions that
     * are copies of each other, this is original undisputed one.
     */
    public var originalTransaction: String? = null

    public fun build(): IssuingDisputeDuplicateEvidence = IssuingDisputeDuplicateEvidence(
      additionalDocumentation = additionalDocumentation,
      cardStatement = cardStatement,
      cashReceipt = cashReceipt,
      checkImage = checkImage,
      explanation = explanation,
      originalTransaction = originalTransaction,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeDuplicateEvidence = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingDisputeDuplicateEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeDuplicateEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeDuplicateEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeDuplicateEvidence must be a JSON object")
      return IssuingDisputeDuplicateEvidence(
        additionalDocumentation = rawObject["additional_documentation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67?>(element) },
        cardStatement = rawObject["card_statement"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb?>(element) },
        cashReceipt = rawObject["cash_receipt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c?>(element) },
        checkImage = rawObject["check_image"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeDuplicateEvidenceCheckImageX4d2bc900?>(element) },
        explanation = rawObject["explanation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        originalTransaction = rawObject["original_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeDuplicateEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeDuplicateEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.cardStatement?.let { put("card_statement", json.encodeToJsonElement(it)) }
        value.cashReceipt?.let { put("cash_receipt", json.encodeToJsonElement(it)) }
        value.checkImage?.let { put("check_image", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", it) }
        value.originalTransaction?.let { put("original_transaction", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeDuplicateEvidence(block: IssuingDisputeDuplicateEvidence.Builder.() -> Unit): IssuingDisputeDuplicateEvidence = IssuingDisputeDuplicateEvidence.build(block)
