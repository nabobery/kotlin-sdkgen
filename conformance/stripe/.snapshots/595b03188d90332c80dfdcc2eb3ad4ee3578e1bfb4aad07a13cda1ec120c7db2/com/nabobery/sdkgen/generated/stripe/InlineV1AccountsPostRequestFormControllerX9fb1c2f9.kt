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
 * A hash of configuration describing the account controller's attributes.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerX9fb1c2f9.Serializer::class)
public class InlineV1AccountsPostRequestFormControllerX9fb1c2f9(
    public val fees: InlineV1AccountsPostRequestFormControllerFeesXd56bd08a? = null,
    public val losses: InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc? = null,
    public val requirementCollection: InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0? = null,
    public val stripeDashboard: InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69? = null,
) {
    public class Builder {
        public var fees: InlineV1AccountsPostRequestFormControllerFeesXd56bd08a? = null

        public var losses: InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc? = null

        public var requirementCollection:
            InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0? = null

        public var stripeDashboard: InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69? =
            null

        public fun build(): InlineV1AccountsPostRequestFormControllerX9fb1c2f9 =
            InlineV1AccountsPostRequestFormControllerX9fb1c2f9(
                fees = fees,
                losses = losses,
                requirementCollection = requirementCollection,
                stripeDashboard = stripeDashboard,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormControllerX9fb1c2f9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerX9fb1c2f9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerX9fb1c2f9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormControllerX9fb1c2f9")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormControllerX9fb1c2f9 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormControllerX9fb1c2f9(
                fees =
                    rawObject["fees"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerFeesXd56bd08a>(it)
                    },
                losses =
                    rawObject["losses"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc>(it)
                    },
                requirementCollection =
                    rawObject["requirement_collection"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0>(
                                it,
                            )
                    },
                stripeDashboard =
                    rawObject["stripe_dashboard"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormControllerX9fb1c2f9,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormControllerX9fb1c2f9")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.fees?.let { put("fees", json.encodeToJsonElement(it)) }
                    value.losses?.let { put("losses", json.encodeToJsonElement(it)) }
                    value.requirementCollection?.let { put("requirement_collection", json.encodeToJsonElement(it)) }
                    value.stripeDashboard?.let { put("stripe_dashboard", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormControllerX9fb1c2f9(
    block: InlineV1AccountsPostRequestFormControllerX9fb1c2f9.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormControllerX9fb1c2f9 = InlineV1AccountsPostRequestFormControllerX9fb1c2f9.build(block)
