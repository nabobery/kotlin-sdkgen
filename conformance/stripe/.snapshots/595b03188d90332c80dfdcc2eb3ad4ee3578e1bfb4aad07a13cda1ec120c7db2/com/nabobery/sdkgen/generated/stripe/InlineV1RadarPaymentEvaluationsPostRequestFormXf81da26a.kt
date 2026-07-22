package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a.Serializer::class)
public class InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a(
    /**
     * Details about the customer associated with the payment evaluation.
     */
    public val customerDetails: InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f,
    /**
     * Details about the payment.
     */
    public val paymentDetails: InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1,
    /**
     * Details about the Client Device Metadata to associate with the payment evaluation.
     */
    public val clientDeviceMetadataDetails:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
) {
    public class Builder {
        private var customerDetailsValue:
            InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f? = null

        public var customerDetails:
            InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f
            get() = requireNotNull(customerDetailsValue) { "customerDetails is required" }
            set(`value`) {
                customerDetailsValue = value
            }

        private var paymentDetailsValue:
            InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1? = null

        public var paymentDetails: InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1
            get() = requireNotNull(paymentDetailsValue) { "paymentDetails is required" }
            set(`value`) {
                paymentDetailsValue = value
            }

        /**
         * Details about the Client Device Metadata to associate with the payment evaluation.
         */
        public var clientDeviceMetadataDetails:
            InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a {
            check(customerDetailsValue != null) { "customerDetails is required" }
            check(paymentDetailsValue != null) { "paymentDetails is required" }
            return InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a(
                customerDetails = customerDetails,
                paymentDetails = paymentDetails,
                clientDeviceMetadataDetails = clientDeviceMetadataDetails,
                expand = expand,
                metadata = metadata,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a must be a JSON object",
                    )
            val customerDetails =
                json.decodeRequired<InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f>(
                    rawObject,
                    "customer_details",
                )
            val paymentDetails =
                json.decodeRequired<InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1>(
                    rawObject,
                    "payment_details",
                )
            return InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a(
                customerDetails = customerDetails,
                paymentDetails = paymentDetails,
                clientDeviceMetadataDetails =
                    rawObject["client_device_metadata_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormClientDeviceMetadata4d9aXde40d348>(
                                it,
                            )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("customer_details", json.encodeToJsonElement(value.customerDetails))
                    put("payment_details", json.encodeToJsonElement(value.paymentDetails))
                    value.clientDeviceMetadataDetails?.let {
                        put(
                            "client_device_metadata_details",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a(
    block: InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a.Builder.() -> Unit,
): InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a =
    InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
