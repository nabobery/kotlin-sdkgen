package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingBillResourceInvoicingTaxesTaxRateDetailsView(
    @SerialName("tax_rate")
    public val taxRate: InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax_rate_details
 */
@Serializable(with = BillingBillResourceInvoicingTaxesTaxRateDetails.Serializer::class)
public class BillingBillResourceInvoicingTaxesTaxRateDetails(
    /**
     * ID of the tax rate
     */
    public val taxRate: InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53,
) {
    public class Builder {
        private var taxRateValue: InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53? =
            null

        public var taxRate: InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53
            get() = requireNotNull(taxRateValue) { "taxRate is required" }
            set(`value`) {
                taxRateValue = value
            }

        public fun build(): BillingBillResourceInvoicingTaxesTaxRateDetails {
            check(taxRateValue != null) { "taxRate is required" }
            return BillingBillResourceInvoicingTaxesTaxRateDetails(
                taxRate = taxRate,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingTaxesTaxRateDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingBillResourceInvoicingTaxesTaxRateDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingTaxesTaxRateDetails {
            val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingTaxesTaxRateDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BillingBillResourceInvoicingTaxesTaxRateDetails must be a JSON object",
                    )
            val taxRate =
                json.decodeRequired<InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53>(
                    rawObject,
                    "tax_rate",
                )
            return BillingBillResourceInvoicingTaxesTaxRateDetails(
                taxRate = taxRate,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingBillResourceInvoicingTaxesTaxRateDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingTaxesTaxRateDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("tax_rate", json.encodeToJsonElement(value.taxRate))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingBillResourceInvoicingTaxesTaxRateDetails(
    block: BillingBillResourceInvoicingTaxesTaxRateDetails.Builder.() -> Unit,
): BillingBillResourceInvoicingTaxesTaxRateDetails = BillingBillResourceInvoicingTaxesTaxRateDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingBillResourceInvoicingTaxesTaxRateDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
