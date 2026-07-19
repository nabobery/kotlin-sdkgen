package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@Serializable
public data class ToolChoiceAllowedView(
  public val mode: InlineComponentsSchemasToolChoiceAllowedPropertiesMode,
  public val tools: List<Map<String, JsonElement?>>,
  public val type: InlineComponentsSchemasToolChoiceAllowedPropertiesType,
)

/**
 * Constrains the model to a pre-defined set of allowed tools
 */
@Serializable(with = ToolChoiceAllowed.Serializer::class)
public class ToolChoiceAllowed(
  public val mode: InlineComponentsSchemasToolChoiceAllowedPropertiesMode,
  tools: List<Map<String, JsonElement?>>,
  public val type: InlineComponentsSchemasToolChoiceAllowedPropertiesType,
) {
  public val tools: List<Map<String, JsonElement?>> = tools.toList()

  public class Builder {
    private var modeValue: InlineComponentsSchemasToolChoiceAllowedPropertiesMode? = null

    public var mode: InlineComponentsSchemasToolChoiceAllowedPropertiesMode
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var toolsValue: List<Map<String, JsonElement?>>? = null

    public var tools: List<Map<String, JsonElement?>>
      get() = requireNotNull(toolsValue) { "tools is required" }
      set(`value`) {
        toolsValue = value
      }

    private var typeValue: InlineComponentsSchemasToolChoiceAllowedPropertiesType? = null

    public var type: InlineComponentsSchemasToolChoiceAllowedPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ToolChoiceAllowed {
      check(modeValue != null) { "mode is required" }
      check(toolsValue != null) { "tools is required" }
      check(typeValue != null) { "type is required" }
      return ToolChoiceAllowed(
        mode = mode,
        tools = tools,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ToolChoiceAllowed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ToolChoiceAllowed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ToolChoiceAllowed {
      val jsonDecoder = decoder.requireJsonDecoder("ToolChoiceAllowed")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ToolChoiceAllowed must be a JSON object")
      val mode = json.decodeRequired<InlineComponentsSchemasToolChoiceAllowedPropertiesMode>(raw, "mode")
      val tools = json.decodeRequired<List<Map<String, JsonElement?>>>(raw, "tools")
      val type = json.decodeRequired<InlineComponentsSchemasToolChoiceAllowedPropertiesType>(raw, "type")
      return ToolChoiceAllowed(
        mode = mode,
        tools = tools,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ToolChoiceAllowed) {
      val jsonEncoder = encoder.requireJsonEncoder("ToolChoiceAllowed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mode", json.encodeToJsonElement(value.mode))
        put("tools", json.encodeToJsonElement(value.tools))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun toolChoiceAllowed(block: ToolChoiceAllowed.Builder.() -> Unit): ToolChoiceAllowed = ToolChoiceAllowed
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ToolChoiceAllowed is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
