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
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s_filters/properties/account_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s_filters/properties/account_subcategories/items
 */
@Serializable(with = InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d.Serializer::class)
public sealed class InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d) {
      encoder.encodeString(value.value)
    }
  }
}
