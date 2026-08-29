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
 * The current status of this order.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.order/properties/status
 */
@Serializable(with = InlineClimateOrderStatusXf7d02510.Serializer::class)
public sealed class InlineClimateOrderStatusXf7d02510 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `awaiting_funds`.
   */
  public data object AwaitingFunds : InlineClimateOrderStatusXf7d02510() {
    public override val `value`: String = "awaiting_funds"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineClimateOrderStatusXf7d02510() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `confirmed`.
   */
  public data object Confirmed : InlineClimateOrderStatusXf7d02510() {
    public override val `value`: String = "confirmed"
  }

  /**
   * Documented value. Wire value: `delivered`.
   */
  public data object Delivered : InlineClimateOrderStatusXf7d02510() {
    public override val `value`: String = "delivered"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineClimateOrderStatusXf7d02510() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClimateOrderStatusXf7d02510()

  public companion object {
    public fun fromValue(`value`: String): InlineClimateOrderStatusXf7d02510 = when (value) {
      AwaitingFunds.value -> AwaitingFunds
      Canceled.value -> Canceled
      Confirmed.value -> Confirmed
      Delivered.value -> Delivered
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineClimateOrderStatusXf7d02510> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineClimateOrderStatusXf7d02510", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClimateOrderStatusXf7d02510 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClimateOrderStatusXf7d02510) {
      encoder.encodeString(value.value)
    }
  }
}
