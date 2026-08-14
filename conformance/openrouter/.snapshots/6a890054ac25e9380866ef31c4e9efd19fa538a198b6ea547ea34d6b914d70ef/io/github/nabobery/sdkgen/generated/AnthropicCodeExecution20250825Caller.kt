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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20250825Caller.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20250825Caller
 */
@Serializable(with = AnthropicCodeExecution20250825Caller.Serializer::class)
public class AnthropicCodeExecution20250825Caller(
  public val toolId: String,
  public val type: InlineAnthropicCodeExecution20250825CallerTypeX15c13a96,
) {
  public class Builder {
    private var toolIdValue: String? = null

    public var toolId: String
      get() = requireNotNull(toolIdValue) { "toolId is required" }
      set(`value`) {
        toolIdValue = value
      }

    private var typeValue: InlineAnthropicCodeExecution20250825CallerTypeX15c13a96? = null

    public var type: InlineAnthropicCodeExecution20250825CallerTypeX15c13a96
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicCodeExecution20250825Caller {
      check(toolIdValue != null) { "toolId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicCodeExecution20250825Caller(
        toolId = toolId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCodeExecution20250825Caller = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCodeExecution20250825Caller> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecution20250825Caller {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecution20250825Caller")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCodeExecution20250825Caller must be a JSON object")
      val toolId = json.decodeRequired<String>(rawObject, "tool_id")
      val type = json.decodeRequired<InlineAnthropicCodeExecution20250825CallerTypeX15c13a96>(rawObject, "type")
      return AnthropicCodeExecution20250825Caller(
        toolId = toolId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecution20250825Caller) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCodeExecution20250825Caller")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_id", value.toolId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCodeExecution20250825Caller(block: AnthropicCodeExecution20250825Caller.Builder.() -> Unit): AnthropicCodeExecution20250825Caller = AnthropicCodeExecution20250825Caller.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCodeExecution20250825Caller is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
