package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_klarna
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordKlarna.Serializer::class)
public class PaymentMethodDetailsPaymentRecordKlarna(
    /**
     * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned to.
     */
    public val location: String? = null,
    /**
     * The payer details for this transaction.
     */
    public val payerDetails: InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa? = null,
    /**
     * The Klarna payment method used for this transaction. Can be one of `pay_later`, `pay_now`, `pay_with_financing`, or
     * `pay_in_installments`
     */
    public val paymentMethodCategory: String? = null,
    /**
     * Preferred language of the Klarna authorization page that the customer is redirected to. Can be one of `de-AT`,
     * `en-AT`, `nl-BE`, `fr-BE`, `en-BE`, `de-DE`, `en-DE`, `da-DK`, `en-DK`, `es-ES`, `en-ES`, `fi-FI`, `sv-FI`,
     * `en-FI`, `en-GB`, `en-IE`, `it-IT`, `en-IT`, `nl-NL`, `en-NL`, `nb-NO`, `en-NO`, `sv-SE`, `en-SE`, `en-US`,
     * `es-US`, `fr-FR`, `en-FR`, `cs-CZ`, `en-CZ`, `ro-RO`, `en-RO`, `el-GR`, `en-GR`, `en-AU`, `en-NZ`, `en-CA`,
     * `fr-CA`, `pl-PL`, `en-PL`, `pt-PT`, `en-PT`, `de-CH`, `fr-CH`, `it-CH`, or `en-CH`
     */
    public val preferredLocale: String? = null,
    /**
     * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
     */
    public val reader: String? = null,
) {
    public class Builder {
        /**
         * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned
         * to.
         */
        public var location: String? = null

        /**
         * The payer details for this transaction.
         */
        public var payerDetails: InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa? =
            null

        /**
         * The Klarna payment method used for this transaction. Can be one of `pay_later`, `pay_now`, `pay_with_financing`,
         * or `pay_in_installments`
         */
        public var paymentMethodCategory: String? = null

        /**
         * Preferred language of the Klarna authorization page that the customer is redirected to. Can be one of `de-AT`,
         * `en-AT`, `nl-BE`, `fr-BE`, `en-BE`, `de-DE`, `en-DE`, `da-DK`, `en-DK`, `es-ES`, `en-ES`, `fi-FI`, `sv-FI`,
         * `en-FI`, `en-GB`, `en-IE`, `it-IT`, `en-IT`, `nl-NL`, `en-NL`, `nb-NO`, `en-NO`, `sv-SE`, `en-SE`, `en-US`,
         * `es-US`, `fr-FR`, `en-FR`, `cs-CZ`, `en-CZ`, `ro-RO`, `en-RO`, `el-GR`, `en-GR`, `en-AU`, `en-NZ`, `en-CA`,
         * `fr-CA`, `pl-PL`, `en-PL`, `pt-PT`, `en-PT`, `de-CH`, `fr-CH`, `it-CH`, or `en-CH`
         */
        public var preferredLocale: String? = null

        /**
         * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
         */
        public var reader: String? = null

        public fun build(): PaymentMethodDetailsPaymentRecordKlarna =
            PaymentMethodDetailsPaymentRecordKlarna(
                location = location,
                payerDetails = payerDetails,
                paymentMethodCategory = paymentMethodCategory,
                preferredLocale = preferredLocale,
                reader = reader,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordKlarna =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordKlarna> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordKlarna {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordKlarna")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordKlarna must be a JSON object")
            return PaymentMethodDetailsPaymentRecordKlarna(
                location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
                payerDetails =
                    rawObject["payer_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa?>(
                                    element,
                                )
                        }
                    },
                paymentMethodCategory =
                    rawObject["payment_method_category"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                preferredLocale =
                    rawObject["preferred_locale"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                reader = rawObject["reader"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsPaymentRecordKlarna,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordKlarna")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.location?.let { put("location", it) }
                    value.payerDetails?.let { put("payer_details", json.encodeToJsonElement(it)) }
                    value.paymentMethodCategory?.let { put("payment_method_category", it) }
                    value.preferredLocale?.let { put("preferred_locale", it) }
                    value.reader?.let { put("reader", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordKlarna(
    block: PaymentMethodDetailsPaymentRecordKlarna.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordKlarna = PaymentMethodDetailsPaymentRecordKlarna.build(block)
