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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContextCompressionPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContextCompressionPlugin/properties/id
 */
@Serializable(with = InlineContextCompressionPluginIdX80e8af94.Serializer::class)
public sealed class InlineContextCompressionPluginIdX80e8af94 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `context-compression`.
   */
  public data object ContextCompression : InlineContextCompressionPluginIdX80e8af94() {
    public override val `value`: String = "context-compression"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContextCompressionPluginIdX80e8af94()

  public companion object {
    public fun fromValue(`value`: String): InlineContextCompressionPluginIdX80e8af94 = when (value) {
      ContextCompression.value -> ContextCompression
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContextCompressionPluginIdX80e8af94> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineContextCompressionPluginIdX80e8af94", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContextCompressionPluginIdX80e8af94 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContextCompressionPluginIdX80e8af94) {
      encoder.encodeString(value.value)
    }
  }
}
