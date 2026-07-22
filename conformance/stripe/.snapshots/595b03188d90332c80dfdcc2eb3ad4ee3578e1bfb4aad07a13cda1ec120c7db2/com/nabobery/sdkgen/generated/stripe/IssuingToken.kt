package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class IssuingTokenView(
    public val card: InlineIssuingTokenCardXb1c7c14b,
    public val created: Int,
    @SerialName("device_fingerprint")
    public val deviceFingerprint: String? = null,
    public val id: String,
    public val last4: String? = null,
    public val livemode: Boolean,
    public val network: InlineIssuingTokenNetworkXbda36374,
    @SerialName("network_data")
    public val networkData: IssuingNetworkTokenNetworkData? = null,
    @SerialName("network_updated_at")
    public val networkUpdatedAt: Int,
    @SerialName("object")
    public val objectValue: InlineIssuingTokenObjectValueX40b4ed68,
    public val status: InlineIssuingTokenStatusXc4e959df,
    @SerialName("wallet_provider")
    public val walletProvider: InlineIssuingTokenWalletProviderXc4259c1a? = null,
)

/**
 * An issuing token object is created when an issued card is added to a digital wallet. As a [card
 * issuer](https://docs.stripe.com/issuing), you can [view and manage these
 * tokens](https://docs.stripe.com/issuing/controls/token-management) through Stripe.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token
 */
@Serializable(with = IssuingToken.Serializer::class)
public class IssuingToken(
    /**
     * Card associated with this token.
     */
    public val card: InlineIssuingTokenCardXb1c7c14b,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * The token service provider / card network associated with the token.
     */
    public val network: InlineIssuingTokenNetworkXbda36374,
    /**
     * Time at which the token was last updated by the card network. Measured in seconds since the Unix epoch.
     */
    public val networkUpdatedAt: Int,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIssuingTokenObjectValueX40b4ed68,
    /**
     * The usage state of the token.
     */
    public val status: InlineIssuingTokenStatusXc4e959df,
    /**
     * The hashed ID derived from the device ID from the card network associated with the token.
     */
    public val deviceFingerprint: String? = null,
    /**
     * The last four digits of the token.
     */
    public val last4: String? = null,
    public val networkData: IssuingNetworkTokenNetworkData? = null,
    /**
     * The digital wallet for this token, if one was used.
     */
    public val walletProvider: InlineIssuingTokenWalletProviderXc4259c1a? = null,
) {
    public class Builder {
        private var cardValue: InlineIssuingTokenCardXb1c7c14b? = null

        public var card: InlineIssuingTokenCardXb1c7c14b
            get() = requireNotNull(cardValue) { "card is required" }
            set(`value`) {
                cardValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var networkValue: InlineIssuingTokenNetworkXbda36374? = null

        public var network: InlineIssuingTokenNetworkXbda36374
            get() = requireNotNull(networkValue) { "network is required" }
            set(`value`) {
                networkValue = value
            }

        private var networkUpdatedAtValue: Int? = null

        public var networkUpdatedAt: Int
            get() = requireNotNull(networkUpdatedAtValue) { "networkUpdatedAt is required" }
            set(`value`) {
                networkUpdatedAtValue = value
            }

        private var objectValueValue: InlineIssuingTokenObjectValueX40b4ed68? = null

        public var objectValue: InlineIssuingTokenObjectValueX40b4ed68
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineIssuingTokenStatusXc4e959df? = null

        public var status: InlineIssuingTokenStatusXc4e959df
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * The hashed ID derived from the device ID from the card network associated with the token.
         */
        public var deviceFingerprint: String? = null

        /**
         * The last four digits of the token.
         */
        public var last4: String? = null

        public var networkData: IssuingNetworkTokenNetworkData? = null

        /**
         * The digital wallet for this token, if one was used.
         */
        public var walletProvider: InlineIssuingTokenWalletProviderXc4259c1a? = null

        public fun build(): IssuingToken {
            check(cardValue != null) { "card is required" }
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(networkValue != null) { "network is required" }
            check(networkUpdatedAtValue != null) { "networkUpdatedAt is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            return IssuingToken(
                card = card,
                created = created,
                id = id,
                livemode = livemode,
                network = network,
                networkUpdatedAt = networkUpdatedAt,
                objectValue = objectValue,
                status = status,
                deviceFingerprint = deviceFingerprint,
                last4 = last4,
                networkData = networkData,
                walletProvider = walletProvider,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingToken = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingToken> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingToken {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingToken")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingToken must be a JSON object")
            val card = json.decodeRequired<InlineIssuingTokenCardXb1c7c14b>(rawObject, "card")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val network = json.decodeRequired<InlineIssuingTokenNetworkXbda36374>(rawObject, "network")
            val networkUpdatedAt = json.decodeRequired<Int>(rawObject, "network_updated_at")
            val objectValue = json.decodeRequired<InlineIssuingTokenObjectValueX40b4ed68>(rawObject, "object")
            val status = json.decodeRequired<InlineIssuingTokenStatusXc4e959df>(rawObject, "status")
            return IssuingToken(
                card = card,
                created = created,
                id = id,
                livemode = livemode,
                network = network,
                networkUpdatedAt = networkUpdatedAt,
                objectValue = objectValue,
                status = status,
                deviceFingerprint =
                    rawObject["device_fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 = rawObject["last4"]?.let { json.decodeFromJsonElement<String>(it) },
                networkData =
                    rawObject["network_data"]?.let {
                        json
                            .decodeFromJsonElement<IssuingNetworkTokenNetworkData>(
                                it,
                            )
                    },
                walletProvider =
                    rawObject["wallet_provider"]?.let {
                        json.decodeFromJsonElement<InlineIssuingTokenWalletProviderXc4259c1a>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingToken,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingToken")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("card", json.encodeToJsonElement(value.card))
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("network", json.encodeToJsonElement(value.network))
                    put("network_updated_at", json.encodeToJsonElement(value.networkUpdatedAt))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    value.deviceFingerprint?.let { put("device_fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.networkData?.let { put("network_data", json.encodeToJsonElement(it)) }
                    value.walletProvider?.let { put("wallet_provider", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingToken(block: IssuingToken.Builder.() -> Unit): IssuingToken = IssuingToken.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("IssuingToken is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
