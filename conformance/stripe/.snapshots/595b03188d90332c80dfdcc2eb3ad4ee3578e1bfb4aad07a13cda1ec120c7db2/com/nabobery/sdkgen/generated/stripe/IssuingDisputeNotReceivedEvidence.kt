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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_not_received_evidence
 */
@Serializable(with = IssuingDisputeNotReceivedEvidence.Serializer::class)
public class IssuingDisputeNotReceivedEvidence(
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public val additionalDocumentation: InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95? = null,
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
    public val productType: InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8? = null,
) {
    public class Builder {
        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
         * dispute.
         */
        public var additionalDocumentation:
            InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95? = null

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
        public var productType: InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8? = null

        public fun build(): IssuingDisputeNotReceivedEvidence =
            IssuingDisputeNotReceivedEvidence(
                additionalDocumentation = additionalDocumentation,
                expectedAt = expectedAt,
                explanation = explanation,
                productDescription = productDescription,
                productType = productType,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingDisputeNotReceivedEvidence = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingDisputeNotReceivedEvidence> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingDisputeNotReceivedEvidence {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeNotReceivedEvidence")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingDisputeNotReceivedEvidence must be a JSON object")
            return IssuingDisputeNotReceivedEvidence(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95?>(
                                    element,
                                )
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
                            json.decodeFromJsonElement<InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingDisputeNotReceivedEvidence,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeNotReceivedEvidence")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.expectedAt?.let { put("expected_at", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", it) }
                    value.productDescription?.let { put("product_description", it) }
                    value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingDisputeNotReceivedEvidence(
    block: IssuingDisputeNotReceivedEvidence.Builder.() -> Unit,
): IssuingDisputeNotReceivedEvidence = IssuingDisputeNotReceivedEvidence.build(block)
