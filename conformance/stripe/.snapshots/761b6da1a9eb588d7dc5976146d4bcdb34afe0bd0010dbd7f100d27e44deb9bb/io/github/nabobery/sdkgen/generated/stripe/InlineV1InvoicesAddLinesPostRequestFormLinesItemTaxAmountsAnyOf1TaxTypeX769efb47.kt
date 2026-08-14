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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/propertie
 * s/tax_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/propertie
 * s/tax_type
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47.Serializer::class)
public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amusement_tax`.
   */
  public data object AmusementTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "amusement_tax"
  }

  /**
   * Documented value. Wire value: `communications_tax`.
   */
  public data object CommunicationsTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "communications_tax"
  }

  /**
   * Documented value. Wire value: `gst`.
   */
  public data object Gst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "gst"
  }

  /**
   * Documented value. Wire value: `hst`.
   */
  public data object Hst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "hst"
  }

  /**
   * Documented value. Wire value: `igst`.
   */
  public data object Igst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "igst"
  }

  /**
   * Documented value. Wire value: `jct`.
   */
  public data object Jct : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "jct"
  }

  /**
   * Documented value. Wire value: `lease_tax`.
   */
  public data object LeaseTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "lease_tax"
  }

  /**
   * Documented value. Wire value: `pst`.
   */
  public data object Pst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "pst"
  }

  /**
   * Documented value. Wire value: `qst`.
   */
  public data object Qst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "qst"
  }

  /**
   * Documented value. Wire value: `retail_delivery_fee`.
   */
  public data object RetailDeliveryFee : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "retail_delivery_fee"
  }

  /**
   * Documented value. Wire value: `rst`.
   */
  public data object Rst : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "rst"
  }

  /**
   * Documented value. Wire value: `sales_tax`.
   */
  public data object SalesTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "sales_tax"
  }

  /**
   * Documented value. Wire value: `service_tax`.
   */
  public data object ServiceTax : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "service_tax"
  }

  /**
   * Documented value. Wire value: `vat`.
   */
  public data object Vat : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47() {
    public override val `value`: String = "vat"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47 = when (value) {
      AmusementTax.value -> AmusementTax
      CommunicationsTax.value -> CommunicationsTax
      Gst.value -> Gst
      Hst.value -> Hst
      Igst.value -> Igst
      Jct.value -> Jct
      LeaseTax.value -> LeaseTax
      Pst.value -> Pst
      Qst.value -> Qst
      RetailDeliveryFee.value -> RetailDeliveryFee
      Rst.value -> Rst
      SalesTax.value -> SalesTax
      ServiceTax.value -> ServiceTax
      Vat.value -> Vat
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47) {
      encoder.encodeString(value.value)
    }
  }
}
