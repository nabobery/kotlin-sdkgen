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

@Serializable
public data class PaymentMethodDetailsCardInstallmentsPlanView(
    public val count: Int? = null,
    public val interval: InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2? = null,
    public val type: InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_installments_plan
 */
@Serializable(with = PaymentMethodDetailsCardInstallmentsPlan.Serializer::class)
public class PaymentMethodDetailsCardInstallmentsPlan(
    /**
     * Type of installment plan, one of `fixed_count`, `bonus`, or `revolving`.
     */
    public val type: InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a,
    /**
     * For `fixed_count` installment plans, this is the number of installment payments your customer will make to their
     * credit card.
     */
    public val count: Int? = null,
    /**
     * For `fixed_count` installment plans, this is the interval between installment payments your customer will make to
     * their credit card.
     * One of `month`.
     */
    public val interval: InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2? = null,
) {
    public class Builder {
        private var typeValue: InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a? = null

        public var type: InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * For `fixed_count` installment plans, this is the number of installment payments your customer will make to their
         * credit card.
         */
        public var count: Int? = null

        /**
         * For `fixed_count` installment plans, this is the interval between installment payments your customer will make to
         * their credit card.
         * One of `month`.
         */
        public var interval: InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2? = null

        public fun build(): PaymentMethodDetailsCardInstallmentsPlan {
            check(typeValue != null) { "type is required" }
            return PaymentMethodDetailsCardInstallmentsPlan(
                type = type,
                count = count,
                interval = interval,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardInstallmentsPlan =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsCardInstallmentsPlan> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardInstallmentsPlan {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardInstallmentsPlan")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsCardInstallmentsPlan must be a JSON object")
            val type =
                json.decodeRequired<InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a>(
                    rawObject,
                    "type",
                )
            return PaymentMethodDetailsCardInstallmentsPlan(
                type = type,
                count =
                    rawObject["count"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                interval =
                    rawObject["interval"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsCardInstallmentsPlan,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardInstallmentsPlan")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.count?.let { put("count", json.encodeToJsonElement(it)) }
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsCardInstallmentsPlan(
    block: PaymentMethodDetailsCardInstallmentsPlan.Builder.() -> Unit,
): PaymentMethodDetailsCardInstallmentsPlan = PaymentMethodDetailsCardInstallmentsPlan.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentMethodDetailsCardInstallmentsPlan is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
