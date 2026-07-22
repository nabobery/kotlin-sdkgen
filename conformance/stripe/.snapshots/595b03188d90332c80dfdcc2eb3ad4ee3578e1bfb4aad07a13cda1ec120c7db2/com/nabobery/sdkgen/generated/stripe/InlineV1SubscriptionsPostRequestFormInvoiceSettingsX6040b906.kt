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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906(
    public val accountTaxIds: InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a? = null,
    public val customFields: InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f? = null,
    public val description: InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856? = null,
    public val footer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed? = null,
    public val issuer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51? = null,
) {
    public class Builder {
        public var accountTaxIds:
            InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a? = null

        public var customFields:
            InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f? = null

        public var description: InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856? =
            null

        public var footer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed? = null

        public var issuer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906 =
            InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906(
                accountTaxIds = accountTaxIds,
                customFields = customFields,
                description = description,
                footer = footer,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a>(
                                it,
                            )
                    },
                customFields =
                    rawObject["custom_fields"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f>(
                                it,
                            )
                    },
                description =
                    rawObject["description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856>(
                                it,
                            )
                    },
                footer =
                    rawObject["footer"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed>(
                            it,
                        )
                    },
                issuer =
                    rawObject["issuer"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906")
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

public fun inlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906(
    block: InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906 =
    InlineV1SubscriptionsPostRequestFormInvoiceSettingsX6040b906.build(block)
