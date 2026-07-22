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
 * d/schema/properties/components/properties/account_management/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/account_management/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514(
    public val disableStripeUserAuthentication: Boolean? = null,
    public val externalAccountCollection: Boolean? = null,
) {
    public class Builder {
        public var disableStripeUserAuthentication: Boolean? = null

        public var externalAccountCollection: Boolean? = null

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514 =
            InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514(
                disableStripeUserAuthentication = disableStripeUserAuthentication,
                externalAccountCollection = externalAccountCollection,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514 must be a JSON object",
                    )
            return InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514(
                disableStripeUserAuthentication =
                    rawObject["disable_stripe_user_authentication"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                externalAccountCollection =
                    rawObject["external_account_collection"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514",
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
                    value.externalAccountCollection?.let {
                        put(
                            "external_account_collection",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514(
    block: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514 =
    InlineV1AccountSessionsPostRequestFormComponentsFeaturesX5849e514.build(block)
