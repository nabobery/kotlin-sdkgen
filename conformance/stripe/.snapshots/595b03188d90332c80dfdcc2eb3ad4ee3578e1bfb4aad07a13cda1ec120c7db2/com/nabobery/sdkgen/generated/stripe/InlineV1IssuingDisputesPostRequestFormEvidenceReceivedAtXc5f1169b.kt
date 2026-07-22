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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/received_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/received_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169b(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXc5f1169bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xd2098f98",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
