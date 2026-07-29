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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_alma_payment_method_options
 */
@Serializable(with = CheckoutAlmaPaymentMethodOptions.Serializer::class)
public class CheckoutAlmaPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86? = null

    public fun build(): CheckoutAlmaPaymentMethodOptions = CheckoutAlmaPaymentMethodOptions(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutAlmaPaymentMethodOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutAlmaPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutAlmaPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutAlmaPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutAlmaPaymentMethodOptions must be a JSON object")
      return CheckoutAlmaPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutAlmaPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutAlmaPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutAlmaPaymentMethodOptions(block: CheckoutAlmaPaymentMethodOptions.Builder.() -> Unit): CheckoutAlmaPaymentMethodOptions = CheckoutAlmaPaymentMethodOptions.build(block)
