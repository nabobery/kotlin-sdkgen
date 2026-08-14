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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate/properties/object
 */
@Serializable(with = InlineShippingRateObjectValueX6333f01b.Serializer::class)
public sealed class InlineShippingRateObjectValueX6333f01b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shipping_rate`.
   */
  public data object ShippingRate : InlineShippingRateObjectValueX6333f01b() {
    public override val `value`: String = "shipping_rate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShippingRateObjectValueX6333f01b()

  public companion object {
    public fun fromValue(`value`: String): InlineShippingRateObjectValueX6333f01b = when (value) {
      ShippingRate.value -> ShippingRate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShippingRateObjectValueX6333f01b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineShippingRateObjectValueX6333f01b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShippingRateObjectValueX6333f01b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateObjectValueX6333f01b) {
      encoder.encodeString(value.value)
    }
  }
}
