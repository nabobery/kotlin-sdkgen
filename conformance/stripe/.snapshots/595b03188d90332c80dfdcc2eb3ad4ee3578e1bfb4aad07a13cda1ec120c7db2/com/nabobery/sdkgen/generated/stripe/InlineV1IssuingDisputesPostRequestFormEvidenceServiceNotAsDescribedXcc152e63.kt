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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Branch {
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Inspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/service_not_as_described
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Inspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Inspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63Inspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X42642162",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X0979aa70",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
