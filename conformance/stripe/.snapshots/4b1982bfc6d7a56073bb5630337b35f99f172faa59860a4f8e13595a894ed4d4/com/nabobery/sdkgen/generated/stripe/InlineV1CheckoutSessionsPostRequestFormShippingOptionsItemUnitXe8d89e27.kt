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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum/properties/unit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business_day`.
   */
  public data object BusinessDay : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27() {
    public override val `value`: String = "business_day"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27 = when (value) {
      BusinessDay.value -> BusinessDay
      Day.value -> Day
      Hour.value -> Hour
      Month.value -> Month
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27) {
      encoder.encodeString(value.value)
    }
  }
}
