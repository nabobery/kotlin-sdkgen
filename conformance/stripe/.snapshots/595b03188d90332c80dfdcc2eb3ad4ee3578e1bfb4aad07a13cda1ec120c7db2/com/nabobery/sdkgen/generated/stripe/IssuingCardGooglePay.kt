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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_google_pay
 */
@Serializable(with = IssuingCardGooglePay.Serializer::class)
public class IssuingCardGooglePay(
    /**
     * Google Pay Eligibility
     */
    public val eligible: Boolean,
    /**
     * Reason the card is ineligible for Google Pay
     */
    public val ineligibleReason: InlineIssuingCardGooglePayIneligibleReasonX01a38feb? = null,
) {
    public class Builder {
        private var eligibleValue: Boolean? = null

        public var eligible: Boolean
            get() = requireNotNull(eligibleValue) { "eligible is required" }
            set(`value`) {
                eligibleValue = value
            }

        /**
         * Reason the card is ineligible for Google Pay
         */
        public var ineligibleReason: InlineIssuingCardGooglePayIneligibleReasonX01a38feb? = null

        public fun build(): IssuingCardGooglePay {
            check(eligibleValue != null) { "eligible is required" }
            return IssuingCardGooglePay(
                eligible = eligible,
                ineligibleReason = ineligibleReason,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingCardGooglePay = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardGooglePay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardGooglePay {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardGooglePay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardGooglePay must be a JSON object")
            val eligible = json.decodeRequired<Boolean>(rawObject, "eligible")
            return IssuingCardGooglePay(
                eligible = eligible,
                ineligibleReason =
                    rawObject["ineligible_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingCardGooglePayIneligibleReasonX01a38feb?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingCardGooglePay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardGooglePay")
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

public fun issuingCardGooglePay(block: IssuingCardGooglePay.Builder.() -> Unit): IssuingCardGooglePay =
    IssuingCardGooglePay.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingCardGooglePay is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
