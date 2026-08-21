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
 * Type of the refund, one of `refund` or `payment_record_refund`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_refund/properties/type
 */
@Serializable(with = InlineCreditNoteRefundTypeXc2c9b186.Serializer::class)
public sealed class InlineCreditNoteRefundTypeXc2c9b186 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_record_refund`.
   */
  public data object PaymentRecordRefund : InlineCreditNoteRefundTypeXc2c9b186() {
    public override val `value`: String = "payment_record_refund"
  }

  /**
   * Documented value. Wire value: `refund`.
   */
  public data object Refund : InlineCreditNoteRefundTypeXc2c9b186() {
    public override val `value`: String = "refund"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNoteRefundTypeXc2c9b186()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNoteRefundTypeXc2c9b186 = when (value) {
      PaymentRecordRefund.value -> PaymentRecordRefund
      Refund.value -> Refund
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteRefundTypeXc2c9b186> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNoteRefundTypeXc2c9b186", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNoteRefundTypeXc2c9b186 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteRefundTypeXc2c9b186) {
      encoder.encodeString(value.value)
    }
  }
}
