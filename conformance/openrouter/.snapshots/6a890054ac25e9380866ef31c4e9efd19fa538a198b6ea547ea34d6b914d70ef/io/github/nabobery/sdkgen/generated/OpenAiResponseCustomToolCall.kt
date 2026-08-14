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
public data class OpenAiResponseCustomToolCallView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val input: String,
  public val name: String,
  public val namespace: String? = null,
  public val type: InlineOpenAiResponseCustomToolCallTypeX82b88241,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCall.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCall
 */
@Serializable(with = OpenAiResponseCustomToolCall.Serializer::class)
public class OpenAiResponseCustomToolCall(
  public val callId: String,
  public val input: String,
  public val name: String,
  public val type: InlineOpenAiResponseCustomToolCallTypeX82b88241,
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

    private var typeValue: InlineOpenAiResponseCustomToolCallTypeX82b88241? = null

    public var type: InlineOpenAiResponseCustomToolCallTypeX82b88241
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    /**
     * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
     */
    public var namespace: String? = null

    public fun build(): OpenAiResponseCustomToolCall {
      check(callIdValue != null) { "callId is required" }
      check(inputValue != null) { "input is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponseCustomToolCall(
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
    public fun build(block: Builder.() -> Unit): OpenAiResponseCustomToolCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponseCustomToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseCustomToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseCustomToolCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponseCustomToolCall must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val input = json.decodeRequired<String>(rawObject, "input")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOpenAiResponseCustomToolCallTypeX82b88241>(rawObject, "type")
      return OpenAiResponseCustomToolCall(
        callId = callId,
        input = input,
        name = name,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponseCustomToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponseCustomToolCall")
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

public fun openAiResponseCustomToolCall(block: OpenAiResponseCustomToolCall.Builder.() -> Unit): OpenAiResponseCustomToolCall = OpenAiResponseCustomToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponseCustomToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
