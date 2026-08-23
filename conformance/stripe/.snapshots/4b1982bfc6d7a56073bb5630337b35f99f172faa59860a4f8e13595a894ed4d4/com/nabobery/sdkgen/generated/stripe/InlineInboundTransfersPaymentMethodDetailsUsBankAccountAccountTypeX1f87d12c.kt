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
 * sdkgen://source/openapi.json#/components/schemas/inbound_transfers_payment_method_details_us_bank_account/properties/
 * account_type
 */
@Serializable(with = InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c.Serializer::class)
public sealed class InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c()

  public companion object {
    public fun fromValue(`value`: String): InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c) {
      encoder.encodeString(value.value)
    }
  }
}
