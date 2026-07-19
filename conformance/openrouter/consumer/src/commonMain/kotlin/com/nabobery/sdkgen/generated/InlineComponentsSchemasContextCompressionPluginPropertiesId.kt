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
 */
@Serializable(with = InlineComponentsSchemasContextCompressionPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasContextCompressionPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `context-compression`.
   */
  public data object ContextCompression : InlineComponentsSchemasContextCompressionPluginPropertiesId() {
    public override val `value`: String = "context-compression"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContextCompressionPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContextCompressionPluginPropertiesId = when (value) {
      ContextCompression.value -> ContextCompression
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContextCompressionPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContextCompressionPluginPropertiesId", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContextCompressionPluginPropertiesId =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContextCompressionPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
