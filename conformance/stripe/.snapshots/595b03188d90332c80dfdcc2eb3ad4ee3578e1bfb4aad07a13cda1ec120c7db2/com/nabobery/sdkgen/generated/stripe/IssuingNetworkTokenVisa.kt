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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_visa
 */
@Serializable(with = IssuingNetworkTokenVisa.Serializer::class)
public class IssuingNetworkTokenVisa(
    /**
     * The network-unique identifier for the token.
     */
    public val tokenReferenceId: String,
    /**
     * The ID of the entity requesting tokenization, specific to Visa.
     */
    public val tokenRequestorId: String,
    /**
     * A unique reference ID from Visa to represent the card account number.
     */
    public val cardReferenceId: String? = null,
    /**
     * Degree of risk associated with the token between `01` and `99`, with higher number indicating higher risk. A `00`
     * value indicates the token was not scored by Visa.
     */
    public val tokenRiskScore: String? = null,
) {
    public class Builder {
        private var tokenReferenceIdValue: String? = null

        public var tokenReferenceId: String
            get() = requireNotNull(tokenReferenceIdValue) { "tokenReferenceId is required" }
            set(`value`) {
                tokenReferenceIdValue = value
            }

        private var tokenRequestorIdValue: String? = null

        public var tokenRequestorId: String
            get() = requireNotNull(tokenRequestorIdValue) { "tokenRequestorId is required" }
            set(`value`) {
                tokenRequestorIdValue = value
            }

        /**
         * A unique reference ID from Visa to represent the card account number.
         */
        public var cardReferenceId: String? = null

        /**
         * Degree of risk associated with the token between `01` and `99`, with higher number indicating higher risk. A `00`
         * value indicates the token was not scored by Visa.
         */
        public var tokenRiskScore: String? = null

        public fun build(): IssuingNetworkTokenVisa {
            check(tokenReferenceIdValue != null) { "tokenReferenceId is required" }
            check(tokenRequestorIdValue != null) { "tokenRequestorId is required" }
            return IssuingNetworkTokenVisa(
                tokenReferenceId = tokenReferenceId,
                tokenRequestorId = tokenRequestorId,
                cardReferenceId = cardReferenceId,
                tokenRiskScore = tokenRiskScore,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingNetworkTokenVisa = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingNetworkTokenVisa> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingNetworkTokenVisa {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenVisa")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingNetworkTokenVisa must be a JSON object")
            val tokenReferenceId = json.decodeRequired<String>(rawObject, "token_reference_id")
            val tokenRequestorId = json.decodeRequired<String>(rawObject, "token_requestor_id")
            return IssuingNetworkTokenVisa(
                tokenReferenceId = tokenReferenceId,
                tokenRequestorId = tokenRequestorId,
                cardReferenceId =
                    rawObject["card_reference_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                tokenRiskScore = rawObject["token_risk_score"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingNetworkTokenVisa,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenVisa")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("token_reference_id", value.tokenReferenceId)
                    put("token_requestor_id", value.tokenRequestorId)
                    value.cardReferenceId?.let { put("card_reference_id", it) }
                    value.tokenRiskScore?.let { put("token_risk_score", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingNetworkTokenVisa(block: IssuingNetworkTokenVisa.Builder.() -> Unit): IssuingNetworkTokenVisa =
    IssuingNetworkTokenVisa.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingNetworkTokenVisa is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
