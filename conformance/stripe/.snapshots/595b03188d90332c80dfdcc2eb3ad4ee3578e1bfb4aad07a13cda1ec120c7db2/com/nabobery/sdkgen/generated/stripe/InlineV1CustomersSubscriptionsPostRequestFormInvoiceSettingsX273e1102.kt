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
 * All invoices will be billed using the specified settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102(
    public val accountTaxIds: InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08? = null,
    public val customFields: InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609? = null,
    public val description: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb? = null,
    public val footer: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a? = null,
    public val issuer: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd? = null,
) {
    public class Builder {
        public var accountTaxIds: InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08? =
            null

        public var customFields: InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609? =
            null

        public var description:
            InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb? = null

        public var footer: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a? =
            null

        public var issuer: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd? =
            null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102 =
            InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102(
                accountTaxIds = accountTaxIds,
                customFields = customFields,
                description = description,
                footer = footer,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08>(
                            it,
                        )
                    },
                customFields =
                    rawObject["custom_fields"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609>(
                            it,
                        )
                    },
                description =
                    rawObject["description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb>(
                                it,
                            )
                    },
                footer =
                    rawObject["footer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a>(
                                it,
                            )
                    },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
                    value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.footer?.let { put("footer", json.encodeToJsonElement(it)) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102(
    block: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102 =
    InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX273e1102.build(block)
