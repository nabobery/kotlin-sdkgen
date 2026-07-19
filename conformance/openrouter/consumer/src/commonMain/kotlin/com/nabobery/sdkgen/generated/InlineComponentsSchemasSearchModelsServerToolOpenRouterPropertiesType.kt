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
 */
@Serializable(with = InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
