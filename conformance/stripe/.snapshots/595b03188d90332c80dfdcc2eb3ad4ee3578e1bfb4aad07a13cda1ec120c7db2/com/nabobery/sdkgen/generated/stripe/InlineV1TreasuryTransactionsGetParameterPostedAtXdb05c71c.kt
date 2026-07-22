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

public enum class InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cBranch {
    InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc,
    Branch2,
}

public sealed class InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cNoMatchException(
    message: String,
) : InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cDecodingException(message)

internal data class InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cInspection(
    public val matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc,
                matchesBranch2,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/8/schema/properties/posted_at.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/8/schema/properties/posted_at
 */
@Serializable(with = InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c.Serializer::class)
public class InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cInspection,
) {
    public val inlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc:
        InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc>(
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

    public val matchedBranches: Set<InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc) {
                    add(
                        InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cBranch.InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc,
                    )
                }
                if (inspection.matchesBranch2) {
                    add(
                        InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cBranch.Branch2,
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
        ): InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c {
            val inspection = inspectInlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cNoMatchException(
                    "InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c(
    element: JsonElement,
): InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cInspection {
    val matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc =
        element
            .isJsonDecodable<InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71cInspection(
        matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc = matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc) {
                    add(
                        "InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc: value does not match InlineV1TreasuryTransactionsGetParameterPostedAtAnyOf1Xcdd183dc",
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
