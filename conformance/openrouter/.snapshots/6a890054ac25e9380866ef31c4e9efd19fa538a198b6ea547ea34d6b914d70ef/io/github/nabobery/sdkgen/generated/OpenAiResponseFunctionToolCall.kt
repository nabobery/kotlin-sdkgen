package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class OpenAiResponseFunctionToolCallView(
  public val arguments: String,
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val name: String,
  public val namespace: String? = null,
  public val status: ToolCallStatus? = null,
  public val type: InlineOpenAiResponseFunctionToolCallTypeXef7600c6,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCall.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCall
 */
@Serializable(with = OpenAiResponseFunctionToolCall.Serializer::class)
public class OpenAiResponseFunctionToolCall(
  public val arguments: String,
  public val callId: String,
  public val name: String,
  public val type: InlineOpenAiResponseFunctionToolCallTypeXef7600c6,
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

    private var typeValue: InlineOpenAiResponseFunctionToolCallTypeXef7600c6? = null

    public var type: InlineOpenAiResponseFunctionToolCallTypeXef7600c6
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

    public fun build(): OpenAiResponseFunctionToolCall {
      check(argumentsValue != null) { "arguments is required" }
      check(callIdValue != null) { "callId is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponseFunctionToolCall(
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
    public fun build(block: Builder.() -> Unit): OpenAiResponseFunctionToolCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponseFunctionToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseFunctionToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseFunctionToolCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponseFunctionToolCall must be a JSON object")
      val arguments = json.decodeRequired<String>(rawObject, "arguments")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOpenAiResponseFunctionToolCallTypeXef7600c6>(rawObject, "type")
      return OpenAiResponseFunctionToolCall(
        arguments = arguments,
        callId = callId,
        name = name,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<ToolCallStatus>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponseFunctionToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponseFunctionToolCall")
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

public fun openAiResponseFunctionToolCall(block: OpenAiResponseFunctionToolCall.Builder.() -> Unit): OpenAiResponseFunctionToolCall = OpenAiResponseFunctionToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponseFunctionToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
