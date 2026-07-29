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
 * The type of entity that holds the account. This can be either 'individual' or 'company'.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_us_bank_account/properties/acc
 * ount_holder_type
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6.Serializer::class)
public sealed class InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountHolderTypeXc426e6d6) {
      encoder.encodeString(value.value)
    }
  }
}
