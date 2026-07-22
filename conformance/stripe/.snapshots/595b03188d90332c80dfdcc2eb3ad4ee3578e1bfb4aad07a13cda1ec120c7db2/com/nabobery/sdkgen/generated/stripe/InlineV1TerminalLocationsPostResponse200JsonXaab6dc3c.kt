package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cBranch {
    TerminalLocation,
    DeletedTerminalLocation,
}

public sealed class InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cNoMatchException(
    message: String,
) : InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cDecodingException(message)

internal data class InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cInspection(
    public val matchesTerminalLocation: Boolean,
    public val matchesDeletedTerminalLocation: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTerminalLocation, matchesDeletedTerminalLocation).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/responses/200/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/responses/200/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c.Serializer::class)
public class InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cInspection,
) {
    public val terminalLocation: TerminalLocationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTerminalLocation) json.decodeFromJsonElement<TerminalLocationView>(raw) else null
        }

    public val deletedTerminalLocation: DeletedTerminalLocationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedTerminalLocation) {
                json.decodeFromJsonElement<DeletedTerminalLocationView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cBranch>
        get() =
            buildSet {
                if (inspection.matchesTerminalLocation) {
                    add(
                        InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cBranch.TerminalLocation,
                    )
                }
                if (inspection.matchesDeletedTerminalLocation) {
                    add(
                        InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cBranch.DeletedTerminalLocation,
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
        ): InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c {
            val inspection = inspectInlineV1TerminalLocationsPostResponse200JsonXaab6dc3c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cNoMatchException(
                    "InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalLocationsPostResponse200JsonXaab6dc3c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalLocationsPostResponse200JsonXaab6dc3c(
    element: JsonElement,
): InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cInspection {
    val raw =
        element as? JsonObject ?: return InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cInspection(
            matchesTerminalLocation = false,
            matchesDeletedTerminalLocation = false,
            failures =
                listOf(
                    "TerminalLocation: expected JSON object",
                    "DeletedTerminalLocation: expected JSON object",
                ),
        )
    val matchesTerminalLocation =
        raw["address"] != null && raw["display_name"].isString() && raw["id"].isString() && raw["livemode"] != null &&
            raw["metadata"] != null &&
            raw["object"] != null
    val matchesDeletedTerminalLocation = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
    return InlineV1TerminalLocationsPostResponse200JsonXaab6dc3cInspection(
        matchesTerminalLocation = matchesTerminalLocation,
        matchesDeletedTerminalLocation = matchesDeletedTerminalLocation,
        failures =
            buildList {
                if (!matchesTerminalLocation) {
                    add(
                        "TerminalLocation: required properties 'address', 'display_name', 'id', 'livemode', 'metadata', 'object' do not match their declared types",
                    )
                }
                if (!matchesDeletedTerminalLocation) {
                    add(
                        "DeletedTerminalLocation: required properties 'deleted', 'id', 'object' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
