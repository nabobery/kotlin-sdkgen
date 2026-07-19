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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpApprovalRequestItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMcpApprovalRequestItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMcpApprovalRequestItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_approval_request`.
   */
  public data object McpApprovalRequest : InlineComponentsSchemasMcpApprovalRequestItemPropertiesType() {
    public override val `value`: String = "mcp_approval_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpApprovalRequestItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpApprovalRequestItemPropertiesType = when (value) {
      McpApprovalRequest.value -> McpApprovalRequest
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpApprovalRequestItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpApprovalRequestItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpApprovalRequestItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpApprovalRequestItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
