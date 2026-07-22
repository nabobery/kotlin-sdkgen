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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Branch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79NoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_v660p/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_v660p/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79 {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79NoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1AnyOf2Xed669661",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
