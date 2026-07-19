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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMcpServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp`.
   */
  public data object Mcp : InlineComponentsSchemasMcpServerToolPropertiesType() {
    public override val `value`: String = "mcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpServerToolPropertiesType = when (value) {
      Mcp.value -> Mcp
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpServerToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
