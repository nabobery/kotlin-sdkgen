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
 * A tool made available to the advisor sub-agent. Only OpenRouter server tools (e.g. openrouter:web_search) are
 * supported; function tools are rejected because the advisor has no way to execute them. The advisor tool may not list
 * itself.
 */
@Serializable(with = AdvisorNestedTool.Serializer::class)
public class AdvisorNestedTool(
  public val type: String,
  public val parameters: Map<String, JsonElement?>? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> = copyAndValidateAdvisorNestedToolAdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: Map<String, JsonElement?>? = null

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement> = emptyMap()

    public fun build(): AdvisorNestedTool {
      check(typeValue != null) { "type is required" }
      return AdvisorNestedTool(
        type = type,
        parameters = parameters,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AdvisorNestedTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AdvisorNestedTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AdvisorNestedTool {
      val jsonDecoder = decoder.requireJsonDecoder("AdvisorNestedTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AdvisorNestedTool must be a JSON object")
      val type = json.decodeRequired<String>(raw, "type")
      return AdvisorNestedTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        additionalProperties = raw.filterKeys { key -> key !in setOf("parameters", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: AdvisorNestedTool) {
      val jsonEncoder = encoder.requireJsonEncoder("AdvisorNestedTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("parameters", "type")) { "AdvisorNestedTool additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun advisorNestedTool(block: AdvisorNestedTool.Builder.() -> Unit): AdvisorNestedTool = AdvisorNestedTool
  .build(block)

private fun copyAndValidateAdvisorNestedToolAdditionalProperties(
  additionalProperties: Map<String, JsonElement>,
): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("parameters", "type") }
  require(collision == null) {
    "AdvisorNestedTool additionalProperties key '" + collision + "' collides with a fixed property"
  }
  return copied
}

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AdvisorNestedTool is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
