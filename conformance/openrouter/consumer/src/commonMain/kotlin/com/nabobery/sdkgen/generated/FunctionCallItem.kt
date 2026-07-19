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
 * A function call initiated by the model
 */
@Serializable(with = FunctionCallItem.Serializer::class)
public class FunctionCallItem(
  public val arguments: String,
  public val callId: String,
  public val name: String,
  public val type: InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType,
  public val id: String? = null,
  /**
   * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
   */
  public val namespace: String? = null,
  public val status: ToolCallStatus? = null,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType? =
        null

    public var type: InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    /**
     * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
     */
    public var namespace: String? = null

    public var status: ToolCallStatus? = null

    public fun build(): FunctionCallItem {
      check(argumentsValue != null) { "arguments is required" }
      check(callIdValue != null) { "callId is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return FunctionCallItem(
        arguments = arguments,
        callId = callId,
        name = name,
        type = type,
        id = id,
        namespace = namespace,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FunctionCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FunctionCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FunctionCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("FunctionCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FunctionCallItem must be a JSON object")
      val arguments = json.decodeRequired<String>(raw, "arguments")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType>(raw, "type")
      return FunctionCallItem(
        arguments = arguments,
        callId = callId,
        name = name,
        type = type,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = raw["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
        status = raw["status"]?.let { json.decodeFromJsonElement<ToolCallStatus>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FunctionCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("FunctionCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("call_id", value.callId)
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.namespace?.let { put("namespace", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun functionCallItem(block: FunctionCallItem.Builder.() -> Unit): FunctionCallItem = FunctionCallItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FunctionCallItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
