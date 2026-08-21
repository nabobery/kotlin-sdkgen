package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Determines which entity is allowed to update the shipping details.
 *
 * Default is `client_only`. Stripe Checkout client will automatically update the shipping details. If set to
 * `server_only`, only your server is allowed to update the shipping details.
 *
 * When set to `server_only`, you must add the onShippingDetailsChange event handler when initializing the Stripe
 * Checkout client and manually update the shipping details from your server using the Stripe API.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_permissions/properties/update_shippin
 * g_details
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `client_only`.
   */
  public data object ClientOnly : InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f() {
    public override val `value`: String = "client_only"
  }

  /**
   * Documented value. Wire value: `server_only`.
   */
  public data object ServerOnly : InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f() {
    public override val `value`: String = "server_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f = when (value) {
      ClientOnly.value -> ClientOnly
      ServerOnly.value -> ServerOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionPermissionsUpdateShippingDetailsXf0320c3f) {
      encoder.encodeString(value.value)
    }
  }
}
