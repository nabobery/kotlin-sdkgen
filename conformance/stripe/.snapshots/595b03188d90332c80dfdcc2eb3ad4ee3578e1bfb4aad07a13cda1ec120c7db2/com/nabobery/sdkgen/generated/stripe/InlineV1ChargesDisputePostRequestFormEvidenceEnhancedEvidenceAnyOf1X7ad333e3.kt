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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3(
    public val mastercardCompliance: InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2? = null,
    public val visaCompellingEvidence3:
        InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252? = null,
    public val visaCompliance: InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa? = null,
) {
    public class Builder {
        public var mastercardCompliance:
            InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2? = null

        public var visaCompellingEvidence3:
            InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252? = null

        public var visaCompliance: InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa? =
            null

        public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 =
            InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3(
                mastercardCompliance = mastercardCompliance,
                visaCompellingEvidence3 = visaCompellingEvidence3,
                visaCompliance = visaCompliance,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 must be a JSON object",
                    )
            return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3(
                mastercardCompliance =
                    rawObject["mastercard_compliance"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceMastercardComplianceX565e0fa2>(
                                it,
                            )
                    },
                visaCompellingEvidence3 =
                    rawObject["visa_compelling_evidence_3"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceVisaCompellingEvidence3Xc06fb252>(
                                it,
                            )
                    },
                visaCompliance =
                    rawObject["visa_compliance"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceVisaComplianceXd23169fa>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3",
                )
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

public fun inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3(
    block: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3.Builder.() -> Unit,
): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 =
    InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3.build(block)
