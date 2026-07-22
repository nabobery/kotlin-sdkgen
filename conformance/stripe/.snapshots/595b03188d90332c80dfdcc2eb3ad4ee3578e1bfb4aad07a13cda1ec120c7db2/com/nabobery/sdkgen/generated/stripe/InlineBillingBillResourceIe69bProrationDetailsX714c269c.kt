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

public enum class InlineBillingBillResourceIe69bProrationDetailsX714c269cBranch {
    BillingBillResourceInvoicingLinesCommonProrationDetails,
}

public sealed class InlineBillingBillResourceIe69bProrationDetailsX714c269cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingBillResourceIe69bProrationDetailsX714c269cNoMatchException(
    message: String,
) : InlineBillingBillResourceIe69bProrationDetailsX714c269cDecodingException(message)

internal data class InlineBillingBillResourceIe69bProrationDetailsX714c269cInspection(
    public val matchesBillingBillResourceInvoicingLinesCommonProrationDetails: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBillingBillResourceInvoicingLinesCommonProrationDetails).count { it }
}

/**
 * Additional details for proration line items
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_subs
 * cription_item_parent/properties/proration_details
 */
@Serializable(with = InlineBillingBillResourceIe69bProrationDetailsX714c269c.Serializer::class)
public class InlineBillingBillResourceIe69bProrationDetailsX714c269c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingBillResourceIe69bProrationDetailsX714c269cInspection,
) {
    public val billingBillResourceInvoicingLinesCommonProrationDetails:
        BillingBillResourceInvoicingLinesCommonProrationDetailsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBillingBillResourceInvoicingLinesCommonProrationDetails) {
                json
                    .decodeFromJsonElement<BillingBillResourceInvoicingLinesCommonProrationDetailsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineBillingBillResourceIe69bProrationDetailsX714c269cBranch>
        get() =
            buildSet {
                if (inspection.matchesBillingBillResourceInvoicingLinesCommonProrationDetails) {
                    add(
                        InlineBillingBillResourceIe69bProrationDetailsX714c269cBranch.BillingBillResourceInvoicingLinesCommonProrationDetails,
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
        ): InlineBillingBillResourceIe69bProrationDetailsX714c269c {
            val inspection = inspectInlineBillingBillResourceIe69bProrationDetailsX714c269c(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingBillResourceIe69bProrationDetailsX714c269cNoMatchException(
                    "InlineBillingBillResourceIe69bProrationDetailsX714c269c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingBillResourceIe69bProrationDetailsX714c269c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingBillResourceIe69bProrationDetailsX714c269c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingBillResourceIe69bProrationDetailsX714c269c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceIe69bProrationDetailsX714c269c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingBillResourceIe69bProrationDetailsX714c269c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineBillingBillResourceIe69bProrationDetailsX714c269c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingBillResourceIe69bProrationDetailsX714c269c(
    element: JsonElement,
): InlineBillingBillResourceIe69bProrationDetailsX714c269cInspection {
    val raw =
        element as? JsonObject ?: return InlineBillingBillResourceIe69bProrationDetailsX714c269cInspection(
            matchesBillingBillResourceInvoicingLinesCommonProrationDetails = false,
            failures = listOf("BillingBillResourceInvoicingLinesCommonProrationDetails: expected JSON object"),
        )
    val matchesBillingBillResourceInvoicingLinesCommonProrationDetails = true
    return InlineBillingBillResourceIe69bProrationDetailsX714c269cInspection(
        matchesBillingBillResourceInvoicingLinesCommonProrationDetails = matchesBillingBillResourceInvoicingLinesCommonProrationDetails,
        failures =
            buildList {
                if (!matchesBillingBillResourceInvoicingLinesCommonProrationDetails) {
                    add(
                        "BillingBillResourceInvoicingLinesCommonProrationDetails: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
