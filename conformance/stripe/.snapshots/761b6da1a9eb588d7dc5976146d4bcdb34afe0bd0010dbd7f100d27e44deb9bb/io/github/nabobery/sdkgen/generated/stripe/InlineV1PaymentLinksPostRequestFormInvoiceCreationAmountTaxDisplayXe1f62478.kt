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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0/proper
 * ties/amount_tax_display.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0/proper
 * ties/amount_tax_display
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exclude_tax`.
   */
  public data object ExcludeTax : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478() {
    public override val `value`: String = "exclude_tax"
  }

  /**
   * Documented value. Wire value: `include_inclusive_tax`.
   */
  public data object IncludeInclusiveTax : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478() {
    public override val `value`: String = "include_inclusive_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478 = when (value) {
      Value.value -> Value
      ExcludeTax.value -> ExcludeTax
      IncludeInclusiveTax.value -> IncludeInclusiveTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478) {
      encoder.encodeString(value.value)
    }
  }
}
