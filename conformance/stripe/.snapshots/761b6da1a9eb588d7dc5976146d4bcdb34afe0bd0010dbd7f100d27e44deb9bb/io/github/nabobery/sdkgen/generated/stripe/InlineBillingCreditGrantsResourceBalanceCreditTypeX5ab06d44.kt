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
 * The type of credit transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credit/properties/type
 */
@Serializable(with = InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44.Serializer::class)
public sealed class InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credits_application_invoice_voided`.
   */
  public data object CreditsApplicationInvoiceVoided : InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44() {
    public override val `value`: String = "credits_application_invoice_voided"
  }

  /**
   * Documented value. Wire value: `credits_granted`.
   */
  public data object CreditsGranted : InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44() {
    public override val `value`: String = "credits_granted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44 = when (value) {
      CreditsApplicationInvoiceVoided.value -> CreditsApplicationInvoiceVoided
      CreditsGranted.value -> CreditsGranted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44) {
      encoder.encodeString(value.value)
    }
  }
}
