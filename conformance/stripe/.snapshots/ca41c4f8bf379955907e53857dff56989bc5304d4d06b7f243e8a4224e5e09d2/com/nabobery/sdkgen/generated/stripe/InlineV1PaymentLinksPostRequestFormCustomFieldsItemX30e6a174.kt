package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174(
  public val key: String,
  public val label: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2,
  public val type: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8,
  public val dropdown: InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c? = null,
  public val numeric: InlineV1PaymentLinksPostRequestFormCustomFieldsItemNumericXb47f2ddd? = null,
  public val optional: Boolean? = null,
  public val text: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var labelValue: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2? =
        null

    public var label: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var typeValue: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8? = null

    public var type: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var dropdown: InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c? =
        null

    public var numeric: InlineV1PaymentLinksPostRequestFormCustomFieldsItemNumericXb47f2ddd? = null

    public var optional: Boolean? = null

    public var text: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 {
      check(keyValue != null) { "key is required" }
      check(labelValue != null) { "label is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174(
        key = key,
        label = label,
        type = type,
        dropdown = dropdown,
        numeric = numeric,
        optional = optional,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val label = json.decodeRequired<InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2>(rawObject, "label")
      val type = json.decodeRequired<InlineV1PaymentLinksPostRequestFormCustomFieldsItemTypeX307d86e8>(rawObject, "type")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174(
        key = key,
        label = label,
        type = type,
        dropdown = rawObject["dropdown"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsItemDropdownX347f2e2c>(it) },
        numeric = rawObject["numeric"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsItemNumericXb47f2ddd>(it) },
        optional = rawObject["optional"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("label", json.encodeToJsonElement(value.label))
        put("type", json.encodeToJsonElement(value.type))
        value.dropdown?.let { put("dropdown", json.encodeToJsonElement(it)) }
        value.numeric?.let { put("numeric", json.encodeToJsonElement(it)) }
        value.optional?.let { put("optional", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174(block: InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 = InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
