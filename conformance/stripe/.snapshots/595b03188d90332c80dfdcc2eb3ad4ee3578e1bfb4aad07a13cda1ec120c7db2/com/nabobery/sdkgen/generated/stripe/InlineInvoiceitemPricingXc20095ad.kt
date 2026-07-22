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

public enum class InlineInvoiceitemPricingXc20095adBranch {
    BillingBillResourceInvoicingPricingPricing,
}

public sealed class InlineInvoiceitemPricingXc20095adDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceitemPricingXc20095adNoMatchException(
    message: String,
) : InlineInvoiceitemPricingXc20095adDecodingException(message)

internal data class InlineInvoiceitemPricingXc20095adInspection(
    public val matchesBillingBillResourceInvoicingPricingPricing: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBillingBillResourceInvoicingPricingPricing).count { it }
}

/**
 * The pricing information of the invoice item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/pricing
 */
@Serializable(with = InlineInvoiceitemPricingXc20095ad.Serializer::class)
public class InlineInvoiceitemPricingXc20095ad internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceitemPricingXc20095adInspection,
) {
    public val billingBillResourceInvoicingPricingPricing:
        BillingBillResourceInvoicingPricingPricingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBillingBillResourceInvoicingPricingPricing) {
                json
                    .decodeFromJsonElement<BillingBillResourceInvoicingPricingPricingView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineInvoiceitemPricingXc20095adBranch>
        get() =
            buildSet {
                if (inspection.matchesBillingBillResourceInvoicingPricingPricing) {
                    add(
                        InlineInvoiceitemPricingXc20095adBranch.BillingBillResourceInvoicingPricingPricing,
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
        ): InlineInvoiceitemPricingXc20095ad {
            val inspection = inspectInlineInvoiceitemPricingXc20095ad(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceitemPricingXc20095adNoMatchException(
                    "InlineInvoiceitemPricingXc20095ad matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceitemPricingXc20095ad(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceitemPricingXc20095ad> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceitemPricingXc20095ad {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemPricingXc20095ad")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceitemPricingXc20095ad,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceitemPricingXc20095ad").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceitemPricingXc20095ad(
    element: JsonElement,
): InlineInvoiceitemPricingXc20095adInspection {
    val raw =
        element as? JsonObject ?: return InlineInvoiceitemPricingXc20095adInspection(
            matchesBillingBillResourceInvoicingPricingPricing = false,
            failures = listOf("BillingBillResourceInvoicingPricingPricing: expected JSON object"),
        )
    val matchesBillingBillResourceInvoicingPricingPricing = raw["type"] != null
    return InlineInvoiceitemPricingXc20095adInspection(
        matchesBillingBillResourceInvoicingPricingPricing = matchesBillingBillResourceInvoicingPricingPricing,
        failures =
            buildList {
                if (!matchesBillingBillResourceInvoicingPricingPricing) {
                    add(
                        "BillingBillResourceInvoicingPricingPricing: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
