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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpListToolsItem/properties/type
 */
@Serializable(with = InlineMcpListToolsItemTypeXbfaedf1b.Serializer::class)
public sealed class InlineMcpListToolsItemTypeXbfaedf1b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_list_tools`.
   */
  public data object McpListTools : InlineMcpListToolsItemTypeXbfaedf1b() {
    public override val `value`: String = "mcp_list_tools"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpListToolsItemTypeXbfaedf1b()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpListToolsItemTypeXbfaedf1b = when (value) {
      McpListTools.value -> McpListTools
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpListToolsItemTypeXbfaedf1b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpListToolsItemTypeXbfaedf1b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpListToolsItemTypeXbfaedf1b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpListToolsItemTypeXbfaedf1b) {
      encoder.encodeString(value.value)
    }
  }
}
