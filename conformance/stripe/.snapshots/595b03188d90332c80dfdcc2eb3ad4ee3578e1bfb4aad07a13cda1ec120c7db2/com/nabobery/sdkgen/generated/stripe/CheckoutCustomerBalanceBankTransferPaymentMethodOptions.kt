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
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_customer_balance_bank_transfer_payment_method_options
 */
@Serializable(with = CheckoutCustomerBalanceBankTransferPaymentMethodOptions.Serializer::class)
public class CheckoutCustomerBalanceBankTransferPaymentMethodOptions(
    public val euBankTransfer: PaymentMethodOptionsCustomerBalanceEuBankAccount? = null,
    /**
     * List of address types that should be returned in the financial_addresses response. If not specified, all valid
     * types will be returned.
     *
     * Permitted values include: `sort_code`, `zengin`, `iban`, or `spei`.
     */
    public val requestedAddressTypes: List<InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef>? = null,
    /**
     * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
     * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
     */
    public val type: InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e? = null,
) {
    public class Builder {
        public var euBankTransfer: PaymentMethodOptionsCustomerBalanceEuBankAccount? = null

        /**
         * List of address types that should be returned in the financial_addresses response. If not specified, all valid
         * types will be returned.
         *
         * Permitted values include: `sort_code`, `zengin`, `iban`, or `spei`.
         */
        public var requestedAddressTypes:
            List<InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef>? = null

        /**
         * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
         * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
         */
        public var type: InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e? =
            null

        public fun build(): CheckoutCustomerBalanceBankTransferPaymentMethodOptions =
            CheckoutCustomerBalanceBankTransferPaymentMethodOptions(
                euBankTransfer = euBankTransfer,
                requestedAddressTypes = requestedAddressTypes,
                type = type,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutCustomerBalanceBankTransferPaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutCustomerBalanceBankTransferPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutCustomerBalanceBankTransferPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutCustomerBalanceBankTransferPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CheckoutCustomerBalanceBankTransferPaymentMethodOptions must be a JSON object",
                    )
            return CheckoutCustomerBalanceBankTransferPaymentMethodOptions(
                euBankTransfer =
                    rawObject["eu_bank_transfer"]?.let {
                        json.decodeFromJsonElement<PaymentMethodOptionsCustomerBalanceEuBankAccount>(it)
                    },
                requestedAddressTypes =
                    rawObject["requested_address_types"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef>>(
                                it,
                            )
                    },
                type =
                    rawObject["type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutCustomerBalanceBankTransferPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutCustomerBalanceBankTransferPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
                    value.requestedAddressTypes?.let { put("requested_address_types", json.encodeToJsonElement(it)) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutCustomerBalanceBankTransferPaymentMethodOptions(
    block: CheckoutCustomerBalanceBankTransferPaymentMethodOptions.Builder.() -> Unit,
): CheckoutCustomerBalanceBankTransferPaymentMethodOptions =
    CheckoutCustomerBalanceBankTransferPaymentMethodOptions.build(block)
