package com.nabobery.sdkgen.generated

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
 * A reference to a previous response item by ID
 */
@Serializable(with = ItemReferenceItem.Serializer::class)
public class ItemReferenceItem(
  public val id: String,
  public val type: InlineComponentsSchemasItemReferenceItemPropertiesType,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var typeValue: InlineComponentsSchemasItemReferenceItemPropertiesType? = null

    public var type: InlineComponentsSchemasItemReferenceItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ItemReferenceItem {
      check(idValue != null) { "id is required" }
      check(typeValue != null) { "type is required" }
      return ItemReferenceItem(
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ItemReferenceItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ItemReferenceItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ItemReferenceItem {
      val jsonDecoder = decoder.requireJsonDecoder("ItemReferenceItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ItemReferenceItem must be a JSON object")
      val id = json.decodeRequired<String>(raw, "id")
      val type = json.decodeRequired<InlineComponentsSchemasItemReferenceItemPropertiesType>(raw, "type")
      return ItemReferenceItem(
        id = id,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ItemReferenceItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ItemReferenceItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun itemReferenceItem(block: ItemReferenceItem.Builder.() -> Unit): ItemReferenceItem = ItemReferenceItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ItemReferenceItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
