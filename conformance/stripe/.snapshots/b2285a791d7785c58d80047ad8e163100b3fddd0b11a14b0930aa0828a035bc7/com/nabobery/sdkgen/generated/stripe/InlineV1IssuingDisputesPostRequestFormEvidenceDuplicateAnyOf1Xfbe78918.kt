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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134? = null,
  public val cardStatement:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementX465a104b? = null,
  public val cashReceipt:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e? = null,
  public val checkImage:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXb2b43892? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089? = null,
  public val originalTransaction: String? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134? = null

    public var cardStatement:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementX465a104b? = null

    public var cashReceipt:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e? = null

    public var checkImage:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXb2b43892? = null

    public var explanation:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089? = null

    public var originalTransaction: String? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918(
      additionalDocumentation = additionalDocumentation,
      cardStatement = cardStatement,
      cashReceipt = cashReceipt,
      checkImage = checkImage,
      explanation = explanation,
      originalTransaction = originalTransaction,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXa749d134>(it) },
        cardStatement = rawObject["card_statement"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementX465a104b>(it) },
        cashReceipt = rawObject["cash_receipt"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e>(it) },
        checkImage = rawObject["check_image"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXb2b43892>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX76315089>(it) },
        originalTransaction = rawObject["original_transaction"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.cardStatement?.let { put("card_statement", json.encodeToJsonElement(it)) }
        value.cashReceipt?.let { put("cash_receipt", json.encodeToJsonElement(it)) }
        value.checkImage?.let { put("check_image", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
        value.originalTransaction?.let { put("original_transaction", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918(block: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918.build(block)
