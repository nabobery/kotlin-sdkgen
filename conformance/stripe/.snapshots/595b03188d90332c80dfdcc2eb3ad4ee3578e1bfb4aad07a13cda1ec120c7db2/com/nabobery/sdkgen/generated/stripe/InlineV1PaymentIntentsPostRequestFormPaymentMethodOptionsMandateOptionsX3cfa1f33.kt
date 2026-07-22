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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33(
    public val amount: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed? = null,
    public val amountType: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81? = null,
    public val endDate: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXc83ae505? = null,
    public val paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX0fc44a97? = null,
    public val paymentsPerPeriod: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618? = null,
    public val purpose: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2470c8fc? = null,
) {
    public class Builder {
        public var amount:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed? = null

        public var amountType:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81? = null

        public var endDate:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXc83ae505? = null

        public var paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX0fc44a97? =
            null

        public var paymentsPerPeriod: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618? =
            null

        public var purpose:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2470c8fc? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33(
                amount = amount,
                amountType = amountType,
                endDate = endDate,
                paymentSchedule = paymentSchedule,
                paymentsPerPeriod = paymentsPerPeriod,
                purpose = purpose,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33(
                amount =
                    rawObject["amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed>(
                                it,
                            )
                    },
                amountType =
                    rawObject["amount_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81>(
                                it,
                            )
                    },
                endDate =
                    rawObject["end_date"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXc83ae505>(
                                it,
                            )
                    },
                paymentSchedule =
                    rawObject["payment_schedule"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX0fc44a97>(it)
                    },
                paymentsPerPeriod =
                    rawObject["payments_per_period"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618>(it)
                    },
                purpose =
                    rawObject["purpose"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeX2470c8fc>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
                    value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
                    value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
                    value.paymentsPerPeriod?.let { put("payments_per_period", json.encodeToJsonElement(it)) }
                    value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX3cfa1f33.build(block)
