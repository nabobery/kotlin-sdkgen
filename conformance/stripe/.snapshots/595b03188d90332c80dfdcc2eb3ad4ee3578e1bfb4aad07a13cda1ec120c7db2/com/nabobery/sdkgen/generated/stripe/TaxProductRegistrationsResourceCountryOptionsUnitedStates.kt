package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_united_states
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsUnitedStates.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsUnitedStates(
    /**
     * Two-letter US state code ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
     */
    public val state: String,
    /**
     * Type of registration in the US.
     */
    public val type: InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5,
    public val localAmusementTax: TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax? = null,
    public val localLeaseTax: TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax? = null,
    public val stateSalesTax: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax? = null,
) {
    public class Builder {
        private var stateValue: String? = null

        public var state: String
            get() = requireNotNull(stateValue) { "state is required" }
            set(`value`) {
                stateValue = value
            }

        private var typeValue:
            InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5? = null

        public var type: InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var localAmusementTax: TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax? =
            null

        public var localLeaseTax: TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax? = null

        public var stateSalesTax: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax? = null

        public fun build(): TaxProductRegistrationsResourceCountryOptionsUnitedStates {
            check(stateValue != null) { "state is required" }
            check(typeValue != null) { "type is required" }
            return TaxProductRegistrationsResourceCountryOptionsUnitedStates(
                state = state,
                type = type,
                localAmusementTax = localAmusementTax,
                localLeaseTax = localLeaseTax,
                stateSalesTax = stateSalesTax,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUnitedStates =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsUnitedStates> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsUnitedStates {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsUnitedStates")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductRegistrationsResourceCountryOptionsUnitedStates must be a JSON object",
                    )
            val state = json.decodeRequired<String>(rawObject, "state")
            val type =
                json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5>(
                    rawObject,
                    "type",
                )
            return TaxProductRegistrationsResourceCountryOptionsUnitedStates(
                state = state,
                type = type,
                localAmusementTax =
                    rawObject["local_amusement_tax"]?.let {
                        json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax>(it)
                    },
                localLeaseTax =
                    rawObject["local_lease_tax"]?.let {
                        json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax>(it)
                    },
                stateSalesTax =
                    rawObject["state_sales_tax"]?.let {
                        json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductRegistrationsResourceCountryOptionsUnitedStates,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsUnitedStates")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("state", value.state)
                    put("type", json.encodeToJsonElement(value.type))
                    value.localAmusementTax?.let { put("local_amusement_tax", json.encodeToJsonElement(it)) }
                    value.localLeaseTax?.let { put("local_lease_tax", json.encodeToJsonElement(it)) }
                    value.stateSalesTax?.let { put("state_sales_tax", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductRegistrationsResourceCountryOptionsUnitedStates(
    block: TaxProductRegistrationsResourceCountryOptionsUnitedStates.Builder.() -> Unit,
): TaxProductRegistrationsResourceCountryOptionsUnitedStates =
    TaxProductRegistrationsResourceCountryOptionsUnitedStates.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductRegistrationsResourceCountryOptionsUnitedStates is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
