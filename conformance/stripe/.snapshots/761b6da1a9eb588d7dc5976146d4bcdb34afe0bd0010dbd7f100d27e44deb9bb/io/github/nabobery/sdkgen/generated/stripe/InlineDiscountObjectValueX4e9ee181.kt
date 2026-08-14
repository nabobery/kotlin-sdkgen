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
 * Source: sdkgen://source/openapi.json#/components/schemas/discount/properties/object
 */
@Serializable(with = InlineDiscountObjectValueX4e9ee181.Serializer::class)
public sealed class InlineDiscountObjectValueX4e9ee181 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `discount`.
   */
  public data object Discount : InlineDiscountObjectValueX4e9ee181() {
    public override val `value`: String = "discount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscountObjectValueX4e9ee181()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscountObjectValueX4e9ee181 = when (value) {
      Discount.value -> Discount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDiscountObjectValueX4e9ee181> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDiscountObjectValueX4e9ee181", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscountObjectValueX4e9ee181 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscountObjectValueX4e9ee181) {
      encoder.encodeString(value.value)
    }
  }
}
