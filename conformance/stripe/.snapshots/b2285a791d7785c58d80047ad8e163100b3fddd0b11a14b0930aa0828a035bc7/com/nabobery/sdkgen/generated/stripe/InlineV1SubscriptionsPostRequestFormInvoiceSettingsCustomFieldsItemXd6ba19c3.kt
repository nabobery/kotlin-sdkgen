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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/0/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3(
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

    public fun build(): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3(block: InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 = InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
