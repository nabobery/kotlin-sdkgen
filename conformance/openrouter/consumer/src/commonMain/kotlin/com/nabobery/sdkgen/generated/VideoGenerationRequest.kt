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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest.
 */
@Serializable(with = VideoGenerationRequest.Serializer::class)
public class VideoGenerationRequest(
  public val model: String,
  public val prompt: String,
  /**
   * Aspect ratio of the generated video
   */
  public val aspectRatio:
      InlineComponentsSchemasVideoGenerationRequestPropertiesAspectRatio? = null,
  /**
   * URL to receive a webhook notification when the video generation job completes. Overrides the workspace-level
   * default callback URL if set. Must be HTTPS.
   */
  public val callbackUrl: String? = null,
  /**
   * Duration of the generated video in seconds
   */
  public val duration: Int? = null,
  /**
   * Images to use as the first and/or last frame of the generated video. Each image must specify a frame_type of
   * first_frame or last_frame.
   */
  public val frameImages: List<FrameImage>? = null,
  /**
   * Whether to generate audio alongside the video. Defaults to the endpoint's generate_audio capability flag, false if
   * not set.
   */
  public val generateAudio: Boolean? = null,
  /**
   * Reference assets to guide video generation. Accepts image, audio, and video references. Audio and video references
   * are only honored by providers that support them (currently BytePlus Seedance 2.0); other providers use image
   * references and ignore the rest.
   */
  public val inputReferences: List<InputReference>? = null,
  /**
   * Provider-specific passthrough configuration
   */
  public val provider: InlineComponentsSchemasVideoGenerationRequestPropertiesProvider? = null,
  /**
   * Resolution of the generated video
   */
  public val resolution: InlineComponentsSchemasVideoGenerationRequestPropertiesResolution? = null,
  /**
   * If specified, the generation will sample deterministically, such that repeated requests with the same seed and
   * parameters should return the same result. Determinism is not guaranteed for all providers.
   */
  public val seed: Int? = null,
  /**
   * Exact pixel dimensions of the generated video in "WIDTHxHEIGHT" format (e.g. "1280x720"). Interchangeable with
   * resolution + aspect_ratio.
   */
  public val size: String? = null,
) {
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
     * Aspect ratio of the generated video
     */
    public var aspectRatio: InlineComponentsSchemasVideoGenerationRequestPropertiesAspectRatio? =
        null

    /**
     * URL to receive a webhook notification when the video generation job completes. Overrides the workspace-level
     * default callback URL if set. Must be HTTPS.
     */
    public var callbackUrl: String? = null

    /**
     * Duration of the generated video in seconds
     */
    public var duration: Int? = null

    /**
     * Images to use as the first and/or last frame of the generated video. Each image must specify a frame_type of
     * first_frame or last_frame.
     */
    public var frameImages: List<FrameImage>? = null

    /**
     * Whether to generate audio alongside the video. Defaults to the endpoint's generate_audio capability flag, false
     * if not set.
     */
    public var generateAudio: Boolean? = null

    /**
     * Reference assets to guide video generation. Accepts image, audio, and video references. Audio and video
     * references are only honored by providers that support them (currently BytePlus Seedance 2.0); other providers use
     * image references and ignore the rest.
     */
    public var inputReferences: List<InputReference>? = null

    /**
     * Provider-specific passthrough configuration
     */
    public var provider: InlineComponentsSchemasVideoGenerationRequestPropertiesProvider? = null

    /**
     * Resolution of the generated video
     */
    public var resolution: InlineComponentsSchemasVideoGenerationRequestPropertiesResolution? = null

    /**
     * If specified, the generation will sample deterministically, such that repeated requests with the same seed and
     * parameters should return the same result. Determinism is not guaranteed for all providers.
     */
    public var seed: Int? = null

    /**
     * Exact pixel dimensions of the generated video in "WIDTHxHEIGHT" format (e.g. "1280x720"). Interchangeable with
     * resolution + aspect_ratio.
     */
    public var size: String? = null

    public fun build(): VideoGenerationRequest {
      check(modelValue != null) { "model is required" }
      check(promptValue != null) { "prompt is required" }
      return VideoGenerationRequest(
        model = model,
        prompt = prompt,
        aspectRatio = aspectRatio,
        callbackUrl = callbackUrl,
        duration = duration,
        frameImages = frameImages,
        generateAudio = generateAudio,
        inputReferences = inputReferences,
        provider = provider,
        resolution = resolution,
        seed = seed,
        size = size,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VideoGenerationRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<VideoGenerationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoGenerationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("VideoGenerationRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("VideoGenerationRequest must be a JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      val prompt = json.decodeRequired<String>(raw, "prompt")
      return VideoGenerationRequest(
        model = model,
        prompt = prompt,
        aspectRatio = raw["aspect_ratio"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasVideoGenerationRequestPropertiesAspectRatio>(it) },
        callbackUrl = raw["callback_url"]?.let { json.decodeFromJsonElement<String>(it) },
        duration = raw["duration"]?.let { json.decodeFromJsonElement<Int>(it) },
        frameImages = raw["frame_images"]?.let { json.decodeFromJsonElement<List<FrameImage>>(it) },
        generateAudio = raw["generate_audio"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        inputReferences = raw["input_references"]?.let { json.decodeFromJsonElement<List<InputReference>>(it) },
        provider = raw["provider"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasVideoGenerationRequestPropertiesProvider>(it) },
        resolution = raw["resolution"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasVideoGenerationRequestPropertiesResolution>(it) },
        seed = raw["seed"]?.let { json.decodeFromJsonElement<Int>(it) },
        size = raw["size"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: VideoGenerationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("VideoGenerationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("prompt", value.prompt)
        value.aspectRatio?.let { put("aspect_ratio", json.encodeToJsonElement(it)) }
        value.callbackUrl?.let { put("callback_url", it) }
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.frameImages?.let { put("frame_images", json.encodeToJsonElement(it)) }
        value.generateAudio?.let { put("generate_audio", json.encodeToJsonElement(it)) }
        value.inputReferences?.let { put("input_references", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.resolution?.let { put("resolution", json.encodeToJsonElement(it)) }
        value.seed?.let { put("seed", json.encodeToJsonElement(it)) }
        value.size?.let { put("size", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun videoGenerationRequest(block: VideoGenerationRequest.Builder.() -> Unit): VideoGenerationRequest =
  VideoGenerationRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("VideoGenerationRequest is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
