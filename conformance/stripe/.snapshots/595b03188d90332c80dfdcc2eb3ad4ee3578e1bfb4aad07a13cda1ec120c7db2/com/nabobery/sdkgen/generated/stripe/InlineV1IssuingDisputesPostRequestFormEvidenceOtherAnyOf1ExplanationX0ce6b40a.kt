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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b:
        InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40a(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1ExplanationX0ce6b40aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xebbf073b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
