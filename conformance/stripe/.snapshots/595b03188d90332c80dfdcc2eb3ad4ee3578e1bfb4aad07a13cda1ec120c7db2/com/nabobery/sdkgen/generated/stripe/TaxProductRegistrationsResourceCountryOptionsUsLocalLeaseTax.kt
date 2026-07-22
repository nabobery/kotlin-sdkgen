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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_us_local_lease_ta
 * x
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax(
    /**
     * A [FIPS code](https://www.census.gov/library/reference/code-lists/ansi.html) representing the local jurisdiction.
     */
    public val jurisdiction: String,
) {
    public class Builder {
        private var jurisdictionValue: String? = null

        public var jurisdiction: String
            get() = requireNotNull(jurisdictionValue) { "jurisdiction is required" }
            set(`value`) {
                jurisdictionValue = value
            }

        public fun build(): TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax {
            check(jurisdictionValue != null) { "jurisdiction is required" }
            return TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax(
                jurisdiction = jurisdiction,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax must be a JSON object",
                    )
            val jurisdiction = json.decodeRequired<String>(rawObject, "jurisdiction")
            return TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax(
                jurisdiction = jurisdiction,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("jurisdiction", value.jurisdiction)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax(
    block: TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax.Builder.() -> Unit,
): TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax =
    TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductRegistrationsResourceCountryOptionsUsLocalLeaseTax is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
