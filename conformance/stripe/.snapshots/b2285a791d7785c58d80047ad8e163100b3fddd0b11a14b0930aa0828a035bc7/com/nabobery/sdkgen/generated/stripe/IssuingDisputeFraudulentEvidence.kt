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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_fraudulent_evidence
 */
@Serializable(with = IssuingDisputeFraudulentEvidence.Serializer::class)
public class IssuingDisputeFraudulentEvidence(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
   * dispute.
   */
  public val additionalDocumentation:
      InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448? = null,
  /**
   * Explanation of why the cardholder is disputing this transaction.
   */
  public val explanation: String? = null,
) {
  public class Builder {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public var additionalDocumentation:
        InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448? = null

    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public var explanation: String? = null

    public fun build(): IssuingDisputeFraudulentEvidence = IssuingDisputeFraudulentEvidence(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeFraudulentEvidence = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingDisputeFraudulentEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeFraudulentEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeFraudulentEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeFraudulentEvidence must be a JSON object")
      return IssuingDisputeFraudulentEvidence(
        additionalDocumentation = rawObject["additional_documentation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448?>(element) },
        explanation = rawObject["explanation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeFraudulentEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeFraudulentEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeFraudulentEvidence(block: IssuingDisputeFraudulentEvidence.Builder.() -> Unit): IssuingDisputeFraudulentEvidence = IssuingDisputeFraudulentEvidence.build(block)
