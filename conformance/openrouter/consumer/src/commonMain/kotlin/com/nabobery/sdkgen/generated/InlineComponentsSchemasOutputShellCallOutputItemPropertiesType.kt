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
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputShellCallOutputItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call_output`.
   */
  public data object ShellCallOutput : InlineComponentsSchemasOutputShellCallOutputItemPropertiesType() {
    public override val `value`: String = "shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputShellCallOutputItemPropertiesType =
      when (value) {
      ShellCallOutput.value -> ShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputShellCallOutputItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
