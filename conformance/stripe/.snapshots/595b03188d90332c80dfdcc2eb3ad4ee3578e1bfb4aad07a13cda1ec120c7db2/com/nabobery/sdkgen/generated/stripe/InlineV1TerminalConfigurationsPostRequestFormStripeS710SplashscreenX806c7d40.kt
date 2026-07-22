package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Branch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40NoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s710/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s710/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188:
        InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Branch.InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188,
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
        ): InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40 {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40NoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188>()
    return InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX806c7d40Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1AnyOf2X3336c188",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
