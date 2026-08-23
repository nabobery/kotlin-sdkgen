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
 * How this metric value should be formatted for display (e.g. percent → multiply by 100 and append %, currency → prefix
 * with $)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/metrics/items/properties/display_format
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8.Serializer::class)
public sealed class InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `currency`.
   */
  public data object Currency : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8() {
    public override val `value`: String = "currency"
  }

  /**
   * Documented value. Wire value: `percent`.
   */
  public data object Percent : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8() {
    public override val `value`: String = "percent"
  }

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `throughput`.
   */
  public data object Throughput : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8() {
    public override val `value`: String = "throughput"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8()

  public companion object {
    public fun fromValue(`value`: String): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8 = when (value) {
      Number.value -> Number
      Currency.value -> Currency
      Percent.value -> Percent
      Latency.value -> Latency
      Throughput.value -> Throughput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8) {
      encoder.encodeString(value.value)
    }
  }
}
