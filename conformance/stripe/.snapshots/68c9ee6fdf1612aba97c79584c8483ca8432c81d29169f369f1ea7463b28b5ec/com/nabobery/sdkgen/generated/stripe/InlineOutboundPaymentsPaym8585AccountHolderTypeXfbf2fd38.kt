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
 * Account holder type: individual or company.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_us_bank_account/properties/
 * account_holder_type
 */
@Serializable(with = InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38.Serializer::class)
public sealed class InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38()

  public companion object {
    public fun fromValue(`value`: String): InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38) {
      encoder.encodeString(value.value)
    }
  }
}
