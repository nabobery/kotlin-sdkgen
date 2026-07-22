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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_payment_intent_async_workflows_resource_inputs_resourc
 * e_tax
 */
@Serializable(with = PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax.Serializer::class)
public class PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax(
    /**
     * The [TaxCalculation](https://docs.stripe.com/api/tax/calculations) id
     */
    public val calculation: String,
) {
    public class Builder {
        private var calculationValue: String? = null

        public var calculation: String
            get() = requireNotNull(calculationValue) { "calculation is required" }
            set(`value`) {
                calculationValue = value
            }

        public fun build(): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax {
            check(calculationValue != null) { "calculation is required" }
            return PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax(
                calculation = calculation,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax must be a JSON object",
                    )
            val calculation = json.decodeRequired<String>(rawObject, "calculation")
            return PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax(
                calculation = calculation,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("calculation", value.calculation)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax(
    block: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax.Builder.() -> Unit,
): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax =
    PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
