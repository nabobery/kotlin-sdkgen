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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750(
    public val billingThresholds: InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670? = null,
    public val clearUsage: Boolean? = null,
    public val deleted: Boolean? = null,
    public val discounts: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca? = null,
    public val id: String? = null,
    public val metadata: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84? = null,
    public val price: String? = null,
    public val priceData: InlineV1InvoicesCreatePreviewPostRequestFormPriceDataXd9ecc710? = null,
    public val quantity: Int? = null,
    public val taxRates: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70? = null,
) {
    public class Builder {
        public var billingThresholds:
            InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670? = null

        public var clearUsage: Boolean? = null

        public var deleted: Boolean? = null

        public var discounts: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca? = null

        public var id: String? = null

        public var metadata:
            InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84? = null

        public var price: String? = null

        public var priceData: InlineV1InvoicesCreatePreviewPostRequestFormPriceDataXd9ecc710? = null

        public var quantity: Int? = null

        public var taxRates:
            InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70? = null

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750 =
            InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750(
                billingThresholds = billingThresholds,
                clearUsage = clearUsage,
                deleted = deleted,
                discounts = discounts,
                id = id,
                metadata = metadata,
                price = price,
                priceData = priceData,
                quantity = quantity,
                taxRates = taxRates,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750 must be a JSON object",
                    )
            return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750(
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670>(
                                it,
                            )
                    },
                clearUsage = rawObject["clear_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca>(it)
                    },
                id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormPriceDataXd9ecc710>(it)
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.clearUsage?.let { put("clear_usage", json.encodeToJsonElement(it)) }
                    value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.id?.let { put("id", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750(
    block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750 =
    InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750.build(block)
