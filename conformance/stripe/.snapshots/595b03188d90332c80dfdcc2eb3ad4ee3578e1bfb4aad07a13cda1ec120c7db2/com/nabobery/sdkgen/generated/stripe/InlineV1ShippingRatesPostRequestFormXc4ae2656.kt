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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormXc4ae2656.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormXc4ae2656(
    /**
     * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
     */
    public val displayName: String,
    /**
     * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
     * CheckoutSessions.
     */
    public val deliveryEstimate: InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
     */
    public val fixedAmount: InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
     * or `unspecified`.
     */
    public val taxBehavior: InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88? = null,
    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
     */
    public val taxCode: String? = null,
    /**
     * The type of calculation to use on the shipping rate.
     */
    public val type: InlineV1ShippingRatesPostRequestFormTypeX43c932eb? = null,
) {
    public class Builder {
        private var displayNameValue: String? = null

        public var displayName: String
            get() = requireNotNull(displayNameValue) { "displayName is required" }
            set(`value`) {
                displayNameValue = value
            }

        /**
         * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
         * CheckoutSessions.
         */
        public var deliveryEstimate: InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37? =
            null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
         */
        public var fixedAmount: InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`,
         * `exclusive`, or `unspecified`.
         */
        public var taxBehavior: InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88? = null

        /**
         * A [tax code](https://docs.stripe.com/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
         */
        public var taxCode: String? = null

        /**
         * The type of calculation to use on the shipping rate.
         */
        public var type: InlineV1ShippingRatesPostRequestFormTypeX43c932eb? = null

        public fun build(): InlineV1ShippingRatesPostRequestFormXc4ae2656 {
            check(displayNameValue != null) { "displayName is required" }
            return InlineV1ShippingRatesPostRequestFormXc4ae2656(
                displayName = displayName,
                deliveryEstimate = deliveryEstimate,
                expand = expand,
                fixedAmount = fixedAmount,
                metadata = metadata,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormXc4ae2656 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormXc4ae2656> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormXc4ae2656 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormXc4ae2656")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ShippingRatesPostRequestFormXc4ae2656 must be a JSON object",
                    )
            val displayName = json.decodeRequired<String>(rawObject, "display_name")
            return InlineV1ShippingRatesPostRequestFormXc4ae2656(
                displayName = displayName,
                deliveryEstimate =
                    rawObject["delivery_estimate"]?.let {
                        json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                fixedAmount =
                    rawObject["fixed_amount"]?.let {
                        json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011>(it)
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88>(it)
                    },
                taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
                type =
                    rawObject["type"]?.let {
                        json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormTypeX43c932eb>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ShippingRatesPostRequestFormXc4ae2656,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormXc4ae2656")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("display_name", value.displayName)
                    value.deliveryEstimate?.let { put("delivery_estimate", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.fixedAmount?.let { put("fixed_amount", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.taxCode?.let { put("tax_code", it) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ShippingRatesPostRequestFormXc4ae2656(
    block: InlineV1ShippingRatesPostRequestFormXc4ae2656.Builder.() -> Unit,
): InlineV1ShippingRatesPostRequestFormXc4ae2656 = InlineV1ShippingRatesPostRequestFormXc4ae2656.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ShippingRatesPostRequestFormXc4ae2656 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
