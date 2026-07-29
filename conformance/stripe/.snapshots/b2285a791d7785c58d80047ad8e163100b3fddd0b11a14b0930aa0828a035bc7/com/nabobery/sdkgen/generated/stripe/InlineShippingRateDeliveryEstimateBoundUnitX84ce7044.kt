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
 * A unit of time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_delivery_estimate_bound/properties/unit
 */
@Serializable(with = InlineShippingRateDeliveryEstimateBoundUnitX84ce7044.Serializer::class)
public sealed class InlineShippingRateDeliveryEstimateBoundUnitX84ce7044 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business_day`.
   */
  public data object BusinessDay : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044() {
    public override val `value`: String = "business_day"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShippingRateDeliveryEstimateBoundUnitX84ce7044()

  public companion object {
    public fun fromValue(`value`: String): InlineShippingRateDeliveryEstimateBoundUnitX84ce7044 = when (value) {
      BusinessDay.value -> BusinessDay
      Day.value -> Day
      Hour.value -> Hour
      Month.value -> Month
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineShippingRateDeliveryEstimateBoundUnitX84ce7044> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineShippingRateDeliveryEstimateBoundUnitX84ce7044", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShippingRateDeliveryEstimateBoundUnitX84ce7044 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateDeliveryEstimateBoundUnitX84ce7044) {
      encoder.encodeString(value.value)
    }
  }
}
