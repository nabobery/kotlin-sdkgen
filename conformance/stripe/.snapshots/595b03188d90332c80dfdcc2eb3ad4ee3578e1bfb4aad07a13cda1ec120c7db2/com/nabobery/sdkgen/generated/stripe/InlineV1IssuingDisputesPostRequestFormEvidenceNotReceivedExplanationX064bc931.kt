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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Branch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX064bc931Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2Xe4ca5043",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
