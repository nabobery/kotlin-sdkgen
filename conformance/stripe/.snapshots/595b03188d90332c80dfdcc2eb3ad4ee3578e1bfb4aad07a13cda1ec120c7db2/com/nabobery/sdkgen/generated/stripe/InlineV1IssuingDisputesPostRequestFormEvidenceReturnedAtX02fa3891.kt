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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/returned_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/returned_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceReturnedAtX02fa3891Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4e784566",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
