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

public enum class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Branch {
    Branch1,
    InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0NoMatchException(
    message: String,
) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/state.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/state
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee) {
                json
                    .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee,
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
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0 {
            val inspection = inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0NoMatchException(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0(
    element: JsonElement,
): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee =
        element
            .isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee>()
    return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX5022c8f0Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee) {
                    add(
                        "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
