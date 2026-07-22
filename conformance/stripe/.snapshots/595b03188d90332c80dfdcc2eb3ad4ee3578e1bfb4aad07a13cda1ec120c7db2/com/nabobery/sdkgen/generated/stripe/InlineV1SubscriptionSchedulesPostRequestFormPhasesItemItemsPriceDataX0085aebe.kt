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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe(
    public val currency: String,
    public val product: String,
    public val recurring: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8,
    public val taxBehavior: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed? = null,
    public val unitAmount: Int? = null,
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var productValue: String? = null

        public var product: String
            get() = requireNotNull(productValue) { "product is required" }
            set(`value`) {
                productValue = value
            }

        private var recurringValue:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8? = null

        public var recurring:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8
            get() = requireNotNull(recurringValue) { "recurring is required" }
            set(`value`) {
                recurringValue = value
            }

        public var taxBehavior:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe {
            check(currencyValue != null) { "currency is required" }
            check(productValue != null) { "product is required" }
            check(recurringValue != null) { "recurring is required" }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe(
                currency = currency,
                product = product,
                recurring = recurring,
                taxBehavior = taxBehavior,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val product = json.decodeRequired<String>(rawObject, "product")
            val recurring =
                json
                    .decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8>(
                        rawObject,
                        "recurring",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe(
                currency = currency,
                product = product,
                recurring = recurring,
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    put("product", value.product)
                    put("recurring", json.encodeToJsonElement(value.recurring))
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
