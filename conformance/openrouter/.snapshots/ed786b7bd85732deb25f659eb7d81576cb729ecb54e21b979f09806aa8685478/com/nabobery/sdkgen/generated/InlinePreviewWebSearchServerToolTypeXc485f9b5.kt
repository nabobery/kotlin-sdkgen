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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchServerTool/properties/type
 */
@Serializable(with = InlinePreviewWebSearchServerToolTypeXc485f9b5.Serializer::class)
public sealed class InlinePreviewWebSearchServerToolTypeXc485f9b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_preview`.
   */
  public data object WebSearchPreview : InlinePreviewWebSearchServerToolTypeXc485f9b5() {
    public override val `value`: String = "web_search_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePreviewWebSearchServerToolTypeXc485f9b5()

  public companion object {
    public fun fromValue(`value`: String): InlinePreviewWebSearchServerToolTypeXc485f9b5 = when (value) {
      WebSearchPreview.value -> WebSearchPreview
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePreviewWebSearchServerToolTypeXc485f9b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePreviewWebSearchServerToolTypeXc485f9b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePreviewWebSearchServerToolTypeXc485f9b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePreviewWebSearchServerToolTypeXc485f9b5) {
      encoder.encodeString(value.value)
    }
  }
}
