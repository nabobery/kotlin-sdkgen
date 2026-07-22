package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_display_bank_transfer_instructions
 */
@Serializable(with = PaymentIntentNextActionDisplayBankTransferInstructions.Serializer::class)
public class PaymentIntentNextActionDisplayBankTransferInstructions(
    /**
     * Type of bank transfer
     */
    public val type: InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe,
    /**
     * The remaining amount that needs to be transferred to complete the payment.
     */
    public val amountRemaining: Int? = null,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String? = null,
    /**
     * A list of financial addresses that can be used to fund the customer balance
     */
    public val financialAddresses: List<FundingInstructionsBankTransferFinancialAddress>? = null,
    /**
     * A link to a hosted page that guides your customer through completing the transfer.
     */
    public val hostedInstructionsUrl: String? = null,
    /**
     * A string identifying this payment. Instruct your customer to include this code in the reference or memo field of
     * their bank transfer.
     */
    public val reference: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe? = null

        public var type: InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The remaining amount that needs to be transferred to complete the payment.
         */
        public var amountRemaining: Int? = null

        /**
         * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
         * [supported currency](https://stripe.com/docs/currencies).
         */
        public var currency: String? = null

        /**
         * A list of financial addresses that can be used to fund the customer balance
         */
        public var financialAddresses: List<FundingInstructionsBankTransferFinancialAddress>? = null

        /**
         * A link to a hosted page that guides your customer through completing the transfer.
         */
        public var hostedInstructionsUrl: String? = null

        /**
         * A string identifying this payment. Instruct your customer to include this code in the reference or memo field of
         * their bank transfer.
         */
        public var reference: String? = null

        public fun build(): PaymentIntentNextActionDisplayBankTransferInstructions {
            check(typeValue != null) { "type is required" }
            return PaymentIntentNextActionDisplayBankTransferInstructions(
                type = type,
                amountRemaining = amountRemaining,
                currency = currency,
                financialAddresses = financialAddresses,
                hostedInstructionsUrl = hostedInstructionsUrl,
                reference = reference,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionDisplayBankTransferInstructions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionDisplayBankTransferInstructions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionDisplayBankTransferInstructions {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionDisplayBankTransferInstructions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentIntentNextActionDisplayBankTransferInstructions must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe>(
                    rawObject,
                    "type",
                )
            return PaymentIntentNextActionDisplayBankTransferInstructions(
                type = type,
                amountRemaining =
                    rawObject["amount_remaining"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                currency =
                    rawObject["currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                financialAddresses =
                    rawObject["financial_addresses"]?.let {
                        json.decodeFromJsonElement<List<FundingInstructionsBankTransferFinancialAddress>>(it)
                    },
                hostedInstructionsUrl =
                    rawObject["hosted_instructions_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                reference =
                    rawObject["reference"]?.let { element ->
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
            `value`: PaymentIntentNextActionDisplayBankTransferInstructions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionDisplayBankTransferInstructions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.amountRemaining?.let { put("amount_remaining", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.financialAddresses?.let { put("financial_addresses", json.encodeToJsonElement(it)) }
                    value.hostedInstructionsUrl?.let { put("hosted_instructions_url", it) }
                    value.reference?.let { put("reference", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionDisplayBankTransferInstructions(
    block: PaymentIntentNextActionDisplayBankTransferInstructions.Builder.() -> Unit,
): PaymentIntentNextActionDisplayBankTransferInstructions =
    PaymentIntentNextActionDisplayBankTransferInstructions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentIntentNextActionDisplayBankTransferInstructions is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
