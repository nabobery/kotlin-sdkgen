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
 * Anthropic-style cache breakpoint for the content part. Interchangeable with the OpenAI-style
 * `prompt_cache_breakpoint` marker: OpenRouter converts between the two based on the provider serving the request.
 */
@Serializable(with = ChatContentCacheControl.Serializer::class)
public class ChatContentCacheControl(
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

    public fun build(): ChatContentCacheControl {
      check(typeValue != null) { "type is required" }
      return ChatContentCacheControl(
        type = type,
        ttl = ttl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentCacheControl = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatContentCacheControl> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentCacheControl {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentCacheControl")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatContentCacheControl must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCacheControlDirectivePropertiesType>(raw, "type")
      return ChatContentCacheControl(
        type = type,
        ttl = raw["ttl"]?.let { json.decodeFromJsonElement<AnthropicCacheControlTtl>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentCacheControl) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentCacheControl")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ttl?.let { put("ttl", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentCacheControl(block: ChatContentCacheControl.Builder.() -> Unit): ChatContentCacheControl =
  ChatContentCacheControl.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentCacheControl is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
