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
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c) {
      encoder.encodeString(value.value)
    }
  }
}
