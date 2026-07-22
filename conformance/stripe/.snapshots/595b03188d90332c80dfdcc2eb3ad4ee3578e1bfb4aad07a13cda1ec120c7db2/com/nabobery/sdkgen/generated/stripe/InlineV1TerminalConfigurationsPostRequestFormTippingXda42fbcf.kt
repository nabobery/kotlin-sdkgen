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

public enum class InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfBranch {
    InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd,
    InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfInspection(
    public val matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd,
                matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6,
            ).count {
                it
            }
}

/**
 * Tipping configurations for readers that support on-reader tips.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/tipping
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfInspection,
) {
    public val inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd:
        InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6:
        InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfBranch.InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfBranch.InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6,
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
        ): InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfInspection {
    val matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6>()
    return InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcfInspection(
        matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd = matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd,
        matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6 = matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6,
        failures =
            buildList {
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd: value does not match InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd",
                    )
                }
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6: value does not match InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf2X9e5c7ea6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
