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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compliance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compliance
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa(
  public val feeAcknowledged: Boolean? = null,
) {
  public class Builder {
    public var feeAcknowledged: Boolean? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa = InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa(
      feeAcknowledged = feeAcknowledged,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa(
        feeAcknowledged = rawObject["fee_acknowledged"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.feeAcknowledged?.let { put("fee_acknowledged", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa(block: InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa = InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa.build(block)
