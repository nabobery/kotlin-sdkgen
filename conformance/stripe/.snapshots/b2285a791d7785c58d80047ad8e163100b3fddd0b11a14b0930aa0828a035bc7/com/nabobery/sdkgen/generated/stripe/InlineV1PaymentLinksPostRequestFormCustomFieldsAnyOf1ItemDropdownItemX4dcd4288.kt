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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/dropdown/properties/options/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/dropdown/properties/options/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288(
  public val label: String,
  public val `value`: String,
) {
  public class Builder {
    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 {
      check(labelValue != null) { "label is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288(
        label = label,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288(
        label = label,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288(block: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
