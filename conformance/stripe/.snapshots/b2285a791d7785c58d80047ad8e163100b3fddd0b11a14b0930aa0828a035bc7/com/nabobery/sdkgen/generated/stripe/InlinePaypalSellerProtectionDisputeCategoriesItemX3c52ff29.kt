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
 * sdkgen://source/openapi.json#/components/schemas/paypal_seller_protection/properties/dispute_categories/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/paypal_seller_protection/properties/dispute_categories/items
 */
@Serializable(with = InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29.Serializer::class)
public sealed class InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `product_not_received`.
   */
  public data object ProductNotReceived : InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29() {
    public override val `value`: String = "product_not_received"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29()

  public companion object {
    public fun fromValue(`value`: String): InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29 = when (value) {
      Fraudulent.value -> Fraudulent
      ProductNotReceived.value -> ProductNotReceived
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29) {
      encoder.encodeString(value.value)
    }
  }
}
