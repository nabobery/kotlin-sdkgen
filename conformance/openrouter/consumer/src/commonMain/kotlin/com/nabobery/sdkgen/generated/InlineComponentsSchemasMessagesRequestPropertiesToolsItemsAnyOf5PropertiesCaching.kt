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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/caching.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching
  .Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching(
  public val type: InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType,
  public val ttl: AnthropicCacheControlTtl? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType? =
        null

    public var type: InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var ttl: AnthropicCacheControlTtl? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching(
        type = type,
        ttl = ttl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching " +
          "must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching(
        type = type,
        ttl = raw["ttl"]?.let { json.decodeFromJsonElement<AnthropicCacheControlTtl>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ttl?.let { put("ttl", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesCaching " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
