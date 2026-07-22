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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eBranch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/cash_receipt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/duplicate/anyOf/0/properties/cash_receipt
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1:
        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eBranch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06e(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCashReceiptX50a8d06eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X305357a1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
