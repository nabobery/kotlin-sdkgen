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
 * ion~1x-www-form-urlencoded/schema/properties/verifone_ux700/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_ux700/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845(
    public val splashscreen: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d? = null,
) {
    public class Builder {
        public var splashscreen:
            InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 =
            InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845(
                splashscreen = splashscreen,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845(
                splashscreen =
                    rawObject["splashscreen"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845",
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

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845(
    block: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 =
    InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845.build(block)
