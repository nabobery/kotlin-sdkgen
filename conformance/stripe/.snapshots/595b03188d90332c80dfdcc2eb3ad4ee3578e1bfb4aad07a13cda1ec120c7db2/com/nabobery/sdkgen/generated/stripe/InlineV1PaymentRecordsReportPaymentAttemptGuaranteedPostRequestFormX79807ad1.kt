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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_guaranteed/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_guaranteed/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1(
    /**
     * When the reported payment was guaranteed. Measured in seconds since the Unix epoch.
     */
    public val guaranteedAt: Int,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1PaymentRecordsRepof263PostRequestFormMetadataX4e494f41? = null,
) {
    public class Builder {
        private var guaranteedAtValue: Int? = null

        public var guaranteedAt: Int
            get() = requireNotNull(guaranteedAtValue) { "guaranteedAt is required" }
            set(`value`) {
                guaranteedAtValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1PaymentRecordsRepof263PostRequestFormMetadataX4e494f41? = null

        public fun build(): InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 {
            check(guaranteedAtValue != null) { "guaranteedAt is required" }
            return InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1(
                guaranteedAt = guaranteedAt,
                expand = expand,
                metadata = metadata,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 must be a JSON object",
                    )
            val guaranteedAt = json.decodeRequired<Int>(rawObject, "guaranteed_at")
            return InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1(
                guaranteedAt = guaranteedAt,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsRepof263PostRequestFormMetadataX4e494f41>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("guaranteed_at", json.encodeToJsonElement(value.guaranteedAt))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1(
    block: InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 =
    InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
