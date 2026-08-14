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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/trial_period_days/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/trial_period_days/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e) {
      encoder.encodeString(value.value)
    }
  }
}
