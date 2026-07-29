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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_spending_limit/properties/interval
 */
@Serializable(with = InlineIssuingCardholderSpendingLimitIntervalX1263902e.Serializer::class)
public sealed class InlineIssuingCardholderSpendingLimitIntervalX1263902e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all_time`.
   */
  public data object AllTime : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "all_time"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `per_authorization`.
   */
  public data object PerAuthorization : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "per_authorization"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `yearly`.
   */
  public data object Yearly : InlineIssuingCardholderSpendingLimitIntervalX1263902e() {
    public override val `value`: String = "yearly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderSpendingLimitIntervalX1263902e()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderSpendingLimitIntervalX1263902e = when (value) {
      AllTime.value -> AllTime
      Daily.value -> Daily
      Monthly.value -> Monthly
      PerAuthorization.value -> PerAuthorization
      Weekly.value -> Weekly
      Yearly.value -> Yearly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderSpendingLimitIntervalX1263902e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderSpendingLimitIntervalX1263902e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderSpendingLimitIntervalX1263902e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderSpendingLimitIntervalX1263902e) {
      encoder.encodeString(value.value)
    }
  }
}
