package io.github.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class ToolChoiceAllowedView internal constructor(
  public val mode: InlineToolChoiceAllowedModeX9d3cd891,
  public val tools: List<Map<String, JsonElement?>>,
  public val type: InlineToolChoiceAllowedTypeX64a69ab1,
)

/**
 * Constrains the model to a pre-defined set of allowed tools
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed
 */
@Serializable(with = ToolChoiceAllowed.Serializer::class)
public class ToolChoiceAllowed(
  public val mode: InlineToolChoiceAllowedModeX9d3cd891,
  tools: List<Map<String, JsonElement?>>,
  public val type: InlineToolChoiceAllowedTypeX64a69ab1,
) {
  public val tools: List<Map<String, JsonElement?>> = tools.map { element0 -> element0.toMap() }

  public class Builder {
    private var modeValue: InlineToolChoiceAllowedModeX9d3cd891? = null

    public var mode: InlineToolChoiceAllowedModeX9d3cd891
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var toolsValue: List<Map<String, JsonElement?>>? = null

    public var tools: List<Map<String, JsonElement?>>
      get() = requireNotNull(toolsValue) { "tools is required" }.map { element0 -> element0.toMap() }
      set(`value`) {
        toolsValue = value.map { element0 -> element0.toMap() }
      }

    private var typeValue: InlineToolChoiceAllowedTypeX64a69ab1? = null

    public var type: InlineToolChoiceAllowedTypeX64a69ab1
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

  internal object Serializer : KSerializer<ToolChoiceAllowed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ToolChoiceAllowed {
      val jsonDecoder = decoder.requireJsonDecoder("ToolChoiceAllowed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ToolChoiceAllowed must be a JSON object")
      val mode = json.decodeRequired<InlineToolChoiceAllowedModeX9d3cd891>(rawObject, "mode")
      val tools = json.decodeRequired<List<Map<String, JsonElement?>>>(rawObject, "tools")
      val type = json.decodeRequired<InlineToolChoiceAllowedTypeX64a69ab1>(rawObject, "type")
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

public fun toolChoiceAllowed(block: ToolChoiceAllowed.Builder.() -> Unit): ToolChoiceAllowed = ToolChoiceAllowed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ToolChoiceAllowed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
