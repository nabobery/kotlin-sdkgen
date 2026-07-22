package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_address
 */
@Serializable(with = IssuingNetworkTokenAddress.Serializer::class)
public class IssuingNetworkTokenAddress(
    /**
     * The street address of the cardholder tokenizing the card.
     */
    public val line1: String,
    /**
     * The postal code of the cardholder tokenizing the card.
     */
    public val postalCode: String,
) {
    public class Builder {
        private var line1Value: String? = null

        public var line1: String
            get() = requireNotNull(line1Value) { "line1 is required" }
            set(`value`) {
                line1Value = value
            }

        private var postalCodeValue: String? = null

        public var postalCode: String
            get() = requireNotNull(postalCodeValue) { "postalCode is required" }
            set(`value`) {
                postalCodeValue = value
            }

        public fun build(): IssuingNetworkTokenAddress {
            check(line1Value != null) { "line1 is required" }
            check(postalCodeValue != null) { "postalCode is required" }
            return IssuingNetworkTokenAddress(
                line1 = line1,
                postalCode = postalCode,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingNetworkTokenAddress = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingNetworkTokenAddress> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingNetworkTokenAddress {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenAddress")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingNetworkTokenAddress must be a JSON object")
            val line1 = json.decodeRequired<String>(rawObject, "line1")
            val postalCode = json.decodeRequired<String>(rawObject, "postal_code")
            return IssuingNetworkTokenAddress(
                line1 = line1,
                postalCode = postalCode,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingNetworkTokenAddress,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenAddress")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("line1", value.line1)
                    put("postal_code", value.postalCode)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingNetworkTokenAddress(
    block: IssuingNetworkTokenAddress.Builder.() -> Unit,
): IssuingNetworkTokenAddress = IssuingNetworkTokenAddress.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("IssuingNetworkTokenAddress is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
