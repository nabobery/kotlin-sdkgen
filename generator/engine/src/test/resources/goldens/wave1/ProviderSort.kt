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
 * Forward-compatible provider ordering. Unknown strings remain intact.
 */
@Serializable(with = ProviderSort.Serializer::class)
public sealed class ProviderSort {
  public abstract val `value`: String

  /**
   * Sort by price. Wire value: `price`.
   */
  public data object Price : ProviderSort() {
    public override val `value`: String = "price"
  }

  /**
   * Sort by throughput. Wire value: `throughput`.
   */
  public data object Throughput : ProviderSort() {
    public override val `value`: String = "throughput"
  }

  /**
   * Sort by latency. Wire value: `latency`.
   */
  public data object Latency : ProviderSort() {
    public override val `value`: String = "latency"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ProviderSort()

  public companion object {
    public fun fromValue(`value`: String): ProviderSort = when (value) {
      Price.value -> Price
      Throughput.value -> Throughput
      Latency.value -> Latency
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ProviderSort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ProviderSort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ProviderSort = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ProviderSort) {
      encoder.encodeString(value.value)
    }
  }
}
