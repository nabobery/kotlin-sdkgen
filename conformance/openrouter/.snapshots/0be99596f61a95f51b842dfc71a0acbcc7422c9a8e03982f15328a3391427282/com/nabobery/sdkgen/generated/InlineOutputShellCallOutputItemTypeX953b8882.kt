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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/type
 */
@Serializable(with = InlineOutputShellCallOutputItemTypeX953b8882.Serializer::class)
public sealed class InlineOutputShellCallOutputItemTypeX953b8882 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call_output`.
   */
  public data object ShellCallOutput : InlineOutputShellCallOutputItemTypeX953b8882() {
    public override val `value`: String = "shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputShellCallOutputItemTypeX953b8882()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputShellCallOutputItemTypeX953b8882 = when (value) {
      ShellCallOutput.value -> ShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputShellCallOutputItemTypeX953b8882> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputShellCallOutputItemTypeX953b8882", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputShellCallOutputItemTypeX953b8882 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallOutputItemTypeX953b8882) {
      encoder.encodeString(value.value)
    }
  }
}
