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
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2 =
      when (value) {
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
