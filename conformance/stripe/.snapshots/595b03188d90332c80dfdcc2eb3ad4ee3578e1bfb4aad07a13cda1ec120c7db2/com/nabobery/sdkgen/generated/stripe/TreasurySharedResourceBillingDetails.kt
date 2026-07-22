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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_shared_resource_billing_details
 */
@Serializable(with = TreasurySharedResourceBillingDetails.Serializer::class)
public class TreasurySharedResourceBillingDetails(
    public val address: Address,
    /**
     * Email address.
     */
    public val email: String? = null,
    /**
     * Full name.
     */
    public val name: String? = null,
) {
    public class Builder {
        private var addressValue: Address? = null

        public var address: Address
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        /**
         * Email address.
         */
        public var email: String? = null

        /**
         * Full name.
         */
        public var name: String? = null

        public fun build(): TreasurySharedResourceBillingDetails {
            check(addressValue != null) { "address is required" }
            return TreasurySharedResourceBillingDetails(
                address = address,
                email = email,
                name = name,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasurySharedResourceBillingDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasurySharedResourceBillingDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasurySharedResourceBillingDetails {
            val jsonDecoder = decoder.requireJsonDecoder("TreasurySharedResourceBillingDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasurySharedResourceBillingDetails must be a JSON object")
            val address = json.decodeRequired<Address>(rawObject, "address")
            return TreasurySharedResourceBillingDetails(
                address = address,
                email =
                    rawObject["email"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                name =
                    rawObject["name"]?.let { element ->
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
            `value`: TreasurySharedResourceBillingDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasurySharedResourceBillingDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                    value.email?.let { put("email", it) }
                    value.name?.let { put("name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasurySharedResourceBillingDetails(
    block: TreasurySharedResourceBillingDetails.Builder.() -> Unit,
): TreasurySharedResourceBillingDetails = TreasurySharedResourceBillingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TreasurySharedResourceBillingDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
