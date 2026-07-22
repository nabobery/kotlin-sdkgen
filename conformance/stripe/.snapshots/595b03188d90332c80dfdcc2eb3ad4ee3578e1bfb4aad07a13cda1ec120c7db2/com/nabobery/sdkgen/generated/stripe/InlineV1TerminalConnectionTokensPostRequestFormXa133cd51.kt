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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1connection_tokens/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1connection_tokens/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalConnectionTokensPostRequestFormXa133cd51.Serializer::class)
public class InlineV1TerminalConnectionTokensPostRequestFormXa133cd51(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * The id of the location that this connection token is scoped to. If specified the connection token will only be
     * usable with readers assigned to that location, otherwise the connection token will be usable with all readers. Note
     * that location scoping only applies to internet-connected readers. For more details, see [the docs on scoping
     * connection
     * tokens](https://docs.stripe.com/terminal/fleet/locations-and-zones?dashboard-or-api=api#connection-tokens).
     */
    public val location: String? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * The id of the location that this connection token is scoped to. If specified the connection token will only be
         * usable with readers assigned to that location, otherwise the connection token will be usable with all readers.
         * Note that location scoping only applies to internet-connected readers. For more details, see [the docs on scoping
         * connection
         * tokens](https://docs.stripe.com/terminal/fleet/locations-and-zones?dashboard-or-api=api#connection-tokens).
         */
        public var location: String? = null

        public fun build(): InlineV1TerminalConnectionTokensPostRequestFormXa133cd51 =
            InlineV1TerminalConnectionTokensPostRequestFormXa133cd51(
                expand = expand,
                location = location,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TerminalConnectionTokensPostRequestFormXa133cd51 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConnectionTokensPostRequestFormXa133cd51> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalConnectionTokensPostRequestFormXa133cd51 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConnectionTokensPostRequestFormXa133cd51")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConnectionTokensPostRequestFormXa133cd51 must be a JSON object",
                    )
            return InlineV1TerminalConnectionTokensPostRequestFormXa133cd51(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConnectionTokensPostRequestFormXa133cd51,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConnectionTokensPostRequestFormXa133cd51")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.location?.let { put("location", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConnectionTokensPostRequestFormXa133cd51(
    block: InlineV1TerminalConnectionTokensPostRequestFormXa133cd51.Builder.() -> Unit,
): InlineV1TerminalConnectionTokensPostRequestFormXa133cd51 =
    InlineV1TerminalConnectionTokensPostRequestFormXa133cd51.build(block)
