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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Record of an OpenRouter server-tool invocation (e.g. openrouter:fusion), carried in reasoning_details so a prior tool
 * call can be rehydrated into a later turn of the same conversation.
 */
@Serializable(with = ReasoningDetailServerToolCall.Serializer::class)
public class ReasoningDetailServerToolCall(
  public val arguments: String,
  public val result: String,
  public val toolName: String,
  public val type: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType,
  public val format: ReasoningFormat? = null,
  public val id: String? = null,
  public val index: Int? = null,
  public val toolCallId: String? = null,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var resultValue: String? = null

    public var result: String
      get() = requireNotNull(resultValue) { "result is required" }
      set(`value`) {
        resultValue = value
      }

    private var toolNameValue: String? = null

    public var toolName: String
      get() = requireNotNull(toolNameValue) { "toolName is required" }
      set(`value`) {
        toolNameValue = value
      }

    private var typeValue: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType? =
        null

    public var type: InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var format: ReasoningFormat? = null

    public var id: String? = null

    public var index: Int? = null

    public var toolCallId: String? = null

    public fun build(): ReasoningDetailServerToolCall {
      check(argumentsValue != null) { "arguments is required" }
      check(resultValue != null) { "result is required" }
      check(toolNameValue != null) { "toolName is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningDetailServerToolCall(
        arguments = arguments,
        result = result,
        toolName = toolName,
        type = type,
        format = format,
        id = id,
        index = index,
        toolCallId = toolCallId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningDetailServerToolCall = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReasoningDetailServerToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetailServerToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetailServerToolCall")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ReasoningDetailServerToolCall must be a JSON object")
      val arguments = json.decodeRequired<String>(raw, "arguments")
      val result = json.decodeRequired<String>(raw, "result")
      val toolName = json.decodeRequired<String>(raw, "tool_name")
      val type = json.decodeRequired<InlineComponentsSchemasReasoningDetailServerToolCallPropertiesType>(raw, "type")
      return ReasoningDetailServerToolCall(
        arguments = arguments,
        result = result,
        toolName = toolName,
        type = type,
        format = raw["format"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningFormat?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        index = raw["index"]?.let { json.decodeFromJsonElement<Int>(it) },
        toolCallId = raw["tool_call_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetailServerToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningDetailServerToolCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("result", value.result)
        put("tool_name", value.toolName)
        put("type", json.encodeToJsonElement(value.type))
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
        value.toolCallId?.let { put("tool_call_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningDetailServerToolCall(block: ReasoningDetailServerToolCall.Builder.() ->
  Unit): ReasoningDetailServerToolCall = ReasoningDetailServerToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ReasoningDetailServerToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
