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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering/properties/pdf.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering/properties/pdf
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9(
    public val pageSize: InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX08fb3390? = null,
) {
    public class Builder {
        public var pageSize: InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX08fb3390? = null

        public fun build(): InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9 =
            InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9(
                pageSize = pageSize,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9(
                pageSize =
                    rawObject["page_size"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX08fb3390>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.pageSize?.let { put("page_size", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9(
    block: InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9 =
    InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9.build(block)
