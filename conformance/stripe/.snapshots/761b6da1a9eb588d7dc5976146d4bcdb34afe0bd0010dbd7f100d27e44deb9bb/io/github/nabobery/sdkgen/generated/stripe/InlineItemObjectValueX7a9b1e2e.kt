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
 * Source: sdkgen://source/openapi.json#/components/schemas/item/properties/object
 */
@Serializable(with = InlineItemObjectValueX7a9b1e2e.Serializer::class)
public sealed class InlineItemObjectValueX7a9b1e2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `item`.
   */
  public data object Item : InlineItemObjectValueX7a9b1e2e() {
    public override val `value`: String = "item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineItemObjectValueX7a9b1e2e()

  public companion object {
    public fun fromValue(`value`: String): InlineItemObjectValueX7a9b1e2e = when (value) {
      Item.value -> Item
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineItemObjectValueX7a9b1e2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineItemObjectValueX7a9b1e2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineItemObjectValueX7a9b1e2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineItemObjectValueX7a9b1e2e) {
      encoder.encodeString(value.value)
    }
  }
}
