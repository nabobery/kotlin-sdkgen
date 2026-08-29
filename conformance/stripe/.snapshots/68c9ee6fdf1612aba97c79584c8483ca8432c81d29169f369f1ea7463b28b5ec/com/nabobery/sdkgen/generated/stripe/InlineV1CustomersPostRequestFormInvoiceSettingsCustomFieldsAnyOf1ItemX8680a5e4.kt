package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields/anyOf/0/items
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4(
  public val name: String,
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

    public fun build(): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4(block: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4.Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
