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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99(
    /**
     * Customer information for this payment.
     */
    public val customerDetails: InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363? = null,
    /**
     * Shipping information for this payment.
     */
    public val shippingDetails: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede? = null,
) {
    public class Builder {
        /**
         * Customer information for this payment.
         */
        public var customerDetails:
            InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8? =
            null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363? = null

        /**
         * Shipping information for this payment.
         */
        public var shippingDetails:
            InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede? = null

        public fun build(): InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99 =
            InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99(
                customerDetails = customerDetails,
                description = description,
                expand = expand,
                metadata = metadata,
                shippingDetails = shippingDetails,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99 must be a JSON object",
                    )
            return InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99(
                customerDetails =
                    rawObject["customer_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5>(
                                it,
                            )
                    },
                description =
                    rawObject["description"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormDescriptionX4df09bd8>(
                            it,
                        )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363>(it)
                    },
                shippingDetails =
                    rawObject["shipping_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99(
    block: InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99 =
    InlineV1PaymentRecordsReportPaymentAttemptInformationalPostRequestFormX9b704c99.build(block)
