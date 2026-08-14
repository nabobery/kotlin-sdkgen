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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/recurring/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/recurring/properties/interval
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b) {
      encoder.encodeString(value.value)
    }
  }
}
