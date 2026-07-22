package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_canceled_evidence
 */
@Serializable(with = IssuingDisputeCanceledEvidence.Serializer::class)
public class IssuingDisputeCanceledEvidence(
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public val additionalDocumentation: InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e? = null,
    /**
     * Date when order was canceled.
     */
    public val canceledAt: Int? = null,
    /**
     * Whether the cardholder was provided with a cancellation policy.
     */
    public val cancellationPolicyProvided: Boolean? = null,
    /**
     * Reason for canceling the order.
     */
    public val cancellationReason: String? = null,
    /**
     * Date when the cardholder expected to receive the product.
     */
    public val expectedAt: Int? = null,
    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public val explanation: String? = null,
    /**
     * Description of the merchandise or service that was purchased.
     */
    public val productDescription: String? = null,
    /**
     * Whether the product was a merchandise or service.
     */
    public val productType: InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230? = null,
    /**
     * Result of cardholder's attempt to return the product.
     */
    public val returnStatus: InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee? = null,
    /**
     * Date when the product was returned or attempted to be returned.
     */
    public val returnedAt: Int? = null,
) {
    public class Builder {
        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
         * dispute.
         */
        public var additionalDocumentation:
            InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e? = null

        /**
         * Date when order was canceled.
         */
        public var canceledAt: Int? = null

        /**
         * Whether the cardholder was provided with a cancellation policy.
         */
        public var cancellationPolicyProvided: Boolean? = null

        /**
         * Reason for canceling the order.
         */
        public var cancellationReason: String? = null

        /**
         * Date when the cardholder expected to receive the product.
         */
        public var expectedAt: Int? = null

        /**
         * Explanation of why the cardholder is disputing this transaction.
         */
        public var explanation: String? = null

        /**
         * Description of the merchandise or service that was purchased.
         */
        public var productDescription: String? = null

        /**
         * Whether the product was a merchandise or service.
         */
        public var productType: InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230? = null

        /**
         * Result of cardholder's attempt to return the product.
         */
        public var returnStatus: InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee? = null

        /**
         * Date when the product was returned or attempted to be returned.
         */
        public var returnedAt: Int? = null

        public fun build(): IssuingDisputeCanceledEvidence =
            IssuingDisputeCanceledEvidence(
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
        public fun build(block: Builder.() -> Unit): IssuingDisputeCanceledEvidence = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingDisputeCanceledEvidence> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingDisputeCanceledEvidence {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeCanceledEvidence")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingDisputeCanceledEvidence must be a JSON object")
            return IssuingDisputeCanceledEvidence(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e?>(
                                    element,
                                )
                        }
                    },
                canceledAt =
                    rawObject["canceled_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                cancellationPolicyProvided =
                    rawObject["cancellation_policy_provided"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
                cancellationReason =
                    rawObject["cancellation_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                expectedAt =
                    rawObject["expected_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                explanation =
                    rawObject["explanation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                productDescription =
                    rawObject["product_description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                productType =
                    rawObject["product_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230?>(
                                element,
                            )
                        }
                    },
                returnStatus =
                    rawObject["return_status"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee?>(
                                element,
                            )
                        }
                    },
                returnedAt =
                    rawObject["returned_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingDisputeCanceledEvidence,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeCanceledEvidence")
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
                    value.cancellationReason?.let { put("cancellation_reason", it) }
                    value.expectedAt?.let { put("expected_at", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", it) }
                    value.productDescription?.let { put("product_description", it) }
                    value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
                    value.returnStatus?.let { put("return_status", json.encodeToJsonElement(it)) }
                    value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingDisputeCanceledEvidence(
    block: IssuingDisputeCanceledEvidence.Builder.() -> Unit,
): IssuingDisputeCanceledEvidence = IssuingDisputeCanceledEvidence.build(block)
