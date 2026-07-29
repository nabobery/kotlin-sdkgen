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
 * sdkgen://source/openapi.json#/components/schemas/inbound_transfers_payment_method_details_us_bank_account/properties/
 * account_holder_type
 */
@Serializable(with = InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f.Serializer::class)
public sealed class InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f()

  public companion object {
    public fun fromValue(`value`: String): InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f) {
      encoder.encodeString(value.value)
    }
  }
}
