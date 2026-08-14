package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/1
 */
@Serializable(with = InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873.Serializer::class)
public sealed class InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873() {
    public override val `value`: String = "always"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873 = when (value) {
      Always.value -> Always
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873) {
      encoder.encodeString(value.value)
    }
  }
}
