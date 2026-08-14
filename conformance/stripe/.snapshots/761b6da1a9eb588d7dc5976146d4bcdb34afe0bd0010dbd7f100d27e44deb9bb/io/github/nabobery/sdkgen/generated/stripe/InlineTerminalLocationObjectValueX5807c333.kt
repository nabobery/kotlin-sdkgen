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
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.location/properties/object
 */
@Serializable(with = InlineTerminalLocationObjectValueX5807c333.Serializer::class)
public sealed class InlineTerminalLocationObjectValueX5807c333 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.location`.
   */
  public data object TerminalLocation : InlineTerminalLocationObjectValueX5807c333() {
    public override val `value`: String = "terminal.location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalLocationObjectValueX5807c333()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalLocationObjectValueX5807c333 = when (value) {
      TerminalLocation.value -> TerminalLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalLocationObjectValueX5807c333> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalLocationObjectValueX5807c333", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalLocationObjectValueX5807c333 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalLocationObjectValueX5807c333) {
      encoder.encodeString(value.value)
    }
  }
}
