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
 * sdkgen://source/openapi.yaml#/components/schemas/SearchModelsServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SearchModelsServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineSearchModelsServerToolOpenRouterTypeXdc204ff5.Serializer::class)
public sealed class InlineSearchModelsServerToolOpenRouterTypeXdc204ff5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineSearchModelsServerToolOpenRouterTypeXdc204ff5() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchModelsServerToolOpenRouterTypeXdc204ff5()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchModelsServerToolOpenRouterTypeXdc204ff5 = when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchModelsServerToolOpenRouterTypeXdc204ff5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSearchModelsServerToolOpenRouterTypeXdc204ff5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchModelsServerToolOpenRouterTypeXdc204ff5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchModelsServerToolOpenRouterTypeXdc204ff5) {
      encoder.encodeString(value.value)
    }
  }
}
