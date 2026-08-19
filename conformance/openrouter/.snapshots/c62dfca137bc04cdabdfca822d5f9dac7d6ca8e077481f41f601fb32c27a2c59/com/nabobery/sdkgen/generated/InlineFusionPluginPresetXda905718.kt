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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/preset
 */
@Serializable(with = InlineFusionPluginPresetXda905718.Serializer::class)
public sealed class InlineFusionPluginPresetXda905718 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `general-high`.
   */
  public data object GeneralHigh : InlineFusionPluginPresetXda905718() {
    public override val `value`: String = "general-high"
  }

  /**
   * Documented value. Wire value: `general-budget`.
   */
  public data object GeneralBudget : InlineFusionPluginPresetXda905718() {
    public override val `value`: String = "general-budget"
  }

  /**
   * Documented value. Wire value: `general-fast`.
   */
  public data object GeneralFast : InlineFusionPluginPresetXda905718() {
    public override val `value`: String = "general-fast"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionPluginPresetXda905718()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionPluginPresetXda905718 = when (value) {
      GeneralHigh.value -> GeneralHigh
      GeneralBudget.value -> GeneralBudget
      GeneralFast.value -> GeneralFast
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionPluginPresetXda905718> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionPluginPresetXda905718", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionPluginPresetXda905718 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionPluginPresetXda905718) {
      encoder.encodeString(value.value)
    }
  }
}
