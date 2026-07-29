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
 * Type of the pretax credit amount referenced.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_notes_pretax_credit_amount/properties/type
 */
@Serializable(with = InlineCreditNotesPretaxCreditAmountTypeXe80b73a1.Serializer::class)
public sealed class InlineCreditNotesPretaxCreditAmountTypeXe80b73a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_balance_transaction`.
   */
  public data object CreditBalanceTransaction : InlineCreditNotesPretaxCreditAmountTypeXe80b73a1() {
    public override val `value`: String = "credit_balance_transaction"
  }

  /**
   * Documented value. Wire value: `discount`.
   */
  public data object Discount : InlineCreditNotesPretaxCreditAmountTypeXe80b73a1() {
    public override val `value`: String = "discount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNotesPretaxCreditAmountTypeXe80b73a1()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNotesPretaxCreditAmountTypeXe80b73a1 = when (value) {
      CreditBalanceTransaction.value -> CreditBalanceTransaction
      Discount.value -> Discount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCreditNotesPretaxCreditAmountTypeXe80b73a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNotesPretaxCreditAmountTypeXe80b73a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNotesPretaxCreditAmountTypeXe80b73a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNotesPretaxCreditAmountTypeXe80b73a1) {
      encoder.encodeString(value.value)
    }
  }
}
