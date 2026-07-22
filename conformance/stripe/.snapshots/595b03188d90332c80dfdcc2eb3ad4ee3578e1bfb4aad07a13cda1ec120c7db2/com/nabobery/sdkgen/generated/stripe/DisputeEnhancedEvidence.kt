package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_evidence
 */
@Serializable(with = DisputeEnhancedEvidence.Serializer::class)
public class DisputeEnhancedEvidence(
    public val mastercardCompliance: DisputeEnhancedEvidenceMastercardCompliance? = null,
    public val visaCompellingEvidence3: DisputeEnhancedEvidenceVisaCompellingEvidence3? = null,
    public val visaCompliance: DisputeEnhancedEvidenceVisaCompliance? = null,
) {
    public class Builder {
        public var mastercardCompliance: DisputeEnhancedEvidenceMastercardCompliance? = null

        public var visaCompellingEvidence3: DisputeEnhancedEvidenceVisaCompellingEvidence3? = null

        public var visaCompliance: DisputeEnhancedEvidenceVisaCompliance? = null

        public fun build(): DisputeEnhancedEvidence =
            DisputeEnhancedEvidence(
                mastercardCompliance = mastercardCompliance,
                visaCompellingEvidence3 = visaCompellingEvidence3,
                visaCompliance = visaCompliance,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputeEnhancedEvidence = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputeEnhancedEvidence> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputeEnhancedEvidence {
            val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEvidence")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DisputeEnhancedEvidence must be a JSON object")
            return DisputeEnhancedEvidence(
                mastercardCompliance =
                    rawObject["mastercard_compliance"]?.let {
                        json.decodeFromJsonElement<DisputeEnhancedEvidenceMastercardCompliance>(it)
                    },
                visaCompellingEvidence3 =
                    rawObject["visa_compelling_evidence_3"]?.let {
                        json.decodeFromJsonElement<DisputeEnhancedEvidenceVisaCompellingEvidence3>(it)
                    },
                visaCompliance =
                    rawObject["visa_compliance"]?.let {
                        json.decodeFromJsonElement<DisputeEnhancedEvidenceVisaCompliance>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DisputeEnhancedEvidence,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEvidence")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mastercardCompliance?.let { put("mastercard_compliance", json.encodeToJsonElement(it)) }
                    value.visaCompellingEvidence3?.let {
                        put(
                            "visa_compelling_evidence_3",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.visaCompliance?.let { put("visa_compliance", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputeEnhancedEvidence(block: DisputeEnhancedEvidence.Builder.() -> Unit): DisputeEnhancedEvidence =
    DisputeEnhancedEvidence.build(block)
