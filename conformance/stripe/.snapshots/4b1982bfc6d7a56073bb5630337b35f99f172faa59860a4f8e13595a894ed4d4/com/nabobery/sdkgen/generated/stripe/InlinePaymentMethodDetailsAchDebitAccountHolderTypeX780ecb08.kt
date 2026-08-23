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
 * Type of entity that holds the account. This can be either `individual` or `company`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_ach_debit/properties/account_holder_type
 */
@Serializable(with = InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08.Serializer::class)
public sealed class InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08) {
      encoder.encodeString(value.value)
    }
  }
}
