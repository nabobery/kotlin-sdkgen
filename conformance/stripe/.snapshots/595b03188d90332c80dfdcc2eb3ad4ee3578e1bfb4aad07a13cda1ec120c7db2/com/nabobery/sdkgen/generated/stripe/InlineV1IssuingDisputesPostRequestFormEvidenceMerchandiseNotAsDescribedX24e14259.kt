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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Branch {
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Inspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Inspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Branch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259 {
            val inspection =
                inspectInlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Inspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259Inspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xde319fb9",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X1e6792a1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
