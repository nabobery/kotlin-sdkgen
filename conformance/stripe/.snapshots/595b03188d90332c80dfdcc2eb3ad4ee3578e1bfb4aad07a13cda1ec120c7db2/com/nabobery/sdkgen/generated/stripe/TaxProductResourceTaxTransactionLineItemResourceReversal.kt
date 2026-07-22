package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class TaxProductResourceTaxTransactionLineItemResourceReversalView(
    @SerialName("original_line_item")
    public val originalLineItem: String,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_transaction_line_item_resource_reversal
 */
@Serializable(with = TaxProductResourceTaxTransactionLineItemResourceReversal.Serializer::class)
public class TaxProductResourceTaxTransactionLineItemResourceReversal(
    /**
     * The `id` of the line item to reverse in the original transaction.
     */
    public val originalLineItem: String,
) {
    public class Builder {
        private var originalLineItemValue: String? = null

        public var originalLineItem: String
            get() = requireNotNull(originalLineItemValue) { "originalLineItem is required" }
            set(`value`) {
                originalLineItemValue = value
            }

        public fun build(): TaxProductResourceTaxTransactionLineItemResourceReversal {
            check(originalLineItemValue != null) { "originalLineItem is required" }
            return TaxProductResourceTaxTransactionLineItemResourceReversal(
                originalLineItem = originalLineItem,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceTaxTransactionLineItemResourceReversal =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxTransactionLineItemResourceReversal> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxTransactionLineItemResourceReversal {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxTransactionLineItemResourceReversal")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductResourceTaxTransactionLineItemResourceReversal must be a JSON object",
                    )
            val originalLineItem = json.decodeRequired<String>(rawObject, "original_line_item")
            return TaxProductResourceTaxTransactionLineItemResourceReversal(
                originalLineItem = originalLineItem,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxTransactionLineItemResourceReversal,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxTransactionLineItemResourceReversal")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("original_line_item", value.originalLineItem)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxTransactionLineItemResourceReversal(
    block: TaxProductResourceTaxTransactionLineItemResourceReversal.Builder.() -> Unit,
): TaxProductResourceTaxTransactionLineItemResourceReversal =
    TaxProductResourceTaxTransactionLineItemResourceReversal.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceTaxTransactionLineItemResourceReversal is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
