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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_payment_intent_async_workflows
 */
@Serializable(with = PaymentFlowsPaymentIntentAsyncWorkflows.Serializer::class)
public class PaymentFlowsPaymentIntentAsyncWorkflows(
    public val inputs: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs? = null,
) {
    public class Builder {
        public var inputs: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs? = null

        public fun build(): PaymentFlowsPaymentIntentAsyncWorkflows =
            PaymentFlowsPaymentIntentAsyncWorkflows(
                inputs = inputs,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsPaymentIntentAsyncWorkflows =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPaymentIntentAsyncWorkflows> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsPaymentIntentAsyncWorkflows {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPaymentIntentAsyncWorkflows")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentFlowsPaymentIntentAsyncWorkflows must be a JSON object")
            return PaymentFlowsPaymentIntentAsyncWorkflows(
                inputs =
                    rawObject["inputs"]?.let {
                        json.decodeFromJsonElement<PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPaymentIntentAsyncWorkflows,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPaymentIntentAsyncWorkflows")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPaymentIntentAsyncWorkflows(
    block: PaymentFlowsPaymentIntentAsyncWorkflows.Builder.() -> Unit,
): PaymentFlowsPaymentIntentAsyncWorkflows = PaymentFlowsPaymentIntentAsyncWorkflows.build(block)
