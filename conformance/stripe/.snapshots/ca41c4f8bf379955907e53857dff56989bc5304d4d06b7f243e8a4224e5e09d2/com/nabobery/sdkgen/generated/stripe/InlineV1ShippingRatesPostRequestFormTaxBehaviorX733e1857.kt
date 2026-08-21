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
 * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
 * or `unspecified`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/tax_behavior
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857) {
      encoder.encodeString(value.value)
    }
  }
}
