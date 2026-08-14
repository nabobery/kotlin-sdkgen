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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_terminal.location/properties/object
 */
@Serializable(with = InlineDeletedTerminalLocationObjectValueXb1d2267f.Serializer::class)
public sealed class InlineDeletedTerminalLocationObjectValueXb1d2267f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.location`.
   */
  public data object TerminalLocation : InlineDeletedTerminalLocationObjectValueXb1d2267f() {
    public override val `value`: String = "terminal.location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedTerminalLocationObjectValueXb1d2267f()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedTerminalLocationObjectValueXb1d2267f = when (value) {
      TerminalLocation.value -> TerminalLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedTerminalLocationObjectValueXb1d2267f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedTerminalLocationObjectValueXb1d2267f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedTerminalLocationObjectValueXb1d2267f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedTerminalLocationObjectValueXb1d2267f) {
      encoder.encodeString(value.value)
    }
  }
}
