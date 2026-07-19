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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolUserLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType =
      when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebSearchToolUserLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
