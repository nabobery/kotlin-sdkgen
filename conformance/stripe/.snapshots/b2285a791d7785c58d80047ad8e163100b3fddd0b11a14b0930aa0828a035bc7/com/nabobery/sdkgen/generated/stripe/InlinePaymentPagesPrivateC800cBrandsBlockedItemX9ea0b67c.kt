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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_private_card_payment_method_options_resource_restricti
 * ons/properties/brands_blocked/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_private_card_payment_method_options_resource_restricti
 * ons/properties/brands_blocked/items
 */
@Serializable(with = InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c.Serializer::class)
public sealed class InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `american_express`.
   */
  public data object AmericanExpress : InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c() {
    public override val `value`: String = "american_express"
  }

  /**
   * Documented value. Wire value: `discover_global_network`.
   */
  public data object DiscoverGlobalNetwork : InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c() {
    public override val `value`: String = "discover_global_network"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c = when (value) {
      AmericanExpress.value -> AmericanExpress
      DiscoverGlobalNetwork.value -> DiscoverGlobalNetwork
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c) {
      encoder.encodeString(value.value)
    }
  }
}
