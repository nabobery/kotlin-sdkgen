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
 * sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview`.
   */
  public data object WebSearchPreview : InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType() {
    public override val `value`: String = "web_search_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType =
      when (value) {
      WebSearchPreview.value -> WebSearchPreview
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
