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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/granularities/items/properties/name
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486.Serializer::class)
public sealed class InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `minute`.
   */
  public data object Minute : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486() {
    public override val `value`: String = "minute"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486() {
    public override val `value`: String = "hour"
  }

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486()

  public companion object {
    public fun fromValue(`value`: String): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486 = when (value) {
      Minute.value -> Minute
      Hour.value -> Hour
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486) {
      encoder.encodeString(value.value)
    }
  }
}
