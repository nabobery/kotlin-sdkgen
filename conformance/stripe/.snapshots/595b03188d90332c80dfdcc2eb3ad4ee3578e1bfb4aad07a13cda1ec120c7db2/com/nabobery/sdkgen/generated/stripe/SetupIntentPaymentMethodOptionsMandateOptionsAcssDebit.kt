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

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_acss_debit
 */
@Serializable(with = SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit.Serializer::class)
public class SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit(
    /**
     * A URL for custom mandate text
     */
    public val customMandateUrl: String? = null,
    /**
     * List of Stripe products where this mandate can be selected automatically.
     */
    public val defaultFor: List<InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16>? = null,
    /**
     * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
     */
    public val intervalDescription: String? = null,
    /**
     * Payment schedule for the mandate.
     */
    public val paymentSchedule: InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f? = null,
    /**
     * Transaction type of the mandate.
     */
    public val transactionType: InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557? = null,
) {
    public class Builder {
        /**
         * A URL for custom mandate text
         */
        public var customMandateUrl: String? = null

        /**
         * List of Stripe products where this mandate can be selected automatically.
         */
        public var defaultFor: List<InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16>? = null

        /**
         * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
         */
        public var intervalDescription: String? = null

        /**
         * Payment schedule for the mandate.
         */
        public var paymentSchedule: InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f? = null

        /**
         * Transaction type of the mandate.
         */
        public var transactionType: InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557? = null

        public fun build(): SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit =
            SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit(
                customMandateUrl = customMandateUrl,
                defaultFor = defaultFor,
                intervalDescription = intervalDescription,
                paymentSchedule = paymentSchedule,
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit {
            val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit must be a JSON object",
                    )
            return SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit(
                customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<String>(it) },
                defaultFor =
                    rawObject["default_for"]?.let {
                        json.decodeFromJsonElement<List<InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16>>(it)
                    },
                intervalDescription =
                    rawObject["interval_description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                paymentSchedule =
                    rawObject["payment_schedule"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f?>(element)
                        }
                    },
                transactionType =
                    rawObject["transaction_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customMandateUrl?.let { put("custom_mandate_url", it) }
                    value.defaultFor?.let { put("default_for", json.encodeToJsonElement(it)) }
                    value.intervalDescription?.let { put("interval_description", it) }
                    value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun setupIntentPaymentMethodOptionsMandateOptionsAcssDebit(
    block: SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit.Builder.() -> Unit,
): SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit =
    SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit.build(block)
