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
 * A call to a custom (freeform-grammar) tool created by the model — distinct from `function_call`. Used for tools like
 * Codex CLI's `apply_patch` whose payload is opaque text rather than JSON arguments.
 */
@Serializable(with = OutputCustomToolCallItem.Serializer::class)
public class OutputCustomToolCallItem(
  public val callId: String,
  public val input: String,
  public val name: String,
  public val type: InlineComponentsSchemasOutputCustomToolCallItemPropertiesType,
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

    private var typeValue: InlineComponentsSchemasOutputCustomToolCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputCustomToolCallItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    /**
     * Namespace qualifier for tools registered as part of a namespace tool group (e.g. an MCP server)
     */
    public var namespace: String? = null

    public fun build(): OutputCustomToolCallItem {
      check(callIdValue != null) { "callId is required" }
      check(inputValue != null) { "input is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return OutputCustomToolCallItem(
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
    public fun build(block: Builder.() -> Unit): OutputCustomToolCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputCustomToolCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputCustomToolCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputCustomToolCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputCustomToolCallItem must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val input = json.decodeRequired<String>(raw, "input")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasOutputCustomToolCallItemPropertiesType>(raw, "type")
      return OutputCustomToolCallItem(
        callId = callId,
        input = input,
        name = name,
        type = type,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = raw["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputCustomToolCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputCustomToolCallItem")
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

public fun outputCustomToolCallItem(block: OutputCustomToolCallItem.Builder.() -> Unit): OutputCustomToolCallItem =
  OutputCustomToolCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputCustomToolCallItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
