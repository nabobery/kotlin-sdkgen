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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_interac_present_receipt/properties/account_ty
 * pe
 */
@Serializable(with = InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6.Serializer::class)
public sealed class InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6() {
    public override val `value`: String = "savings"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsInteracPresentReceiptAccountTypeXdeba2ab6) {
      encoder.encodeString(value.value)
    }
  }
}
