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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e(
    public val amountTaxDisplay: InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732? = null,
    public val template: String? = null,
) {
    public class Builder {
        public var amountTaxDisplay:
            InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732? = null

        public var template: String? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e =
            InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e(
                amountTaxDisplay = amountTaxDisplay,
                template = template,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e must be a JSON object",
                    )
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e(
                amountTaxDisplay =
                    rawObject["amount_tax_display"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732>(
                                it,
                            )
                    },
                template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountTaxDisplay?.let { put("amount_tax_display", json.encodeToJsonElement(it)) }
                    value.template?.let { put("template", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e(
    block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e =
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e.build(block)
