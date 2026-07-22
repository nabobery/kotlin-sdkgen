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

public enum class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Branch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa,
}

public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa:
        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa) {
                    add(
                        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Branch.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa,
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
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa>()
    return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesX055f8d65Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa = matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa: value does not match InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X8999adfa",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
