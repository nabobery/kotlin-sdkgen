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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e(
    public val accountTaxIds: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475? = null,
    public val customFields: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5? = null,
    public val description: String? = null,
    public val footer: String? = null,
    public val issuer: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee? = null,
    public val metadata: Map<String, String>? = null,
    public val renderingOptions: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7? = null,
) {
    public class Builder {
        public var accountTaxIds:
            InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475? = null

        public var customFields:
            InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5? = null

        public var description: String? = null

        public var footer: String? = null

        public var issuer:
            InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee? = null

        public var metadata: Map<String, String>? = null

        public var renderingOptions:
            InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e =
            InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e(
                accountTaxIds = accountTaxIds,
                customFields = customFields,
                description = description,
                footer = footer,
                issuer = issuer,
                metadata = metadata,
                renderingOptions = renderingOptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475>(
                                it,
                            )
                    },
                customFields =
                    rawObject["custom_fields"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5>(
                                it,
                            )
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                renderingOptions =
                    rawObject["rendering_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
                    value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.footer?.let { put("footer", it) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.renderingOptions?.let { put("rendering_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e(
    block: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e =
    InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e.build(block)
