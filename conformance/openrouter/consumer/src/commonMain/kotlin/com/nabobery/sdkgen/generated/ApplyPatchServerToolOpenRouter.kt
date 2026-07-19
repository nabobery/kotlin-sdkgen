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
public data class ApplyPatchServerToolOpenRouterView(
  public val parameters: ApplyPatchServerToolConfig? = null,
  public val type: InlineComponentsSchemasApplyPatchServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: validates V4A diff patches for file operations (create, update, delete). Restricted
 * to the Responses API.
 */
@Serializable(with = ApplyPatchServerToolOpenRouter.Serializer::class)
public class ApplyPatchServerToolOpenRouter(
  public val type: InlineComponentsSchemasApplyPatchServerToolOpenRouterPropertiesType,
  public val parameters: ApplyPatchServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasApplyPatchServerToolOpenRouterPropertiesType? =
        null

    public var type: InlineComponentsSchemasApplyPatchServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: ApplyPatchServerToolConfig? = null

    public fun build(): ApplyPatchServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return ApplyPatchServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplyPatchServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ApplyPatchServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasApplyPatchServerToolOpenRouterPropertiesType>(raw, "type")
      return ApplyPatchServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<ApplyPatchServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchServerToolOpenRouter(block: ApplyPatchServerToolOpenRouter.Builder.() ->
  Unit): ApplyPatchServerToolOpenRouter = ApplyPatchServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ApplyPatchServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
