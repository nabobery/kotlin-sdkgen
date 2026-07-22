package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_status_details
 */
@Serializable(with = TaxProductResourceTaxSettingsStatusDetails.Serializer::class)
public class TaxProductResourceTaxSettingsStatusDetails(
    public val active: JsonObject? = null,
    public val pending: TaxProductResourceTaxSettingsStatusDetailsResourcePending? = null,
) {
    public class Builder {
        public var active: JsonObject? = null

        public var pending: TaxProductResourceTaxSettingsStatusDetailsResourcePending? = null

        public fun build(): TaxProductResourceTaxSettingsStatusDetails =
            TaxProductResourceTaxSettingsStatusDetails(
                active = active,
                pending = pending,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceTaxSettingsStatusDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxSettingsStatusDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxSettingsStatusDetails {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxSettingsStatusDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TaxProductResourceTaxSettingsStatusDetails must be a JSON object")
            return TaxProductResourceTaxSettingsStatusDetails(
                active = rawObject["active"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                pending =
                    rawObject["pending"]?.let {
                        json.decodeFromJsonElement<TaxProductResourceTaxSettingsStatusDetailsResourcePending>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxSettingsStatusDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxSettingsStatusDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.active?.let { put("active", json.encodeToJsonElement(it)) }
                    value.pending?.let { put("pending", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxSettingsStatusDetails(
    block: TaxProductResourceTaxSettingsStatusDetails.Builder.() -> Unit,
): TaxProductResourceTaxSettingsStatusDetails = TaxProductResourceTaxSettingsStatusDetails.build(block)
