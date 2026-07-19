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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputShellCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call`.
   */
  public data object ShellCall : InlineComponentsSchemasOutputShellCallItemPropertiesType() {
    public override val `value`: String = "shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputShellCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputShellCallItemPropertiesType = when (value) {
      ShellCall.value -> ShellCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputShellCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputShellCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
