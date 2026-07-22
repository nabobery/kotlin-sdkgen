package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compliance
 */
@Serializable(with = DisputeEnhancedEligibilityVisaCompliance.Serializer::class)
public class DisputeEnhancedEligibilityVisaCompliance(
    /**
     * Visa compliance eligibility status.
     */
    public val status: InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa,
) {
    public class Builder {
        private var statusValue: InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa? = null

        public var status: InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        public fun build(): DisputeEnhancedEligibilityVisaCompliance {
            check(statusValue != null) { "status is required" }
            return DisputeEnhancedEligibilityVisaCompliance(
                status = status,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputeEnhancedEligibilityVisaCompliance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputeEnhancedEligibilityVisaCompliance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputeEnhancedEligibilityVisaCompliance {
            val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEligibilityVisaCompliance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DisputeEnhancedEligibilityVisaCompliance must be a JSON object")
            val status =
                json.decodeRequired<InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa>(
                    rawObject,
                    "status",
                )
            return DisputeEnhancedEligibilityVisaCompliance(
                status = status,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DisputeEnhancedEligibilityVisaCompliance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEligibilityVisaCompliance")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("status", json.encodeToJsonElement(value.status))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputeEnhancedEligibilityVisaCompliance(
    block: DisputeEnhancedEligibilityVisaCompliance.Builder.() -> Unit,
): DisputeEnhancedEligibilityVisaCompliance = DisputeEnhancedEligibilityVisaCompliance.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "DisputeEnhancedEligibilityVisaCompliance is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
