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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpApprovalRequestItem/properties/type
 */
@Serializable(with = InlineMcpApprovalRequestItemTypeX9ec23cf5.Serializer::class)
public sealed class InlineMcpApprovalRequestItemTypeX9ec23cf5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_approval_request`.
   */
  public data object McpApprovalRequest : InlineMcpApprovalRequestItemTypeX9ec23cf5() {
    public override val `value`: String = "mcp_approval_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpApprovalRequestItemTypeX9ec23cf5()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpApprovalRequestItemTypeX9ec23cf5 = when (value) {
      McpApprovalRequest.value -> McpApprovalRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpApprovalRequestItemTypeX9ec23cf5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpApprovalRequestItemTypeX9ec23cf5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpApprovalRequestItemTypeX9ec23cf5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpApprovalRequestItemTypeX9ec23cf5) {
      encoder.encodeString(value.value)
    }
  }
}
