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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_acss_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_acss_debit
 */
@Serializable(with = SourceTypeAcssDebit.Serializer::class)
public class SourceTypeAcssDebit(
    public val bankAddressCity: String? = null,
    public val bankAddressLine1: String? = null,
    public val bankAddressLine2: String? = null,
    public val bankAddressPostalCode: String? = null,
    public val bankName: String? = null,
    public val category: String? = null,
    public val country: String? = null,
    public val fingerprint: String? = null,
    public val last4: String? = null,
    public val routingNumber: String? = null,
) {
    public class Builder {
        public var bankAddressCity: String? = null

        public var bankAddressLine1: String? = null

        public var bankAddressLine2: String? = null

        public var bankAddressPostalCode: String? = null

        public var bankName: String? = null

        public var category: String? = null

        public var country: String? = null

        public var fingerprint: String? = null

        public var last4: String? = null

        public var routingNumber: String? = null

        public fun build(): SourceTypeAcssDebit =
            SourceTypeAcssDebit(
                bankAddressCity = bankAddressCity,
                bankAddressLine1 = bankAddressLine1,
                bankAddressLine2 = bankAddressLine2,
                bankAddressPostalCode = bankAddressPostalCode,
                bankName = bankName,
                category = category,
                country = country,
                fingerprint = fingerprint,
                last4 = last4,
                routingNumber = routingNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceTypeAcssDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceTypeAcssDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceTypeAcssDebit {
            val jsonDecoder = decoder.requireJsonDecoder("SourceTypeAcssDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceTypeAcssDebit must be a JSON object")
            return SourceTypeAcssDebit(
                bankAddressCity =
                    rawObject["bank_address_city"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                bankAddressLine1 =
                    rawObject["bank_address_line_1"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                bankAddressLine2 =
                    rawObject["bank_address_line_2"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                bankAddressPostalCode =
                    rawObject["bank_address_postal_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                bankName =
                    rawObject["bank_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                category =
                    rawObject["category"]?.let { element ->
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
                fingerprint =
                    rawObject["fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                routingNumber =
                    rawObject["routing_number"]?.let { element ->
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
            `value`: SourceTypeAcssDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceTypeAcssDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankAddressCity?.let { put("bank_address_city", it) }
                    value.bankAddressLine1?.let { put("bank_address_line_1", it) }
                    value.bankAddressLine2?.let { put("bank_address_line_2", it) }
                    value.bankAddressPostalCode?.let { put("bank_address_postal_code", it) }
                    value.bankName?.let { put("bank_name", it) }
                    value.category?.let { put("category", it) }
                    value.country?.let { put("country", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceTypeAcssDebit(block: SourceTypeAcssDebit.Builder.() -> Unit): SourceTypeAcssDebit =
    SourceTypeAcssDebit.build(block)
