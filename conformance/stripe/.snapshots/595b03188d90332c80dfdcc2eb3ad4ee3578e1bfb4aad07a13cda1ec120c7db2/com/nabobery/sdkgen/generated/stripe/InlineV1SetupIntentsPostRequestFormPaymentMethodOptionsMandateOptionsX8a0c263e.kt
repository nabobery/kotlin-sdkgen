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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e(
    public val amount: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0? = null,
    public val amountType: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeXcb8707bf? = null,
    public val endDate: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX29ef1278? = null,
    public val paymentSchedule: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6? = null,
    public val paymentsPerPeriod: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05? = null,
    public val purpose: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeXc830528d? = null,
    public val startDate: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX60dcd645? = null,
) {
    public class Builder {
        public var amount: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0? =
            null

        public var amountType:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeXcb8707bf? = null

        public var endDate:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX29ef1278? = null

        public var paymentSchedule:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6? = null

        public var paymentsPerPeriod: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05? =
            null

        public var purpose:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeXc830528d? = null

        public var startDate:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX60dcd645? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e(
                amount = amount,
                amountType = amountType,
                endDate = endDate,
                paymentSchedule = paymentSchedule,
                paymentsPerPeriod = paymentsPerPeriod,
                purpose = purpose,
                startDate = startDate,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e(
                amount =
                    rawObject["amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0>(
                                it,
                            )
                    },
                amountType =
                    rawObject["amount_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountTypeXcb8707bf>(
                                it,
                            )
                    },
                endDate =
                    rawObject["end_date"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateX29ef1278>(
                                it,
                            )
                    },
                paymentSchedule =
                    rawObject["payment_schedule"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6>(
                                it,
                            )
                    },
                paymentsPerPeriod =
                    rawObject["payments_per_period"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05>(it)
                    },
                purpose =
                    rawObject["purpose"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoPurposeXc830528d>(
                                it,
                            )
                    },
                startDate =
                    rawObject["start_date"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX60dcd645>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e",
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
                    value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX8a0c263e.build(block)
