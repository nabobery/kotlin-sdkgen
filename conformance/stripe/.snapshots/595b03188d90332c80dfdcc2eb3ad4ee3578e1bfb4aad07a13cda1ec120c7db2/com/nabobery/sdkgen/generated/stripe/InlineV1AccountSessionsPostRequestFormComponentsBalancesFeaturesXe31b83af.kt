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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/balances/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/balances/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af(
    public val disableStripeUserAuthentication: Boolean? = null,
    public val editPayoutSchedule: Boolean? = null,
    public val externalAccountCollection: Boolean? = null,
    public val instantPayouts: Boolean? = null,
    public val standardPayouts: Boolean? = null,
) {
    public class Builder {
        public var disableStripeUserAuthentication: Boolean? = null

        public var editPayoutSchedule: Boolean? = null

        public var externalAccountCollection: Boolean? = null

        public var instantPayouts: Boolean? = null

        public var standardPayouts: Boolean? = null

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af =
            InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af(
                disableStripeUserAuthentication = disableStripeUserAuthentication,
                editPayoutSchedule = editPayoutSchedule,
                externalAccountCollection = externalAccountCollection,
                instantPayouts = instantPayouts,
                standardPayouts = standardPayouts,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af must be a JSON object",
                    )
            return InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af(
                disableStripeUserAuthentication =
                    rawObject["disable_stripe_user_authentication"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                editPayoutSchedule =
                    rawObject["edit_payout_schedule"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
                externalAccountCollection =
                    rawObject["external_account_collection"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
                instantPayouts = rawObject["instant_payouts"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                standardPayouts = rawObject["standard_payouts"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.disableStripeUserAuthentication?.let {
                        put(
                            "disable_stripe_user_authentication",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.editPayoutSchedule?.let { put("edit_payout_schedule", json.encodeToJsonElement(it)) }
                    value.externalAccountCollection?.let {
                        put(
                            "external_account_collection",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.instantPayouts?.let { put("instant_payouts", json.encodeToJsonElement(it)) }
                    value.standardPayouts?.let { put("standard_payouts", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af(
    block: InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af =
    InlineV1AccountSessionsPostRequestFormComponentsBalancesFeaturesXe31b83af.build(block)
