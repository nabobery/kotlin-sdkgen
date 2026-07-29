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
 * Interval (or event) to which the amount applies.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_spending_limit/properties/interval
 */
@Serializable(with = InlineIssuingCardSpendingLimitIntervalX76b723ea.Serializer::class)
public sealed class InlineIssuingCardSpendingLimitIntervalX76b723ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all_time`.
   */
  public data object AllTime : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "all_time"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `per_authorization`.
   */
  public data object PerAuthorization : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "per_authorization"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `yearly`.
   */
  public data object Yearly : InlineIssuingCardSpendingLimitIntervalX76b723ea() {
    public override val `value`: String = "yearly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardSpendingLimitIntervalX76b723ea()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardSpendingLimitIntervalX76b723ea = when (value) {
      AllTime.value -> AllTime
      Daily.value -> Daily
      Monthly.value -> Monthly
      PerAuthorization.value -> PerAuthorization
      Weekly.value -> Weekly
      Yearly.value -> Yearly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardSpendingLimitIntervalX76b723ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardSpendingLimitIntervalX76b723ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardSpendingLimitIntervalX76b723ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardSpendingLimitIntervalX76b723ea) {
      encoder.encodeString(value.value)
    }
  }
}
