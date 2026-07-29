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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account/properties/account_type
 */
@Serializable(with = InlinePaymentMethodUsBankAccountAccountTypeX72df841c.Serializer::class)
public sealed class InlinePaymentMethodUsBankAccountAccountTypeX72df841c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlinePaymentMethodUsBankAccountAccountTypeX72df841c() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlinePaymentMethodUsBankAccountAccountTypeX72df841c() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodUsBankAccountAccountTypeX72df841c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodUsBankAccountAccountTypeX72df841c = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodUsBankAccountAccountTypeX72df841c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodUsBankAccountAccountTypeX72df841c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountAccountTypeX72df841c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodUsBankAccountAccountTypeX72df841c) {
      encoder.encodeString(value.value)
    }
  }
}
