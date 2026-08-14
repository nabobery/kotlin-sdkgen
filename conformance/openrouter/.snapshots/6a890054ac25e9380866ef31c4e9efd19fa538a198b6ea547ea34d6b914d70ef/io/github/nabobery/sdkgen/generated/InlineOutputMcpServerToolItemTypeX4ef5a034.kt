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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMcpServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMcpServerToolItem/properties/type
 */
@Serializable(with = InlineOutputMcpServerToolItemTypeX4ef5a034.Serializer::class)
public sealed class InlineOutputMcpServerToolItemTypeX4ef5a034 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:mcp`.
   */
  public data object OpenrouterMcp : InlineOutputMcpServerToolItemTypeX4ef5a034() {
    public override val `value`: String = "openrouter:mcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMcpServerToolItemTypeX4ef5a034()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMcpServerToolItemTypeX4ef5a034 = when (value) {
      OpenrouterMcp.value -> OpenrouterMcp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMcpServerToolItemTypeX4ef5a034> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputMcpServerToolItemTypeX4ef5a034", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMcpServerToolItemTypeX4ef5a034 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMcpServerToolItemTypeX4ef5a034) {
      encoder.encodeString(value.value)
    }
  }
}
