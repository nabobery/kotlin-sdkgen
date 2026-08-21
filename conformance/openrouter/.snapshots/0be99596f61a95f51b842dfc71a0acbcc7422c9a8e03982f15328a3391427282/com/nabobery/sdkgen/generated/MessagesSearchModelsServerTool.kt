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
public data class MessagesSearchModelsServerToolView(
  public val parameters: SearchModelsServerToolConfig? = null,
  public val type: InlineMessagesSearchModelsServerToolTypeX4206f319,
)

/**
 * OpenRouter built-in server tool: searches and filters AI models available on OpenRouter
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesSearchModelsServerTool
 */
@Serializable(with = MessagesSearchModelsServerTool.Serializer::class)
public class MessagesSearchModelsServerTool(
  public val type: InlineMessagesSearchModelsServerToolTypeX4206f319,
  public val parameters: SearchModelsServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineMessagesSearchModelsServerToolTypeX4206f319? = null

    public var type: InlineMessagesSearchModelsServerToolTypeX4206f319
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: SearchModelsServerToolConfig? = null

    public fun build(): MessagesSearchModelsServerTool {
      check(typeValue != null) { "type is required" }
      return MessagesSearchModelsServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesSearchModelsServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesSearchModelsServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesSearchModelsServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesSearchModelsServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesSearchModelsServerTool must be a JSON object")
      val type = json.decodeRequired<InlineMessagesSearchModelsServerToolTypeX4206f319>(rawObject, "type")
      return MessagesSearchModelsServerTool(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<SearchModelsServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesSearchModelsServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesSearchModelsServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesSearchModelsServerTool(block: MessagesSearchModelsServerTool.Builder.() -> Unit): MessagesSearchModelsServerTool = MessagesSearchModelsServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesSearchModelsServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
