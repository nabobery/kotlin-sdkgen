package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_swish_payment_method_options
 */
@Serializable(with = CheckoutSwishPaymentMethodOptions.Serializer::class)
public class CheckoutSwishPaymentMethodOptions(
  /**
   * The order reference that will be displayed to customers in the Swish application. Defaults to the `id` of the
   * Payment Intent.
   */
  public val reference: String? = null,
) {
  public class Builder {
    /**
     * The order reference that will be displayed to customers in the Swish application. Defaults to the `id` of the
     * Payment Intent.
     */
    public var reference: String? = null

    public fun build(): CheckoutSwishPaymentMethodOptions = CheckoutSwishPaymentMethodOptions(
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutSwishPaymentMethodOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutSwishPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutSwishPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutSwishPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutSwishPaymentMethodOptions must be a JSON object")
      return CheckoutSwishPaymentMethodOptions(
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutSwishPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutSwishPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutSwishPaymentMethodOptions(block: CheckoutSwishPaymentMethodOptions.Builder.() -> Unit): CheckoutSwishPaymentMethodOptions = CheckoutSwishPaymentMethodOptions.build(block)
