package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool/properties/type
 */
@Serializable(with = InlineWebSearchServerToolTypeX7d2abf06.Serializer::class)
public sealed class InlineWebSearchServerToolTypeX7d2abf06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_2025_08_26`.
   */
  public data object WebSearch20250826 : InlineWebSearchServerToolTypeX7d2abf06() {
    public override val `value`: String = "web_search_2025_08_26"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchServerToolTypeX7d2abf06()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchServerToolTypeX7d2abf06 = when (value) {
      WebSearch20250826.value -> WebSearch20250826
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchServerToolTypeX7d2abf06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchServerToolTypeX7d2abf06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchServerToolTypeX7d2abf06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchServerToolTypeX7d2abf06) {
      encoder.encodeString(value.value)
    }
  }
}
