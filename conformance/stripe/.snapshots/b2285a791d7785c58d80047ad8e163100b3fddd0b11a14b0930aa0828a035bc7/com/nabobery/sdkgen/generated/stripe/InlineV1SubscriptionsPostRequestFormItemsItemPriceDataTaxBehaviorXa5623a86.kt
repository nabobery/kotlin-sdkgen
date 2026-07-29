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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataTaxBehaviorXa5623a86) {
      encoder.encodeString(value.value)
    }
  }
}
