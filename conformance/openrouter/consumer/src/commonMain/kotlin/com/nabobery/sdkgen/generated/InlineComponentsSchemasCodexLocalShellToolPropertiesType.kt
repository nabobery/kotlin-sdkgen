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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CodexLocalShellTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCodexLocalShellToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCodexLocalShellToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell`.
   */
  public data object LocalShell : InlineComponentsSchemasCodexLocalShellToolPropertiesType() {
    public override val `value`: String = "local_shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodexLocalShellToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodexLocalShellToolPropertiesType = when (value) {
      LocalShell.value -> LocalShell
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodexLocalShellToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodexLocalShellToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodexLocalShellToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCodexLocalShellToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
