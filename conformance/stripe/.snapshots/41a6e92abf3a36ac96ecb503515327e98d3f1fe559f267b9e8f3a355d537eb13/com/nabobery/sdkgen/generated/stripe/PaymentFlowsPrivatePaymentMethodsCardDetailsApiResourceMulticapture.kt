package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_mult
 * icapture
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture(
  /**
   * Indicates whether or not multiple captures are supported.
   */
  public val status: InlinePaymentFlowsPrivatePefbaStatusXf7fb8417,
) {
  public class Builder {
    private var statusValue: InlinePaymentFlowsPrivatePefbaStatusXf7fb8417? = null

    public var status: InlinePaymentFlowsPrivatePefbaStatusXf7fb8417
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture {
      check(statusValue != null) { "status is required" }
      return PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture(
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture must be a JSON object")
      val status = json.decodeRequired<InlinePaymentFlowsPrivatePefbaStatusXf7fb8417>(rawObject, "status")
      return PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture(
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture(block: PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture = PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
