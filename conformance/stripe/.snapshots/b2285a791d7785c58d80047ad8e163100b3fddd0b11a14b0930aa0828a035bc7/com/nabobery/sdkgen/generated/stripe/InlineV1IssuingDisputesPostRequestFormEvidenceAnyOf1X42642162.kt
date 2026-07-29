package com.nabobery.sdkgen.generated.stripe

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
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX9ff55b1f? = null,
  public val canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtX45bd3060? = null,
  public val cancellationReason:
      InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed? = null,
  public val receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX9ff55b1f? = null

    public var canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtX45bd3060? = null

    public var cancellationReason:
        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8? = null

    public var explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed? =
        null

    public var receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162(
      additionalDocumentation = additionalDocumentation,
      canceledAt = canceledAt,
      cancellationReason = cancellationReason,
      explanation = explanation,
      receivedAt = receivedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX9ff55b1f>(it) },
        canceledAt = rawObject["canceled_at"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtX45bd3060>(it) },
        cancellationReason = rawObject["cancellation_reason"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX1f3c00ed>(it) },
        receivedAt = rawObject["received_at"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
        value.receivedAt?.let { put("received_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162(block: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162.build(block)
