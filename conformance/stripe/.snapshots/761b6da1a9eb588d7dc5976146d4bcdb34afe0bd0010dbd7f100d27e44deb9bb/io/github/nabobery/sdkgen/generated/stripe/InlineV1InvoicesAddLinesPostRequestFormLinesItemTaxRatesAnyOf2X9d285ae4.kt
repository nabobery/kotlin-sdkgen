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
 * form-urlencoded/schema/properties/lines/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4.Serializer::class)
public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4) {
      encoder.encodeString(value.value)
    }
  }
}
