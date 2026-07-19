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
 * sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/action/properties/type.
 */
@Serializable(with = InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exec`.
   */
  public data object Exec : InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType() {
    public override val `value`: String = "exec"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType =
      when (value) {
      Exec.value -> Exec
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
