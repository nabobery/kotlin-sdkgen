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
 * Only required if a [default tax
 * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(rec
 * ommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of taxes
 * or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either `inclusive` or
 * `exclusive`, it cannot be changed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/tax_behavior
 */
@Serializable(with = InlineV1PricesPostRequestFormTaxBehaviorX568b489a.Serializer::class)
public sealed class InlineV1PricesPostRequestFormTaxBehaviorX568b489a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1PricesPostRequestFormTaxBehaviorX568b489a() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1PricesPostRequestFormTaxBehaviorX568b489a() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PricesPostRequestFormTaxBehaviorX568b489a() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormTaxBehaviorX568b489a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormTaxBehaviorX568b489a = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormTaxBehaviorX568b489a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormTaxBehaviorX568b489a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTaxBehaviorX568b489a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTaxBehaviorX568b489a) {
      encoder.encodeString(value.value)
    }
  }
}
