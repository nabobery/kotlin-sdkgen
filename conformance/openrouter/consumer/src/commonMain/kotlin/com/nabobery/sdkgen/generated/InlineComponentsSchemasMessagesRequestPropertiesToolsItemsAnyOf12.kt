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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/12.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12(
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 must be a " +
          "JSON object")
      val type = json.decodeRequired<String>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf12 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
