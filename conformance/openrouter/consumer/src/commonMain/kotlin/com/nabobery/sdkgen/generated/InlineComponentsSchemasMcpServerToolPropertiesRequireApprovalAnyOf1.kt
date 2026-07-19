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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1() {
    public override val `value`: String = "always"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1 =
      when (value) {
      Always.value -> Always
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
