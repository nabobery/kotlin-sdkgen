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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb5b6b018? = null,
    public val canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX03f8b635? = null,
    public val cancellationPolicyProvided:
        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7204f72d? = null,
    public val cancellationReason: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69? = null,
    public val expectedAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationX613b6aa2? = null,
    public val productDescription: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75? = null,
    public val productType: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b? = null,
    public val returnStatus: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae? = null,
    public val returnedAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtXc6a230d3? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb5b6b018? = null

        public var canceledAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX03f8b635? = null

        public var cancellationPolicyProvided:
            InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7204f72d? = null

        public var cancellationReason:
            InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69? = null

        public var expectedAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3? = null

        public var explanation:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationX613b6aa2? = null

        public var productDescription:
            InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75? = null

        public var productType:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b? = null

        public var returnStatus:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae? = null

        public var returnedAt:
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtXc6a230d3? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c =
            InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c(
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb5b6b018>(
                                it,
                            )
                    },
                canceledAt =
                    rawObject["canceled_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX03f8b635>(
                                it,
                            )
                    },
                cancellationPolicyProvided =
                    rawObject["cancellation_policy_provided"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7204f72d>(
                                it,
                            )
                    },
                cancellationReason =
                    rawObject["cancellation_reason"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX5ddabd69>(
                                it,
                            )
                    },
                expectedAt =
                    rawObject["expected_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtX42c6cda3>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExplanationX613b6aa2>(
                                it,
                            )
                    },
                productDescription =
                    rawObject["product_description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75>(
                                it,
                            )
                    },
                productType =
                    rawObject["product_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b>(
                                it,
                            )
                    },
                returnStatus =
                    rawObject["return_status"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae>(
                                it,
                            )
                    },
                returnedAt =
                    rawObject["returned_at"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ReturnedAtXc6a230d3>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c",
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

public fun inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c =
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c.build(block)
