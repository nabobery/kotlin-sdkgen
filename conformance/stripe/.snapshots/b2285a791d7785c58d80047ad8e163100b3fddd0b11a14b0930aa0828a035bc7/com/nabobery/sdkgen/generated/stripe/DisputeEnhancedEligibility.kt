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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility
 */
@Serializable(with = DisputeEnhancedEligibility.Serializer::class)
public class DisputeEnhancedEligibility(
  public val mastercardCompliance: DisputeEnhancedEligibilityMastercardCompliance? = null,
  public val visaCompellingEvidence3: DisputeEnhancedEligibilityVisaCompellingEvidence3? = null,
  public val visaCompliance: DisputeEnhancedEligibilityVisaCompliance? = null,
) {
  public class Builder {
    public var mastercardCompliance: DisputeEnhancedEligibilityMastercardCompliance? = null

    public var visaCompellingEvidence3: DisputeEnhancedEligibilityVisaCompellingEvidence3? = null

    public var visaCompliance: DisputeEnhancedEligibilityVisaCompliance? = null

    public fun build(): DisputeEnhancedEligibility = DisputeEnhancedEligibility(
      mastercardCompliance = mastercardCompliance,
      visaCompellingEvidence3 = visaCompellingEvidence3,
      visaCompliance = visaCompliance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEnhancedEligibility = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DisputeEnhancedEligibility> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEnhancedEligibility {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEligibility")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEnhancedEligibility must be a JSON object")
      return DisputeEnhancedEligibility(
        mastercardCompliance = rawObject["mastercard_compliance"]?.let { json.decodeFromJsonElement<DisputeEnhancedEligibilityMastercardCompliance>(it) },
        visaCompellingEvidence3 = rawObject["visa_compelling_evidence_3"]?.let { json.decodeFromJsonElement<DisputeEnhancedEligibilityVisaCompellingEvidence3>(it) },
        visaCompliance = rawObject["visa_compliance"]?.let { json.decodeFromJsonElement<DisputeEnhancedEligibilityVisaCompliance>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEnhancedEligibility) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEligibility")
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

public fun disputeEnhancedEligibility(block: DisputeEnhancedEligibility.Builder.() -> Unit): DisputeEnhancedEligibility = DisputeEnhancedEligibility.build(block)
