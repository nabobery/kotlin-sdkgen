package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_mastercard_compliance
 */
@Serializable(with = DisputeEnhancedEligibilityMastercardCompliance.Serializer::class)
public class DisputeEnhancedEligibilityMastercardCompliance(
  /**
   * Mastercard compliance eligibility status.
   */
  public val status: InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7,
) {
  public class Builder {
    private var statusValue: InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7? =
        null

    public var status: InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): DisputeEnhancedEligibilityMastercardCompliance {
      check(statusValue != null) { "status is required" }
      return DisputeEnhancedEligibilityMastercardCompliance(
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEnhancedEligibilityMastercardCompliance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputeEnhancedEligibilityMastercardCompliance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEnhancedEligibilityMastercardCompliance {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEligibilityMastercardCompliance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEnhancedEligibilityMastercardCompliance must be a JSON object")
      val status = json.decodeRequired<InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7>(rawObject, "status")
      return DisputeEnhancedEligibilityMastercardCompliance(
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEnhancedEligibilityMastercardCompliance) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEligibilityMastercardCompliance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeEnhancedEligibilityMastercardCompliance(block: DisputeEnhancedEligibilityMastercardCompliance.Builder.() -> Unit): DisputeEnhancedEligibilityMastercardCompliance = DisputeEnhancedEligibilityMastercardCompliance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeEnhancedEligibilityMastercardCompliance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
