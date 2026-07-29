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
 * The type of account being debited or credited
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present_receipt/properties/account_type
 */
@Serializable(with = InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `credit`.
   */
  public data object Credit : InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997() {
    public override val `value`: String = "credit"
  }

  /**
   * Documented value. Wire value: `prepaid`.
   */
  public data object Prepaid : InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997() {
    public override val `value`: String = "prepaid"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997 = when (value) {
      Checking.value -> Checking
      Credit.value -> Credit
      Prepaid.value -> Prepaid
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardPresentReceiptAccountTypeXf2a2e997) {
      encoder.encodeString(value.value)
    }
  }
}
