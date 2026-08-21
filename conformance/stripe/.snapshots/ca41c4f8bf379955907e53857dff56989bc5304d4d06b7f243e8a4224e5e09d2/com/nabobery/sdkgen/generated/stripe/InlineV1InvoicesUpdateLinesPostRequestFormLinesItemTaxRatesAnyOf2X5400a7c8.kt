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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8.Serializer::class)
public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8) {
      encoder.encodeString(value.value)
    }
  }
}
