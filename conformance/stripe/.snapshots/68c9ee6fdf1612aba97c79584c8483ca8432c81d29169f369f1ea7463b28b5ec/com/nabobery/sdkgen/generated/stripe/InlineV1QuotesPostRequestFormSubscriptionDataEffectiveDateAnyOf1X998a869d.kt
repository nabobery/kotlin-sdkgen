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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/effective_date/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/effective_date/anyOf/0
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `current_period_end`.
   */
  public data object CurrentPeriodEnd : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d() {
    public override val `value`: String = "current_period_end"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d = when (value) {
      CurrentPeriodEnd.value -> CurrentPeriodEnd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d) {
      encoder.encodeString(value.value)
    }
  }
}
