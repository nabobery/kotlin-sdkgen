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

@Serializable
public data class SubagentServerToolOpenRouterView(
  public val parameters: SubagentServerToolConfig? = null,
  public val type: InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: delegates self-contained tasks to a smaller, cheaper, faster worker model (any
 * OpenRouter model) mid-generation and returns its outcome. The worker may run as a sub-agent with its own tools.
 */
@Serializable(with = SubagentServerToolOpenRouter.Serializer::class)
public class SubagentServerToolOpenRouter(
  public val type: InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType,
  public val parameters: SubagentServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType? = null

    public var type: InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: SubagentServerToolConfig? = null

    public fun build(): SubagentServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return SubagentServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubagentServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubagentServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubagentServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("SubagentServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SubagentServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType>(raw, "type")
      return SubagentServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<SubagentServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubagentServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("SubagentServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subagentServerToolOpenRouter(block: SubagentServerToolOpenRouter.Builder.() ->
  Unit): SubagentServerToolOpenRouter = SubagentServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("SubagentServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
