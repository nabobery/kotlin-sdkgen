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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d) {
      encoder.encodeString(value.value)
    }
  }
}
