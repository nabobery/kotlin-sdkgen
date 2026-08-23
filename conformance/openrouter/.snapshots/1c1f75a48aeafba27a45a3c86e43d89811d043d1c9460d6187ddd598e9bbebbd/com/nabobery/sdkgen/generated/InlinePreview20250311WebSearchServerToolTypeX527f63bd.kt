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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preview_20250311_WebSearchServerTool/properties/type
 */
@Serializable(with = InlinePreview20250311WebSearchServerToolTypeX527f63bd.Serializer::class)
public sealed class InlinePreview20250311WebSearchServerToolTypeX527f63bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview_2025_03_11`.
   */
  public data object WebSearchPreview20250311 : InlinePreview20250311WebSearchServerToolTypeX527f63bd() {
    public override val `value`: String = "web_search_preview_2025_03_11"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePreview20250311WebSearchServerToolTypeX527f63bd()

  public companion object {
    public fun fromValue(`value`: String): InlinePreview20250311WebSearchServerToolTypeX527f63bd = when (value) {
      WebSearchPreview20250311.value -> WebSearchPreview20250311
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePreview20250311WebSearchServerToolTypeX527f63bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePreview20250311WebSearchServerToolTypeX527f63bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePreview20250311WebSearchServerToolTypeX527f63bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePreview20250311WebSearchServerToolTypeX527f63bd) {
      encoder.encodeString(value.value)
    }
  }
}
