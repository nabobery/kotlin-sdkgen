package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fBranch {
    TerminalOnboardingLinkAppleTermsAndConditions,
}

public sealed class InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fNoMatchException(
    message: String,
) : InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fDecodingException(message)

internal data class InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fInspection(
    public val matchesTerminalOnboardingLinkAppleTermsAndConditions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTerminalOnboardingLinkAppleTermsAndConditions).count { it }
}

/**
 * The options associated with the Apple Terms and Conditions link type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_onboarding_link_link_options/properties/apple_terms_and_con
 * ditions
 */
@Serializable(with = InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f.Serializer::class)
public class InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fInspection,
) {
    public val terminalOnboardingLinkAppleTermsAndConditions:
        TerminalOnboardingLinkAppleTermsAndConditionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTerminalOnboardingLinkAppleTermsAndConditions) {
                json
                    .decodeFromJsonElement<TerminalOnboardingLinkAppleTermsAndConditionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fBranch>
        get() =
            buildSet {
                if (inspection.matchesTerminalOnboardingLinkAppleTermsAndConditions) {
                    add(
                        InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fBranch.TerminalOnboardingLinkAppleTermsAndConditions,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f {
            val inspection = inspectInlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f(raw)
            if (inspection.matchCount == 0) {
                throw InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fNoMatchException(
                    "InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f(
    element: JsonElement,
): InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fInspection {
    val raw =
        element as? JsonObject
            ?: return InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fInspection(
                matchesTerminalOnboardingLinkAppleTermsAndConditions = false,
                failures = listOf("TerminalOnboardingLinkAppleTermsAndConditions: expected JSON object"),
            )
    val matchesTerminalOnboardingLinkAppleTermsAndConditions = raw["merchant_display_name"].isString()
    return InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151fInspection(
        matchesTerminalOnboardingLinkAppleTermsAndConditions = matchesTerminalOnboardingLinkAppleTermsAndConditions,
        failures =
            buildList {
                if (!matchesTerminalOnboardingLinkAppleTermsAndConditions) {
                    add(
                        "TerminalOnboardingLinkAppleTermsAndConditions: required properties 'merchant_display_name' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
