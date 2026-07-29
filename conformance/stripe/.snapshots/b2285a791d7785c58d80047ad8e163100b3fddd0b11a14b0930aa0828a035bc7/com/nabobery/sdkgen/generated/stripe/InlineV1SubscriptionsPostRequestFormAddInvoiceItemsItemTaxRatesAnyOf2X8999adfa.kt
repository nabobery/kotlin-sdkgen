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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa) {
      encoder.encodeString(value.value)
    }
  }
}
