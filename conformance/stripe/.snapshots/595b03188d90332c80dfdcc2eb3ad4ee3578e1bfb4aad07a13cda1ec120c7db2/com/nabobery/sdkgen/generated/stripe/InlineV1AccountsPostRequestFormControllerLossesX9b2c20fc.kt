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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/losses.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/losses
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc.Serializer::class)
public class InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc(
    public val payments: InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3? = null,
) {
    public class Builder {
        public var payments: InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3? = null

        public fun build(): InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc =
            InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc(
                payments = payments,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc(
                payments =
                    rawObject["payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.payments?.let { put("payments", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormControllerLossesX9b2c20fc(
    block: InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc =
    InlineV1AccountsPostRequestFormControllerLossesX9b2c20fc.build(block)
