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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_other_evidence
 */
@Serializable(with = IssuingDisputeOtherEvidence.Serializer::class)
public class IssuingDisputeOtherEvidence(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
   * dispute.
   */
  public val additionalDocumentation:
      InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba? = null,
  /**
   * Explanation of why the cardholder is disputing this transaction.
   */
  public val explanation: String? = null,
  /**
   * Description of the merchandise or service that was purchased.
   */
  public val productDescription: String? = null,
  /**
   * Whether the product was a merchandise or service.
   */
  public val productType: InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5? = null,
) {
  public class Builder {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public var additionalDocumentation:
        InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba? = null

    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public var explanation: String? = null

    /**
     * Description of the merchandise or service that was purchased.
     */
    public var productDescription: String? = null

    /**
     * Whether the product was a merchandise or service.
     */
    public var productType: InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5? = null

    public fun build(): IssuingDisputeOtherEvidence = IssuingDisputeOtherEvidence(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
      productDescription = productDescription,
      productType = productType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeOtherEvidence = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingDisputeOtherEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeOtherEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeOtherEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeOtherEvidence must be a JSON object")
      return IssuingDisputeOtherEvidence(
        additionalDocumentation = rawObject["additional_documentation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba?>(element) },
        explanation = rawObject["explanation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        productDescription = rawObject["product_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        productType = rawObject["product_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeOtherEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeOtherEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", it) }
        value.productDescription?.let { put("product_description", it) }
        value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeOtherEvidence(block: IssuingDisputeOtherEvidence.Builder.() -> Unit): IssuingDisputeOtherEvidence = IssuingDisputeOtherEvidence.build(block)
