package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/delivery_estimate/properties/minimum/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/delivery_estimate/properties/minimum/properties/unit
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business_day`.
   */
  public data object BusinessDay : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c() {
    public override val `value`: String = "business_day"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c = when (value) {
      BusinessDay.value -> BusinessDay
      Day.value -> Day
      Hour.value -> Hour
      Month.value -> Month
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumUnitXf22af00c) {
      encoder.encodeString(value.value)
    }
  }
}
