package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/action/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/action/properties/type
 */
@Serializable(with = InlineLocalShellCallItemActionTypeX536632c8.Serializer::class)
public sealed class InlineLocalShellCallItemActionTypeX536632c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exec`.
   */
  public data object Exec : InlineLocalShellCallItemActionTypeX536632c8() {
    public override val `value`: String = "exec"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLocalShellCallItemActionTypeX536632c8()

  public companion object {
    public fun fromValue(`value`: String): InlineLocalShellCallItemActionTypeX536632c8 = when (value) {
      Exec.value -> Exec
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLocalShellCallItemActionTypeX536632c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineLocalShellCallItemActionTypeX536632c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLocalShellCallItemActionTypeX536632c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLocalShellCallItemActionTypeX536632c8) {
      encoder.encodeString(value.value)
    }
  }
}
