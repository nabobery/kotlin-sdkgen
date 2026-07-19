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
 * sdkgen://source/openapi.yaml#/components/schemas/Preview_20250311_WebSearchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview_2025_03_11`.
   */
  public data object WebSearchPreview20250311 : InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType() {
    public override val `value`: String = "web_search_preview_2025_03_11"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType =
      when (value) {
      WebSearchPreview20250311.value -> WebSearchPreview20250311
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
