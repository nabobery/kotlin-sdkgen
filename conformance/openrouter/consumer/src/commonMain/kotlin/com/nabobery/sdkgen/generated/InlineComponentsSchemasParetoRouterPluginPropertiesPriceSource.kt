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
 * Price source for the Pareto frontier cost axis. "prompt" uses catalog list price (endpoint.pricing.prompt).
 * "weighted_avg" uses traffic-weighted effective input price from ClickHouse, falling back to prompt price for models
 * without traffic data. Defaults to "prompt".
 */
@Serializable(with = InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource.Serializer::class)
public sealed class InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `prompt`.
   */
  public data object Prompt : InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource() {
    public override val `value`: String = "prompt"
  }

  /**
   * Documented value. Wire value: `weighted_avg`.
   */
  public data object WeightedAvg : InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource() {
    public override val `value`: String = "weighted_avg"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource =
      when (value) {
      Prompt.value -> Prompt
      WeightedAvg.value -> WeightedAvg
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasParetoRouterPluginPropertiesPriceSource) {
      encoder.encodeString(value.value)
    }
  }
}
