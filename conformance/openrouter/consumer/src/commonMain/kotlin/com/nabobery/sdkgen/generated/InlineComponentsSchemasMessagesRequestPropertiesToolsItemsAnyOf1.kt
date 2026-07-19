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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1(
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesType,
  public val cacheControl: AnthropicCacheControlDirective? = null,
) {
  public class Builder {
    private var nameValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesName? = null

    public var name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesName
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1(
        name = name,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 must be a JSON " +
          "object")
      val name = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesName>(raw, "name")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1(
        name = name,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
