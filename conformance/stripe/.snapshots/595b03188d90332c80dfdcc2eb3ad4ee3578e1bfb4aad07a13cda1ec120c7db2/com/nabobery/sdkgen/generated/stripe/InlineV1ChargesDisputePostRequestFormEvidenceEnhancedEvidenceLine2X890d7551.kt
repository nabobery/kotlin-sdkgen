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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Branch {
    Branch1,
    InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551NoMatchException(
    message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551DecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/line2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/line2
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4) {
                json
                    .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4) {
                    add(
                        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Branch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4,
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
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551 {
            val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551NoMatchException(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551(
    element: JsonElement,
): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4 =
        element
            .isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4>()
    return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4) {
                    add(
                        "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X7570e2e4",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
