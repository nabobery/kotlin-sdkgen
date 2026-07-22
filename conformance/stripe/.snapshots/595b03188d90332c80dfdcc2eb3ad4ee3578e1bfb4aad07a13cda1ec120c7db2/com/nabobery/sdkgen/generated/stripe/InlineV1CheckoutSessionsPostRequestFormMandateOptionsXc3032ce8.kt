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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8(
    public val customMandateUrl: InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b? = null,
    public val defaultFor: List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX46a79aed>? = null,
    public val intervalDescription: String? = null,
    public val paymentSchedule: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7? = null,
    public val transactionType: InlineV1CheckoutSessionsPostRequestFormTransactionTypeX6e8b2bdb? = null,
) {
    public class Builder {
        public var customMandateUrl: InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b? =
            null

        public var defaultFor:
            List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX46a79aed>? = null

        public var intervalDescription: String? = null

        public var paymentSchedule: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7? =
            null

        public var transactionType: InlineV1CheckoutSessionsPostRequestFormTransactionTypeX6e8b2bdb? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8 =
            InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8(
                customMandateUrl = customMandateUrl,
                defaultFor = defaultFor,
                intervalDescription = intervalDescription,
                paymentSchedule = paymentSchedule,
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8(
                customMandateUrl =
                    rawObject["custom_mandate_url"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b>(it)
                    },
                defaultFor =
                    rawObject["default_for"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX46a79aed>>(
                                it,
                            )
                    },
                intervalDescription =
                    rawObject["interval_description"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                paymentSchedule =
                    rawObject["payment_schedule"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7>(it)
                    },
                transactionType =
                    rawObject["transaction_type"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormTransactionTypeX6e8b2bdb>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customMandateUrl?.let { put("custom_mandate_url", json.encodeToJsonElement(it)) }
                    value.defaultFor?.let { put("default_for", json.encodeToJsonElement(it)) }
                    value.intervalDescription?.let { put("interval_description", it) }
                    value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8(
    block: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8 =
    InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8.build(block)
