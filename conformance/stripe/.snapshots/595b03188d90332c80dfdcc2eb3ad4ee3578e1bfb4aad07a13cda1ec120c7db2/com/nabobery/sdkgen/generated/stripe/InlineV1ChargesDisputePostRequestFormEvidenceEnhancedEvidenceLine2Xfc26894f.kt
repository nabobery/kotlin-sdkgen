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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fBranch {
    Branch1,
    InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fNoMatchException(
    message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fDecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/line2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/line2
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1) {
                json
                    .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1) {
                    add(
                        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1,
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
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f {
            val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fNoMatchException(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f(
    element: JsonElement,
): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1 =
        element
            .isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1>()
    return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1) {
                    add(
                        "InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X9b0ac8a1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
