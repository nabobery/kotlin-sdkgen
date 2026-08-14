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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_card/properties/object
 */
@Serializable(with = InlineDeletedCardObjectValueX8a553c3e.Serializer::class)
public sealed class InlineDeletedCardObjectValueX8a553c3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineDeletedCardObjectValueX8a553c3e() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedCardObjectValueX8a553c3e()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedCardObjectValueX8a553c3e = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedCardObjectValueX8a553c3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedCardObjectValueX8a553c3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedCardObjectValueX8a553c3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedCardObjectValueX8a553c3e) {
      encoder.encodeString(value.value)
    }
  }
}
