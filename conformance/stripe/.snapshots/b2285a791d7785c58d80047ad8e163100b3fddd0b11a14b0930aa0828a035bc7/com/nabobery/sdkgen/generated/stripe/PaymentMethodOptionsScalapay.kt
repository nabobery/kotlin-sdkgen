package com.nabobery.sdkgen.generated.stripe

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
public data class PaymentMethodOptionsScalapayView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_scalapay
 */
@Serializable(with = PaymentMethodOptionsScalapay.Serializer::class)
public class PaymentMethodOptionsScalapay(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371? = null

    public fun build(): PaymentMethodOptionsScalapay = PaymentMethodOptionsScalapay(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsScalapay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodOptionsScalapay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsScalapay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsScalapay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsScalapay must be a JSON object")
      return PaymentMethodOptionsScalapay(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsScalapay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsScalapay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsScalapay(block: PaymentMethodOptionsScalapay.Builder.() -> Unit): PaymentMethodOptionsScalapay = PaymentMethodOptionsScalapay.build(block)
