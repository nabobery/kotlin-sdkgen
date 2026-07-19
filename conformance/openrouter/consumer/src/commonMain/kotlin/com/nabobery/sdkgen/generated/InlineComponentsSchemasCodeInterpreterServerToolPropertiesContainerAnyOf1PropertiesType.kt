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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1/properties/ty
 * pe.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
