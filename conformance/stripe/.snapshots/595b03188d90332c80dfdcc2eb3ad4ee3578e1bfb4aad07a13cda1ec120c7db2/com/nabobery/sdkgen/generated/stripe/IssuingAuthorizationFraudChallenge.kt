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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fraud_challenge
 */
@Serializable(with = IssuingAuthorizationFraudChallenge.Serializer::class)
public class IssuingAuthorizationFraudChallenge(
    /**
     * The method by which the fraud challenge was delivered to the cardholder.
     */
    public val channel: InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f,
    /**
     * The status of the fraud challenge.
     */
    public val status: InlineIssuingAuthorizationFraudChallengeStatusX729193b4,
    /**
     * If the challenge is not deliverable, the reason why.
     */
    public val undeliverableReason: InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec? = null,
) {
    public class Builder {
        private var channelValue: InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f? = null

        public var channel: InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f
            get() = requireNotNull(channelValue) { "channel is required" }
            set(`value`) {
                channelValue = value
            }

        private var statusValue: InlineIssuingAuthorizationFraudChallengeStatusX729193b4? = null

        public var status: InlineIssuingAuthorizationFraudChallengeStatusX729193b4
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * If the challenge is not deliverable, the reason why.
         */
        public var undeliverableReason:
            InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec? = null

        public fun build(): IssuingAuthorizationFraudChallenge {
            check(channelValue != null) { "channel is required" }
            check(statusValue != null) { "status is required" }
            return IssuingAuthorizationFraudChallenge(
                channel = channel,
                status = status,
                undeliverableReason = undeliverableReason,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingAuthorizationFraudChallenge = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingAuthorizationFraudChallenge> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingAuthorizationFraudChallenge {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationFraudChallenge")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingAuthorizationFraudChallenge must be a JSON object")
            val channel =
                json.decodeRequired<InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f>(
                    rawObject,
                    "channel",
                )
            val status =
                json.decodeRequired<InlineIssuingAuthorizationFraudChallengeStatusX729193b4>(
                    rawObject,
                    "status",
                )
            return IssuingAuthorizationFraudChallenge(
                channel = channel,
                status = status,
                undeliverableReason =
                    rawObject["undeliverable_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingAuthorizationFraudChallenge,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationFraudChallenge")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("channel", json.encodeToJsonElement(value.channel))
                    put("status", json.encodeToJsonElement(value.status))
                    value.undeliverableReason?.let { put("undeliverable_reason", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingAuthorizationFraudChallenge(
    block: IssuingAuthorizationFraudChallenge.Builder.() -> Unit,
): IssuingAuthorizationFraudChallenge = IssuingAuthorizationFraudChallenge.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "IssuingAuthorizationFraudChallenge is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
