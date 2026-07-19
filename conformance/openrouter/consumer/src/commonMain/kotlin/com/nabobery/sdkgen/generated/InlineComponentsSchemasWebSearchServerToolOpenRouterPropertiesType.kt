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
 * sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool_OpenRouter/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
