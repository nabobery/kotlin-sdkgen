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
 * d/schema/properties/components/properties/issuing_cards_list/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/issuing_cards_list/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2(
    public val cardManagement: Boolean? = null,
    public val cardSpendDisputeManagement: Boolean? = null,
    public val cardholderManagement: Boolean? = null,
    public val disableStripeUserAuthentication: Boolean? = null,
    public val spendControlManagement: Boolean? = null,
) {
    public class Builder {
        public var cardManagement: Boolean? = null

        public var cardSpendDisputeManagement: Boolean? = null

        public var cardholderManagement: Boolean? = null

        public var disableStripeUserAuthentication: Boolean? = null

        public var spendControlManagement: Boolean? = null

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2 =
            InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2(
                cardManagement = cardManagement,
                cardSpendDisputeManagement = cardSpendDisputeManagement,
                cardholderManagement = cardholderManagement,
                disableStripeUserAuthentication = disableStripeUserAuthentication,
                spendControlManagement = spendControlManagement,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2 must be a JSON object",
                    )
            return InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2(
                cardManagement = rawObject["card_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                cardSpendDisputeManagement =
                    rawObject["card_spend_dispute_management"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                cardholderManagement =
                    rawObject["cardholder_management"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                disableStripeUserAuthentication =
                    rawObject["disable_stripe_user_authentication"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                spendControlManagement =
                    rawObject["spend_control_management"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.cardManagement?.let { put("card_management", json.encodeToJsonElement(it)) }
                    value.cardSpendDisputeManagement?.let {
                        put(
                            "card_spend_dispute_management",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.cardholderManagement?.let { put("cardholder_management", json.encodeToJsonElement(it)) }
                    value.disableStripeUserAuthentication?.let {
                        put(
                            "disable_stripe_user_authentication",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.spendControlManagement?.let { put("spend_control_management", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2(
    block: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2 =
    InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2.build(block)
