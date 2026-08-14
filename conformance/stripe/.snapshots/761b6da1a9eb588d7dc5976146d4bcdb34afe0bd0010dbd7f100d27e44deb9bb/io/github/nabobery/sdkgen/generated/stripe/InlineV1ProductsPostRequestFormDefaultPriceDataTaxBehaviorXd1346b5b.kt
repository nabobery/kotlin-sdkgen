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
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b.Serializer::class)
public sealed class InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b) {
      encoder.encodeString(value.value)
    }
  }
}
