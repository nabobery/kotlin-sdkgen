package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:image_generation server tool. Accepts all image_config params (aspect_ratio,
 * quality, size, background, output_format, output_compression, moderation, etc.) plus a model field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerToolConfig
 */
@Serializable(with = ImageGenerationServerToolConfig.Serializer::class)
public class ImageGenerationServerToolConfig(
  /**
   * Which image generation model to use (e.g. "openai/gpt-5-image"). Defaults to "openai/gpt-5-image".
   */
  public val model: String? = null,
  additionalProperties: Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties:
      Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50> =
      copyAndValidateImageGenerationServerToolConfigAdditionalProperties(additionalProperties)

  public class Builder {
    /**
     * Which image generation model to use (e.g. "openai/gpt-5-image"). Defaults to "openai/gpt-5-image".
     */
    public var model: String? = null

    private var additionalPropertiesValue:
        Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties:
        Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): ImageGenerationServerToolConfig = ImageGenerationServerToolConfig(
      model = model,
      additionalProperties = additionalProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenerationServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenerationServerToolConfig must be a JSON object")
      return ImageGenerationServerToolConfig(
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("model") }.mapValues { (_, element) -> json.decodeFromJsonElement<InlineImageGenerationServerToolConfigAdditionalValueXdf221d50>(element) }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.model?.let { put("model", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("model")) { "ImageGenerationServerToolConfig additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, json.encodeToJsonElement(additionalValue))
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateImageGenerationServerToolConfigAdditionalProperties(additionalProperties: Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50>): Map<String, InlineImageGenerationServerToolConfigAdditionalValueXdf221d50> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("model") }
  require(collision == null) { "ImageGenerationServerToolConfig additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun imageGenerationServerToolConfig(block: ImageGenerationServerToolConfig.Builder.() -> Unit): ImageGenerationServerToolConfig = ImageGenerationServerToolConfig.build(block)
