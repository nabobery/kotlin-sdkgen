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
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6.Serializer::class)
public class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6(
    public val upTo: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074,
    public val flatAmount: Int? = null,
    public val flatAmountDecimal: String? = null,
    public val unitAmount: Int? = null,
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        private var upToValue:
            InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074? = null

        public var upTo: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074
            get() = requireNotNull(upToValue) { "upTo is required" }
            set(`value`) {
                upToValue = value
            }

        public var flatAmount: Int? = null

        public var flatAmountDecimal: String? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 {
            check(upToValue != null) { "upTo is required" }
            return InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6(
                upTo = upTo,
                flatAmount = flatAmount,
                flatAmountDecimal = flatAmountDecimal,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 must be a JSON object",
                    )
            val upTo =
                json.decodeRequired<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074>(
                    rawObject,
                    "up_to",
                )
            return InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6(
                upTo = upTo,
                flatAmount = rawObject["flat_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                flatAmountDecimal = rawObject["flat_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("up_to", json.encodeToJsonElement(value.upTo))
                    value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
                    value.flatAmountDecimal?.let { put("flat_amount_decimal", it) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6(
    block: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6.Builder.() -> Unit,
): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 =
    InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
