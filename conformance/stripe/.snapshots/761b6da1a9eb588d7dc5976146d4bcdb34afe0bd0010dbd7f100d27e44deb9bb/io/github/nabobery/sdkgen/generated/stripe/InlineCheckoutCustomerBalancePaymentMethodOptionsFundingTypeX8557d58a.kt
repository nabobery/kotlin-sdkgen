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
 * The funding method type to be used when there are not enough funds in the customer balance. Permitted values include:
 * `bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_customer_balance_payment_method_options/properties/funding_
 * type
 */
@Serializable(with = InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a.Serializer::class)
public sealed class InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_transfer`.
   */
  public data object BankTransfer : InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a() {
    public override val `value`: String = "bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a = when (value) {
      BankTransfer.value -> BankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCustomerBalancePaymentMethodOptionsFundingTypeX8557d58a) {
      encoder.encodeString(value.value)
    }
  }
}
