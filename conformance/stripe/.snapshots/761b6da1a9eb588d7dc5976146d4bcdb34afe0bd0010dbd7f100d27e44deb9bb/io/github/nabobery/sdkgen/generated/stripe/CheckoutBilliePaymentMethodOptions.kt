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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_billie_payment_method_options
 */
@Serializable(with = CheckoutBilliePaymentMethodOptions.Serializer::class)
public class CheckoutBilliePaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44? = null

    public fun build(): CheckoutBilliePaymentMethodOptions = CheckoutBilliePaymentMethodOptions(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutBilliePaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutBilliePaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutBilliePaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutBilliePaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutBilliePaymentMethodOptions must be a JSON object")
      return CheckoutBilliePaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutBilliePaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutBilliePaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutBilliePaymentMethodOptions(block: CheckoutBilliePaymentMethodOptions.Builder.() -> Unit): CheckoutBilliePaymentMethodOptions = CheckoutBilliePaymentMethodOptions.build(block)
