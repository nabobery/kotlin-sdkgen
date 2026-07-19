package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * A tool made available to the subagent. Only OpenRouter server tools (e.g. openrouter:web_search) are supported;
 * function tools are rejected because the worker has no way to execute them. The subagent tool may not list itself.
 */
@Serializable(with = SubagentNestedTool.Serializer::class)
public class SubagentNestedTool(
  public val type: String,
  public val parameters: Map<String, JsonElement?>? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: Map<String, JsonElement?>? = null

    public fun build(): SubagentNestedTool {
      check(typeValue != null) { "type is required" }
      return SubagentNestedTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubagentNestedTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubagentNestedTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubagentNestedTool {
      val jsonDecoder = decoder.requireJsonDecoder("SubagentNestedTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SubagentNestedTool must be a JSON object")
      val type = json.decodeRequired<String>(raw, "type")
      return SubagentNestedTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubagentNestedTool) {
      val jsonEncoder = encoder.requireJsonEncoder("SubagentNestedTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subagentNestedTool(block: SubagentNestedTool.Builder.() -> Unit): SubagentNestedTool = SubagentNestedTool
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubagentNestedTool is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
