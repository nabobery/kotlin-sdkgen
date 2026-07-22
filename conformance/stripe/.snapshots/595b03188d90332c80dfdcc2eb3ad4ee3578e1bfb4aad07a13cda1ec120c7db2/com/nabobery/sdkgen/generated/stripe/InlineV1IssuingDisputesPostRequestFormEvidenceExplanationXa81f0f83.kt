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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXa81f0f83Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X7f4e297d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
