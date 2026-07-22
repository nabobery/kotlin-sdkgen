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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Branch {
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836,
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Inspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Inspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Inspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025Inspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1Xd5750836",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf2X4ae7c721",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
