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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Branch {
    BillingBillResourceInvoicingParentsInvoiceQuoteParent,
}

public sealed class InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36NoMatchException(
    message: String,
) : InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36DecodingException(message)

internal data class InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Inspection(
    public val matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent).count { it }
}

/**
 * Details about the quote that generated this invoice
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_parent/properties/qu
 * ote_details
 */
@Serializable(with = InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36.Serializer::class)
public class InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Inspection,
) {
    public val billingBillResourceInvoicingParentsInvoiceQuoteParent:
        BillingBillResourceInvoicingParentsInvoiceQuoteParentView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent) {
                json
                    .decodeFromJsonElement<BillingBillResourceInvoicingParentsInvoiceQuoteParentView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Branch>
        get() =
            buildSet {
                if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent) {
                    add(
                        InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Branch.BillingBillResourceInvoicingParentsInvoiceQuoteParent,
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
        ): InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36 {
            val inspection = inspectInlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36NoMatchException(
                    "InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36(
    element: JsonElement,
): InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Inspection {
    val raw =
        element as? JsonObject
            ?: return InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Inspection(
                matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent = false,
                failures = listOf("BillingBillResourceInvoicingParentsInvoiceQuoteParent: expected JSON object"),
            )
    val matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent = raw["quote"].isString()
    return InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36Inspection(
        matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent = matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent,
        failures =
            buildList {
                if (!matchesBillingBillResourceInvoicingParentsInvoiceQuoteParent) {
                    add(
                        "BillingBillResourceInvoicingParentsInvoiceQuoteParent: required properties 'quote' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
