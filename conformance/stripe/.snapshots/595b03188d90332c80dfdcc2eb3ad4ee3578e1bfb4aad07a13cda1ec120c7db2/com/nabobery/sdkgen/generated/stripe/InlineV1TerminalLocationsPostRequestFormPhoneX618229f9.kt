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

public enum class InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Branch {
    Branch1,
    InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5,
}

public sealed class InlineV1TerminalLocationsPostRequestFormPhoneX618229f9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormPhoneX618229f9NoMatchException(
    message: String,
) : InlineV1TerminalLocationsPostRequestFormPhoneX618229f9DecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5).count { it }
}

/**
 * The phone number for the location.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/phone
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormPhoneX618229f9.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormPhoneX618229f9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5:
        InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5) {
                json
                    .decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Branch.Branch1)
                if (inspection.matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5) {
                    add(
                        InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Branch.InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5,
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
        ): InlineV1TerminalLocationsPostRequestFormPhoneX618229f9 {
            val inspection = inspectInlineV1TerminalLocationsPostRequestFormPhoneX618229f9(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalLocationsPostRequestFormPhoneX618229f9NoMatchException(
                    "InlineV1TerminalLocationsPostRequestFormPhoneX618229f9 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalLocationsPostRequestFormPhoneX618229f9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormPhoneX618229f9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormPhoneX618229f9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormPhoneX618229f9")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormPhoneX618229f9,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalLocationsPostRequestFormPhoneX618229f9",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormPhoneX618229f9(
    element: JsonElement,
): InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5 =
        element
            .isJsonDecodable<InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5>()
    return InlineV1TerminalLocationsPostRequestFormPhoneX618229f9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5 = matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5) {
                    add(
                        "InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5: value does not match InlineV1TerminalLocationsPostRequestFormPhoneAnyOf2X0e5d19e5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
