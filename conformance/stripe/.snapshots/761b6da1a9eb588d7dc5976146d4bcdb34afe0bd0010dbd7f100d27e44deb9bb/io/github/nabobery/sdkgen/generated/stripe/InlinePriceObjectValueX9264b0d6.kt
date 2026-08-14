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
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/object
 */
@Serializable(with = InlinePriceObjectValueX9264b0d6.Serializer::class)
public sealed class InlinePriceObjectValueX9264b0d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlinePriceObjectValueX9264b0d6() {
    public override val `value`: String = "price"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePriceObjectValueX9264b0d6()

  public companion object {
    public fun fromValue(`value`: String): InlinePriceObjectValueX9264b0d6 = when (value) {
      Price.value -> Price
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePriceObjectValueX9264b0d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePriceObjectValueX9264b0d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePriceObjectValueX9264b0d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePriceObjectValueX9264b0d6) {
      encoder.encodeString(value.value)
    }
  }
}
