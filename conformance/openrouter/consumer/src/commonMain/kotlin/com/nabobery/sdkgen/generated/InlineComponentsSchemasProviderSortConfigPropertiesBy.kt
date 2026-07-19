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
 */
@Serializable(with = InlineComponentsSchemasProviderSortConfigPropertiesBy.Serializer::class)
public sealed class InlineComponentsSchemasProviderSortConfigPropertiesBy {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineComponentsSchemasProviderSortConfigPropertiesBy() {
    public override val `value`: String = "price"
  }

  /**
   * Documented value. Wire value: `throughput`.
   */
  public data object Throughput : InlineComponentsSchemasProviderSortConfigPropertiesBy() {
    public override val `value`: String = "throughput"
  }

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlineComponentsSchemasProviderSortConfigPropertiesBy() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `exacto`.
   */
  public data object Exacto : InlineComponentsSchemasProviderSortConfigPropertiesBy() {
    public override val `value`: String = "exacto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasProviderSortConfigPropertiesBy()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasProviderSortConfigPropertiesBy = when (value) {
      Price.value -> Price
      Throughput.value -> Throughput
      Latency.value -> Latency
      Exacto.value -> Exacto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderSortConfigPropertiesBy> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasProviderSortConfigPropertiesBy", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderSortConfigPropertiesBy =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasProviderSortConfigPropertiesBy) {
      encoder.encodeString(value.value)
    }
  }
}
