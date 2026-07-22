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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aBranch {
    InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845,
    InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aNoMatchException(
    message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aInspection(
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845: Boolean,
    public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845,
                matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86,
            ).count {
                it
            }
}

/**
 * An object containing device type specific settings for Verifone UX700 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_ux700
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aInspection,
) {
    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86) {
                json
                    .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845,
                    )
                }
                if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86) {
                    add(
                        InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86,
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
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a {
            val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aNoMatchException(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16a(
    element: JsonElement,
): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aInspection {
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845>()
    val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86 =
        element
            .isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86>()
    return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700Xedb0d16aInspection(
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845,
        matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86,
        failures =
            buildList {
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1Xb719f845",
                    )
                }
                if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86) {
                    add(
                        "InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xa709df86",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
