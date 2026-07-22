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
import kotlin.String
import kotlin.Unit

@Serializable
public data class InvoicesResourceFromInvoiceView(
    public val action: String,
    public val invoice: InlineInvoicesResourceFromInvoiceInvoiceX162d3783,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_from_invoice
 */
@Serializable(with = InvoicesResourceFromInvoice.Serializer::class)
public class InvoicesResourceFromInvoice(
    /**
     * The relation between this invoice and the cloned invoice
     */
    public val action: String,
    /**
     * The invoice that was cloned.
     */
    public val invoice: InlineInvoicesResourceFromInvoiceInvoiceX162d3783,
) {
    public class Builder {
        private var actionValue: String? = null

        public var action: String
            get() = requireNotNull(actionValue) { "action is required" }
            set(`value`) {
                actionValue = value
            }

        private var invoiceValue: InlineInvoicesResourceFromInvoiceInvoiceX162d3783? = null

        public var invoice: InlineInvoicesResourceFromInvoiceInvoiceX162d3783
            get() = requireNotNull(invoiceValue) { "invoice is required" }
            set(`value`) {
                invoiceValue = value
            }

        public fun build(): InvoicesResourceFromInvoice {
            check(actionValue != null) { "action is required" }
            check(invoiceValue != null) { "invoice is required" }
            return InvoicesResourceFromInvoice(
                action = action,
                invoice = invoice,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicesResourceFromInvoice = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicesResourceFromInvoice> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicesResourceFromInvoice {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceFromInvoice")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicesResourceFromInvoice must be a JSON object")
            val action = json.decodeRequired<String>(rawObject, "action")
            val invoice = json.decodeRequired<InlineInvoicesResourceFromInvoiceInvoiceX162d3783>(rawObject, "invoice")
            return InvoicesResourceFromInvoice(
                action = action,
                invoice = invoice,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicesResourceFromInvoice,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceFromInvoice")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("action", value.action)
                    put("invoice", json.encodeToJsonElement(value.invoice))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicesResourceFromInvoice(
    block: InvoicesResourceFromInvoice.Builder.() -> Unit,
): InvoicesResourceFromInvoice = InvoicesResourceFromInvoice.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InvoicesResourceFromInvoice is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
