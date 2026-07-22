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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/cancellation_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described/anyOf/0/properties/cancellation_reason
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX85bed7e8Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2fc19089",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
