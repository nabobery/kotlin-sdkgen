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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ShellCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasShellCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasShellCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call`.
   */
  public data object ShellCall : InlineComponentsSchemasShellCallItemPropertiesType() {
    public override val `value`: String = "shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasShellCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasShellCallItemPropertiesType = when (value) {
      ShellCall.value -> ShellCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasShellCallItemPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellCallItemPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
