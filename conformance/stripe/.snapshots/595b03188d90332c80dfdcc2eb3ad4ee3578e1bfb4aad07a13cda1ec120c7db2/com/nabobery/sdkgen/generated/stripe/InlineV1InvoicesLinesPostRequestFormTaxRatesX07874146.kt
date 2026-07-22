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

public enum class InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Branch {
    Branch1,
    InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed,
}

public sealed class InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146NoMatchException(
    message: String,
) : InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146DecodingException(message)

internal data class InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed).count { it }
}

/**
 * The tax rates which apply to the line item. When set, the `default_tax_rates` on the invoice do not apply to this
 * line item. Pass an empty string to remove previously-defined tax rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_rates
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed:
        InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Branch.Branch1)
                if (inspection.matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed) {
                    add(
                        InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Branch.InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed,
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
        ): InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146 {
            val inspection = inspectInlineV1InvoicesLinesPostRequestFormTaxRatesX07874146(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146NoMatchException(
                    "InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesLinesPostRequestFormTaxRatesX07874146(
    element: JsonElement,
): InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed =
        element
            .isJsonDecodable<InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed>()
    return InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed = matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed) {
                    add(
                        "InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed: value does not match InlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
