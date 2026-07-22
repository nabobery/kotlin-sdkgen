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
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s710/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s710/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a(
    public val splashscreen: InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40? = null,
) {
    public class Builder {
        public var splashscreen:
            InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a =
            InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a(
                splashscreen = splashscreen,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a(
                splashscreen =
                    rawObject["splashscreen"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a",
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

public fun inlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a(
    block: InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a =
    InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a.build(block)
