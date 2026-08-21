package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ShellServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellServerTool/properties/type
 */
@Serializable(with = InlineShellServerToolTypeX5a1681b4.Serializer::class)
public sealed class InlineShellServerToolTypeX5a1681b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell`.
   */
  public data object Shell : InlineShellServerToolTypeX5a1681b4() {
    public override val `value`: String = "shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShellServerToolTypeX5a1681b4()

  public companion object {
    public fun fromValue(`value`: String): InlineShellServerToolTypeX5a1681b4 = when (value) {
      Shell.value -> Shell
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShellServerToolTypeX5a1681b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineShellServerToolTypeX5a1681b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShellServerToolTypeX5a1681b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShellServerToolTypeX5a1681b4) {
      encoder.encodeString(value.value)
    }
  }
}
