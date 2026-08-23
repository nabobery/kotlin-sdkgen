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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenRouterWebSearchServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenRouterWebSearchServerTool/properties/type
 */
@Serializable(with = InlineOpenRouterWebSearchServerToolTypeXa67c9eca.Serializer::class)
public sealed class InlineOpenRouterWebSearchServerToolTypeXa67c9eca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineOpenRouterWebSearchServerToolTypeXa67c9eca() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenRouterWebSearchServerToolTypeXa67c9eca()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenRouterWebSearchServerToolTypeXa67c9eca = when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenRouterWebSearchServerToolTypeXa67c9eca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenRouterWebSearchServerToolTypeXa67c9eca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenRouterWebSearchServerToolTypeXa67c9eca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenRouterWebSearchServerToolTypeXa67c9eca) {
      encoder.encodeString(value.value)
    }
  }
}
