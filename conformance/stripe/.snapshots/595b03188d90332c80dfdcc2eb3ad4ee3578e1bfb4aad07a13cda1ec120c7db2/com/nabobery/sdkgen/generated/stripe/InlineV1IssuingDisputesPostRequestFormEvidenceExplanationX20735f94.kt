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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationX20735f94Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X2593754c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
