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
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8
  .Serializer::class)
public sealed class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `currency`.
   */
  public data object Currency : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8() {
    public override val `value`: String = "currency"
  }

  /**
   * Documented value. Wire value: `percent`.
   */
  public data object Percent : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8() {
    public override val `value`: String = "percent"
  }

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `throughput`.
   */
  public data object Throughput : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8() {
    public override val `value`: String = "throughput"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8 = when (value) {
      Number.value -> Number
      Currency.value -> Currency
      Percent.value -> Percent
      Latency.value -> Latency
      Throughput.value -> Throughput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData15ee4f8) {
      encoder.encodeString(value.value)
    }
  }
}
