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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f(
    public val customUnitAmount: InlineV1PricesPostRequestFormCurrencyOptionsCustomUnitAmountX5dc1d270? = null,
    public val taxBehavior: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243? = null,
    public val tiers: List<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0>? = null,
    public val unitAmount: Int? = null,
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        public var customUnitAmount:
            InlineV1PricesPostRequestFormCurrencyOptionsCustomUnitAmountX5dc1d270? = null

        public var taxBehavior:
            InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243? = null

        public var tiers:
            List<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0>? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f =
            InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f(
                customUnitAmount = customUnitAmount,
                taxBehavior = taxBehavior,
                tiers = tiers,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f must be a JSON object",
                    )
            return InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f(
                customUnitAmount =
                    rawObject["custom_unit_amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsCustomUnitAmountX5dc1d270>(
                                it,
                            )
                    },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243>(
                                it,
                            )
                    },
                tiers =
                    rawObject["tiers"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0>>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customUnitAmount?.let { put("custom_unit_amount", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.tiers?.let { put("tiers", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f(
    block: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f.Builder.() -> Unit,
): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f =
    InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f.build(block)
