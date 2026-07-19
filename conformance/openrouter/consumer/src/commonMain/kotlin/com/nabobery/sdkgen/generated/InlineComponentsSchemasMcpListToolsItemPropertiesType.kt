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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpListToolsItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMcpListToolsItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMcpListToolsItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_list_tools`.
   */
  public data object McpListTools : InlineComponentsSchemasMcpListToolsItemPropertiesType() {
    public override val `value`: String = "mcp_list_tools"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpListToolsItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpListToolsItemPropertiesType = when (value) {
      McpListTools.value -> McpListTools
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpListToolsItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpListToolsItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpListToolsItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpListToolsItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
