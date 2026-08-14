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
 * The type of calculation to use on the shipping rate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/type
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormTypeX43c932eb.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormTypeX43c932eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed_amount`.
   */
  public data object FixedAmount : InlineV1ShippingRatesPostRequestFormTypeX43c932eb() {
    public override val `value`: String = "fixed_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ShippingRatesPostRequestFormTypeX43c932eb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormTypeX43c932eb = when (value) {
      FixedAmount.value -> FixedAmount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormTypeX43c932eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormTypeX43c932eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormTypeX43c932eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormTypeX43c932eb) {
      encoder.encodeString(value.value)
    }
  }
}
