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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormX119d6614.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormX119d6614(
    /**
     * Unique identifier of the Climate product.
     */
    public val product: String,
    /**
     * Requested amount of carbon removal units. Either this or `metric_tons` must be specified.
     */
    public val amount: Int? = null,
    /**
     * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not set.
     */
    public val beneficiary: InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589? = null,
    /**
     * Request currency for the order as a three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a supported [settlement currency for
     * your account](https://stripe.com/docs/currencies). If omitted, the account's default currency will be used.
     */
    public val currency: String? = null,
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
    /**
     * Requested number of tons for the order. Either this or `amount` must be specified.
     */
    public val metricTons: String? = null,
) {
    public class Builder {
        private var productValue: String? = null

        public var product: String
            get() = requireNotNull(productValue) { "product is required" }
            set(`value`) {
                productValue = value
            }

        /**
         * Requested amount of carbon removal units. Either this or `metric_tons` must be specified.
         */
        public var amount: Int? = null

        /**
         * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not
         * set.
         */
        public var beneficiary: InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589? = null

        /**
         * Request currency for the order as a three-letter [ISO currency
         * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a supported [settlement currency
         * for your account](https://stripe.com/docs/currencies). If omitted, the account's default currency will be used.
         */
        public var currency: String? = null

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

        /**
         * Requested number of tons for the order. Either this or `amount` must be specified.
         */
        public var metricTons: String? = null

        public fun build(): InlineV1ClimateOrdersPostRequestFormX119d6614 {
            check(productValue != null) { "product is required" }
            return InlineV1ClimateOrdersPostRequestFormX119d6614(
                product = product,
                amount = amount,
                beneficiary = beneficiary,
                currency = currency,
                expand = expand,
                metadata = metadata,
                metricTons = metricTons,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormX119d6614 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormX119d6614> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormX119d6614 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormX119d6614")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ClimateOrdersPostRequestFormX119d6614 must be a JSON object",
                    )
            val product = json.decodeRequired<String>(rawObject, "product")
            return InlineV1ClimateOrdersPostRequestFormX119d6614(
                product = product,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                beneficiary =
                    rawObject["beneficiary"]?.let {
                        json.decodeFromJsonElement<InlineV1ClimateOrdersPostRequestFormBeneficiaryX3f801589>(it)
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                metricTons = rawObject["metric_tons"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ClimateOrdersPostRequestFormX119d6614,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormX119d6614")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("product", value.product)
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.beneficiary?.let { put("beneficiary", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.metricTons?.let { put("metric_tons", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ClimateOrdersPostRequestFormX119d6614(
    block: InlineV1ClimateOrdersPostRequestFormX119d6614.Builder.() -> Unit,
): InlineV1ClimateOrdersPostRequestFormX119d6614 = InlineV1ClimateOrdersPostRequestFormX119d6614.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ClimateOrdersPostRequestFormX119d6614 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
