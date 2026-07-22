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
 * Represents a line item to be displayed on the reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_line_item
 */
@Serializable(with = TerminalReaderReaderResourceLineItem.Serializer::class)
public class TerminalReaderReaderResourceLineItem(
    /**
     * The amount of the line item. A positive integer in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public val amount: Int,
    /**
     * Description of the line item.
     */
    public val description: String,
    /**
     * The quantity of the line item.
     */
    public val quantity: Int,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var descriptionValue: String? = null

        public var description: String
            get() = requireNotNull(descriptionValue) { "description is required" }
            set(`value`) {
                descriptionValue = value
            }

        private var quantityValue: Int? = null

        public var quantity: Int
            get() = requireNotNull(quantityValue) { "quantity is required" }
            set(`value`) {
                quantityValue = value
            }

        public fun build(): TerminalReaderReaderResourceLineItem {
            check(amountValue != null) { "amount is required" }
            check(descriptionValue != null) { "description is required" }
            check(quantityValue != null) { "quantity is required" }
            return TerminalReaderReaderResourceLineItem(
                amount = amount,
                description = description,
                quantity = quantity,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceLineItem =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceLineItem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceLineItem {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceLineItem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceLineItem must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val description = json.decodeRequired<String>(rawObject, "description")
            val quantity = json.decodeRequired<Int>(rawObject, "quantity")
            return TerminalReaderReaderResourceLineItem(
                amount = amount,
                description = description,
                quantity = quantity,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceLineItem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceLineItem")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("description", value.description)
                    put("quantity", json.encodeToJsonElement(value.quantity))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceLineItem(
    block: TerminalReaderReaderResourceLineItem.Builder.() -> Unit,
): TerminalReaderReaderResourceLineItem = TerminalReaderReaderResourceLineItem.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TerminalReaderReaderResourceLineItem is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
