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

public enum class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dBranch {
    Branch1,
    InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dNoMatchException(
    message: String,
) : InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dDecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_purchase_ip.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_purchase_ip
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b) {
                json
                    .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b) {
                    add(
                        InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dBranch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b,
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
        ): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d {
            val inspection = inspectInlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dNoMatchException(
                    "InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d(
    element: JsonElement,
): InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b =
        element
            .isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b>()
    return InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b) {
                    add(
                        "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xce914c5b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
