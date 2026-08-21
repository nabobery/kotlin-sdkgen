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
 * Indicates that you intend to make future payments with the payment method collected during checkout.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_intent_data/properties/setup_future_u
 * sage
 */
@Serializable(with = InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f.Serializer::class)
public sealed class InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f) {
      encoder.encodeString(value.value)
    }
  }
}
