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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0(
  public val inputSchema:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema,
  public val name: String,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val description: String? = null,
  public val type:
      InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType? = null,
) {
  public class Builder {
    private var inputSchemaValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema? =
        null

    public var inputSchema:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema
      get() = requireNotNull(inputSchemaValue) { "inputSchema is required" }
      set(`value`) {
        inputSchemaValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var description: String? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType?
        = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 {
      check(inputSchemaValue != null) { "inputSchema is required" }
      check(nameValue != null) { "name is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0(
        inputSchema = inputSchema,
        name = name,
        cacheControl = cacheControl,
        description = description,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 must be a JSON " +
          "object")
      val inputSchema = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesInputSchema>(raw,
          "input_schema")
      val name = json.decodeRequired<String>(raw, "name")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0(
        inputSchema = inputSchema,
        name = name,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        description = raw["description"]?.let { json.decodeFromJsonElement<String>(it) },
        type = raw["type"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_schema", json.encodeToJsonElement(value.inputSchema))
        put("name", value.name)
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
