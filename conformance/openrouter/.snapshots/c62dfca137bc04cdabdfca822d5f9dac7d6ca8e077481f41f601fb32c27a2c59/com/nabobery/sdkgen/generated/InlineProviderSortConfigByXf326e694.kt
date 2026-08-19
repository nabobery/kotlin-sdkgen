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
 * The provider sorting strategy (price, throughput, latency)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderSortConfig/properties/by
 */
@Serializable(with = InlineProviderSortConfigByXf326e694.Serializer::class)
public sealed class InlineProviderSortConfigByXf326e694 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineProviderSortConfigByXf326e694() {
    public override val `value`: String = "price"
  }

  /**
   * Documented value. Wire value: `throughput`.
   */
  public data object Throughput : InlineProviderSortConfigByXf326e694() {
    public override val `value`: String = "throughput"
  }

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlineProviderSortConfigByXf326e694() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `exacto`.
   */
  public data object Exacto : InlineProviderSortConfigByXf326e694() {
    public override val `value`: String = "exacto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProviderSortConfigByXf326e694()

  public companion object {
    public fun fromValue(`value`: String): InlineProviderSortConfigByXf326e694 = when (value) {
      Price.value -> Price
      Throughput.value -> Throughput
      Latency.value -> Latency
      Exacto.value -> Exacto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProviderSortConfigByXf326e694> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineProviderSortConfigByXf326e694", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProviderSortConfigByXf326e694 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProviderSortConfigByXf326e694) {
      encoder.encodeString(value.value)
    }
  }
}
