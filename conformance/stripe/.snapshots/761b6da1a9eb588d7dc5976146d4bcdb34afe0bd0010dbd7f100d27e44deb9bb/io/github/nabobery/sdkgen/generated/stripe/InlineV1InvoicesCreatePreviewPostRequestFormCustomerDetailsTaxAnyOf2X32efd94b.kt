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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax/properties/ip_address/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax/properties/ip_address/anyOf/1
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b) {
      encoder.encodeString(value.value)
    }
  }
}
