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
 */
@Serializable(with = InlineComponentsSchemasShellServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasShellServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell`.
   */
  public data object Shell : InlineComponentsSchemasShellServerToolPropertiesType() {
    public override val `value`: String = "shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasShellServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasShellServerToolPropertiesType = when (value) {
      Shell.value -> Shell
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasShellServerToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
