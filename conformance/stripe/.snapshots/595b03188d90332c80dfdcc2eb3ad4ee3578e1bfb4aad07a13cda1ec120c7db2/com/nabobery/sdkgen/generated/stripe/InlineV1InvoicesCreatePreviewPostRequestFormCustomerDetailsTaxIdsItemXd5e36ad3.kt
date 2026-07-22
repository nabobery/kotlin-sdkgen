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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax_ids/items
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3(
    public val type: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsTypeXba0583e9,
    public val `value`: String,
) {
    public class Builder {
        private var typeValue:
            InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsTypeXba0583e9? = null

        public var type: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsTypeXba0583e9
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        private var valueValue: String? = null

        public var `value`: String
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 {
            check(typeValue != null) { "type is required" }
            check(valueValue != null) { "value is required" }
            return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3(
                type = type,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsTypeXba0583e9>(
                    rawObject,
                    "type",
                )
            val value = json.decodeRequired<String>(rawObject, "value")
            return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3(
                type = type,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    put("value", value.value)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3(
    block: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 =
    InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
