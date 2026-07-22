package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eBranch {
    Branch1,
    InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5,
}

public sealed class InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eNoMatchException(
    message: String,
) : InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eDecodingException(message)

internal data class InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5).count { it }
}

/**
 * The coupons, promotion codes & existing discounts which apply to the line item. Item discounts are applied before
 * invoice discounts. Pass an empty string to remove previously-defined discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eInspection,
) {
    public val branch1: List<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5:
        InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eBranch.Branch1)
                if (inspection.matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5) {
                    add(
                        InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eBranch.InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5,
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
        ): InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e {
            val inspection = inspectInlineV1InvoicesLinesPostRequestFormDiscountsXc325813e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eNoMatchException(
                    "InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesLinesPostRequestFormDiscountsXc325813e(
    element: JsonElement,
): InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 =
        element
            .isJsonDecodable<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5>()
    return InlineV1InvoicesLinesPostRequestFormDiscountsXc325813eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 = matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5) {
                    add(
                        "InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5: value does not match InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
