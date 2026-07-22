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

public enum class InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dBranch {
    Branch1,
    InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902,
}

public sealed class InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dNoMatchException(
    message: String,
) : InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dDecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902,
            ).count { it }
}

/**
 * A name for the location.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902:
        InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902) {
                json
                    .decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902) {
                    add(
                        InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dBranch.InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902,
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
        ): InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d {
            val inspection = inspectInlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dNoMatchException(
                    "InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d(
    element: JsonElement,
): InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902 =
        element
            .isJsonDecodable<InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902>()
    return InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902 = matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902) {
                    add(
                        "InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902: value does not match InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
