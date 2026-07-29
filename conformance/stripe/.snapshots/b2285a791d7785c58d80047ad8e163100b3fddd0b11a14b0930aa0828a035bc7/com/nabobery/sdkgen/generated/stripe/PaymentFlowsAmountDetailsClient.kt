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

@Serializable
public data class PaymentFlowsAmountDetailsClientView(
  public val tip: PaymentFlowsAmountDetailsClientResourceTip? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_client
 */
@Serializable(with = PaymentFlowsAmountDetailsClient.Serializer::class)
public class PaymentFlowsAmountDetailsClient(
  public val tip: PaymentFlowsAmountDetailsClientResourceTip? = null,
) {
  public class Builder {
    public var tip: PaymentFlowsAmountDetailsClientResourceTip? = null

    public fun build(): PaymentFlowsAmountDetailsClient = PaymentFlowsAmountDetailsClient(
      tip = tip,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsClient = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentFlowsAmountDetailsClient> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsClient {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsClient")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetailsClient must be a JSON object")
      return PaymentFlowsAmountDetailsClient(
        tip = rawObject["tip"]?.let { json.decodeFromJsonElement<PaymentFlowsAmountDetailsClientResourceTip>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetailsClient) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsClient")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tip?.let { put("tip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetailsClient(block: PaymentFlowsAmountDetailsClient.Builder.() -> Unit): PaymentFlowsAmountDetailsClient = PaymentFlowsAmountDetailsClient.build(block)
