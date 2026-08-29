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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_us_bank_account/properties/account_type
 */
@Serializable(with = InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e.Serializer::class)
public sealed class InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e) {
      encoder.encodeString(value.value)
    }
  }
}
