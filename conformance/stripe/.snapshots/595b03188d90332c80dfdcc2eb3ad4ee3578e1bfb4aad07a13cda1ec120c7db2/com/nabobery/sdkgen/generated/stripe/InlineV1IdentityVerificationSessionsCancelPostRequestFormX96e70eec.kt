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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}~1cancel/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}~1cancel/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec.Serializer::class)
public class InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec =
            InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec(
                expand = expand,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec must be a JSON object",
                    )
            return InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec(
    block: InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec.Builder.() -> Unit,
): InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec =
    InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec.build(block)
