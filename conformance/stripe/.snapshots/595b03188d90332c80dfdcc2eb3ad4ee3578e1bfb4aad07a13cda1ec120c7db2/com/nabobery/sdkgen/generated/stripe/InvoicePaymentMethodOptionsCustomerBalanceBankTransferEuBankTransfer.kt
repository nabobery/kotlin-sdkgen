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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_customer_balance_bank_transfer_eu_ban
 * k_transfer
 */
@Serializable(with = InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer.Serializer::class)
public class InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer(
    /**
     * The desired country code of the bank account information. Permitted values include: `DE`, `FR`, `IE`, or `NL`.
     */
    public val country: InlineInvoicePaymentMethoddec3CountryX7154029b,
) {
    public class Builder {
        private var countryValue: InlineInvoicePaymentMethoddec3CountryX7154029b? = null

        public var country: InlineInvoicePaymentMethoddec3CountryX7154029b
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer {
            check(countryValue != null) { "country is required" }
            return InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer must be a JSON object",
                    )
            val country = json.decodeRequired<InlineInvoicePaymentMethoddec3CountryX7154029b>(rawObject, "country")
            return InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", json.encodeToJsonElement(value.country))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer(
    block: InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer.Builder.() -> Unit,
): InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer =
    InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
