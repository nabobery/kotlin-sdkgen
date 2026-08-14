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
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items/properties/up_
 * to/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items/properties/up_
 * to/anyOf/0
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5.Serializer::class)
public sealed class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inf`.
   */
  public data object Inf : InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5() {
    public override val `value`: String = "inf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 = when (value) {
      Inf.value -> Inf
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5) {
      encoder.encodeString(value.value)
    }
  }
}
