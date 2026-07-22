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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbBranch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bbInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1AnyOf2X04894d15",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
