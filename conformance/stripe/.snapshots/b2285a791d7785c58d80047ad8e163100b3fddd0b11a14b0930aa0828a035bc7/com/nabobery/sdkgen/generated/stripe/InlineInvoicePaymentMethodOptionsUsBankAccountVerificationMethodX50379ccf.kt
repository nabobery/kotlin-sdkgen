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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account/properties/verificati
 * on_method
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethodOptionsUsBankAccountVerificationMethodX50379ccf) {
      encoder.encodeString(value.value)
    }
  }
}
