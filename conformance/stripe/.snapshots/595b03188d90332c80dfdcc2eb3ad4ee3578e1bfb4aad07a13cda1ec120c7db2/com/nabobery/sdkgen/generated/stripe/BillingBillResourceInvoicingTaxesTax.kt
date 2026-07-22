package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax
 */
@Serializable(with = BillingBillResourceInvoicingTaxesTax.Serializer::class)
public class BillingBillResourceInvoicingTaxesTax(
    /**
     * The amount of the tax, in cents (or local equivalent).
     */
    public val amount: Int,
    /**
     * Whether this tax is inclusive or exclusive.
     */
    public val taxBehavior: InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a,
    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values for this field may be
     * extended as new tax rules are supported.
     */
    public val taxabilityReason: InlineBillingBillResourceInvoicingTaxesTaxTaxabilityReasonXc6ddf993,
    /**
     * The type of tax information.
     */
    public val type: InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2,
    /**
     * Additional details about the tax rate. Only present when `type` is `tax_rate_details`.
     */
    public val taxRateDetails: InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc? = null,
    /**
     * The amount on which tax is calculated, in cents (or local equivalent).
     */
    public val taxableAmount: Int? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var taxBehaviorValue: InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a? =
            null

        public var taxBehavior: InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a
            get() = requireNotNull(taxBehaviorValue) { "taxBehavior is required" }
            set(`value`) {
                taxBehaviorValue = value
            }

        private var taxabilityReasonValue:
            InlineBillingBillResourceInvoicingTaxesTaxTaxabilityReasonXc6ddf993? = null

        public var taxabilityReason: InlineBillingBillResourceInvoicingTaxesTaxTaxabilityReasonXc6ddf993
            get() = requireNotNull(taxabilityReasonValue) { "taxabilityReason is required" }
            set(`value`) {
                taxabilityReasonValue = value
            }

        private var typeValue: InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2? = null

        public var type: InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * Additional details about the tax rate. Only present when `type` is `tax_rate_details`.
         */
        public var taxRateDetails: InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc? =
            null

        /**
         * The amount on which tax is calculated, in cents (or local equivalent).
         */
        public var taxableAmount: Int? = null

        public fun build(): BillingBillResourceInvoicingTaxesTax {
            check(amountValue != null) { "amount is required" }
            check(taxBehaviorValue != null) { "taxBehavior is required" }
            check(taxabilityReasonValue != null) { "taxabilityReason is required" }
            check(typeValue != null) { "type is required" }
            return BillingBillResourceInvoicingTaxesTax(
                amount = amount,
                taxBehavior = taxBehavior,
                taxabilityReason = taxabilityReason,
                type = type,
                taxRateDetails = taxRateDetails,
                taxableAmount = taxableAmount,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingTaxesTax =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingBillResourceInvoicingTaxesTax> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingTaxesTax {
            val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingTaxesTax")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingBillResourceInvoicingTaxesTax must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val taxBehavior =
                json.decodeRequired<InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a>(
                    rawObject,
                    "tax_behavior",
                )
            val taxabilityReason =
                json.decodeRequired<InlineBillingBillResourceInvoicingTaxesTaxTaxabilityReasonXc6ddf993>(
                    rawObject,
                    "taxability_reason",
                )
            val type = json.decodeRequired<InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2>(rawObject, "type")
            return BillingBillResourceInvoicingTaxesTax(
                amount = amount,
                taxBehavior = taxBehavior,
                taxabilityReason = taxabilityReason,
                type = type,
                taxRateDetails =
                    rawObject["tax_rate_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc?>(
                                    element,
                                )
                        }
                    },
                taxableAmount =
                    rawObject["taxable_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingBillResourceInvoicingTaxesTax,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingTaxesTax")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("tax_behavior", json.encodeToJsonElement(value.taxBehavior))
                    put("taxability_reason", json.encodeToJsonElement(value.taxabilityReason))
                    put("type", json.encodeToJsonElement(value.type))
                    value.taxRateDetails?.let { put("tax_rate_details", json.encodeToJsonElement(it)) }
                    value.taxableAmount?.let { put("taxable_amount", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingBillResourceInvoicingTaxesTax(
    block: BillingBillResourceInvoicingTaxesTax.Builder.() -> Unit,
): BillingBillResourceInvoicingTaxesTax = BillingBillResourceInvoicingTaxesTax.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingBillResourceInvoicingTaxesTax is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
