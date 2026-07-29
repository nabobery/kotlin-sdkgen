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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_no_valid_authorization_evidence
 */
@Serializable(with = IssuingDisputeNoValidAuthorizationEvidence.Serializer::class)
public class IssuingDisputeNoValidAuthorizationEvidence(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
   * dispute.
   */
  public val additionalDocumentation:
      InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846? = null,
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
        InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846? = null

    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public var explanation: String? = null

    public fun build(): IssuingDisputeNoValidAuthorizationEvidence = IssuingDisputeNoValidAuthorizationEvidence(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeNoValidAuthorizationEvidence = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingDisputeNoValidAuthorizationEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeNoValidAuthorizationEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeNoValidAuthorizationEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeNoValidAuthorizationEvidence must be a JSON object")
      return IssuingDisputeNoValidAuthorizationEvidence(
        additionalDocumentation = rawObject["additional_documentation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846?>(element) },
        explanation = rawObject["explanation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeNoValidAuthorizationEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeNoValidAuthorizationEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeNoValidAuthorizationEvidence(block: IssuingDisputeNoValidAuthorizationEvidence.Builder.() -> Unit): IssuingDisputeNoValidAuthorizationEvidence = IssuingDisputeNoValidAuthorizationEvidence.build(block)
