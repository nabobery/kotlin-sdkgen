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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fBranch {
    InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918,
    InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fInspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fInspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fInspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8fInspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1Xfbe78918",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf2X7124ff13",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
