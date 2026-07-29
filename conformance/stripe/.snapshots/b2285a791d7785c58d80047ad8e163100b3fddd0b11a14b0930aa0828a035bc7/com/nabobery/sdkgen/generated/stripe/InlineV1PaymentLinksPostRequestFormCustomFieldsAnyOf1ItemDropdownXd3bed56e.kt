package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/dropdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/dropdown
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e(
  options: List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288>,
  public val defaultValue: String? = null,
) {
  public val options:
      List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288> =
      options.toList()

  public class Builder {
    private var optionsValue:
        List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288>? = null

    public var options:
        List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288>
      get() = requireNotNull(optionsValue) { "options is required" }.toList()
      set(`value`) {
        optionsValue = value.toList()
      }

    public var defaultValue: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e {
      check(optionsValue != null) { "options is required" }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e(
        options = options,
        defaultValue = defaultValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e must be a JSON object")
      val options = json.decodeRequired<List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownItemX4dcd4288>>(rawObject, "options")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e(
        options = options,
        defaultValue = rawObject["default_value"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("options", json.encodeToJsonElement(value.options))
        value.defaultValue?.let { put("default_value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e(block: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
