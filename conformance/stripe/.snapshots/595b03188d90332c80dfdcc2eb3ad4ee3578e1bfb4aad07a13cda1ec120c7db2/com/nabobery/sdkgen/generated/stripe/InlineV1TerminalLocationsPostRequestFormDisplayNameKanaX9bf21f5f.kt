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

public enum class InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fBranch {
    Branch1,
    InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3,
}

public sealed class InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fNoMatchException(
    message: String,
) : InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fDecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3,
            ).count {
                it
            }
}

/**
 * The Kana variation of the name for the location (Japan only).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name_kana
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3:
        InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3) {
                json
                    .decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3) {
                    add(
                        InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fBranch.InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3,
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
        ): InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f {
            val inspection = inspectInlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fNoMatchException(
                    "InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f(
    element: JsonElement,
): InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3 =
        element
            .isJsonDecodable<InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3>()
    return InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3 = matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3) {
                    add(
                        "InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3: value does not match InlineV1TerminalLocationsPostRequestFormDisplayNameKanaAnyOf2Xeee1b7e3",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
