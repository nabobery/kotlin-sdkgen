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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/expected_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/expected_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eBranch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4e(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ExpectedAtXd611cb4eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5ae5267f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
