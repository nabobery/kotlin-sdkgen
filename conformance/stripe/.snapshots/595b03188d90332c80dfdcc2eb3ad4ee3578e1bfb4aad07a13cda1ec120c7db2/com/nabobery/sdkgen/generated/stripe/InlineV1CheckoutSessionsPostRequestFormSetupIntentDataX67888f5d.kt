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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in `setup` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/setup_intent_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d(
    public val description: String? = null,
    public val metadata: Map<String, String>? = null,
    public val onBehalfOf: String? = null,
) {
    public class Builder {
        public var description: String? = null

        public var metadata: Map<String, String>? = null

        public var onBehalfOf: String? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d =
            InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d(
                description = description,
                metadata = metadata,
                onBehalfOf = onBehalfOf,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d(
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.description?.let { put("description", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d(
    block: InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d =
    InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d.build(block)
