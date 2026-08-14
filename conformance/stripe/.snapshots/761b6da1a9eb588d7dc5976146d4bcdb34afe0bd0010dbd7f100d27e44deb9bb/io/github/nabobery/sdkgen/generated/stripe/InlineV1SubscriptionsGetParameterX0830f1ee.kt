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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/12/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/12/schema
 */
@Serializable(with = InlineV1SubscriptionsGetParameterX0830f1ee.Serializer::class)
public sealed class InlineV1SubscriptionsGetParameterX0830f1ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `ended`.
   */
  public data object Ended : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "ended"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "incomplete"
  }

  /**
   * Documented value. Wire value: `incomplete_expired`.
   */
  public data object IncompleteExpired : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "incomplete_expired"
  }

  /**
   * Documented value. Wire value: `past_due`.
   */
  public data object PastDue : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "past_due"
  }

  /**
   * Documented value. Wire value: `paused`.
   */
  public data object Paused : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "paused"
  }

  /**
   * Documented value. Wire value: `trialing`.
   */
  public data object Trialing : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "trialing"
  }

  /**
   * Documented value. Wire value: `unpaid`.
   */
  public data object Unpaid : InlineV1SubscriptionsGetParameterX0830f1ee() {
    public override val `value`: String = "unpaid"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsGetParameterX0830f1ee()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsGetParameterX0830f1ee = when (value) {
      Active.value -> Active
      All.value -> All
      Canceled.value -> Canceled
      Ended.value -> Ended
      Incomplete.value -> Incomplete
      IncompleteExpired.value -> IncompleteExpired
      PastDue.value -> PastDue
      Paused.value -> Paused
      Trialing.value -> Trialing
      Unpaid.value -> Unpaid
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsGetParameterX0830f1ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsGetParameterX0830f1ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsGetParameterX0830f1ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsGetParameterX0830f1ee) {
      encoder.encodeString(value.value)
    }
  }
}
