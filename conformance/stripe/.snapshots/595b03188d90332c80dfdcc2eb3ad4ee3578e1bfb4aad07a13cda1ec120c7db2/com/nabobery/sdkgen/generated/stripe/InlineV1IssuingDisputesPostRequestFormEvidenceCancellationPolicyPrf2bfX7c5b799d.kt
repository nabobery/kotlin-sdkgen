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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/cancellation_policy_provided.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/cancellation_policy_provided
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dInspection,
) {
    public val branch1: Boolean? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Boolean>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dBranch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799d(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dInspection {
    val matchesBranch1 = element.isJsonDecodable<Boolean>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceCancellationPolicyPrf2bfX7c5b799dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Boolean")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xb4a3711a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
