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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_network_data
 */
@Serializable(with = IssuingNetworkTokenNetworkData.Serializer::class)
public class IssuingNetworkTokenNetworkData(
    /**
     * The network that the token is associated with. An additional hash is included with a name matching this value,
     * containing tokenization data specific to the card network.
     */
    public val type: InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa,
    public val device: IssuingNetworkTokenDevice? = null,
    public val mastercard: IssuingNetworkTokenMastercard? = null,
    public val visa: IssuingNetworkTokenVisa? = null,
    public val walletProvider: IssuingNetworkTokenWalletProvider? = null,
) {
    public class Builder {
        private var typeValue: InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa? = null

        public var type: InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var device: IssuingNetworkTokenDevice? = null

        public var mastercard: IssuingNetworkTokenMastercard? = null

        public var visa: IssuingNetworkTokenVisa? = null

        public var walletProvider: IssuingNetworkTokenWalletProvider? = null

        public fun build(): IssuingNetworkTokenNetworkData {
            check(typeValue != null) { "type is required" }
            return IssuingNetworkTokenNetworkData(
                type = type,
                device = device,
                mastercard = mastercard,
                visa = visa,
                walletProvider = walletProvider,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingNetworkTokenNetworkData = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingNetworkTokenNetworkData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingNetworkTokenNetworkData {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenNetworkData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingNetworkTokenNetworkData must be a JSON object")
            val type = json.decodeRequired<InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa>(rawObject, "type")
            return IssuingNetworkTokenNetworkData(
                type = type,
                device = rawObject["device"]?.let { json.decodeFromJsonElement<IssuingNetworkTokenDevice>(it) },
                mastercard =
                    rawObject["mastercard"]?.let {
                        json.decodeFromJsonElement<IssuingNetworkTokenMastercard>(
                            it,
                        )
                    },
                visa = rawObject["visa"]?.let { json.decodeFromJsonElement<IssuingNetworkTokenVisa>(it) },
                walletProvider =
                    rawObject["wallet_provider"]?.let {
                        json.decodeFromJsonElement<IssuingNetworkTokenWalletProvider>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingNetworkTokenNetworkData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenNetworkData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.device?.let { put("device", json.encodeToJsonElement(it)) }
                    value.mastercard?.let { put("mastercard", json.encodeToJsonElement(it)) }
                    value.visa?.let { put("visa", json.encodeToJsonElement(it)) }
                    value.walletProvider?.let { put("wallet_provider", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingNetworkTokenNetworkData(
    block: IssuingNetworkTokenNetworkData.Builder.() -> Unit,
): IssuingNetworkTokenNetworkData = IssuingNetworkTokenNetworkData.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "IssuingNetworkTokenNetworkData is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
