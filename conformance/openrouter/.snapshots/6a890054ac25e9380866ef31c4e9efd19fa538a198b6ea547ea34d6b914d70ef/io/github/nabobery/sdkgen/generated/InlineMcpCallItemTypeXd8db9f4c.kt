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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpCallItem/properties/type
 */
@Serializable(with = InlineMcpCallItemTypeXd8db9f4c.Serializer::class)
public sealed class InlineMcpCallItemTypeXd8db9f4c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mcp_call`.
   */
  public data object McpCall : InlineMcpCallItemTypeXd8db9f4c() {
    public override val `value`: String = "mcp_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpCallItemTypeXd8db9f4c()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpCallItemTypeXd8db9f4c = when (value) {
      McpCall.value -> McpCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpCallItemTypeXd8db9f4c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMcpCallItemTypeXd8db9f4c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpCallItemTypeXd8db9f4c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpCallItemTypeXd8db9f4c) {
      encoder.encodeString(value.value)
    }
  }
}
