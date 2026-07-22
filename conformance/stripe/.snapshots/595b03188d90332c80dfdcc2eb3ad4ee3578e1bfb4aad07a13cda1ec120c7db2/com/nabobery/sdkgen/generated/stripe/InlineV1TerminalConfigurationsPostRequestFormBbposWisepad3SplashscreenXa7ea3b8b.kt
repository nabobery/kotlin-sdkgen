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

public enum class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bBranch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepad3/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepad3/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60:
        InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bBranch.InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60,
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
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60>()
    return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60 = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1AnyOf2X92873a60",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
