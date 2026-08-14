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
 * The mode of the Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/mode
 */
@Serializable(with = InlineCheckoutSessionModeXf4d293a1.Serializer::class)
public sealed class InlineCheckoutSessionModeXf4d293a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment`.
   */
  public data object Payment : InlineCheckoutSessionModeXf4d293a1() {
    public override val `value`: String = "payment"
  }

  /**
   * Documented value. Wire value: `setup`.
   */
  public data object Setup : InlineCheckoutSessionModeXf4d293a1() {
    public override val `value`: String = "setup"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineCheckoutSessionModeXf4d293a1() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionModeXf4d293a1()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionModeXf4d293a1 = when (value) {
      Payment.value -> Payment
      Setup.value -> Setup
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionModeXf4d293a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionModeXf4d293a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionModeXf4d293a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionModeXf4d293a1) {
      encoder.encodeString(value.value)
    }
  }
}
