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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpApprovalResponseItem/properties/type
 */
@Serializable(with = InlineMcpApprovalResponseItemTypeX11d2becb.Serializer::class)
public sealed class InlineMcpApprovalResponseItemTypeX11d2becb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_approval_response`.
   */
  public data object McpApprovalResponse : InlineMcpApprovalResponseItemTypeX11d2becb() {
    public override val `value`: String = "mcp_approval_response"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpApprovalResponseItemTypeX11d2becb()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpApprovalResponseItemTypeX11d2becb = when (value) {
      McpApprovalResponse.value -> McpApprovalResponse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpApprovalResponseItemTypeX11d2becb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpApprovalResponseItemTypeX11d2becb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpApprovalResponseItemTypeX11d2becb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpApprovalResponseItemTypeX11d2becb) {
      encoder.encodeString(value.value)
    }
  }
}
