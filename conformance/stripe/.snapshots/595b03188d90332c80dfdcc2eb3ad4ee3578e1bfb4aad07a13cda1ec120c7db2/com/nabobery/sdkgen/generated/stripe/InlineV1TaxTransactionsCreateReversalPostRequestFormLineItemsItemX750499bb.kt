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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/line_items/items
 */
@Serializable(with = InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb.Serializer::class)
public class InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb(
    public val amount: Int,
    public val amountTax: Int,
    public val originalLineItem: String,
    public val reference: String,
    public val metadata: Map<String, String>? = null,
    public val quantity: Int? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountTaxValue: Int? = null

        public var amountTax: Int
            get() = requireNotNull(amountTaxValue) { "amountTax is required" }
            set(`value`) {
                amountTaxValue = value
            }

        private var originalLineItemValue: String? = null

        public var originalLineItem: String
            get() = requireNotNull(originalLineItemValue) { "originalLineItem is required" }
            set(`value`) {
                originalLineItemValue = value
            }

        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        public var metadata: Map<String, String>? = null

        public var quantity: Int? = null

        public fun build(): InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb {
            check(amountValue != null) { "amount is required" }
            check(amountTaxValue != null) { "amountTax is required" }
            check(originalLineItemValue != null) { "originalLineItem is required" }
            check(referenceValue != null) { "reference is required" }
            return InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb(
                amount = amount,
                amountTax = amountTax,
                originalLineItem = originalLineItem,
                reference = reference,
                metadata = metadata,
                quantity = quantity,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
            val originalLineItem = json.decodeRequired<String>(rawObject, "original_line_item")
            val reference = json.decodeRequired<String>(rawObject, "reference")
            return InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb(
                amount = amount,
                amountTax = amountTax,
                originalLineItem = originalLineItem,
                reference = reference,
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_tax", json.encodeToJsonElement(value.amountTax))
                    put("original_line_item", value.originalLineItem)
                    put("reference", value.reference)
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb(
    block: InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb.Builder.() -> Unit,
): InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb =
    InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
