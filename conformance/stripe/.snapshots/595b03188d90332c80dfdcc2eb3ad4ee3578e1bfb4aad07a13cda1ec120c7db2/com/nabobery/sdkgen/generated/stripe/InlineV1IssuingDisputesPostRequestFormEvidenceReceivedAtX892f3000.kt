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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/received_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/received_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtX892f3000Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2Xaa14c63b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
