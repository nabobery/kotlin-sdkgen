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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/rendering_options/anyOf/0/properties/amount_tax_display.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/rendering_options/anyOf/0/properties/amount_tax_display
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exclude_tax`.
   */
  public data object ExcludeTax : InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423() {
    public override val `value`: String = "exclude_tax"
  }

  /**
   * Documented value. Wire value: `include_inclusive_tax`.
   */
  public data object IncludeInclusiveTax : InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423() {
    public override val `value`: String = "include_inclusive_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423 = when (value) {
      Value.value -> Value
      ExcludeTax.value -> ExcludeTax
      IncludeInclusiveTax.value -> IncludeInclusiveTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1068a423) {
      encoder.encodeString(value.value)
    }
  }
}
