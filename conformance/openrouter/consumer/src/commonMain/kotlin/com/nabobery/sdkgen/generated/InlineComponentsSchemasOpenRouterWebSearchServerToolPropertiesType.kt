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
 */
@Serializable(with = InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType =
      when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
