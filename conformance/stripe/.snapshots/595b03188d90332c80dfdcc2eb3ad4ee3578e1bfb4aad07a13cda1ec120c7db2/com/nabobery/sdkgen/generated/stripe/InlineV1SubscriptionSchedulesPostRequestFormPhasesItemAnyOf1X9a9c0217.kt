package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217(
    public val amountGte: Int? = null,
    public val resetBillingCycleAnchor: Boolean? = null,
) {
    public class Builder {
        public var amountGte: Int? = null

        public var resetBillingCycleAnchor: Boolean? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 =
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217(
                amountGte = amountGte,
                resetBillingCycleAnchor = resetBillingCycleAnchor,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217(
                amountGte = rawObject["amount_gte"]?.let { json.decodeFromJsonElement<Int>(it) },
                resetBillingCycleAnchor =
                    rawObject["reset_billing_cycle_anchor"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountGte?.let { put("amount_gte", json.encodeToJsonElement(it)) }
                    value.resetBillingCycleAnchor?.let {
                        put(
                            "reset_billing_cycle_anchor",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217.build(block)
