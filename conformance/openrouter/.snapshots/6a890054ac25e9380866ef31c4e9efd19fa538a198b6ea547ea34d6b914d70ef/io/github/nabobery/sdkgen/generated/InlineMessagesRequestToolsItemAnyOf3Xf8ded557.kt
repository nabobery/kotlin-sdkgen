package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf3Xf8ded557.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf3Xf8ded557(
  public val name: InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0,
  public val type: InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82,
  public val cacheControl: AnthropicCacheControlDirective? = null,
) {
  public class Builder {
    private var nameValue: InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0? = null

    public var name: InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82? = null

    public var type: InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf3Xf8ded557 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf3Xf8ded557(
        name = name,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf3Xf8ded557 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf3Xf8ded557> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf3Xf8ded557 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf3Xf8ded557")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf3Xf8ded557 must be a JSON object")
      val name = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf3Xf8ded557(
        name = name,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf3Xf8ded557) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf3Xf8ded557")
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

public fun inlineMessagesRequestToolsItemAnyOf3Xf8ded557(block: InlineMessagesRequestToolsItemAnyOf3Xf8ded557.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf3Xf8ded557 = InlineMessagesRequestToolsItemAnyOf3Xf8ded557.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf3Xf8ded557 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
