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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubagentNestedTool
 */
@Serializable(with = SubagentNestedTool.Serializer::class)
public class SubagentNestedTool(
  public val type: String,
  parameters: Map<String, JsonElement?>? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  public val parameters: Map<String, JsonElement?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateSubagentNestedToolAdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var parametersValue: Map<String, JsonElement?>? = null

    public var parameters: Map<String, JsonElement?>?
      get() = parametersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): SubagentNestedTool {
      check(typeValue != null) { "type is required" }
      return SubagentNestedTool(
        type = type,
        parameters = parameters,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubagentNestedTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubagentNestedTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubagentNestedTool {
      val jsonDecoder = decoder.requireJsonDecoder("SubagentNestedTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubagentNestedTool must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return SubagentNestedTool(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("parameters", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubagentNestedTool) {
      val jsonEncoder = encoder.requireJsonEncoder("SubagentNestedTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("parameters", "type")) { "SubagentNestedTool additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateSubagentNestedToolAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("parameters", "type") }
  require(collision == null) { "SubagentNestedTool additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun subagentNestedTool(block: SubagentNestedTool.Builder.() -> Unit): SubagentNestedTool = SubagentNestedTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubagentNestedTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
