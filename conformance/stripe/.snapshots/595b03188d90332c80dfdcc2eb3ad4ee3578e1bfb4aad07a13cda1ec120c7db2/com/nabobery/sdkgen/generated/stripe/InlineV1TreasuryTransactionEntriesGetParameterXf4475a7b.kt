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

public enum class InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bBranch {
    InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028,
    Branch2,
}

public sealed class InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bNoMatchException(
    message: String,
) : InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bDecodingException(message)

internal data class InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bInspection(
    public val matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028,
                matchesBranch2,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/0/schema
 */
@Serializable(with = InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b.Serializer::class)
public class InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bInspection,
) {
    public val inlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028:
        InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

    public val matchedBranches: Set<InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028) {
                    add(
                        InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bBranch.InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028,
                    )
                }
                if (inspection.matchesBranch2) {
                    add(
                        InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bBranch.Branch2,
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
        ): InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b {
            val inspection = inspectInlineV1TreasuryTransactionEntriesGetParameterXf4475a7b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bNoMatchException(
                    "InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TreasuryTransactionEntriesGetParameterXf4475a7b(
    element: JsonElement,
): InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bInspection {
    val matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028 =
        element
            .isJsonDecodable<InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1TreasuryTransactionEntriesGetParameterXf4475a7bInspection(
        matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028 = matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028) {
                    add(
                        "InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028: value does not match InlineV1TreasuryTransactionEntriesGetParameterAnyOf1X47a7d028",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
