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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/typ
 * e.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content`.
   */
  public data object Content : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType() {
    public override val `value`: String = "content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType = when (value) {
      Content.value -> Content
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
