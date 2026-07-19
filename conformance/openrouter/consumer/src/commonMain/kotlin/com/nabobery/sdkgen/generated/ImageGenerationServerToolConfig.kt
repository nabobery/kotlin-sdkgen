package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:image_generation server tool. Accepts all image_config params (aspect_ratio,
 * quality, size, background, output_format, output_compression, moderation, etc.) plus a model field.
 */
@Serializable(with = ImageGenerationServerToolConfig.Serializer::class)
public class ImageGenerationServerToolConfig(
  /**
   * Which image generation model to use (e.g. "openai/gpt-5-image"). Defaults to "openai/gpt-5-image".
   */
  public val model: String? = null,
) {
  public class Builder {
    /**
     * Which image generation model to use (e.g. "openai/gpt-5-image"). Defaults to "openai/gpt-5-image".
     */
    public var model: String? = null

    public fun build(): ImageGenerationServerToolConfig = ImageGenerationServerToolConfig(
      model = model,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationServerToolConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenerationServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationServerToolConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenerationServerToolConfig must be a JSON object")
      return ImageGenerationServerToolConfig(
        model = raw["model"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.model?.let { put("model", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationServerToolConfig(block: ImageGenerationServerToolConfig.Builder.() ->
  Unit): ImageGenerationServerToolConfig = ImageGenerationServerToolConfig.build(block)
