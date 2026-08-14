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
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790) {
      encoder.encodeString(value.value)
    }
  }
}
