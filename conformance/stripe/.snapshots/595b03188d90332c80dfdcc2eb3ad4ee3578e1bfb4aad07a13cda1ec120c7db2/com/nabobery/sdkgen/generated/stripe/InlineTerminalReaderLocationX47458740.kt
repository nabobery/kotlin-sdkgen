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

public enum class InlineTerminalReaderLocationX47458740Branch {
    Branch1,
    TerminalLocation,
}

public sealed class InlineTerminalReaderLocationX47458740DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTerminalReaderLocationX47458740NoMatchException(
    message: String,
) : InlineTerminalReaderLocationX47458740DecodingException(message)

internal data class InlineTerminalReaderLocationX47458740Inspection(
    public val matchesBranch1: Boolean,
    public val matchesTerminalLocation: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTerminalLocation).count { it }
}

/**
 * The location identifier of the reader.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.reader/properties/location
 */
@Serializable(with = InlineTerminalReaderLocationX47458740.Serializer::class)
public class InlineTerminalReaderLocationX47458740 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTerminalReaderLocationX47458740Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val terminalLocation: TerminalLocation? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTerminalLocation) json.decodeFromJsonElement<TerminalLocation>(raw) else null
        }

    public val matchedBranches: Set<InlineTerminalReaderLocationX47458740Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTerminalReaderLocationX47458740Branch.Branch1)
                if (inspection.matchesTerminalLocation) {
                    add(
                        InlineTerminalReaderLocationX47458740Branch.TerminalLocation,
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
        ): InlineTerminalReaderLocationX47458740 {
            val inspection = inspectInlineTerminalReaderLocationX47458740(raw)
            if (inspection.matchCount == 0) {
                throw InlineTerminalReaderLocationX47458740NoMatchException(
                    "InlineTerminalReaderLocationX47458740 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTerminalReaderLocationX47458740(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTerminalReaderLocationX47458740> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTerminalReaderLocationX47458740 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderLocationX47458740")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderLocationX47458740,
        ) {
            encoder.requireJsonEncoder("InlineTerminalReaderLocationX47458740").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTerminalReaderLocationX47458740(
    element: JsonElement,
): InlineTerminalReaderLocationX47458740Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTerminalLocation = element.isJsonDecodable<TerminalLocation>()
    return InlineTerminalReaderLocationX47458740Inspection(
        matchesBranch1 = matchesBranch1,
        matchesTerminalLocation = matchesTerminalLocation,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTerminalLocation) add("TerminalLocation: value does not match TerminalLocation")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
