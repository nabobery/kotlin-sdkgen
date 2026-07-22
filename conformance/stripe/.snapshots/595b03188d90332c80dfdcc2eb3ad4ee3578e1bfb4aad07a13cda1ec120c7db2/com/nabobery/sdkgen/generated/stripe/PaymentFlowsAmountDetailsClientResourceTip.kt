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
import kotlin.Int
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_client_resource_tip
 */
@Serializable(with = PaymentFlowsAmountDetailsClientResourceTip.Serializer::class)
public class PaymentFlowsAmountDetailsClientResourceTip(
    /**
     * Portion of the amount that corresponds to a tip.
     */
    public val amount: Int? = null,
) {
    public class Builder {
        /**
         * Portion of the amount that corresponds to a tip.
         */
        public var amount: Int? = null

        public fun build(): PaymentFlowsAmountDetailsClientResourceTip =
            PaymentFlowsAmountDetailsClientResourceTip(
                amount = amount,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsClientResourceTip =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsAmountDetailsClientResourceTip> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsClientResourceTip {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsClientResourceTip")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentFlowsAmountDetailsClientResourceTip must be a JSON object")
            return PaymentFlowsAmountDetailsClientResourceTip(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsAmountDetailsClientResourceTip,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsClientResourceTip")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsAmountDetailsClientResourceTip(
    block: PaymentFlowsAmountDetailsClientResourceTip.Builder.() -> Unit,
): PaymentFlowsAmountDetailsClientResourceTip = PaymentFlowsAmountDetailsClientResourceTip.build(block)
