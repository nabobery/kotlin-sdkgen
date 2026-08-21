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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/dropdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/dropdown
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c(
  options: List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownOptionsItemX7bb5a8fa>,
  public val defaultValue: String? = null,
) {
  public val options:
      List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownOptionsItemX7bb5a8fa> =
      options.toList()

  public class Builder {
    private var optionsValue:
        List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownOptionsItemX7bb5a8fa>? =
        null

    public var options:
        List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownOptionsItemX7bb5a8fa>
      get() = requireNotNull(optionsValue) { "options is required" }.toList()
      set(`value`) {
        optionsValue = value.toList()
      }

    public var defaultValue: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c {
      check(optionsValue != null) { "options is required" }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c(
        options = options,
        defaultValue = defaultValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c must be a JSON object")
      val options = json.decodeRequired<List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownOptionsItemX7bb5a8fa>>(rawObject, "options")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c(
        options = options,
        defaultValue = rawObject["default_value"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("options", json.encodeToJsonElement(value.options))
        value.defaultValue?.let { put("default_value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c(block: InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c = InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
