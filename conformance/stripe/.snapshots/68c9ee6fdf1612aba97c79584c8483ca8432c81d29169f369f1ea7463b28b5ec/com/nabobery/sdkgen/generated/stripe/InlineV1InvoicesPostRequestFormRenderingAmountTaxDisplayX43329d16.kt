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
 * /properties/rendering/properties/amount_tax_display.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering/properties/amount_tax_display
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exclude_tax`.
   */
  public data object ExcludeTax : InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16() {
    public override val `value`: String = "exclude_tax"
  }

  /**
   * Documented value. Wire value: `include_inclusive_tax`.
   */
  public data object IncludeInclusiveTax : InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16() {
    public override val `value`: String = "include_inclusive_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16 = when (value) {
      Value.value -> Value
      ExcludeTax.value -> ExcludeTax
      IncludeInclusiveTax.value -> IncludeInclusiveTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16) {
      encoder.encodeString(value.value)
    }
  }
}
