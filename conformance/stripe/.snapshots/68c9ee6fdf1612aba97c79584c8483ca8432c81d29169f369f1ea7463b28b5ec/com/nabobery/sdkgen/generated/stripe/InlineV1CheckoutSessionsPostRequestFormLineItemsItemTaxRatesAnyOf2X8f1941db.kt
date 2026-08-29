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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db) {
      encoder.encodeString(value.value)
    }
  }
}
