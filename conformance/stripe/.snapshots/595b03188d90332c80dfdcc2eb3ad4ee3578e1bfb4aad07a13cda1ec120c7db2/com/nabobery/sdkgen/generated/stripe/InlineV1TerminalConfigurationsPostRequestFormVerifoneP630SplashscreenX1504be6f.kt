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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fBranch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p630/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p630/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X0a7066c6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
