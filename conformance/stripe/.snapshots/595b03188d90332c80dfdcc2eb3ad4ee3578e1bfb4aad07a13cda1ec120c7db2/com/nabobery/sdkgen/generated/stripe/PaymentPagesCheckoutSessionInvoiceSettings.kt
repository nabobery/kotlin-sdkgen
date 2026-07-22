package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_settings
 */
@Serializable(with = PaymentPagesCheckoutSessionInvoiceSettings.Serializer::class)
public class PaymentPagesCheckoutSessionInvoiceSettings(
    /**
     * The account tax IDs associated with the invoice.
     */
    public val accountTaxIds: List<InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3>? = null,
    /**
     * Custom fields displayed on the invoice.
     */
    public val customFields: List<InvoiceSettingCustomField>? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Footer displayed on the invoice.
     */
    public val footer: String? = null,
    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and support information
     * of the specified account.
     */
    public val issuer: InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Options for invoice PDF rendering.
     */
    public val renderingOptions: InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768? = null,
) {
    public class Builder {
        /**
         * The account tax IDs associated with the invoice.
         */
        public var accountTaxIds:
            List<InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3>? = null

        /**
         * Custom fields displayed on the invoice.
         */
        public var customFields: List<InvoiceSettingCustomField>? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Footer displayed on the invoice.
         */
        public var footer: String? = null

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding and support information
         * of the specified account.
         */
        public var issuer: InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Options for invoice PDF rendering.
         */
        public var renderingOptions:
            InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768? = null

        public fun build(): PaymentPagesCheckoutSessionInvoiceSettings =
            PaymentPagesCheckoutSessionInvoiceSettings(
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
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionInvoiceSettings =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionInvoiceSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionInvoiceSettings {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionInvoiceSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionInvoiceSettings must be a JSON object")
            return PaymentPagesCheckoutSessionInvoiceSettings(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3>?>(
                                    element,
                                )
                        }
                    },
                customFields =
                    rawObject["custom_fields"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<InvoiceSettingCustomField>?>(element)
                        }
                    },
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                footer =
                    rawObject["footer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                issuer =
                    rawObject["issuer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291?>(
                                    element,
                                )
                        }
                    },
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                renderingOptions =
                    rawObject["rendering_options"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionInvoiceSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionInvoiceSettings")
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

public fun paymentPagesCheckoutSessionInvoiceSettings(
    block: PaymentPagesCheckoutSessionInvoiceSettings.Builder.() -> Unit,
): PaymentPagesCheckoutSessionInvoiceSettings = PaymentPagesCheckoutSessionInvoiceSettings.build(block)
