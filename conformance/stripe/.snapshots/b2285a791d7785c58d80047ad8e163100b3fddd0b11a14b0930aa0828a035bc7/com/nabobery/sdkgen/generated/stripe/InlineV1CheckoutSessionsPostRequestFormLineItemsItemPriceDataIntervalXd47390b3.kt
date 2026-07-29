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
 * ded/schema/properties/line_items/items/properties/price_data/properties/recurring/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/line_items/items/properties/price_data/properties/recurring/properties/interval
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3) {
      encoder.encodeString(value.value)
    }
  }
}
