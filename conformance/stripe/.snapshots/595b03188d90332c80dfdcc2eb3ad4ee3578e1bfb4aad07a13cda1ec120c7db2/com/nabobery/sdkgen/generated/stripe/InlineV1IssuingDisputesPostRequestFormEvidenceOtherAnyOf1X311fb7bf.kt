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
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX34c1cf1a? = null,
    public val productDescription: InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b? = null,
    public val productType: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ProductTypeXcff7dcb7? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2? = null

        public var explanation:
            InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX34c1cf1a? = null

        public var productDescription:
            InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b? = null

        public var productType:
            InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ProductTypeXcff7dcb7? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf =
            InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf(
                additionalDocumentation = additionalDocumentation,
                explanation = explanation,
                productDescription = productDescription,
                productType = productType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX34c1cf1a>(
                                it,
                            )
                    },
                productDescription =
                    rawObject["product_description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b>(
                                it,
                            )
                    },
                productType =
                    rawObject["product_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ProductTypeXcff7dcb7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
                    value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
                    value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf =
    InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1X311fb7bf.build(block)
