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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/2
 */
@Serializable(with = InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f.Serializer::class)
public sealed class InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f = when (value) {
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f) {
      encoder.encodeString(value.value)
    }
  }
}
