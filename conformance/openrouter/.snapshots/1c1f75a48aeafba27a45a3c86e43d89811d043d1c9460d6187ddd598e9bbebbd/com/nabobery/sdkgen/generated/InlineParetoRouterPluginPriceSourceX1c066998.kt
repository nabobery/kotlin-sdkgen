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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ParetoRouterPlugin/properties/price_source
 */
@Serializable(with = InlineParetoRouterPluginPriceSourceX1c066998.Serializer::class)
public sealed class InlineParetoRouterPluginPriceSourceX1c066998 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `prompt`.
   */
  public data object Prompt : InlineParetoRouterPluginPriceSourceX1c066998() {
    public override val `value`: String = "prompt"
  }

  /**
   * Documented value. Wire value: `weighted_avg`.
   */
  public data object WeightedAvg : InlineParetoRouterPluginPriceSourceX1c066998() {
    public override val `value`: String = "weighted_avg"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineParetoRouterPluginPriceSourceX1c066998()

  public companion object {
    public fun fromValue(`value`: String): InlineParetoRouterPluginPriceSourceX1c066998 = when (value) {
      Prompt.value -> Prompt
      WeightedAvg.value -> WeightedAvg
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineParetoRouterPluginPriceSourceX1c066998> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineParetoRouterPluginPriceSourceX1c066998", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineParetoRouterPluginPriceSourceX1c066998 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineParetoRouterPluginPriceSourceX1c066998) {
      encoder.encodeString(value.value)
    }
  }
}
