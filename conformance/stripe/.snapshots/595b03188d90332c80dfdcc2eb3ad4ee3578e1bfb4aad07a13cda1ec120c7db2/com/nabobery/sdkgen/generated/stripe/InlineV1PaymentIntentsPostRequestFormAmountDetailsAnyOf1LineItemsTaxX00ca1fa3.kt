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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3(
    public val totalTaxAmount: Int,
) {
    public class Builder {
        private var totalTaxAmountValue: Int? = null

        public var totalTaxAmount: Int
            get() = requireNotNull(totalTaxAmountValue) { "totalTaxAmount is required" }
            set(`value`) {
                totalTaxAmountValue = value
            }

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 {
            check(totalTaxAmountValue != null) { "totalTaxAmount is required" }
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3(
                totalTaxAmount = totalTaxAmount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 must be a JSON object",
                    )
            val totalTaxAmount = json.decodeRequired<Int>(rawObject, "total_tax_amount")
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3(
                totalTaxAmount = totalTaxAmount,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("total_tax_amount", json.encodeToJsonElement(value.totalTaxAmount))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsTaxX00ca1fa3 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
