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
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6(
  public val mastercardCompliance:
      InlineV1DisputesPostRequestFormEvidenceMastercardComplianceX37cd8536? = null,
  public val visaCompellingEvidence3:
      InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109? = null,
  public val visaCompliance:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4? = null,
) {
  public class Builder {
    public var mastercardCompliance:
        InlineV1DisputesPostRequestFormEvidenceMastercardComplianceX37cd8536? = null

    public var visaCompellingEvidence3:
        InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109? = null

    public var visaCompliance:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4? = null

    public fun build(): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6(
      mastercardCompliance = mastercardCompliance,
      visaCompellingEvidence3 = visaCompellingEvidence3,
      visaCompliance = visaCompliance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 must be a JSON object")
      return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6(
        mastercardCompliance = rawObject["mastercard_compliance"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceMastercardComplianceX37cd8536>(it) },
        visaCompellingEvidence3 = rawObject["visa_compelling_evidence_3"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109>(it) },
        visaCompliance = rawObject["visa_compliance"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mastercardCompliance?.let { put("mastercard_compliance", json.encodeToJsonElement(it)) }
        value.visaCompellingEvidence3?.let { put("visa_compelling_evidence_3", json.encodeToJsonElement(it)) }
        value.visaCompliance?.let { put("visa_compliance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6(block: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6.Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6 = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1X592f0bf6.build(block)
