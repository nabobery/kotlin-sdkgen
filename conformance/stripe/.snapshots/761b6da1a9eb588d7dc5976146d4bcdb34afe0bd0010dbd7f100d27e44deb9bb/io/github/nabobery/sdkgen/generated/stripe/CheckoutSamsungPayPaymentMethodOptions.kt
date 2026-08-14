package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_samsung_pay_payment_method_options
 */
@Serializable(with = CheckoutSamsungPayPaymentMethodOptions.Serializer::class)
public class CheckoutSamsungPayPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod:
      InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d? =
        null

    public fun build(): CheckoutSamsungPayPaymentMethodOptions = CheckoutSamsungPayPaymentMethodOptions(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutSamsungPayPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutSamsungPayPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutSamsungPayPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutSamsungPayPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutSamsungPayPaymentMethodOptions must be a JSON object")
      return CheckoutSamsungPayPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutSamsungPayPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutSamsungPayPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutSamsungPayPaymentMethodOptions(block: CheckoutSamsungPayPaymentMethodOptions.Builder.() -> Unit): CheckoutSamsungPayPaymentMethodOptions = CheckoutSamsungPayPaymentMethodOptions.build(block)
