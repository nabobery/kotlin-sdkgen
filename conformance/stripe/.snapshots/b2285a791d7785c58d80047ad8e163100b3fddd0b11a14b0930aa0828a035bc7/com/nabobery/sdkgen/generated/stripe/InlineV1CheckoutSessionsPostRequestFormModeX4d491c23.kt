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
 * The mode of the Checkout Session. Pass `subscription` if the Checkout Session includes at least one recurring item.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/mode
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormModeX4d491c23.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormModeX4d491c23 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment`.
   */
  public data object Payment : InlineV1CheckoutSessionsPostRequestFormModeX4d491c23() {
    public override val `value`: String = "payment"
  }

  /**
   * Documented value. Wire value: `setup`.
   */
  public data object Setup : InlineV1CheckoutSessionsPostRequestFormModeX4d491c23() {
    public override val `value`: String = "setup"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineV1CheckoutSessionsPostRequestFormModeX4d491c23() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormModeX4d491c23()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormModeX4d491c23 = when (value) {
      Payment.value -> Payment
      Setup.value -> Setup
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormModeX4d491c23> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormModeX4d491c23", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormModeX4d491c23 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormModeX4d491c23) {
      encoder.encodeString(value.value)
    }
  }
}
