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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlDirective/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ephemeral`.
   */
  public data object Ephemeral : InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType() {
    public override val `value`: String = "ephemeral"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType =
      when (value) {
      Ephemeral.value -> Ephemeral
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
