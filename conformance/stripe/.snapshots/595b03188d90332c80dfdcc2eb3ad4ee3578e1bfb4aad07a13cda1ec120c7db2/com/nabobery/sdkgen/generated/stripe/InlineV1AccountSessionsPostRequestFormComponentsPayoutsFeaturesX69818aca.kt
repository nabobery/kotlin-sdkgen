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
 * d/schema/properties/components/properties/payouts/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payouts/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca(
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

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca =
            InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca(
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
        ): InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca must be a JSON object",
                    )
            return InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca(
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
            `value`: InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca",
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

public fun inlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca(
    block: InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca =
    InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca.build(block)
