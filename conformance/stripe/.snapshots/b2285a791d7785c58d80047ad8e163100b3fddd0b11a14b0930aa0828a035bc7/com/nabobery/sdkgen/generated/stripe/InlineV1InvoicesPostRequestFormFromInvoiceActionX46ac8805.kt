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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/from_invoice/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/from_invoice/properties/action
 */
@Serializable(with = InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `revision`.
   */
  public data object Revision : InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805() {
    public override val `value`: String = "revision"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805 = when (value) {
      Revision.value -> Revision
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805) {
      encoder.encodeString(value.value)
    }
  }
}
