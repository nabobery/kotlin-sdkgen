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
import kotlin.String
import kotlin.Unit

/**
 * Default invoice settings for this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df(
    public val customFields: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f? = null,
    public val defaultPaymentMethod: String? = null,
    public val footer: String? = null,
    public val renderingOptions: InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb4913c35? = null,
) {
    public class Builder {
        public var customFields: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f? =
            null

        public var defaultPaymentMethod: String? = null

        public var footer: String? = null

        public var renderingOptions:
            InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb4913c35? = null

        public fun build(): InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df =
            InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df(
                customFields = customFields,
                defaultPaymentMethod = defaultPaymentMethod,
                footer = footer,
                renderingOptions = renderingOptions,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df must be a JSON object",
                    )
            return InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df(
                customFields =
                    rawObject["custom_fields"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f>(
                                it,
                            )
                    },
                defaultPaymentMethod =
                    rawObject["default_payment_method"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
                renderingOptions =
                    rawObject["rendering_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb4913c35>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
                    value.defaultPaymentMethod?.let { put("default_payment_method", it) }
                    value.footer?.let { put("footer", it) }
                    value.renderingOptions?.let { put("rendering_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df(
    block: InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df.Builder.() -> Unit,
): InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df =
    InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df.build(block)
