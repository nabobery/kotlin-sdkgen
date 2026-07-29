package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of condition.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/portal_resource_schedule_update_at_period_end_condition/properties/t
 * ype
 */
@Serializable(with = InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972.Serializer::class)
public sealed class InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `decreasing_item_amount`.
   */
  public data object DecreasingItemAmount : InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972() {
    public override val `value`: String = "decreasing_item_amount"
  }

  /**
   * Documented value. Wire value: `shortening_interval`.
   */
  public data object ShorteningInterval : InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972() {
    public override val `value`: String = "shortening_interval"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972 = when (value) {
      DecreasingItemAmount.value -> DecreasingItemAmount
      ShorteningInterval.value -> ShorteningInterval
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972) {
      encoder.encodeString(value.value)
    }
  }
}
