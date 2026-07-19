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
 * A curated OpenRouter fusion preset (slugs follow `<task>-<tier>`, e.g. `general-high`). Expands server-side into the
 * preset's analysis_models panel and judge model, so callers never name individual models. Explicitly provided
 * `analysis_models` / `model` take precedence.
 */
@Serializable(with = InlineComponentsSchemasFusionPluginPropertiesPreset.Serializer::class)
public sealed class InlineComponentsSchemasFusionPluginPropertiesPreset {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `general-high`.
   */
  public data object GeneralHigh : InlineComponentsSchemasFusionPluginPropertiesPreset() {
    public override val `value`: String = "general-high"
  }

  /**
   * Documented value. Wire value: `general-budget`.
   */
  public data object GeneralBudget : InlineComponentsSchemasFusionPluginPropertiesPreset() {
    public override val `value`: String = "general-budget"
  }

  /**
   * Documented value. Wire value: `general-fast`.
   */
  public data object GeneralFast : InlineComponentsSchemasFusionPluginPropertiesPreset() {
    public override val `value`: String = "general-fast"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionPluginPropertiesPreset()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionPluginPropertiesPreset = when (value) {
      GeneralHigh.value -> GeneralHigh
      GeneralBudget.value -> GeneralBudget
      GeneralFast.value -> GeneralFast
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionPluginPropertiesPreset> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionPluginPropertiesPreset",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionPluginPropertiesPreset = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionPluginPropertiesPreset) {
      encoder.encodeString(value.value)
    }
  }
}
