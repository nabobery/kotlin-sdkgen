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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccBranch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p400/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p400/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91cccInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
