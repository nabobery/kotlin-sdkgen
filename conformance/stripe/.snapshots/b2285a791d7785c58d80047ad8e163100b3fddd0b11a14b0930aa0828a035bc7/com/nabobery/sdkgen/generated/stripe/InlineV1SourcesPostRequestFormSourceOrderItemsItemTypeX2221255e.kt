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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/items/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/items/items/properties/type
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `discount`.
   */
  public data object Discount : InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e() {
    public override val `value`: String = "discount"
  }

  /**
   * Documented value. Wire value: `shipping`.
   */
  public data object Shipping : InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e() {
    public override val `value`: String = "shipping"
  }

  /**
   * Documented value. Wire value: `sku`.
   */
  public data object Sku : InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e() {
    public override val `value`: String = "sku"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e() {
    public override val `value`: String = "tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e = when (value) {
      Discount.value -> Discount
      Shipping.value -> Shipping
      Sku.value -> Sku
      Tax.value -> Tax
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e) {
      encoder.encodeString(value.value)
    }
  }
}
