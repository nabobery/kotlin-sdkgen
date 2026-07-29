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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate/properties/maximum/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate/properties/maximum/properties/unit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business_day`.
   */
  public data object BusinessDay : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec() {
    public override val `value`: String = "business_day"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec = when (value) {
      BusinessDay.value -> BusinessDay
      Day.value -> Day
      Hour.value -> Hour
      Month.value -> Month
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec) {
      encoder.encodeString(value.value)
    }
  }
}
