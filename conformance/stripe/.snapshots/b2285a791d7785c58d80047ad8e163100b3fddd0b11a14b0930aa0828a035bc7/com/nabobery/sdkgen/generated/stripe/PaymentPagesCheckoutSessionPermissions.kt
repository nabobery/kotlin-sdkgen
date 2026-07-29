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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionPermissionsView(
  @SerialName("update_shipping_details")
  public val updateShippingDetails:
      InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_permissions
 */
@Serializable(with = PaymentPagesCheckoutSessionPermissions.Serializer::class)
public class PaymentPagesCheckoutSessionPermissions(
  /**
   * Determines which entity is allowed to update the shipping details.
   *
   * Default is `client_only`. Stripe Checkout client will automatically update the shipping details. If set to
   * `server_only`, only your server is allowed to update the shipping details.
   *
   * When set to `server_only`, you must add the onShippingDetailsChange event handler when initializing the Stripe
   * Checkout client and manually update the shipping details from your server using the Stripe API.
   */
  public val updateShippingDetails:
      InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f? = null,
) {
  public class Builder {
    /**
     * Determines which entity is allowed to update the shipping details.
     *
     * Default is `client_only`. Stripe Checkout client will automatically update the shipping details. If set to
     * `server_only`, only your server is allowed to update the shipping details.
     *
     * When set to `server_only`, you must add the onShippingDetailsChange event handler when initializing the Stripe
     * Checkout client and manually update the shipping details from your server using the Stripe API.
     */
    public var updateShippingDetails:
        InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f? = null

    public fun build(): PaymentPagesCheckoutSessionPermissions = PaymentPagesCheckoutSessionPermissions(
      updateShippingDetails = updateShippingDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionPermissions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionPermissions must be a JSON object")
      return PaymentPagesCheckoutSessionPermissions(
        updateShippingDetails = rawObject["update_shipping_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.updateShippingDetails?.let { put("update_shipping_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionPermissions(block: PaymentPagesCheckoutSessionPermissions.Builder.() -> Unit): PaymentPagesCheckoutSessionPermissions = PaymentPagesCheckoutSessionPermissions.build(block)
