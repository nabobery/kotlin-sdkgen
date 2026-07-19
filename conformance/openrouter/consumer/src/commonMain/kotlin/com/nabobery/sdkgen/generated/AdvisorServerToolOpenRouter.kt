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
public data class AdvisorServerToolOpenRouterView(
  public val parameters: AdvisorServerToolConfig? = null,
  public val type: InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: consults a higher-intelligence advisor model (any OpenRouter model) for guidance
 * mid-generation and returns its response. The advisor may run as a sub-agent with its own tools. Include multiple
 * entries to offer several named advisors; at most one entry may omit `name` to act as the default advisor.
 */
@Serializable(with = AdvisorServerToolOpenRouter.Serializer::class)
public class AdvisorServerToolOpenRouter(
  public val type: InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType,
  public val parameters: AdvisorServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType? = null

    public var type: InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: AdvisorServerToolConfig? = null

    public fun build(): AdvisorServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return AdvisorServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AdvisorServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AdvisorServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AdvisorServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("AdvisorServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AdvisorServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAdvisorServerToolOpenRouterPropertiesType>(raw, "type")
      return AdvisorServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<AdvisorServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AdvisorServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("AdvisorServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun advisorServerToolOpenRouter(block: AdvisorServerToolOpenRouter.Builder.() ->
  Unit): AdvisorServerToolOpenRouter = AdvisorServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AdvisorServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
