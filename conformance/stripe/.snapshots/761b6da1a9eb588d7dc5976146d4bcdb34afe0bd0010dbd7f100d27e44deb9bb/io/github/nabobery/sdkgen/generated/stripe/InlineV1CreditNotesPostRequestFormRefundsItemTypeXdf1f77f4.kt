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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items/properties/type
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_record_refund`.
   */
  public data object PaymentRecordRefund : InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4() {
    public override val `value`: String = "payment_record_refund"
  }

  /**
   * Documented value. Wire value: `refund`.
   */
  public data object Refund : InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4() {
    public override val `value`: String = "refund"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4 = when (value) {
      PaymentRecordRefund.value -> PaymentRecordRefund
      Refund.value -> Refund
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4) {
      encoder.encodeString(value.value)
    }
  }
}
