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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_price/properties/object
 */
@Serializable(with = InlineDeletedPriceObjectValueXf790add3.Serializer::class)
public sealed class InlineDeletedPriceObjectValueXf790add3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineDeletedPriceObjectValueXf790add3() {
    public override val `value`: String = "price"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedPriceObjectValueXf790add3()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedPriceObjectValueXf790add3 = when (value) {
      Price.value -> Price
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedPriceObjectValueXf790add3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedPriceObjectValueXf790add3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedPriceObjectValueXf790add3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedPriceObjectValueXf790add3) {
      encoder.encodeString(value.value)
    }
  }
}
