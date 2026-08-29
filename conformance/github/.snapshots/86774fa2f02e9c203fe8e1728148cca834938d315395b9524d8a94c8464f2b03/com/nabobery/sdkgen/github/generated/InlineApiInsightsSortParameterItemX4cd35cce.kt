package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/api-insights-sort/schema/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/api-insights-sort/schema/items
 */
@Serializable(with = InlineApiInsightsSortParameterItemX4cd35cce.Serializer::class)
public sealed class InlineApiInsightsSortParameterItemX4cd35cce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `last_rate_limited_timestamp`.
   */
  public data object LastRateLimitedTimestamp : InlineApiInsightsSortParameterItemX4cd35cce() {
    public override val `value`: String = "last_rate_limited_timestamp"
  }

  /**
   * Documented value. Wire value: `last_request_timestamp`.
   */
  public data object LastRequestTimestamp : InlineApiInsightsSortParameterItemX4cd35cce() {
    public override val `value`: String = "last_request_timestamp"
  }

  /**
   * Documented value. Wire value: `rate_limited_request_count`.
   */
  public data object RateLimitedRequestCount : InlineApiInsightsSortParameterItemX4cd35cce() {
    public override val `value`: String = "rate_limited_request_count"
  }

  /**
   * Documented value. Wire value: `subject_name`.
   */
  public data object SubjectName : InlineApiInsightsSortParameterItemX4cd35cce() {
    public override val `value`: String = "subject_name"
  }

  /**
   * Documented value. Wire value: `total_request_count`.
   */
  public data object TotalRequestCount : InlineApiInsightsSortParameterItemX4cd35cce() {
    public override val `value`: String = "total_request_count"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApiInsightsSortParameterItemX4cd35cce()

  public companion object {
    public fun fromValue(`value`: String): InlineApiInsightsSortParameterItemX4cd35cce = when (value) {
      LastRateLimitedTimestamp.value -> LastRateLimitedTimestamp
      LastRequestTimestamp.value -> LastRequestTimestamp
      RateLimitedRequestCount.value -> RateLimitedRequestCount
      SubjectName.value -> SubjectName
      TotalRequestCount.value -> TotalRequestCount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApiInsightsSortParameterItemX4cd35cce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineApiInsightsSortParameterItemX4cd35cce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApiInsightsSortParameterItemX4cd35cce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsSortParameterItemX4cd35cce) {
      encoder.encodeString(value.value)
    }
  }
}
