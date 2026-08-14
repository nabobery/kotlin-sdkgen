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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineWebSearchServerToolOpenRouterTypeX178663c8.Serializer::class)
public sealed class InlineWebSearchServerToolOpenRouterTypeX178663c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineWebSearchServerToolOpenRouterTypeX178663c8() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchServerToolOpenRouterTypeX178663c8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchServerToolOpenRouterTypeX178663c8 = when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchServerToolOpenRouterTypeX178663c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchServerToolOpenRouterTypeX178663c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchServerToolOpenRouterTypeX178663c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchServerToolOpenRouterTypeX178663c8) {
      encoder.encodeString(value.value)
    }
  }
}
