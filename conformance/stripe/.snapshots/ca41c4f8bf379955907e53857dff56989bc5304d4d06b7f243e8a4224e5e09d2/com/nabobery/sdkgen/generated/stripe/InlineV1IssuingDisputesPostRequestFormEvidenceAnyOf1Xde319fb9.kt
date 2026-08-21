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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94? = null,
  public val receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000? = null,
  public val returnDescription:
      InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530? = null,
  public val returnStatus:
      InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX33901326? = null,
  public val returnedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b? = null

    public var explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94? =
        null

    public var receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000? = null

    public var returnDescription:
        InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530? = null

    public var returnStatus: InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX33901326? =
        null

    public var returnedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
      receivedAt = receivedAt,
      returnDescription = returnDescription,
      returnStatus = returnStatus,
      returnedAt = returnedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94>(it) },
        receivedAt = rawObject["received_at"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000>(it) },
        returnDescription = rawObject["return_description"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReturnDescriptionX11d85530>(it) },
        returnStatus = rawObject["return_status"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX33901326>(it) },
        returnedAt = rawObject["returned_at"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX744ccf9e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
        value.receivedAt?.let { put("received_at", json.encodeToJsonElement(it)) }
        value.returnDescription?.let { put("return_description", json.encodeToJsonElement(it)) }
        value.returnStatus?.let { put("return_status", json.encodeToJsonElement(it)) }
        value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9(block: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9.build(block)
