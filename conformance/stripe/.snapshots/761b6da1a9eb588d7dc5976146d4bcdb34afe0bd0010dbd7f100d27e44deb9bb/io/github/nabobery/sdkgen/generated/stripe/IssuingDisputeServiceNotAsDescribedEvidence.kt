package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_service_not_as_described_evidence
 */
@Serializable(with = IssuingDisputeServiceNotAsDescribedEvidence.Serializer::class)
public class IssuingDisputeServiceNotAsDescribedEvidence(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
   * dispute.
   */
  public val additionalDocumentation:
      InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4? = null,
  /**
   * Date when order was canceled.
   */
  public val canceledAt: Int? = null,
  /**
   * Reason for canceling the order.
   */
  public val cancellationReason: String? = null,
  /**
   * Explanation of why the cardholder is disputing this transaction.
   */
  public val explanation: String? = null,
  /**
   * Date when the product was received.
   */
  public val receivedAt: Int? = null,
) {
  public class Builder {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public var additionalDocumentation:
        InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4? = null

    /**
     * Date when order was canceled.
     */
    public var canceledAt: Int? = null

    /**
     * Reason for canceling the order.
     */
    public var cancellationReason: String? = null

    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public var explanation: String? = null

    /**
     * Date when the product was received.
     */
    public var receivedAt: Int? = null

    public fun build(): IssuingDisputeServiceNotAsDescribedEvidence = IssuingDisputeServiceNotAsDescribedEvidence(
      additionalDocumentation = additionalDocumentation,
      canceledAt = canceledAt,
      cancellationReason = cancellationReason,
      explanation = explanation,
      receivedAt = receivedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeServiceNotAsDescribedEvidence = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingDisputeServiceNotAsDescribedEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeServiceNotAsDescribedEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeServiceNotAsDescribedEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeServiceNotAsDescribedEvidence must be a JSON object")
      return IssuingDisputeServiceNotAsDescribedEvidence(
        additionalDocumentation = rawObject["additional_documentation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4?>(element) },
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        cancellationReason = rawObject["cancellation_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        explanation = rawObject["explanation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        receivedAt = rawObject["received_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeServiceNotAsDescribedEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeServiceNotAsDescribedEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.cancellationReason?.let { put("cancellation_reason", it) }
        value.explanation?.let { put("explanation", it) }
        value.receivedAt?.let { put("received_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeServiceNotAsDescribedEvidence(block: IssuingDisputeServiceNotAsDescribedEvidence.Builder.() -> Unit): IssuingDisputeServiceNotAsDescribedEvidence = IssuingDisputeServiceNotAsDescribedEvidence.build(block)
