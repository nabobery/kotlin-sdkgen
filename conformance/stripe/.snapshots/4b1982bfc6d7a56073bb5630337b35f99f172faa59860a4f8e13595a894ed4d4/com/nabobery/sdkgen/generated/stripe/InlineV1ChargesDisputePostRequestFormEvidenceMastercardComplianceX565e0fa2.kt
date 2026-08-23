package com.nabobery.sdkgen.generated.stripe

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
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/mastercard_compliance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/mastercard_compliance
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2(
  public val feeAcknowledged: Boolean? = null,
) {
  public class Builder {
    public var feeAcknowledged: Boolean? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2 = InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2(
      feeAcknowledged = feeAcknowledged,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2 must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2(
        feeAcknowledged = rawObject["fee_acknowledged"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.feeAcknowledged?.let { put("fee_acknowledged", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2(block: InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2 = InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2.build(block)
