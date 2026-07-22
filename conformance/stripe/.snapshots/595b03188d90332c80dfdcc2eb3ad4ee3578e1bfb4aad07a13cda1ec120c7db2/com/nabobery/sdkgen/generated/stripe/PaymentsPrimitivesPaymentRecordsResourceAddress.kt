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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * A representation of a physical address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_address
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceAddress.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceAddress(
    /**
     * City, district, suburb, town, or village.
     */
    public val city: String? = null,
    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public val country: String? = null,
    /**
     * Address line 1, such as the street, PO Box, or company name.
     */
    public val line1: String? = null,
    /**
     * Address line 2, such as the apartment, suite, unit, or building.
     */
    public val line2: String? = null,
    /**
     * ZIP or postal code.
     */
    public val postalCode: String? = null,
    /**
     * State, county, province, or region ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
     */
    public val state: String? = null,
) {
    public class Builder {
        /**
         * City, district, suburb, town, or village.
         */
        public var city: String? = null

        /**
         * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public var country: String? = null

        /**
         * Address line 1, such as the street, PO Box, or company name.
         */
        public var line1: String? = null

        /**
         * Address line 2, such as the apartment, suite, unit, or building.
         */
        public var line2: String? = null

        /**
         * ZIP or postal code.
         */
        public var postalCode: String? = null

        /**
         * State, county, province, or region ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
         */
        public var state: String? = null

        public fun build(): PaymentsPrimitivesPaymentRecordsResourceAddress =
            PaymentsPrimitivesPaymentRecordsResourceAddress(
                city = city,
                country = country,
                line1 = line1,
                line2 = line2,
                postalCode = postalCode,
                state = state,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceAddress =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceAddress> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceAddress {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceAddress")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentsPrimitivesPaymentRecordsResourceAddress must be a JSON object",
                    )
            return PaymentsPrimitivesPaymentRecordsResourceAddress(
                city =
                    rawObject["city"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                line1 =
                    rawObject["line1"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                line2 =
                    rawObject["line2"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                postalCode =
                    rawObject["postal_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                state =
                    rawObject["state"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentsPrimitivesPaymentRecordsResourceAddress,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceAddress")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.city?.let { put("city", it) }
                    value.country?.let { put("country", it) }
                    value.line1?.let { put("line1", it) }
                    value.line2?.let { put("line2", it) }
                    value.postalCode?.let { put("postal_code", it) }
                    value.state?.let { put("state", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentsPrimitivesPaymentRecordsResourceAddress(
    block: PaymentsPrimitivesPaymentRecordsResourceAddress.Builder.() -> Unit,
): PaymentsPrimitivesPaymentRecordsResourceAddress = PaymentsPrimitivesPaymentRecordsResourceAddress.build(block)
