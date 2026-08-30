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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/caching
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866(
  public val type: InlineAnthropicCacheControlDirectiveTypeX1079002e,
  public val ttl: AnthropicCacheControlTtl? = null,
) {
  public class Builder {
    private var typeValue: InlineAnthropicCacheControlDirectiveTypeX1079002e? = null

    public var type: InlineAnthropicCacheControlDirectiveTypeX1079002e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var ttl: AnthropicCacheControlTtl? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866(
        type = type,
        ttl = ttl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicCacheControlDirectiveTypeX1079002e>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866(
        type = type,
        ttl = rawObject["ttl"]?.let { json.decodeFromJsonElement<AnthropicCacheControlTtl>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ttl?.let { put("ttl", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolsItemAnyOf6CachingX8e87a866(block: InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 = InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf6CachingX8e87a866 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
