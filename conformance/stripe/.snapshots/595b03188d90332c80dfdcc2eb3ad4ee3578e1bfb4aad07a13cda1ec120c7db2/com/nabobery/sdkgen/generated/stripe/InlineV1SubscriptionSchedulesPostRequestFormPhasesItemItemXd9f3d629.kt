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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629(
    public val discountable: Boolean? = null,
    public val discounts: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX9c355106>? = null,
    public val metadata: Map<String, String>? = null,
    public val period: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXb0e8d835? = null,
    public val price: String? = null,
    public val priceData: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataXe98e1dbb? = null,
    public val quantity: Int? = null,
    public val taxRates: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa? = null,
) {
    public class Builder {
        public var discountable: Boolean? = null

        public var discounts: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX9c355106>? =
            null

        public var metadata: Map<String, String>? = null

        public var period: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXb0e8d835? = null

        public var price: String? = null

        public var priceData: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataXe98e1dbb? =
            null

        public var quantity: Int? = null

        public var taxRates: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa? =
            null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629 =
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629(
                discountable = discountable,
                discounts = discounts,
                metadata = metadata,
                period = period,
                price = price,
                priceData = priceData,
                quantity = quantity,
                taxRates = taxRates,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629 must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629(
                discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX9c355106>>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                period =
                    rawObject["period"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXb0e8d835>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataXe98e1dbb>(
                                it,
                            )
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.period?.let { put("period", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629 =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629.build(block)
