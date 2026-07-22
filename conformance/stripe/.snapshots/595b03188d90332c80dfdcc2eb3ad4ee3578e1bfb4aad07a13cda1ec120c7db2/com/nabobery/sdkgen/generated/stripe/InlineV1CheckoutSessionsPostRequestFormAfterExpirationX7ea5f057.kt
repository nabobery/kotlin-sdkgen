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
 * Configure actions after a Checkout Session has expired. You can't set this parameter if `ui_mode` is `elements`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/after_expiration
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057(
    public val recovery: InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903? = null,
) {
    public class Builder {
        public var recovery: InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057 =
            InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057(
                recovery = recovery,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057(
                recovery =
                    rawObject["recovery"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.recovery?.let { put("recovery", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057(
    block: InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057 =
    InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057.build(block)
