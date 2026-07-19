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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputSearchModelsServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType =
      when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputSearchModelsServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
