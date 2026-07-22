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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_rate_details
 */
@Serializable(with = TaxProductResourceTaxRateDetails.Serializer::class)
public class TaxProductResourceTaxRateDetails(
    /**
     * The tax rate percentage as a string. For example, 8.5% is represented as `"8.5"`.
     */
    public val percentageDecimal: String,
    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public val country: String? = null,
    /**
     * The amount of the tax rate when the `rate_type` is `flat_amount`. Tax rates with `rate_type` `percentage` can vary
     * based on the transaction, resulting in this field being `null`. This field exposes the amount and currency of the
     * flat tax rate.
     */
    public val flatAmount: InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80? = null,
    /**
     * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
     * location. This field is only present for TaxRates created by Stripe Tax.
     */
    public val rateType: InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b? = null,
    /**
     * State, county, province, or region ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
     */
    public val state: String? = null,
    /**
     * The tax type, such as `vat` or `sales_tax`.
     */
    public val taxType: InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4? = null,
) {
    public class Builder {
        private var percentageDecimalValue: String? = null

        public var percentageDecimal: String
            get() = requireNotNull(percentageDecimalValue) { "percentageDecimal is required" }
            set(`value`) {
                percentageDecimalValue = value
            }

        /**
         * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public var country: String? = null

        /**
         * The amount of the tax rate when the `rate_type` is `flat_amount`. Tax rates with `rate_type` `percentage` can
         * vary based on the transaction, resulting in this field being `null`. This field exposes the amount and currency
         * of the flat tax rate.
         */
        public var flatAmount: InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80? = null

        /**
         * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
         * location. This field is only present for TaxRates created by Stripe Tax.
         */
        public var rateType: InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b? = null

        /**
         * State, county, province, or region ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
         */
        public var state: String? = null

        /**
         * The tax type, such as `vat` or `sales_tax`.
         */
        public var taxType: InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4? = null

        public fun build(): TaxProductResourceTaxRateDetails {
            check(percentageDecimalValue != null) { "percentageDecimal is required" }
            return TaxProductResourceTaxRateDetails(
                percentageDecimal = percentageDecimal,
                country = country,
                flatAmount = flatAmount,
                rateType = rateType,
                state = state,
                taxType = taxType,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceTaxRateDetails = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxRateDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxRateDetails {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxRateDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TaxProductResourceTaxRateDetails must be a JSON object")
            val percentageDecimal = json.decodeRequired<String>(rawObject, "percentage_decimal")
            return TaxProductResourceTaxRateDetails(
                percentageDecimal = percentageDecimal,
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                flatAmount =
                    rawObject["flat_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80?>(
                                element,
                            )
                        }
                    },
                rateType =
                    rawObject["rate_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b?>(
                                element,
                            )
                        }
                    },
                state =
                    rawObject["state"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                taxType =
                    rawObject["tax_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxRateDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxRateDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("percentage_decimal", value.percentageDecimal)
                    value.country?.let { put("country", it) }
                    value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
                    value.rateType?.let { put("rate_type", json.encodeToJsonElement(it)) }
                    value.state?.let { put("state", it) }
                    value.taxType?.let { put("tax_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxRateDetails(
    block: TaxProductResourceTaxRateDetails.Builder.() -> Unit,
): TaxProductResourceTaxRateDetails = TaxProductResourceTaxRateDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceTaxRateDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
