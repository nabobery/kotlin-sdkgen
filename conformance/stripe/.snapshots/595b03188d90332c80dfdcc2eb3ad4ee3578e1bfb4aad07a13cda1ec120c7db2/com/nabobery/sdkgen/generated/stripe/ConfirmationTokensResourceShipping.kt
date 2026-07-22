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
public data class ConfirmationTokensResourceShippingView(
    public val address: Address,
    public val name: String,
    public val phone: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_shipping
 */
@Serializable(with = ConfirmationTokensResourceShipping.Serializer::class)
public class ConfirmationTokensResourceShipping(
    public val address: Address,
    /**
     * Recipient name.
     */
    public val name: String,
    /**
     * Recipient phone (including extension).
     */
    public val phone: String? = null,
) {
    public class Builder {
        private var addressValue: Address? = null

        public var address: Address
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        /**
         * Recipient phone (including extension).
         */
        public var phone: String? = null

        public fun build(): ConfirmationTokensResourceShipping {
            check(addressValue != null) { "address is required" }
            check(nameValue != null) { "name is required" }
            return ConfirmationTokensResourceShipping(
                address = address,
                name = name,
                phone = phone,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConfirmationTokensResourceShipping = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConfirmationTokensResourceShipping> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConfirmationTokensResourceShipping {
            val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourceShipping")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConfirmationTokensResourceShipping must be a JSON object")
            val address = json.decodeRequired<Address>(rawObject, "address")
            val name = json.decodeRequired<String>(rawObject, "name")
            return ConfirmationTokensResourceShipping(
                address = address,
                name = name,
                phone =
                    rawObject["phone"]?.let { element ->
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
            `value`: ConfirmationTokensResourceShipping,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourceShipping")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                    put("name", value.name)
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun confirmationTokensResourceShipping(
    block: ConfirmationTokensResourceShipping.Builder.() -> Unit,
): ConfirmationTokensResourceShipping = ConfirmationTokensResourceShipping.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "ConfirmationTokensResourceShipping is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
