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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_apple_pay
 */
@Serializable(with = IssuingCardApplePay.Serializer::class)
public class IssuingCardApplePay(
    /**
     * Apple Pay Eligibility
     */
    public val eligible: Boolean,
    /**
     * Reason the card is ineligible for Apple Pay
     */
    public val ineligibleReason: InlineIssuingCardApplePayIneligibleReasonXbee2eece? = null,
) {
    public class Builder {
        private var eligibleValue: Boolean? = null

        public var eligible: Boolean
            get() = requireNotNull(eligibleValue) { "eligible is required" }
            set(`value`) {
                eligibleValue = value
            }

        /**
         * Reason the card is ineligible for Apple Pay
         */
        public var ineligibleReason: InlineIssuingCardApplePayIneligibleReasonXbee2eece? = null

        public fun build(): IssuingCardApplePay {
            check(eligibleValue != null) { "eligible is required" }
            return IssuingCardApplePay(
                eligible = eligible,
                ineligibleReason = ineligibleReason,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingCardApplePay = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardApplePay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardApplePay {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardApplePay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardApplePay must be a JSON object")
            val eligible = json.decodeRequired<Boolean>(rawObject, "eligible")
            return IssuingCardApplePay(
                eligible = eligible,
                ineligibleReason =
                    rawObject["ineligible_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingCardApplePayIneligibleReasonXbee2eece?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingCardApplePay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardApplePay")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("eligible", json.encodeToJsonElement(value.eligible))
                    value.ineligibleReason?.let { put("ineligible_reason", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingCardApplePay(block: IssuingCardApplePay.Builder.() -> Unit): IssuingCardApplePay =
    IssuingCardApplePay.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingCardApplePay is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
