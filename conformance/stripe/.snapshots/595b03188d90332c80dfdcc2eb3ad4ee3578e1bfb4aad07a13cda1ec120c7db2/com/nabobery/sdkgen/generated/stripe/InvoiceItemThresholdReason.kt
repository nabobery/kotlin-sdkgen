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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_item_threshold_reason
 */
@Serializable(with = InvoiceItemThresholdReason.Serializer::class)
public class InvoiceItemThresholdReason(
    lineItemIds: List<String>,
    /**
     * The quantity threshold boundary that applied to the given line item.
     */
    public val usageGte: Int,
) {
    /**
     * The IDs of the line items that triggered the threshold invoice.
     */
    public val lineItemIds: List<String> = lineItemIds.toList()

    public class Builder {
        private var lineItemIdsValue: List<String>? = null

        public var lineItemIds: List<String>
            get() = requireNotNull(lineItemIdsValue) { "lineItemIds is required" }
            set(`value`) {
                lineItemIdsValue = value
            }

        private var usageGteValue: Int? = null

        public var usageGte: Int
            get() = requireNotNull(usageGteValue) { "usageGte is required" }
            set(`value`) {
                usageGteValue = value
            }

        public fun build(): InvoiceItemThresholdReason {
            check(lineItemIdsValue != null) { "lineItemIds is required" }
            check(usageGteValue != null) { "usageGte is required" }
            return InvoiceItemThresholdReason(
                lineItemIds = lineItemIds,
                usageGte = usageGte,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoiceItemThresholdReason = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoiceItemThresholdReason> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoiceItemThresholdReason {
            val jsonDecoder = decoder.requireJsonDecoder("InvoiceItemThresholdReason")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoiceItemThresholdReason must be a JSON object")
            val lineItemIds = json.decodeRequired<List<String>>(rawObject, "line_item_ids")
            val usageGte = json.decodeRequired<Int>(rawObject, "usage_gte")
            return InvoiceItemThresholdReason(
                lineItemIds = lineItemIds,
                usageGte = usageGte,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoiceItemThresholdReason,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoiceItemThresholdReason")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("line_item_ids", json.encodeToJsonElement(value.lineItemIds))
                    put("usage_gte", json.encodeToJsonElement(value.usageGte))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoiceItemThresholdReason(
    block: InvoiceItemThresholdReason.Builder.() -> Unit,
): InvoiceItemThresholdReason = InvoiceItemThresholdReason.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InvoiceItemThresholdReason is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
