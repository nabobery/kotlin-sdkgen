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
 * Describes the presence of the customer during the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_card/properties
 * /customer_presence
 */
@Serializable(with = InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55.Serializer::class)
public sealed class InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55 = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55) {
      encoder.encodeString(value.value)
    }
  }
}
