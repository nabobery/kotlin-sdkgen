package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class InvoiceSettingCheckoutRenderingOptionsView(
    @SerialName("amount_tax_display")
    public val amountTaxDisplay: String? = null,
    public val template: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_setting_checkout_rendering_options
 */
@Serializable(with = InvoiceSettingCheckoutRenderingOptions.Serializer::class)
public class InvoiceSettingCheckoutRenderingOptions(
    /**
     * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
     */
    public val amountTaxDisplay: String? = null,
    /**
     * ID of the invoice rendering template to be used for the generated invoice.
     */
    public val template: String? = null,
) {
    public class Builder {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         */
        public var amountTaxDisplay: String? = null

        /**
         * ID of the invoice rendering template to be used for the generated invoice.
         */
        public var template: String? = null

        public fun build(): InvoiceSettingCheckoutRenderingOptions =
            InvoiceSettingCheckoutRenderingOptions(
                amountTaxDisplay = amountTaxDisplay,
                template = template,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoiceSettingCheckoutRenderingOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoiceSettingCheckoutRenderingOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoiceSettingCheckoutRenderingOptions {
            val jsonDecoder = decoder.requireJsonDecoder("InvoiceSettingCheckoutRenderingOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoiceSettingCheckoutRenderingOptions must be a JSON object")
            return InvoiceSettingCheckoutRenderingOptions(
                amountTaxDisplay =
                    rawObject["amount_tax_display"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                template =
                    rawObject["template"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoiceSettingCheckoutRenderingOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoiceSettingCheckoutRenderingOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountTaxDisplay?.let { put("amount_tax_display", it) }
                    value.template?.let { put("template", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoiceSettingCheckoutRenderingOptions(
    block: InvoiceSettingCheckoutRenderingOptions.Builder.() -> Unit,
): InvoiceSettingCheckoutRenderingOptions = InvoiceSettingCheckoutRenderingOptions.build(block)
