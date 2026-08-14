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
 * The type of the payment method used in the OutboundPayment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details/properties/type
 */
@Serializable(with = InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1.Serializer::class)
public sealed class InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_account`.
   */
  public data object FinancialAccount : InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1() {
    public override val `value`: String = "financial_account"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1() {
    public override val `value`: String = "us_bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1()

  public companion object {
    public fun fromValue(`value`: String): InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1 = when (value) {
      FinancialAccount.value -> FinancialAccount
      UsBankAccount.value -> UsBankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1) {
      encoder.encodeString(value.value)
    }
  }
}
