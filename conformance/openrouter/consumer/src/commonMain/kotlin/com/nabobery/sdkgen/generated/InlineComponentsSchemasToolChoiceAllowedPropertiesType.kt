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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/type.
 */
@Serializable(with = InlineComponentsSchemasToolChoiceAllowedPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasToolChoiceAllowedPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `allowed_tools`.
   */
  public data object AllowedTools : InlineComponentsSchemasToolChoiceAllowedPropertiesType() {
    public override val `value`: String = "allowed_tools"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasToolChoiceAllowedPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasToolChoiceAllowedPropertiesType = when (value) {
      AllowedTools.value -> AllowedTools
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasToolChoiceAllowedPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasToolChoiceAllowedPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasToolChoiceAllowedPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasToolChoiceAllowedPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
