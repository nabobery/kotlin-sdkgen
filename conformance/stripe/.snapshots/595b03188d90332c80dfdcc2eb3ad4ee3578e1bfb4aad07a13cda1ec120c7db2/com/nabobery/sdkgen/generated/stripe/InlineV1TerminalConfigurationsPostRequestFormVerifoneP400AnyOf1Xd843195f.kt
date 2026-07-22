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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p400/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p400/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f(
    public val splashscreen: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f? = null,
) {
    public class Builder {
        public var splashscreen:
            InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f =
            InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f(
                splashscreen = splashscreen,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f(
                splashscreen =
                    rawObject["splashscreen"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f(
    block: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f =
    InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f.build(block)
