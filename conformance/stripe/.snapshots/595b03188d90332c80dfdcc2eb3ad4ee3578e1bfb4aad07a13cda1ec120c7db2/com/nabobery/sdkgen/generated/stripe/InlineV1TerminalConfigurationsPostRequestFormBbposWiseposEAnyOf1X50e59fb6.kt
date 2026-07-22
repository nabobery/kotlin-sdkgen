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
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepos_e/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepos_e/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6(
    public val splashscreen: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenXaddd69a7? = null,
) {
    public class Builder {
        public var splashscreen:
            InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenXaddd69a7? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 =
            InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6(
                splashscreen = splashscreen,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6(
                splashscreen =
                    rawObject["splashscreen"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenXaddd69a7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6",
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

public fun inlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6(
    block: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 =
    InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6.build(block)
