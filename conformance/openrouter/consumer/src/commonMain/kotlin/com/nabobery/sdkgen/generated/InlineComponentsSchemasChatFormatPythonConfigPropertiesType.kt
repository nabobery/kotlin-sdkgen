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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatPythonConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFormatPythonConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFormatPythonConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineComponentsSchemasChatFormatPythonConfigPropertiesType() {
    public override val `value`: String = "python"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFormatPythonConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFormatPythonConfigPropertiesType = when (value) {
      Python.value -> Python
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFormatPythonConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFormatPythonConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFormatPythonConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFormatPythonConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
