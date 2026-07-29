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
 * Configuration for collecting the customer's billing address. Defaults to `auto`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/billing_address_collection
 */
@Serializable(with = InlinePaymentLinkBillingAddressCollectionX8c0d649d.Serializer::class)
public sealed class InlinePaymentLinkBillingAddressCollectionX8c0d649d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlinePaymentLinkBillingAddressCollectionX8c0d649d() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlinePaymentLinkBillingAddressCollectionX8c0d649d() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkBillingAddressCollectionX8c0d649d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkBillingAddressCollectionX8c0d649d = when (value) {
      Auto.value -> Auto
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinkBillingAddressCollectionX8c0d649d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinkBillingAddressCollectionX8c0d649d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkBillingAddressCollectionX8c0d649d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkBillingAddressCollectionX8c0d649d) {
      encoder.encodeString(value.value)
    }
  }
}
