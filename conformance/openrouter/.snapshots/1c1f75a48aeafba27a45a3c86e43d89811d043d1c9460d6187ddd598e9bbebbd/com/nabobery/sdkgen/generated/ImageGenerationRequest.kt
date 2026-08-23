package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Image generation request input
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationRequest
 */
@Serializable(with = ImageGenerationRequest.Serializer::class)
public class ImageGenerationRequest(
  /**
   * The image generation model to use
   */
  public val model: String,
  /**
   * Text description of the desired image
   */
  public val prompt: String,
  /**
   * Normalized aspect ratio of the generated image. Providers clamp to their supported subset.
   */
  public val aspectRatio: InlineImageGenerationRequestAspectRatioX7a47f180? = null,
  /**
   * Background treatment. `transparent` requires an output_format that supports alpha (png or webp).
   */
  public val background: InlineImageGenerationRequestBackgroundX7ea8d8fc? = null,
  inputReferences: List<ContentPartImage>? = null,
  /**
   * Number of images to generate (1-10). Providers that only support single-image generation reject n > 1.
   */
  public val n: Int? = null,
  /**
   * Compression level (0-100) for webp/jpeg output. Ignored for png and by providers without a compression knob.
   */
  public val outputCompression: Int? = null,
  /**
   * Encoding of the returned image bytes. Most models produce raster formats (png, jpeg, webp). SVG is supported by
   * vectorization models (e.g. Quiver) — the SVG markup is UTF-8 base64-encoded in `b64_json`.
   */
  public val outputFormat: InlineImageGenerationRequestOutputFormatXb36c99ed? = null,
  public val provider: ImageGenerationProviderPreferences? = null,
  /**
   * Rendering quality. Providers without a quality knob ignore this.
   */
  public val quality: InlineImageGenerationRequestQualityXf78369d7? = null,
  /**
   * Normalized resolution tier of the generated image. Concrete pixel dimensions are derived per-provider.
   */
  public val resolution: InlineImageGenerationRequestResolutionXb0714d7e? = null,
  /**
   * If specified, the generation will sample deterministically, such that repeated requests with the same seed and
   * parameters should return the same result. Determinism is not guaranteed for all providers.
   */
  public val seed: Int? = null,
  /**
   * Optional. A convenience shorthand for output dimensions — pass a tier ("2K", "4K") or explicit pixels ("2048x2048")
   * and we normalize it to the right dimensions for the chosen provider. A tier size is equivalent to setting
   * `resolution` and combines with `aspect_ratio`. An explicit pixel size is authoritative: a mismatched `resolution`
   * or `aspect_ratio` alongside it is rejected with a 400.
   */
  public val size: String? = null,
  /**
   * If true, partial images are streamed as SSE events as they become available. Only supported by providers with
   * native streaming (currently OpenAI). Non-streaming providers ignore this flag and return a buffered response.
   */
  public val stream: Boolean? = null,
) {
  /**
   * Reference images to guide image-to-image generation, as base64 data URLs or HTTP(S) URLs.
   */
  public val inputReferences: List<ContentPartImage>? =
      inputReferences?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    /**
     * Normalized aspect ratio of the generated image. Providers clamp to their supported subset.
     */
    public var aspectRatio: InlineImageGenerationRequestAspectRatioX7a47f180? = null

    /**
     * Background treatment. `transparent` requires an output_format that supports alpha (png or webp).
     */
    public var background: InlineImageGenerationRequestBackgroundX7ea8d8fc? = null

    private var inputReferencesValue: List<ContentPartImage>? = null

    /**
     * Reference images to guide image-to-image generation, as base64 data URLs or HTTP(S) URLs.
     */
    public var inputReferences: List<ContentPartImage>?
      get() = inputReferencesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        inputReferencesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Number of images to generate (1-10). Providers that only support single-image generation reject n > 1.
     */
    public var n: Int? = null

    /**
     * Compression level (0-100) for webp/jpeg output. Ignored for png and by providers without a compression knob.
     */
    public var outputCompression: Int? = null

    /**
     * Encoding of the returned image bytes. Most models produce raster formats (png, jpeg, webp). SVG is supported by
     * vectorization models (e.g. Quiver) — the SVG markup is UTF-8 base64-encoded in `b64_json`.
     */
    public var outputFormat: InlineImageGenerationRequestOutputFormatXb36c99ed? = null

    public var provider: ImageGenerationProviderPreferences? = null

    /**
     * Rendering quality. Providers without a quality knob ignore this.
     */
    public var quality: InlineImageGenerationRequestQualityXf78369d7? = null

    /**
     * Normalized resolution tier of the generated image. Concrete pixel dimensions are derived per-provider.
     */
    public var resolution: InlineImageGenerationRequestResolutionXb0714d7e? = null

    /**
     * If specified, the generation will sample deterministically, such that repeated requests with the same seed and
     * parameters should return the same result. Determinism is not guaranteed for all providers.
     */
    public var seed: Int? = null

    /**
     * Optional. A convenience shorthand for output dimensions — pass a tier ("2K", "4K") or explicit pixels
     * ("2048x2048") and we normalize it to the right dimensions for the chosen provider. A tier size is equivalent to
     * setting `resolution` and combines with `aspect_ratio`. An explicit pixel size is authoritative: a mismatched
     * `resolution` or `aspect_ratio` alongside it is rejected with a 400.
     */
    public var size: String? = null

    /**
     * If true, partial images are streamed as SSE events as they become available. Only supported by providers with
     * native streaming (currently OpenAI). Non-streaming providers ignore this flag and return a buffered response.
     */
    public var stream: Boolean? = null

    public fun build(): ImageGenerationRequest {
      check(modelValue != null) { "model is required" }
      check(promptValue != null) { "prompt is required" }
      return ImageGenerationRequest(
        model = model,
        prompt = prompt,
        aspectRatio = aspectRatio,
        background = background,
        inputReferences = inputReferences,
        n = n,
        outputCompression = outputCompression,
        outputFormat = outputFormat,
        provider = provider,
        quality = quality,
        resolution = resolution,
        seed = seed,
        size = size,
        stream = stream,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenerationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenerationRequest must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val prompt = json.decodeRequired<String>(rawObject, "prompt")
      return ImageGenerationRequest(
        model = model,
        prompt = prompt,
        aspectRatio = rawObject["aspect_ratio"]?.let { json.decodeFromJsonElement<InlineImageGenerationRequestAspectRatioX7a47f180>(it) },
        background = rawObject["background"]?.let { json.decodeFromJsonElement<InlineImageGenerationRequestBackgroundX7ea8d8fc>(it) },
        inputReferences = rawObject["input_references"]?.let { json.decodeFromJsonElement<List<ContentPartImage>>(it) },
        n = rawObject["n"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputCompression = rawObject["output_compression"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputFormat = rawObject["output_format"]?.let { json.decodeFromJsonElement<InlineImageGenerationRequestOutputFormatXb36c99ed>(it) },
        provider = rawObject["provider"]?.let { json.decodeFromJsonElement<ImageGenerationProviderPreferences>(it) },
        quality = rawObject["quality"]?.let { json.decodeFromJsonElement<InlineImageGenerationRequestQualityXf78369d7>(it) },
        resolution = rawObject["resolution"]?.let { json.decodeFromJsonElement<InlineImageGenerationRequestResolutionXb0714d7e>(it) },
        seed = rawObject["seed"]?.let { json.decodeFromJsonElement<Int>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<String>(it) },
        stream = rawObject["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("prompt", value.prompt)
        value.aspectRatio?.let { put("aspect_ratio", json.encodeToJsonElement(it)) }
        value.background?.let { put("background", json.encodeToJsonElement(it)) }
        value.inputReferences?.let { put("input_references", json.encodeToJsonElement(it)) }
        value.n?.let { put("n", json.encodeToJsonElement(it)) }
        value.outputCompression?.let { put("output_compression", json.encodeToJsonElement(it)) }
        value.outputFormat?.let { put("output_format", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.quality?.let { put("quality", json.encodeToJsonElement(it)) }
        value.resolution?.let { put("resolution", json.encodeToJsonElement(it)) }
        value.seed?.let { put("seed", json.encodeToJsonElement(it)) }
        value.size?.let { put("size", it) }
        value.stream?.let { put("stream", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationRequest(block: ImageGenerationRequest.Builder.() -> Unit): ImageGenerationRequest = ImageGenerationRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
