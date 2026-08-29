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
public data class ImageGenerationServerToolOpenRouterView(
  public val parameters: ImageGenerationServerToolConfig? = null,
  public val type: InlineImageGenerationServerToolOpenRouterTypeX37e47550,
)

/**
 * OpenRouter built-in server tool: generates images from text prompts using an image generation model
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool_OpenRouter
 */
@Serializable(with = ImageGenerationServerToolOpenRouter.Serializer::class)
public class ImageGenerationServerToolOpenRouter(
  public val type: InlineImageGenerationServerToolOpenRouterTypeX37e47550,
  public val parameters: ImageGenerationServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineImageGenerationServerToolOpenRouterTypeX37e47550? = null

    public var type: InlineImageGenerationServerToolOpenRouterTypeX37e47550
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: ImageGenerationServerToolConfig? = null

    public fun build(): ImageGenerationServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return ImageGenerationServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationServerToolOpenRouter = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenerationServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationServerToolOpenRouter")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenerationServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineImageGenerationServerToolOpenRouterTypeX37e47550>(rawObject, "type")
      return ImageGenerationServerToolOpenRouter(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<ImageGenerationServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationServerToolOpenRouter(block: ImageGenerationServerToolOpenRouter.Builder.() -> Unit): ImageGenerationServerToolOpenRouter = ImageGenerationServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
