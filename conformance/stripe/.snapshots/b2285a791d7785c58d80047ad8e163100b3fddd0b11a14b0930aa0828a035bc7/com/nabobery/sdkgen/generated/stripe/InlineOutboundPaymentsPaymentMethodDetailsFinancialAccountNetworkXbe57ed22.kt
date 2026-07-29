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
 * The rails used to send funds.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_financial_account/propertie
 * s/network
 */
@Serializable(with = InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22.Serializer::class)
public sealed class InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22()

  public companion object {
    public fun fromValue(`value`: String): InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22 = when (value) {
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22) {
      encoder.encodeString(value.value)
    }
  }
}
