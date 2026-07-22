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

public enum class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Branch {
    Branch1,
    InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Branch.InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b>()
    return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b = matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b: value does not match InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2Xa337739b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
