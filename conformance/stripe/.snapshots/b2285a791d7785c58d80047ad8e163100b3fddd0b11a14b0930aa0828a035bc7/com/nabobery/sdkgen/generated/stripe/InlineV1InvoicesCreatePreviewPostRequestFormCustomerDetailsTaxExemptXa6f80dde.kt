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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax_exempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax_exempt
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde = when (value) {
      Value.value -> Value
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde) {
      encoder.encodeString(value.value)
    }
  }
}
