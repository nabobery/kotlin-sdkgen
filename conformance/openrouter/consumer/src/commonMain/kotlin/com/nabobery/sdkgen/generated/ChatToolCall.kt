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
 * Tool call made by the assistant
 */
@Serializable(with = ChatToolCall.Serializer::class)
public class ChatToolCall(
  public val function: InlineComponentsSchemasChatToolCallPropertiesFunction,
  /**
   * Tool call identifier
   */
  public val id: String,
  public val type: InlineComponentsSchemasChatToolCallPropertiesType,
) {
  public class Builder {
    private var functionValue: InlineComponentsSchemasChatToolCallPropertiesFunction? = null

    public var function: InlineComponentsSchemasChatToolCallPropertiesFunction
      get() = requireNotNull(functionValue) { "function is required" }
      set(`value`) {
        functionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var typeValue: InlineComponentsSchemasChatToolCallPropertiesType? = null

    public var type: InlineComponentsSchemasChatToolCallPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatToolCall {
      check(functionValue != null) { "function is required" }
      check(idValue != null) { "id is required" }
      check(typeValue != null) { "type is required" }
      return ChatToolCall(
        function = function,
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatToolCall = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("ChatToolCall")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatToolCall must be a JSON object")
      val function = json.decodeRequired<InlineComponentsSchemasChatToolCallPropertiesFunction>(raw, "function")
      val id = json.decodeRequired<String>(raw, "id")
      val type = json.decodeRequired<InlineComponentsSchemasChatToolCallPropertiesType>(raw, "type")
      return ChatToolCall(
        function = function,
        id = id,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatToolCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("function", json.encodeToJsonElement(value.function))
        put("id", value.id)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatToolCall(block: ChatToolCall.Builder.() -> Unit): ChatToolCall = ChatToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
