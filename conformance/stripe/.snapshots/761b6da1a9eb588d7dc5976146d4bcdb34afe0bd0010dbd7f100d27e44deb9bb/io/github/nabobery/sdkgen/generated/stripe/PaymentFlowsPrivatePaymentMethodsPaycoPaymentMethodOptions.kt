package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptionsView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_payco_payment_method_options
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b? = null

    public fun build(): PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions must be a JSON object")
      return PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions(block: PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions.build(block)
