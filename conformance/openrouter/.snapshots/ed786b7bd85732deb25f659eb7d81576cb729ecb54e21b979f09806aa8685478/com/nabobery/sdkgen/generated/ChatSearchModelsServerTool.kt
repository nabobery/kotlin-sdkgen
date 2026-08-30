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

@Serializable
public data class ChatSearchModelsServerToolView(
  public val parameters: SearchModelsServerToolConfig? = null,
  public val type: InlineChatSearchModelsServerToolTypeXad5b449f,
)

/**
 * OpenRouter built-in server tool: searches and filters AI models available on OpenRouter
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatSearchModelsServerTool
 */
@Serializable(with = ChatSearchModelsServerTool.Serializer::class)
public class ChatSearchModelsServerTool(
  public val type: InlineChatSearchModelsServerToolTypeXad5b449f,
  public val parameters: SearchModelsServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineChatSearchModelsServerToolTypeXad5b449f? = null

    public var type: InlineChatSearchModelsServerToolTypeXad5b449f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: SearchModelsServerToolConfig? = null

    public fun build(): ChatSearchModelsServerTool {
      check(typeValue != null) { "type is required" }
      return ChatSearchModelsServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatSearchModelsServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatSearchModelsServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatSearchModelsServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("ChatSearchModelsServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatSearchModelsServerTool must be a JSON object")
      val type = json.decodeRequired<InlineChatSearchModelsServerToolTypeXad5b449f>(rawObject, "type")
      return ChatSearchModelsServerTool(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<SearchModelsServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatSearchModelsServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatSearchModelsServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatSearchModelsServerTool(block: ChatSearchModelsServerTool.Builder.() -> Unit): ChatSearchModelsServerTool = ChatSearchModelsServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatSearchModelsServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
