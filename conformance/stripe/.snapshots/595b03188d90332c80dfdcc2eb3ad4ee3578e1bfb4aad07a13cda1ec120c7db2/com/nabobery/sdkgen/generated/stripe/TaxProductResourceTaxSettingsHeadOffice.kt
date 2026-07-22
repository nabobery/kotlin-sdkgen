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

@Serializable
public data class TaxProductResourceTaxSettingsHeadOfficeView(
    public val address: Address,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_head_office
 */
@Serializable(with = TaxProductResourceTaxSettingsHeadOffice.Serializer::class)
public class TaxProductResourceTaxSettingsHeadOffice(
    public val address: Address,
) {
    public class Builder {
        private var addressValue: Address? = null

        public var address: Address
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        public fun build(): TaxProductResourceTaxSettingsHeadOffice {
            check(addressValue != null) { "address is required" }
            return TaxProductResourceTaxSettingsHeadOffice(
                address = address,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceTaxSettingsHeadOffice =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxSettingsHeadOffice> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxSettingsHeadOffice {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxSettingsHeadOffice")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TaxProductResourceTaxSettingsHeadOffice must be a JSON object")
            val address = json.decodeRequired<Address>(rawObject, "address")
            return TaxProductResourceTaxSettingsHeadOffice(
                address = address,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxSettingsHeadOffice,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxSettingsHeadOffice")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxSettingsHeadOffice(
    block: TaxProductResourceTaxSettingsHeadOffice.Builder.() -> Unit,
): TaxProductResourceTaxSettingsHeadOffice = TaxProductResourceTaxSettingsHeadOffice.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceTaxSettingsHeadOffice is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
