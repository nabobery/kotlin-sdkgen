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
 * ed/schema/properties/evidence/properties/fraudulent/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/fraudulent/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXc5960901? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXc5960901? = null

    public var explanation:
        InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXc5960901>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationX1937664d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780(block: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780.build(block)
