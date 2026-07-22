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
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/no_valid_authorization/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8? = null

        public var explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd? =
            null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d =
            InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d(
                additionalDocumentation = additionalDocumentation,
                explanation = explanation,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX1bf316c8>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX8f638dbd>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d",
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

public fun inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d =
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X9201138d.build(block)
