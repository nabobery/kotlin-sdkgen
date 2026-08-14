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
public data class PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptionsView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_samsung_pay_payment_method_opt
 * ions
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779? = null

    public fun build(): PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions must be a JSON object")
      return PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions(block: PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions.build(block)
