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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05(
  public val key: String,
  public val label: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8,
  public val type: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c,
  public val dropdown:
      InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc? = null,
  public val numeric:
      InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemNumericX33747b50? = null,
  public val optional: Boolean? = null,
  public val text: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTextXf813b141? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var labelValue: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8? =
        null

    public var label: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var typeValue: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c? =
        null

    public var type: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var dropdown: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc? =
        null

    public var numeric: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemNumericX33747b50? =
        null

    public var optional: Boolean? = null

    public var text: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTextXf813b141? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 {
      check(keyValue != null) { "key is required" }
      check(labelValue != null) { "label is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05(
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
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val label = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8>(rawObject, "label")
      val type = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c>(rawObject, "type")
      return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05(
        key = key,
        label = label,
        type = type,
        dropdown = rawObject["dropdown"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc>(it) },
        numeric = rawObject["numeric"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemNumericX33747b50>(it) },
        optional = rawObject["optional"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTextXf813b141>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05")
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

public fun inlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05(block: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
