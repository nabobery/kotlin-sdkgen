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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/expected_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/expected_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtX6b097a58Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X0a29ccc9",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
