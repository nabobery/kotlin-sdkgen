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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f) {
      encoder.encodeString(value.value)
    }
  }
}
