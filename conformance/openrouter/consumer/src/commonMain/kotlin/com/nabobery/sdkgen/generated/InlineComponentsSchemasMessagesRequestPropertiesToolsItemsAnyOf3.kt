package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/3.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3(
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesType,
  public val allowedDomains: List<String>? = null,
  public val blockedDomains: List<String>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val maxUses: Int? = null,
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
) {
  public class Builder {
    private var nameValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesName? = null

    public var name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesName
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var allowedDomains: List<String>? = null

    public var blockedDomains: List<String>? = null

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var maxUses: Int? = null

    public var userLocation: AnthropicWebSearchToolUserLocation? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3(
        name = name,
        type = type,
        allowedDomains = allowedDomains,
        blockedDomains = blockedDomains,
        cacheControl = cacheControl,
        maxUses = maxUses,
        userLocation = userLocation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 must be a JSON " +
          "object")
      val name = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesName>(raw, "name")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3(
        name = name,
        type = type,
        allowedDomains = raw["allowed_domains"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        blockedDomains = raw["blocked_domains"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        maxUses = raw["max_uses"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        userLocation = raw["user_location"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicWebSearchToolUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.allowedDomains?.let { put("allowed_domains", json.encodeToJsonElement(it)) }
        value.blockedDomains?.let { put("blocked_domains", json.encodeToJsonElement(it)) }
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.maxUses?.let { put("max_uses", json.encodeToJsonElement(it)) }
        value.userLocation?.let { put("user_location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf3 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
