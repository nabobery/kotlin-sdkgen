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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputSearchModelsServerToolItem/properties/type
 */
@Serializable(with = InlineOutputSearchModelsServerToolItemTypeX99374856.Serializer::class)
public sealed class InlineOutputSearchModelsServerToolItemTypeX99374856 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineOutputSearchModelsServerToolItemTypeX99374856() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputSearchModelsServerToolItemTypeX99374856()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputSearchModelsServerToolItemTypeX99374856 = when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputSearchModelsServerToolItemTypeX99374856> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputSearchModelsServerToolItemTypeX99374856", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputSearchModelsServerToolItemTypeX99374856 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputSearchModelsServerToolItemTypeX99374856) {
      encoder.encodeString(value.value)
    }
  }
}
