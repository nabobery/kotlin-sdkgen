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
public data class PaymentMethodOptionsBillieView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_billie
 */
@Serializable(with = PaymentMethodOptionsBillie.Serializer::class)
public class PaymentMethodOptionsBillie(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6? = null

    public fun build(): PaymentMethodOptionsBillie = PaymentMethodOptionsBillie(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsBillie = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodOptionsBillie> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsBillie {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsBillie")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsBillie must be a JSON object")
      return PaymentMethodOptionsBillie(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsBillie) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsBillie")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsBillie(block: PaymentMethodOptionsBillie.Builder.() -> Unit): PaymentMethodOptionsBillie = PaymentMethodOptionsBillie.build(block)
