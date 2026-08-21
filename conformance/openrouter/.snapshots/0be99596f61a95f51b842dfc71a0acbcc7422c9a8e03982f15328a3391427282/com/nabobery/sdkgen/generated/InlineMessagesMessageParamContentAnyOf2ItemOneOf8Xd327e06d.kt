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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/7
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(
  public val id: String,
  public val name: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68,
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

    private var typeValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var input: JsonElement? = null

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(
        id = id,
        name = name,
        type = type,
        cacheControl = cacheControl,
        input = input,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(
        id = id,
        name = name,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        input = rawObject["input"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d")
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

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d = InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
