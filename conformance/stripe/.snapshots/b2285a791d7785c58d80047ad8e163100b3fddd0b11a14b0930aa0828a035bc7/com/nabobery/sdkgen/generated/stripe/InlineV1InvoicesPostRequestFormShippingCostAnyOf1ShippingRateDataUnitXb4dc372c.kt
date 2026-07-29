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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum/properties/unit
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business_day`.
   */
  public data object BusinessDay : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c() {
    public override val `value`: String = "business_day"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c = when (value) {
      BusinessDay.value -> BusinessDay
      Day.value -> Day
      Hour.value -> Hour
      Month.value -> Month
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c) {
      encoder.encodeString(value.value)
    }
  }
}
