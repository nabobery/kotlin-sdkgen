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
 * sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallOutputItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasLocalShellCallOutputItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasLocalShellCallOutputItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell_call_output`.
   */
  public data object LocalShellCallOutput : InlineComponentsSchemasLocalShellCallOutputItemPropertiesType() {
    public override val `value`: String = "local_shell_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasLocalShellCallOutputItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasLocalShellCallOutputItemPropertiesType =
      when (value) {
      LocalShellCallOutput.value -> LocalShellCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLocalShellCallOutputItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasLocalShellCallOutputItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLocalShellCallOutputItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasLocalShellCallOutputItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
