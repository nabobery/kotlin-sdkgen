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

public enum class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Branch {
    Branch1,
    InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46NoMatchException(
    message: String,
) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/shipping_address/properties/line1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/shipping_address/properties/line1
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7) {
                json
                    .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7,
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
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46 {
            val inspection = inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46NoMatchException(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46(
    element: JsonElement,
): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7 =
        element
            .isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7>()
    return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7) {
                    add(
                        "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4d8cccf7",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
