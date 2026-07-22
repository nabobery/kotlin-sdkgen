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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642.Serializer::class)
public class InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642(
    lines: List<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val invoiceMetadata: InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10? = null,
) {
    /**
     * The line items to remove.
     */
    public val lines: List<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55> =
        lines.toList()

    public class Builder {
        private var linesValue: List<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55>? =
            null

        public var lines: List<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55>
            get() = requireNotNull(linesValue) { "lines is required" }
            set(`value`) {
                linesValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var invoiceMetadata: InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10? =
            null

        public fun build(): InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 {
            check(linesValue != null) { "lines is required" }
            return InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642(
                lines = lines,
                expand = expand,
                invoiceMetadata = invoiceMetadata,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 must be a JSON object",
                    )
            val lines =
                json.decodeRequired<List<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55>>(
                    rawObject,
                    "lines",
                )
            return InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642(
                lines = lines,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                invoiceMetadata =
                    rawObject["invoice_metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("lines", json.encodeToJsonElement(value.lines))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.invoiceMetadata?.let { put("invoice_metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesRemoveLinesPostRequestFormXfc30f642(
    block: InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642.Builder.() -> Unit,
): InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 =
    InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
