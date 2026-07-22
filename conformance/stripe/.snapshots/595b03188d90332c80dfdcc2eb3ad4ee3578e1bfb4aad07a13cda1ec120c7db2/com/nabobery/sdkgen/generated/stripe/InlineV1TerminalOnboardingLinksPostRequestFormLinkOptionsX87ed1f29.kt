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
 * Specific fields needed to generate the desired link type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1onboarding_links/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/link_options
 */
@Serializable(with = InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29.Serializer::class)
public class InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29(
    public val appleTermsAndConditions:
        InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50? = null,
) {
    public class Builder {
        public var appleTermsAndConditions:
            InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50? = null

        public fun build(): InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29 =
            InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29(
                appleTermsAndConditions = appleTermsAndConditions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29 must be a JSON object",
                    )
            return InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29(
                appleTermsAndConditions =
                    rawObject["apple_terms_and_conditions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.appleTermsAndConditions?.let {
                        put(
                            "apple_terms_and_conditions",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29(
    block: InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29.Builder.() -> Unit,
): InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29 =
    InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29.build(block)
