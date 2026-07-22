package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class CustomerTaxLocationView(
    public val country: String,
    public val source: InlineCustomerTaxLocationSourceX6bb00e15,
    public val state: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax_location
 */
@Serializable(with = CustomerTaxLocation.Serializer::class)
public class CustomerTaxLocation(
    /**
     * The identified tax country of the customer.
     */
    public val country: String,
    /**
     * The data source used to infer the customer's location.
     */
    public val source: InlineCustomerTaxLocationSourceX6bb00e15,
    /**
     * The identified tax state, county, province, or region of the customer.
     */
    public val state: String? = null,
) {
    public class Builder {
        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        private var sourceValue: InlineCustomerTaxLocationSourceX6bb00e15? = null

        public var source: InlineCustomerTaxLocationSourceX6bb00e15
            get() = requireNotNull(sourceValue) { "source is required" }
            set(`value`) {
                sourceValue = value
            }

        /**
         * The identified tax state, county, province, or region of the customer.
         */
        public var state: String? = null

        public fun build(): CustomerTaxLocation {
            check(countryValue != null) { "country is required" }
            check(sourceValue != null) { "source is required" }
            return CustomerTaxLocation(
                country = country,
                source = source,
                state = state,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CustomerTaxLocation = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerTaxLocation> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CustomerTaxLocation {
            val jsonDecoder = decoder.requireJsonDecoder("CustomerTaxLocation")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CustomerTaxLocation must be a JSON object")
            val country = json.decodeRequired<String>(rawObject, "country")
            val source = json.decodeRequired<InlineCustomerTaxLocationSourceX6bb00e15>(rawObject, "source")
            return CustomerTaxLocation(
                country = country,
                source = source,
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
            `value`: CustomerTaxLocation,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CustomerTaxLocation")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", value.country)
                    put("source", json.encodeToJsonElement(value.source))
                    value.state?.let { put("state", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerTaxLocation(block: CustomerTaxLocation.Builder.() -> Unit): CustomerTaxLocation =
    CustomerTaxLocation.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("CustomerTaxLocation is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
