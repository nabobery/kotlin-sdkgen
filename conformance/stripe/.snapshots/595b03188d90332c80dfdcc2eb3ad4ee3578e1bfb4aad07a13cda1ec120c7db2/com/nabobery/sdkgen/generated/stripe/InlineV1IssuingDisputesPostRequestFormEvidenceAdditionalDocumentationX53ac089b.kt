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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa:
        InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bBranch.InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089b(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX53ac089bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa = matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf2X4ebe02aa",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
