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
 * The rails the ReceivedCredit was sent over. A FinancialAccount can only send funds over `stripe`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/received_payment_method_details_financial_account/properties/network
 */
@Serializable(with = InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f.Serializer::class)
public sealed class InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f()

  public companion object {
    public fun fromValue(`value`: String): InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f = when (value) {
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f) {
      encoder.encodeString(value.value)
    }
  }
}
