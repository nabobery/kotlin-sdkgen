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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/type
 */
@Serializable(with = InlineShellCallOutputItemTypeX6e6337a0.Serializer::class)
public sealed class InlineShellCallOutputItemTypeX6e6337a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call_output`.
   */
  public data object ShellCallOutput : InlineShellCallOutputItemTypeX6e6337a0() {
    public override val `value`: String = "shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShellCallOutputItemTypeX6e6337a0()

  public companion object {
    public fun fromValue(`value`: String): InlineShellCallOutputItemTypeX6e6337a0 = when (value) {
      ShellCallOutput.value -> ShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShellCallOutputItemTypeX6e6337a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineShellCallOutputItemTypeX6e6337a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShellCallOutputItemTypeX6e6337a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShellCallOutputItemTypeX6e6337a0) {
      encoder.encodeString(value.value)
    }
  }
}
