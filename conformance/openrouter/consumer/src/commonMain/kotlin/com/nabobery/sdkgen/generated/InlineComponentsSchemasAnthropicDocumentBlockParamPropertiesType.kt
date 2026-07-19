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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document`.
   */
  public data object Document : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType() {
    public override val `value`: String = "document"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType =
      when (value) {
      Document.value -> Document
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
