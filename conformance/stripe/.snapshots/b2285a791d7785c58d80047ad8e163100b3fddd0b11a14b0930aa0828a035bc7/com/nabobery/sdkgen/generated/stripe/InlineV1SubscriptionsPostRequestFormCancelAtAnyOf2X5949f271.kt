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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/cancel_at/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/cancel_at/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_billed_until`.
   */
  public data object MaxBilledUntil : InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271() {
    public override val `value`: String = "max_billed_until"
  }

  /**
   * Documented value. Wire value: `max_period_end`.
   */
  public data object MaxPeriodEnd : InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271() {
    public override val `value`: String = "max_period_end"
  }

  /**
   * Documented value. Wire value: `min_period_end`.
   */
  public data object MinPeriodEnd : InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271() {
    public override val `value`: String = "min_period_end"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271 = when (value) {
      MaxBilledUntil.value -> MaxBilledUntil
      MaxPeriodEnd.value -> MaxPeriodEnd
      MinPeriodEnd.value -> MinPeriodEnd
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271) {
      encoder.encodeString(value.value)
    }
  }
}
