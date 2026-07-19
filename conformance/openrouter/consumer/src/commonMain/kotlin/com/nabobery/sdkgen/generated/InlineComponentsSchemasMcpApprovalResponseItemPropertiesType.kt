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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpApprovalResponseItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMcpApprovalResponseItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMcpApprovalResponseItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_approval_response`.
   */
  public data object McpApprovalResponse : InlineComponentsSchemasMcpApprovalResponseItemPropertiesType() {
    public override val `value`: String = "mcp_approval_response"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpApprovalResponseItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpApprovalResponseItemPropertiesType = when (value) {
      McpApprovalResponse.value -> McpApprovalResponse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpApprovalResponseItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpApprovalResponseItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpApprovalResponseItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpApprovalResponseItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
