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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXac0f6ad5? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXac0f6ad5? = null

        public var explanation:
            InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d =
            InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d(
                additionalDocumentation = additionalDocumentation,
                explanation = explanation,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXac0f6ad5>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d =
    InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d.build(block)
