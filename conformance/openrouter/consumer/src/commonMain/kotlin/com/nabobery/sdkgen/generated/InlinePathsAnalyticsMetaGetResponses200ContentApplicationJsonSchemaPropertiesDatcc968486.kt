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
 * Granularity identifier
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486
  .Serializer::class)
public sealed class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `minute`.
   */
  public data object Minute : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486() {
    public override val `value`: String = "minute"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486 = when (value) {
      Minute.value -> Minute
      Hour.value -> Hour
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486) {
      encoder.encodeString(value.value)
    }
  }
}
