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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/7.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7.Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(
  public val id: String,
  public val name: String,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val input: JsonElement? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68? =
        null

    public var type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var input: JsonElement? = null

    public fun build(): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(
        id = id,
        name = name,
        type = type,
        cacheControl = cacheControl,
        input = input,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 " +
          "must be a JSON object")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68>(raw,
          "type")
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(
        id = id,
        name = name,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        input = raw["input"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.input?.let { put("input", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(block: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7.Builder.() -> Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
