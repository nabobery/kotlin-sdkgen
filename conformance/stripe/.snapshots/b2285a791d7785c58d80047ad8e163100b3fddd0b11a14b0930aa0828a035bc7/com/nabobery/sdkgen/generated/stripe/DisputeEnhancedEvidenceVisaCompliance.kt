package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_evidence_visa_compliance
 */
@Serializable(with = DisputeEnhancedEvidenceVisaCompliance.Serializer::class)
public class DisputeEnhancedEvidenceVisaCompliance(
  /**
   * A field acknowledging the fee incurred when countering a Visa compliance dispute. If this field is set to true,
   * evidence can be submitted for the compliance dispute. Stripe collects a 500 USD (or local equivalent) amount to
   * cover the network costs associated with resolving compliance disputes. Stripe refunds the 500 USD network fee if
   * you win the dispute.
   */
  public val feeAcknowledged: Boolean,
) {
  public class Builder {
    private var feeAcknowledgedValue: Boolean? = null

    public var feeAcknowledged: Boolean
      get() = requireNotNull(feeAcknowledgedValue) { "feeAcknowledged is required" }
      set(`value`) {
        feeAcknowledgedValue = value
      }

    public fun build(): DisputeEnhancedEvidenceVisaCompliance {
      check(feeAcknowledgedValue != null) { "feeAcknowledged is required" }
      return DisputeEnhancedEvidenceVisaCompliance(
        feeAcknowledged = feeAcknowledged,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEnhancedEvidenceVisaCompliance = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DisputeEnhancedEvidenceVisaCompliance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEnhancedEvidenceVisaCompliance {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEvidenceVisaCompliance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEnhancedEvidenceVisaCompliance must be a JSON object")
      val feeAcknowledged = json.decodeRequired<Boolean>(rawObject, "fee_acknowledged")
      return DisputeEnhancedEvidenceVisaCompliance(
        feeAcknowledged = feeAcknowledged,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEnhancedEvidenceVisaCompliance) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEvidenceVisaCompliance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("fee_acknowledged", json.encodeToJsonElement(value.feeAcknowledged))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeEnhancedEvidenceVisaCompliance(block: DisputeEnhancedEvidenceVisaCompliance.Builder.() -> Unit): DisputeEnhancedEvidenceVisaCompliance = DisputeEnhancedEvidenceVisaCompliance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeEnhancedEvidenceVisaCompliance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
