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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_merchandise_not_as_described_evidence
 */
@Serializable(with = IssuingDisputeMerchandiseNotAsDescribedEvidence.Serializer::class)
public class IssuingDisputeMerchandiseNotAsDescribedEvidence(
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the
     * dispute.
     */
    public val additionalDocumentation: InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0? = null,
    /**
     * Explanation of why the cardholder is disputing this transaction.
     */
    public val explanation: String? = null,
    /**
     * Date when the product was received.
     */
    public val receivedAt: Int? = null,
    /**
     * Description of the cardholder's attempt to return the product.
     */
    public val returnDescription: String? = null,
    /**
     * Result of cardholder's attempt to return the product.
     */
    public val returnStatus: InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985? = null,
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
            InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0? = null

        /**
         * Explanation of why the cardholder is disputing this transaction.
         */
        public var explanation: String? = null

        /**
         * Date when the product was received.
         */
        public var receivedAt: Int? = null

        /**
         * Description of the cardholder's attempt to return the product.
         */
        public var returnDescription: String? = null

        /**
         * Result of cardholder's attempt to return the product.
         */
        public var returnStatus:
            InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985? = null

        /**
         * Date when the product was returned or attempted to be returned.
         */
        public var returnedAt: Int? = null

        public fun build(): IssuingDisputeMerchandiseNotAsDescribedEvidence =
            IssuingDisputeMerchandiseNotAsDescribedEvidence(
                additionalDocumentation = additionalDocumentation,
                explanation = explanation,
                receivedAt = receivedAt,
                returnDescription = returnDescription,
                returnStatus = returnStatus,
                returnedAt = returnedAt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingDisputeMerchandiseNotAsDescribedEvidence =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingDisputeMerchandiseNotAsDescribedEvidence> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingDisputeMerchandiseNotAsDescribedEvidence {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeMerchandiseNotAsDescribedEvidence")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "IssuingDisputeMerchandiseNotAsDescribedEvidence must be a JSON object",
                    )
            return IssuingDisputeMerchandiseNotAsDescribedEvidence(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0?>(
                                element,
                            )
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
                receivedAt =
                    rawObject["received_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                returnDescription =
                    rawObject["return_description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                returnStatus =
                    rawObject["return_status"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985?>(
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
            `value`: IssuingDisputeMerchandiseNotAsDescribedEvidence,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeMerchandiseNotAsDescribedEvidence")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", it) }
                    value.receivedAt?.let { put("received_at", json.encodeToJsonElement(it)) }
                    value.returnDescription?.let { put("return_description", it) }
                    value.returnStatus?.let { put("return_status", json.encodeToJsonElement(it)) }
                    value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingDisputeMerchandiseNotAsDescribedEvidence(
    block: IssuingDisputeMerchandiseNotAsDescribedEvidence.Builder.() -> Unit,
): IssuingDisputeMerchandiseNotAsDescribedEvidence = IssuingDisputeMerchandiseNotAsDescribedEvidence.build(block)
