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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasLocalShellCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasLocalShellCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell_call`.
   */
  public data object LocalShellCall : InlineComponentsSchemasLocalShellCallItemPropertiesType() {
    public override val `value`: String = "local_shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasLocalShellCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasLocalShellCallItemPropertiesType = when (value) {
      LocalShellCall.value -> LocalShellCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLocalShellCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasLocalShellCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLocalShellCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasLocalShellCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
