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
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_setting_custom_field
 */
@Serializable(with = InvoiceSettingCustomField.Serializer::class)
public class InvoiceSettingCustomField(
    /**
     * The name of the custom field.
     */
    public val name: String,
    /**
     * The value of the custom field.
     */
    public val `value`: String,
) {
    public class Builder {
        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        private var valueValue: String? = null

        public var `value`: String
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): InvoiceSettingCustomField {
            check(nameValue != null) { "name is required" }
            check(valueValue != null) { "value is required" }
            return InvoiceSettingCustomField(
                name = name,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoiceSettingCustomField = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoiceSettingCustomField> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoiceSettingCustomField {
            val jsonDecoder = decoder.requireJsonDecoder("InvoiceSettingCustomField")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoiceSettingCustomField must be a JSON object")
            val name = json.decodeRequired<String>(rawObject, "name")
            val value = json.decodeRequired<String>(rawObject, "value")
            return InvoiceSettingCustomField(
                name = name,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoiceSettingCustomField,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoiceSettingCustomField")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("name", value.name)
                    put("value", value.value)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoiceSettingCustomField(block: InvoiceSettingCustomField.Builder.() -> Unit): InvoiceSettingCustomField =
    InvoiceSettingCustomField.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InvoiceSettingCustomField is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
