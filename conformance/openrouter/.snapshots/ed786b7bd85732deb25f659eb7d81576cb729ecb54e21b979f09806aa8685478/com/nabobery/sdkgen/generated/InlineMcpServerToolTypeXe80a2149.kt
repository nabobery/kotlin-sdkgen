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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/type
 */
@Serializable(with = InlineMcpServerToolTypeXe80a2149.Serializer::class)
public sealed class InlineMcpServerToolTypeXe80a2149 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp`.
   */
  public data object Mcp : InlineMcpServerToolTypeXe80a2149() {
    public override val `value`: String = "mcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpServerToolTypeXe80a2149()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpServerToolTypeXe80a2149 = when (value) {
      Mcp.value -> Mcp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolTypeXe80a2149> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpServerToolTypeXe80a2149", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpServerToolTypeXe80a2149 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolTypeXe80a2149) {
      encoder.encodeString(value.value)
    }
  }
}
