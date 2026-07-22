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

public enum class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acBranch {
    Branch1,
    InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepos_e/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepos_e/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd:
        InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acBranch.InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd,
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
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd>()
    return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85acInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
