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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0/properties/amount_tax_
 * display.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0/properties/amount_tax_
 * display
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exclude_tax`.
   */
  public data object ExcludeTax : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732() {
    public override val `value`: String = "exclude_tax"
  }

  /**
   * Documented value. Wire value: `include_inclusive_tax`.
   */
  public data object IncludeInclusiveTax : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732() {
    public override val `value`: String = "include_inclusive_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732 = when (value) {
      Value.value -> Value
      ExcludeTax.value -> ExcludeTax
      IncludeInclusiveTax.value -> IncludeInclusiveTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayX563b2732) {
      encoder.encodeString(value.value)
    }
  }
}
