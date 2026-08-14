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
 * sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallOutputItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallOutputItem/properties/type
 */
@Serializable(with = InlineLocalShellCallOutputItemTypeX2b68a326.Serializer::class)
public sealed class InlineLocalShellCallOutputItemTypeX2b68a326 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell_call_output`.
   */
  public data object LocalShellCallOutput : InlineLocalShellCallOutputItemTypeX2b68a326() {
    public override val `value`: String = "local_shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLocalShellCallOutputItemTypeX2b68a326()

  public companion object {
    public fun fromValue(`value`: String): InlineLocalShellCallOutputItemTypeX2b68a326 = when (value) {
      LocalShellCallOutput.value -> LocalShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLocalShellCallOutputItemTypeX2b68a326> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineLocalShellCallOutputItemTypeX2b68a326", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLocalShellCallOutputItemTypeX2b68a326 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLocalShellCallOutputItemTypeX2b68a326) {
      encoder.encodeString(value.value)
    }
  }
}
