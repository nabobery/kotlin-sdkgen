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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasShellCallOutputItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasShellCallOutputItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call_output`.
   */
  public data object ShellCallOutput : InlineComponentsSchemasShellCallOutputItemPropertiesType() {
    public override val `value`: String = "shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasShellCallOutputItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasShellCallOutputItemPropertiesType = when (value) {
      ShellCallOutput.value -> ShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellCallOutputItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasShellCallOutputItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellCallOutputItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellCallOutputItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
