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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputItemCustomToolCall.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemCustomToolCall
 */
@Serializable(with = OutputItemCustomToolCall.Serializer::class)
public class OutputItemCustomToolCall(
  public val callId: String,
  public val input: String,
  public val name: String,
  public val type: InlineOutputItemCustomToolCallTypeX9265eb82,
  public val id: String? = null,
  /**
   * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
   */
  public val namespace: String? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var inputValue: String? = null

    public var input: String
      get() = requireNotNull(inputValue) { "input is required" }
      set(`value`) {
        inputValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineOutputItemCustomToolCallTypeX9265eb82? = null

    public var type: InlineOutputItemCustomToolCallTypeX9265eb82
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    /**
     * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
     */
    public var namespace: String? = null

    public fun build(): OutputItemCustomToolCall {
      check(callIdValue != null) { "callId is required" }
      check(inputValue != null) { "input is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemCustomToolCall(
        callId = callId,
        input = input,
        name = name,
        type = type,
        id = id,
        namespace = namespace,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemCustomToolCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputItemCustomToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemCustomToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemCustomToolCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputItemCustomToolCall must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val input = json.decodeRequired<String>(rawObject, "input")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOutputItemCustomToolCallTypeX9265eb82>(rawObject, "type")
      return OutputItemCustomToolCall(
        callId = callId,
        input = input,
        name = name,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemCustomToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemCustomToolCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("input", value.input)
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.namespace?.let { put("namespace", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputItemCustomToolCall(block: OutputItemCustomToolCall.Builder.() -> Unit): OutputItemCustomToolCall = OutputItemCustomToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemCustomToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
