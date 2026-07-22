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
import kotlin.Unit

/**
 * Details on the legal guardian's or authorizer's acceptance of the required Stripe agreements.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/additional_tos_acceptances
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52(
    public val account: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67? = null,
) {
    public class Builder {
        public var account:
            InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52 =
            InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52(
                account = account,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52(
                account =
                    rawObject["account"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.account?.let { put("account", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52(
    block: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52 =
    InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52.build(block)
