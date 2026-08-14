package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputFunctionCallItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFunctionCallItem
 */
@Serializable(with = OutputFunctionCallItem.Serializer::class)
public class OutputFunctionCallItem(
  public val arguments: String,
  public val callId: String,
  public val name: String,
  public val type: InlineOutputItemFunctionCallTypeX494d8eba,
  public val id: String? = null,
  /**
   * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
   */
  public val namespace: String? = null,
  public val status: InlineOutputItemFunctionCallStatusXb23ccde6? = null,
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

    private var typeValue: InlineOutputItemFunctionCallTypeX494d8eba? = null

    public var type: InlineOutputItemFunctionCallTypeX494d8eba
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    /**
     * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
     */
    public var namespace: String? = null

    public var status: InlineOutputItemFunctionCallStatusXb23ccde6? = null

    public fun build(): OutputFunctionCallItem {
      check(argumentsValue != null) { "arguments is required" }
      check(callIdValue != null) { "callId is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OutputFunctionCallItem(
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
    public fun build(block: Builder.() -> Unit): OutputFunctionCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputFunctionCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFunctionCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFunctionCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputFunctionCallItem must be a JSON object")
      val arguments = json.decodeRequired<String>(rawObject, "arguments")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOutputItemFunctionCallTypeX494d8eba>(rawObject, "type")
      return OutputFunctionCallItem(
        arguments = arguments,
        callId = callId,
        name = name,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOutputItemFunctionCallStatusXb23ccde6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputFunctionCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputFunctionCallItem")
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

public fun outputFunctionCallItem(block: OutputFunctionCallItem.Builder.() -> Unit): OutputFunctionCallItem = OutputFunctionCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputFunctionCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
