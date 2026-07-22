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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05:
        InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionXf661ed75Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2Xf6ca8f05",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
