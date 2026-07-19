package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ImageGenerationServerToolView(
  public val background:
      InlineComponentsSchemasImageGenerationServerToolPropertiesBackground? = null,
  @SerialName("input_fidelity")
  public val inputFidelity:
      InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity? = null,
  @SerialName("input_image_mask")
  public val inputImageMask:
      InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask? = null,
  public val model: String? = null,
  public val moderation:
      InlineComponentsSchemasImageGenerationServerToolPropertiesModeration? = null,
  @SerialName("output_compression")
  public val outputCompression: Int? = null,
  @SerialName("output_format")
  public val outputFormat:
      InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat? = null,
  @SerialName("partial_images")
  public val partialImages: Int? = null,
  public val quality: InlineComponentsSchemasImageGenerationServerToolPropertiesQuality? = null,
  public val size: String? = null,
  public val type: InlineComponentsSchemasImageGenerationServerToolPropertiesType,
)

/**
 * Image generation tool configuration
 */
@Serializable(with = ImageGenerationServerTool.Serializer::class)
public class ImageGenerationServerTool(
  public val type: InlineComponentsSchemasImageGenerationServerToolPropertiesType,
  public val background:
      InlineComponentsSchemasImageGenerationServerToolPropertiesBackground? = null,
  public val inputFidelity:
      InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity? = null,
  public val inputImageMask:
      InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask? = null,
  public val model: String? = null,
  public val moderation:
      InlineComponentsSchemasImageGenerationServerToolPropertiesModeration? = null,
  public val outputCompression: Int? = null,
  public val outputFormat:
      InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat? = null,
  public val partialImages: Int? = null,
  public val quality: InlineComponentsSchemasImageGenerationServerToolPropertiesQuality? = null,
  public val size: String? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasImageGenerationServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasImageGenerationServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var background: InlineComponentsSchemasImageGenerationServerToolPropertiesBackground? =
        null

    public var inputFidelity:
        InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity? = null

    public var inputImageMask:
        InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask? = null

    public var model: String? = null

    public var moderation: InlineComponentsSchemasImageGenerationServerToolPropertiesModeration? =
        null

    public var outputCompression: Int? = null

    public var outputFormat: InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat?
        = null

    public var partialImages: Int? = null

    public var quality: InlineComponentsSchemasImageGenerationServerToolPropertiesQuality? = null

    public var size: String? = null

    public fun build(): ImageGenerationServerTool {
      check(typeValue != null) { "type is required" }
      return ImageGenerationServerTool(
        type = type,
        background = background,
        inputFidelity = inputFidelity,
        inputImageMask = inputImageMask,
        model = model,
        moderation = moderation,
        outputCompression = outputCompression,
        outputFormat = outputFormat,
        partialImages = partialImages,
        quality = quality,
        size = size,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenerationServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenerationServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasImageGenerationServerToolPropertiesType>(raw, "type")
      return ImageGenerationServerTool(
        type = type,
        background = raw["background"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesBackground>(it) },
        inputFidelity = raw["input_fidelity"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesInputFidelity?>(element) },
        inputImageMask = raw["input_image_mask"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask>(it) },
        model = raw["model"]?.let { json.decodeFromJsonElement<String>(it) },
        moderation = raw["moderation"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesModeration>(it) },
        outputCompression = raw["output_compression"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputFormat = raw["output_format"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat>(it) },
        partialImages = raw["partial_images"]?.let { json.decodeFromJsonElement<Int>(it) },
        quality = raw["quality"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesQuality>(it) },
        size = raw["size"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.background?.let { put("background", json.encodeToJsonElement(it)) }
        value.inputFidelity?.let { put("input_fidelity", json.encodeToJsonElement(it)) }
        value.inputImageMask?.let { put("input_image_mask", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.moderation?.let { put("moderation", json.encodeToJsonElement(it)) }
        value.outputCompression?.let { put("output_compression", json.encodeToJsonElement(it)) }
        value.outputFormat?.let { put("output_format", json.encodeToJsonElement(it)) }
        value.partialImages?.let { put("partial_images", json.encodeToJsonElement(it)) }
        value.quality?.let { put("quality", json.encodeToJsonElement(it)) }
        value.size?.let { put("size", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationServerTool(block: ImageGenerationServerTool.Builder.() -> Unit): ImageGenerationServerTool =
  ImageGenerationServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationServerTool is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
