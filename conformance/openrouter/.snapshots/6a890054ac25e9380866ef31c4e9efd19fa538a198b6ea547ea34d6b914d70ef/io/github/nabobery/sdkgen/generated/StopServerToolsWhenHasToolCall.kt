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
 * Stop after a tool with this name has been called.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenHasToolCall
 */
@Serializable(with = StopServerToolsWhenHasToolCall.Serializer::class)
public class StopServerToolsWhenHasToolCall(
  public val toolName: String,
  public val type: InlineStopServerToolsWhenHasToolCallTypeX57d5992a,
) {
  public class Builder {
    private var toolNameValue: String? = null

    public var toolName: String
      get() = requireNotNull(toolNameValue) { "toolName is required" }
      set(`value`) {
        toolNameValue = value
      }

    private var typeValue: InlineStopServerToolsWhenHasToolCallTypeX57d5992a? = null

    public var type: InlineStopServerToolsWhenHasToolCallTypeX57d5992a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StopServerToolsWhenHasToolCall {
      check(toolNameValue != null) { "toolName is required" }
      check(typeValue != null) { "type is required" }
      return StopServerToolsWhenHasToolCall(
        toolName = toolName,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StopServerToolsWhenHasToolCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StopServerToolsWhenHasToolCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenHasToolCall {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenHasToolCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StopServerToolsWhenHasToolCall must be a JSON object")
      val toolName = json.decodeRequired<String>(rawObject, "tool_name")
      val type = json.decodeRequired<InlineStopServerToolsWhenHasToolCallTypeX57d5992a>(rawObject, "type")
      return StopServerToolsWhenHasToolCall(
        toolName = toolName,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenHasToolCall) {
      val jsonEncoder = encoder.requireJsonEncoder("StopServerToolsWhenHasToolCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_name", value.toolName)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stopServerToolsWhenHasToolCall(block: StopServerToolsWhenHasToolCall.Builder.() -> Unit): StopServerToolsWhenHasToolCall = StopServerToolsWhenHasToolCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StopServerToolsWhenHasToolCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
