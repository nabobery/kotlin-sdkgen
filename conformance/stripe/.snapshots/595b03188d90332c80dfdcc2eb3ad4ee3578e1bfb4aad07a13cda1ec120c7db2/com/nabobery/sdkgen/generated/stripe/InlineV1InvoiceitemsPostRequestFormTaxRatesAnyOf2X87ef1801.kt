package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801.Serializer::class)
public sealed class InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
