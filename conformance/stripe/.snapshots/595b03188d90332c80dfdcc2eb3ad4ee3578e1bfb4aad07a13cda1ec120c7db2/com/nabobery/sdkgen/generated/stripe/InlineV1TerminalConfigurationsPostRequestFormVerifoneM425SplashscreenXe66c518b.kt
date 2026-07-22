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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bBranch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_m425/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_m425/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1AnyOf2Xd79774c7",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
