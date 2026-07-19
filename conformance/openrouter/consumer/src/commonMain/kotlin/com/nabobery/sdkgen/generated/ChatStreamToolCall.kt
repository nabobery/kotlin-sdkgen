package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Tool call delta for streaming responses
 */
@Serializable(with = ChatStreamToolCall.Serializer::class)
public class ChatStreamToolCall(
  /**
   * Tool call index in the array
   */
  public val index: Int,
  /**
   * Function call details
   */
  public val function: InlineComponentsSchemasChatStreamToolCallPropertiesFunction? = null,
  /**
   * Tool call identifier
   */
  public val id: String? = null,
  /**
   * Tool call type
   */
  public val type: InlineComponentsSchemasChatStreamToolCallPropertiesType? = null,
) {
  public class Builder {
    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    /**
     * Function call details
     */
    public var function: InlineComponentsSchemasChatStreamToolCallPropertiesFunction? = null

    /**
     * Tool call identifier
     */
    public var id: String? = null

    /**
     * Tool call type
     */
    public var type: InlineComponentsSchemasChatStreamToolCallPropertiesType? = null

    public fun build(): ChatStreamToolCall {
      check(indexValue != null) { "index is required" }
      return ChatStreamToolCall(
        index = index,
        function = function,
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatStreamToolCall = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatStreamToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatStreamToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("ChatStreamToolCall")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatStreamToolCall must be a JSON object")
      val index = json.decodeRequired<Int>(raw, "index")
      return ChatStreamToolCall(
        index = index,
        function = raw["function"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatStreamToolCallPropertiesFunction>(it) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        type = raw["type"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatStreamToolCallPropertiesType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatStreamToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatStreamToolCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("index", json.encodeToJsonElement(value.index))
        value.function?.let { put("function", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatStreamToolCall(block: ChatStreamToolCall.Builder.() -> Unit): ChatStreamToolCall = ChatStreamToolCall
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatStreamToolCall is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
