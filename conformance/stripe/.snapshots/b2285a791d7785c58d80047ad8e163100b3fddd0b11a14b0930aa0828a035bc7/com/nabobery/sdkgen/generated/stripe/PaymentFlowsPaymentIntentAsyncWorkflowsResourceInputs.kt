package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_payment_intent_async_workflows_resource_inputs
 */
@Serializable(with = PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs.Serializer::class)
public class PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs(
  public val tax: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax? = null,
) {
  public class Builder {
    public var tax: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax? = null

    public fun build(): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs = PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs(
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs must be a JSON object")
      return PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs(
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputsResourceTax>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPaymentIntentAsyncWorkflowsResourceInputs(block: PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs.Builder.() -> Unit): PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs = PaymentFlowsPaymentIntentAsyncWorkflowsResourceInputs.build(block)
