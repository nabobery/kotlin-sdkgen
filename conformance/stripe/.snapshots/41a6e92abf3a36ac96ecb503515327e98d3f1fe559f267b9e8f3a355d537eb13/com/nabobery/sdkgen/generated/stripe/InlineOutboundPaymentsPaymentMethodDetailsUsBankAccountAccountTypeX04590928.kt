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
 * Account type: checkings or savings. Defaults to checking if omitted.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_us_bank_account/properties/
 * account_type
 */
@Serializable(with = InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928.Serializer::class)
public sealed class InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928()

  public companion object {
    public fun fromValue(`value`: String): InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928) {
      encoder.encodeString(value.value)
    }
  }
}
