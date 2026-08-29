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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_tax_rates/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122) {
      encoder.encodeString(value.value)
    }
  }
}
