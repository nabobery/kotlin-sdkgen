package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/spending_limits/items/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/spending_limits/items/properties/interval
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all_time`.
   */
  public data object AllTime : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "all_time"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `per_authorization`.
   */
  public data object PerAuthorization : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "per_authorization"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `yearly`.
   */
  public data object Yearly : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73() {
    public override val `value`: String = "yearly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73 = when (value) {
      AllTime.value -> AllTime
      Daily.value -> Daily
      Monthly.value -> Monthly
      PerAuthorization.value -> PerAuthorization
      Weekly.value -> Weekly
      Yearly.value -> Yearly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73) {
      encoder.encodeString(value.value)
    }
  }
}
