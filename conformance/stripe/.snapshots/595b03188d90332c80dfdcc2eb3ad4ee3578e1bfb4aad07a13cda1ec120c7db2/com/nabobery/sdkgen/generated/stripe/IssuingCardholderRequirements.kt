package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_requirements
 */
@Serializable(with = IssuingCardholderRequirements.Serializer::class)
public class IssuingCardholderRequirements(
    /**
     * If `disabled_reason` is present, all cards will decline authorizations with `cardholder_verification_required`
     * reason.
     */
    public val disabledReason: InlineIssuingCardholderRequirementsDisabledReasonXb22ed862? = null,
    /**
     * Array of fields that need to be collected in order to verify and re-enable the cardholder.
     */
    public val pastDue: List<InlineIssuingCardholderRequirementsPastDueItemX2eb847cc>? = null,
) {
    public class Builder {
        /**
         * If `disabled_reason` is present, all cards will decline authorizations with `cardholder_verification_required`
         * reason.
         */
        public var disabledReason: InlineIssuingCardholderRequirementsDisabledReasonXb22ed862? = null

        /**
         * Array of fields that need to be collected in order to verify and re-enable the cardholder.
         */
        public var pastDue: List<InlineIssuingCardholderRequirementsPastDueItemX2eb847cc>? = null

        public fun build(): IssuingCardholderRequirements =
            IssuingCardholderRequirements(
                disabledReason = disabledReason,
                pastDue = pastDue,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingCardholderRequirements = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardholderRequirements> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardholderRequirements {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderRequirements")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardholderRequirements must be a JSON object")
            return IssuingCardholderRequirements(
                disabledReason =
                    rawObject["disabled_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingCardholderRequirementsDisabledReasonXb22ed862?>(
                                element,
                            )
                        }
                    },
                pastDue =
                    rawObject["past_due"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<InlineIssuingCardholderRequirementsPastDueItemX2eb847cc>?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingCardholderRequirements,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderRequirements")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
                    value.pastDue?.let { put("past_due", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingCardholderRequirements(
    block: IssuingCardholderRequirements.Builder.() -> Unit,
): IssuingCardholderRequirements = IssuingCardholderRequirements.build(block)
