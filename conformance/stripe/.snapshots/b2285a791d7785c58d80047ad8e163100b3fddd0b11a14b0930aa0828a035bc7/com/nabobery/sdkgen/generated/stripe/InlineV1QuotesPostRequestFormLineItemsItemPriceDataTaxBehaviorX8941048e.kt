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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorX8941048e) {
      encoder.encodeString(value.value)
    }
  }
}
