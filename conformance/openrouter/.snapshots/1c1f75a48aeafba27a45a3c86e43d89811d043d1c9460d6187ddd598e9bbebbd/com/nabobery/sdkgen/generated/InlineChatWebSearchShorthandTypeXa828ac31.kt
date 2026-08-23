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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatWebSearchShorthand/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatWebSearchShorthand/properties/type
 */
@Serializable(with = InlineChatWebSearchShorthandTypeXa828ac31.Serializer::class)
public sealed class InlineChatWebSearchShorthandTypeXa828ac31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search`.
   */
  public data object WebSearch : InlineChatWebSearchShorthandTypeXa828ac31() {
    public override val `value`: String = "web_search"
  }

  /**
   * Documented value. Wire value: `web_search_preview`.
   */
  public data object WebSearchPreview : InlineChatWebSearchShorthandTypeXa828ac31() {
    public override val `value`: String = "web_search_preview"
  }

  /**
   * Documented value. Wire value: `web_search_preview_2025_03_11`.
   */
  public data object WebSearchPreview20250311 : InlineChatWebSearchShorthandTypeXa828ac31() {
    public override val `value`: String = "web_search_preview_2025_03_11"
  }

  /**
   * Documented value. Wire value: `web_search_2025_08_26`.
   */
  public data object WebSearch20250826 : InlineChatWebSearchShorthandTypeXa828ac31() {
    public override val `value`: String = "web_search_2025_08_26"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatWebSearchShorthandTypeXa828ac31()

  public companion object {
    public fun fromValue(`value`: String): InlineChatWebSearchShorthandTypeXa828ac31 = when (value) {
      WebSearch.value -> WebSearch
      WebSearchPreview.value -> WebSearchPreview
      WebSearchPreview20250311.value -> WebSearchPreview20250311
      WebSearch20250826.value -> WebSearch20250826
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatWebSearchShorthandTypeXa828ac31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatWebSearchShorthandTypeXa828ac31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatWebSearchShorthandTypeXa828ac31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatWebSearchShorthandTypeXa828ac31) {
      encoder.encodeString(value.value)
    }
  }
}
