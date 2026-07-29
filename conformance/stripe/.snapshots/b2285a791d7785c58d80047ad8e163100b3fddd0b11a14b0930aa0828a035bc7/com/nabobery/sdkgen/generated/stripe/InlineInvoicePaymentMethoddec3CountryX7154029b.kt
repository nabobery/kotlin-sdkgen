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
 * The desired country code of the bank account information. Permitted values include: `DE`, `FR`, `IE`, or `NL`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_customer_balance_bank_transfer_eu_ban
 * k_transfer/properties/country
 */
@Serializable(with = InlineInvoicePaymentMethoddec3CountryX7154029b.Serializer::class)
public sealed class InlineInvoicePaymentMethoddec3CountryX7154029b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `BE`.
   */
  public data object Be : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "BE"
  }

  /**
   * Documented value. Wire value: `DE`.
   */
  public data object De : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "DE"
  }

  /**
   * Documented value. Wire value: `ES`.
   */
  public data object Es : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "ES"
  }

  /**
   * Documented value. Wire value: `FR`.
   */
  public data object Fr : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "FR"
  }

  /**
   * Documented value. Wire value: `IE`.
   */
  public data object Ie : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "IE"
  }

  /**
   * Documented value. Wire value: `NL`.
   */
  public data object Nl : InlineInvoicePaymentMethoddec3CountryX7154029b() {
    public override val `value`: String = "NL"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethoddec3CountryX7154029b()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethoddec3CountryX7154029b = when (value) {
      Be.value -> Be
      De.value -> De
      Es.value -> Es
      Fr.value -> Fr
      Ie.value -> Ie
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicePaymentMethoddec3CountryX7154029b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethoddec3CountryX7154029b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethoddec3CountryX7154029b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethoddec3CountryX7154029b) {
      encoder.encodeString(value.value)
    }
  }
}
