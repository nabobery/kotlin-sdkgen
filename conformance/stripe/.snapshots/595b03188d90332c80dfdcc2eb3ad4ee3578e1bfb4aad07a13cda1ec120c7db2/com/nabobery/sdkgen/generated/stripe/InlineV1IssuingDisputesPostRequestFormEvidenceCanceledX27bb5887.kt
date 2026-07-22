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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Branch {
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c,
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Inspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Inspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Inspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887Inspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1X793a094c",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X0f398878",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
