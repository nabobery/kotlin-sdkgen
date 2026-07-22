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
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce? = null,
    public val canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6? = null,
    public val cancellationPolicyProvided:
        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d? = null,
    public val cancellationReason: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX787a6295? = null,
    public val expectedAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationXab468a10? = null,
    public val productDescription: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX3265ca9f? = null,
    public val productType: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeX6dc5ba76? = null,
    public val returnStatus: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a? = null,
    public val returnedAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtX528d4269? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce? = null

        public var canceledAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6? = null

        public var cancellationPolicyProvided:
            InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d? = null

        public var cancellationReason:
            InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX787a6295? = null

        public var expectedAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e? = null

        public var explanation:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationXab468a10? = null

        public var productDescription:
            InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX3265ca9f? = null

        public var productType:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeX6dc5ba76? = null

        public var returnStatus:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a? = null

        public var returnedAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtX528d4269? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 =
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836(
                additionalDocumentation = additionalDocumentation,
                canceledAt = canceledAt,
                cancellationPolicyProvided = cancellationPolicyProvided,
                cancellationReason = cancellationReason,
                expectedAt = expectedAt,
                explanation = explanation,
                productDescription = productDescription,
                productType = productType,
                returnStatus = returnStatus,
                returnedAt = returnedAt,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX3c24c2ce>(
                                it,
                            )
                    },
                canceledAt =
                    rawObject["canceled_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6>(
                                it,
                            )
                    },
                cancellationPolicyProvided =
                    rawObject["cancellation_policy_provided"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d>(
                                it,
                            )
                    },
                cancellationReason =
                    rawObject["cancellation_reason"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX787a6295>(
                                it,
                            )
                    },
                expectedAt =
                    rawObject["expected_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationXab468a10>(
                                it,
                            )
                    },
                productDescription =
                    rawObject["product_description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX3265ca9f>(
                                it,
                            )
                    },
                productType =
                    rawObject["product_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeX6dc5ba76>(
                                it,
                            )
                    },
                returnStatus =
                    rawObject["return_status"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a>(
                                it,
                            )
                    },
                returnedAt =
                    rawObject["returned_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtX528d4269>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
                    value.cancellationPolicyProvided?.let {
                        put(
                            "cancellation_policy_provided",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
                    value.expectedAt?.let { put("expected_at", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
                    value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
                    value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
                    value.returnStatus?.let { put("return_status", json.encodeToJsonElement(it)) }
                    value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 =
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836.build(block)
