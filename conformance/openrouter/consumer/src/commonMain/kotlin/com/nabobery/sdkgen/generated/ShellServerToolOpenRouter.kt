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
public data class ShellServerToolOpenRouterView(
  public val parameters: ShellServerToolConfig? = null,
  public val type: InlineComponentsSchemasShellServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: runs shell commands server-side in a sandboxed container (a sandbox-backed clone of
 * OpenAI's hosted shell tool)
 */
@Serializable(with = ShellServerToolOpenRouter.Serializer::class)
public class ShellServerToolOpenRouter(
  public val type: InlineComponentsSchemasShellServerToolOpenRouterPropertiesType,
  public val parameters: ShellServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasShellServerToolOpenRouterPropertiesType? = null

    public var type: InlineComponentsSchemasShellServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: ShellServerToolConfig? = null

    public fun build(): ShellServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return ShellServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShellServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ShellServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShellServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("ShellServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ShellServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasShellServerToolOpenRouterPropertiesType>(raw, "type")
      return ShellServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<ShellServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShellServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("ShellServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shellServerToolOpenRouter(block: ShellServerToolOpenRouter.Builder.() -> Unit): ShellServerToolOpenRouter =
  ShellServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShellServerToolOpenRouter is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
