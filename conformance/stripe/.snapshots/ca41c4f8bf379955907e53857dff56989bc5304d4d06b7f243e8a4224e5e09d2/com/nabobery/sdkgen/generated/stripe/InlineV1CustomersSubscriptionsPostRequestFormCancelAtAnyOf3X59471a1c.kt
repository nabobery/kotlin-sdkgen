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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancel_at/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancel_at/anyOf/2
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_billed_until`.
   */
  public data object MaxBilledUntil : InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c() {
    public override val `value`: String = "max_billed_until"
  }

  /**
   * Documented value. Wire value: `max_period_end`.
   */
  public data object MaxPeriodEnd : InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c() {
    public override val `value`: String = "max_period_end"
  }

  /**
   * Documented value. Wire value: `min_period_end`.
   */
  public data object MinPeriodEnd : InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c() {
    public override val `value`: String = "min_period_end"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c = when (value) {
      MaxBilledUntil.value -> MaxBilledUntil
      MaxPeriodEnd.value -> MaxPeriodEnd
      MinPeriodEnd.value -> MinPeriodEnd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c) {
      encoder.encodeString(value.value)
    }
  }
}
