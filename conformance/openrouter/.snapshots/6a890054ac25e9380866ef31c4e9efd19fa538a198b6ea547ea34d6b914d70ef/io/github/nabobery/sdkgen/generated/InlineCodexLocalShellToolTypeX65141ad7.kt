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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CodexLocalShellTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodexLocalShellTool/properties/type
 */
@Serializable(with = InlineCodexLocalShellToolTypeX65141ad7.Serializer::class)
public sealed class InlineCodexLocalShellToolTypeX65141ad7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell`.
   */
  public data object LocalShell : InlineCodexLocalShellToolTypeX65141ad7() {
    public override val `value`: String = "local_shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodexLocalShellToolTypeX65141ad7()

  public companion object {
    public fun fromValue(`value`: String): InlineCodexLocalShellToolTypeX65141ad7 = when (value) {
      LocalShell.value -> LocalShell
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodexLocalShellToolTypeX65141ad7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCodexLocalShellToolTypeX65141ad7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodexLocalShellToolTypeX65141ad7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodexLocalShellToolTypeX65141ad7) {
      encoder.encodeString(value.value)
    }
  }
}
