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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicFileDocumentSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType =
      when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
