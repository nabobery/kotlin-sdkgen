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

public enum class InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Branch {
    Branch1,
    InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772NoMatchException(
    message: String,
) : InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/product_description
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109) {
                json
                    .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109,
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
        ): InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772 {
            val inspection = inspectInlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772NoMatchException(
                    "InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772(
    element: JsonElement,
): InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109 =
        element
            .isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109>()
    return InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109) {
                    add(
                        "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc65ef109",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
