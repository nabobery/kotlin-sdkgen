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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class IssuingAuthorizationTreasuryView(
    @SerialName("received_credits")
    public val receivedCredits: List<String>,
    @SerialName("received_debits")
    public val receivedDebits: List<String>,
    public val transaction: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_treasury
 */
@Serializable(with = IssuingAuthorizationTreasury.Serializer::class)
public class IssuingAuthorizationTreasury(
    receivedCredits: List<String>,
    receivedDebits: List<String>,
    /**
     * The Treasury [Transaction](https://docs.stripe.com/api/treasury/transactions) associated with this authorization
     */
    public val transaction: String? = null,
) {
    /**
     * The array of [ReceivedCredits](https://docs.stripe.com/api/treasury/received_credits) associated with this
     * authorization
     */
    public val receivedCredits: List<String> = receivedCredits.toList()

    /**
     * The array of [ReceivedDebits](https://docs.stripe.com/api/treasury/received_debits) associated with this
     * authorization
     */
    public val receivedDebits: List<String> = receivedDebits.toList()

    public class Builder {
        private var receivedCreditsValue: List<String>? = null

        public var receivedCredits: List<String>
            get() = requireNotNull(receivedCreditsValue) { "receivedCredits is required" }
            set(`value`) {
                receivedCreditsValue = value
            }

        private var receivedDebitsValue: List<String>? = null

        public var receivedDebits: List<String>
            get() = requireNotNull(receivedDebitsValue) { "receivedDebits is required" }
            set(`value`) {
                receivedDebitsValue = value
            }

        /**
         * The Treasury [Transaction](https://docs.stripe.com/api/treasury/transactions) associated with this authorization
         */
        public var transaction: String? = null

        public fun build(): IssuingAuthorizationTreasury {
            check(receivedCreditsValue != null) { "receivedCredits is required" }
            check(receivedDebitsValue != null) { "receivedDebits is required" }
            return IssuingAuthorizationTreasury(
                receivedCredits = receivedCredits,
                receivedDebits = receivedDebits,
                transaction = transaction,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingAuthorizationTreasury = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingAuthorizationTreasury> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingAuthorizationTreasury {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationTreasury")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingAuthorizationTreasury must be a JSON object")
            val receivedCredits = json.decodeRequired<List<String>>(rawObject, "received_credits")
            val receivedDebits = json.decodeRequired<List<String>>(rawObject, "received_debits")
            return IssuingAuthorizationTreasury(
                receivedCredits = receivedCredits,
                receivedDebits = receivedDebits,
                transaction =
                    rawObject["transaction"]?.let { element ->
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
            `value`: IssuingAuthorizationTreasury,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationTreasury")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("received_credits", json.encodeToJsonElement(value.receivedCredits))
                    put("received_debits", json.encodeToJsonElement(value.receivedDebits))
                    value.transaction?.let { put("transaction", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingAuthorizationTreasury(
    block: IssuingAuthorizationTreasury.Builder.() -> Unit,
): IssuingAuthorizationTreasury = IssuingAuthorizationTreasury.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("IssuingAuthorizationTreasury is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
