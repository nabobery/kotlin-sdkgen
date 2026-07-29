package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The rendering mode.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1markdown/post/requestBody/content/application~1json/schema/properties/mode
 */
@Serializable(with = InlineMarkdownPostRequestJsonModeXbd7bd11d.Serializer::class)
public sealed class InlineMarkdownPostRequestJsonModeXbd7bd11d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `markdown`.
   */
  public data object Markdown : InlineMarkdownPostRequestJsonModeXbd7bd11d() {
    public override val `value`: String = "markdown"
  }

  /**
   * Documented value. Wire value: `gfm`.
   */
  public data object Gfm : InlineMarkdownPostRequestJsonModeXbd7bd11d() {
    public override val `value`: String = "gfm"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMarkdownPostRequestJsonModeXbd7bd11d()

  public companion object {
    public fun fromValue(`value`: String): InlineMarkdownPostRequestJsonModeXbd7bd11d = when (value) {
      Markdown.value -> Markdown
      Gfm.value -> Gfm
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMarkdownPostRequestJsonModeXbd7bd11d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineMarkdownPostRequestJsonModeXbd7bd11d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMarkdownPostRequestJsonModeXbd7bd11d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMarkdownPostRequestJsonModeXbd7bd11d) {
      encoder.encodeString(value.value)
    }
  }
}
