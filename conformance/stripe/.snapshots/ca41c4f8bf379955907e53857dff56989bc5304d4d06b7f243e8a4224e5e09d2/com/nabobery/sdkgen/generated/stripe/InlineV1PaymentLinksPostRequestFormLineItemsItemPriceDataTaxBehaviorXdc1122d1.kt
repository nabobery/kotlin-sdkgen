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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1) {
      encoder.encodeString(value.value)
    }
  }
}
