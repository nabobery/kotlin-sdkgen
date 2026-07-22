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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Branch {
    InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510NoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Inspection(
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a,
            ).count {
                it
            }
}

/**
 * An object containing device type specific settings for Verifone M425 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_m425
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Inspection,
) {
    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510 {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510NoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Inspection {
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425X3cdb3510Inspection(
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a,
        failures =
            buildList {
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9",
                    )
                }
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf2X7fef470a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
