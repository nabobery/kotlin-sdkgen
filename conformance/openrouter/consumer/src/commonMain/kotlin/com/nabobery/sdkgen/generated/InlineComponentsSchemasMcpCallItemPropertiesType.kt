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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMcpCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMcpCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_call`.
   */
  public data object McpCall : InlineComponentsSchemasMcpCallItemPropertiesType() {
    public override val `value`: String = "mcp_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpCallItemPropertiesType = when (value) {
      McpCall.value -> McpCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpCallItemPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpCallItemPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
