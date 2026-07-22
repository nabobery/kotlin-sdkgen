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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1login_links/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1login_links/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsLoginLinksPostRequestFormX852839ba.Serializer::class)
public class InlineV1AccountsLoginLinksPostRequestFormX852839ba(
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

        public fun build(): InlineV1AccountsLoginLinksPostRequestFormX852839ba =
            InlineV1AccountsLoginLinksPostRequestFormX852839ba(
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsLoginLinksPostRequestFormX852839ba =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsLoginLinksPostRequestFormX852839ba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsLoginLinksPostRequestFormX852839ba {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsLoginLinksPostRequestFormX852839ba")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsLoginLinksPostRequestFormX852839ba must be a JSON object",
                    )
            return InlineV1AccountsLoginLinksPostRequestFormX852839ba(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsLoginLinksPostRequestFormX852839ba,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsLoginLinksPostRequestFormX852839ba")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsLoginLinksPostRequestFormX852839ba(
    block: InlineV1AccountsLoginLinksPostRequestFormX852839ba.Builder.() -> Unit,
): InlineV1AccountsLoginLinksPostRequestFormX852839ba = InlineV1AccountsLoginLinksPostRequestFormX852839ba.build(block)
