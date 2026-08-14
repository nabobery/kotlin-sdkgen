package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe? = null,
  public val cardStatement:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f? = null,
  public val cashReceipt:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX76f7eea4? = null,
  public val checkImage:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXe3fe2b64? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX3c81df35? = null,
  public val originalTransaction: String? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe? = null

    public var cardStatement:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f? = null

    public var cashReceipt:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX76f7eea4? = null

    public var checkImage:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXe3fe2b64? = null

    public var explanation:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX3c81df35? = null

    public var originalTransaction: String? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869(
      additionalDocumentation = additionalDocumentation,
      cardStatement = cardStatement,
      cashReceipt = cashReceipt,
      checkImage = checkImage,
      explanation = explanation,
      originalTransaction = originalTransaction,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX4a927abe>(it) },
        cardStatement = rawObject["card_statement"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f>(it) },
        cashReceipt = rawObject["cash_receipt"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX76f7eea4>(it) },
        checkImage = rawObject["check_image"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1CheckImageXe3fe2b64>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateExplanationX3c81df35>(it) },
        originalTransaction = rawObject["original_transaction"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869")
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

public fun inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869(block: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869 = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1X3a48e869.build(block)
