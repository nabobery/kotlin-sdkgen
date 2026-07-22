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

public enum class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Branch {
    Branch1,
    InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466,
}

public sealed class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7NoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7DecodingException(message)

internal data class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466:
        InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466) {
                    add(
                        InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Branch.InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466,
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
        ): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7 {
            val inspection = inspectInlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7NoMatchException(
                    "InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7(
    element: JsonElement,
): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466 =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466>()
    return InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466 = matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466) {
                    add(
                        "InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466: value does not match InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2X1492f466",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
