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

@Serializable
public data class FusionServerToolOpenRouterView(
  public val parameters: FusionServerToolConfig? = null,
  public val type: InlineFusionServerToolOpenRouterTypeX5f638c60,
)

/**
 * OpenRouter built-in server tool: fans out the user prompt to a panel of analysis models, then asks a judge model to
 * summarize their collective output as structured JSON the outer model can synthesize from.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionServerTool_OpenRouter
 */
@Serializable(with = FusionServerToolOpenRouter.Serializer::class)
public class FusionServerToolOpenRouter(
  public val type: InlineFusionServerToolOpenRouterTypeX5f638c60,
  public val parameters: FusionServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineFusionServerToolOpenRouterTypeX5f638c60? = null

    public var type: InlineFusionServerToolOpenRouterTypeX5f638c60
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: FusionServerToolConfig? = null

    public fun build(): FusionServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return FusionServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionServerToolOpenRouter = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("FusionServerToolOpenRouter")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineFusionServerToolOpenRouterTypeX5f638c60>(rawObject, "type")
      return FusionServerToolOpenRouter(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<FusionServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionServerToolOpenRouter(block: FusionServerToolOpenRouter.Builder.() -> Unit): FusionServerToolOpenRouter = FusionServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
