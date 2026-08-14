package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compliance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compliance
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4(
  public val feeAcknowledged: Boolean? = null,
) {
  public class Builder {
    public var feeAcknowledged: Boolean? = null

    public fun build(): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4 = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4(
      feeAcknowledged = feeAcknowledged,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4 must be a JSON object")
      return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4(
        feeAcknowledged = rawObject["fee_acknowledged"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.feeAcknowledged?.let { put("fee_acknowledged", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4(block: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4.Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4 = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceVisaComplianceXa302ceb4.build(block)
