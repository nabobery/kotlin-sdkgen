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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63(
    public val state: String,
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b,
    public val localAmusementTax: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e? = null,
    public val localLeaseTax: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsLocalLeaseTaxXe7b38890? = null,
    public val stateSalesTax: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90? = null,
) {
    public class Builder {
        private var stateValue: String? = null

        public var state: String
            get() = requireNotNull(stateValue) { "state is required" }
            set(`value`) {
                stateValue = value
            }

        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var localAmusementTax:
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e? = null

        public var localLeaseTax:
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsLocalLeaseTaxXe7b38890? = null

        public var stateSalesTax:
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90? = null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 {
            check(stateValue != null) { "state is required" }
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63(
                state = state,
                type = type,
                localAmusementTax = localAmusementTax,
                localLeaseTax = localLeaseTax,
                stateSalesTax = stateSalesTax,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 must be a JSON object",
                    )
            val state = json.decodeRequired<String>(rawObject, "state")
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63(
                state = state,
                type = type,
                localAmusementTax =
                    rawObject["local_amusement_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e>(
                                it,
                            )
                    },
                localLeaseTax =
                    rawObject["local_lease_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsLocalLeaseTaxXe7b38890>(
                                it,
                            )
                    },
                stateSalesTax =
                    rawObject["state_sales_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63",
                )
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
