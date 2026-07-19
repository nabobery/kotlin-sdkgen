package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * Pricing information for the model
 */
@Serializable(with = PublicPricing.Serializer::class)
public class PublicPricing(
  /**
   * Price in USD per token for completion (output) generation
   */
  public val completion: String,
  /**
   * Price in USD per token for prompt (input) processing
   */
  public val prompt: String,
  /**
   * Price in USD per audio input token
   */
  public val audio: String? = null,
  /**
   * Price in USD per audio output token
   */
  public val audioOutput: String? = null,
  /**
   * Fractional discount applied to this endpoint's pricing; the price is multiplied by (1 - discount) (0 = no discount,
   * 1 = free)
   */
  public val discount: Double? = null,
  /**
   * Price in USD per input image
   */
  public val image: String? = null,
  /**
   * Price in USD per output image
   */
  public val imageOutput: String? = null,
  /**
   * Price in USD per image token
   */
  public val imageToken: String? = null,
  /**
   * Price in USD per cached audio input token
   */
  public val inputAudioCache: String? = null,
  /**
   * Price in USD per cached input token (read)
   */
  public val inputCacheRead: String? = null,
  /**
   * Price per cache-write token, in USD per token. For providers with multiple cache TTLs (e.g. Anthropic), this is the
   * default (5-minute) cache-write rate.
   */
  public val inputCacheWrite: String? = null,
  /**
   * Price per 1-hour cache-write token, in USD per token. Only present for providers that price an extended (1-hour)
   * cache TTL separately, such as Anthropic.
   */
  public val inputCacheWrite1h: String? = null,
  /**
   * Price in USD per internal reasoning token
   */
  public val internalReasoning: String? = null,
  /**
   * Conditional overrides of the base pricing (e.g. long-context or time-based pricing). An entry applies when all of
   * its condition fields (e.g. min_prompt_tokens, or the utc_start/utc_end time window) match the request; among
   * applicable entries, later entries win per key; price keys absent from an entry inherit the base price. The
   * top-level pricing keys always reflect the price that applies under default conditions.
   */
  public val overrides: List<PricingOverride>? = null,
  /**
   * Price in USD per request
   */
  public val request: String? = null,
  /**
   * Price in USD per web search
   */
  public val webSearch: String? = null,
) {
  public class Builder {
    private var completionValue: String? = null

    public var completion: String
      get() = requireNotNull(completionValue) { "completion is required" }
      set(`value`) {
        completionValue = value
      }

    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    /**
     * Price in USD per audio input token
     */
    public var audio: String? = null

    /**
     * Price in USD per audio output token
     */
    public var audioOutput: String? = null

    /**
     * Fractional discount applied to this endpoint's pricing; the price is multiplied by (1 - discount) (0 = no
     * discount, 1 = free)
     */
    public var discount: Double? = null

    /**
     * Price in USD per input image
     */
    public var image: String? = null

    /**
     * Price in USD per output image
     */
    public var imageOutput: String? = null

    /**
     * Price in USD per image token
     */
    public var imageToken: String? = null

    /**
     * Price in USD per cached audio input token
     */
    public var inputAudioCache: String? = null

    /**
     * Price in USD per cached input token (read)
     */
    public var inputCacheRead: String? = null

    /**
     * Price per cache-write token, in USD per token. For providers with multiple cache TTLs (e.g. Anthropic), this is
     * the default (5-minute) cache-write rate.
     */
    public var inputCacheWrite: String? = null

    /**
     * Price per 1-hour cache-write token, in USD per token. Only present for providers that price an extended (1-hour)
     * cache TTL separately, such as Anthropic.
     */
    public var inputCacheWrite1h: String? = null

    /**
     * Price in USD per internal reasoning token
     */
    public var internalReasoning: String? = null

    /**
     * Conditional overrides of the base pricing (e.g. long-context or time-based pricing). An entry applies when all of
     * its condition fields (e.g. min_prompt_tokens, or the utc_start/utc_end time window) match the request; among
     * applicable entries, later entries win per key; price keys absent from an entry inherit the base price. The
     * top-level pricing keys always reflect the price that applies under default conditions.
     */
    public var overrides: List<PricingOverride>? = null

    /**
     * Price in USD per request
     */
    public var request: String? = null

    /**
     * Price in USD per web search
     */
    public var webSearch: String? = null

    public fun build(): PublicPricing {
      check(completionValue != null) { "completion is required" }
      check(promptValue != null) { "prompt is required" }
      return PublicPricing(
        completion = completion,
        prompt = prompt,
        audio = audio,
        audioOutput = audioOutput,
        discount = discount,
        image = image,
        imageOutput = imageOutput,
        imageToken = imageToken,
        inputAudioCache = inputAudioCache,
        inputCacheRead = inputCacheRead,
        inputCacheWrite = inputCacheWrite,
        inputCacheWrite1h = inputCacheWrite1h,
        internalReasoning = internalReasoning,
        overrides = overrides,
        request = request,
        webSearch = webSearch,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PublicPricing = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PublicPricing> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PublicPricing {
      val jsonDecoder = decoder.requireJsonDecoder("PublicPricing")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("PublicPricing must be a JSON object")
      val completion = json.decodeRequired<String>(raw, "completion")
      val prompt = json.decodeRequired<String>(raw, "prompt")
      return PublicPricing(
        completion = completion,
        prompt = prompt,
        audio = raw["audio"]?.let { json.decodeFromJsonElement<String>(it) },
        audioOutput = raw["audio_output"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = raw["discount"]?.let { json.decodeFromJsonElement<Double>(it) },
        image = raw["image"]?.let { json.decodeFromJsonElement<String>(it) },
        imageOutput = raw["image_output"]?.let { json.decodeFromJsonElement<String>(it) },
        imageToken = raw["image_token"]?.let { json.decodeFromJsonElement<String>(it) },
        inputAudioCache = raw["input_audio_cache"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheRead = raw["input_cache_read"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheWrite = raw["input_cache_write"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheWrite1h = raw["input_cache_write_1h"]?.let { json.decodeFromJsonElement<String>(it) },
        internalReasoning = raw["internal_reasoning"]?.let { json.decodeFromJsonElement<String>(it) },
        overrides = raw["overrides"]?.let { json.decodeFromJsonElement<List<PricingOverride>>(it) },
        request = raw["request"]?.let { json.decodeFromJsonElement<String>(it) },
        webSearch = raw["web_search"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PublicPricing) {
      val jsonEncoder = encoder.requireJsonEncoder("PublicPricing")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion", value.completion)
        put("prompt", value.prompt)
        value.audio?.let { put("audio", it) }
        value.audioOutput?.let { put("audio_output", it) }
        value.discount?.let { put("discount", json.encodeToJsonElement(it)) }
        value.image?.let { put("image", it) }
        value.imageOutput?.let { put("image_output", it) }
        value.imageToken?.let { put("image_token", it) }
        value.inputAudioCache?.let { put("input_audio_cache", it) }
        value.inputCacheRead?.let { put("input_cache_read", it) }
        value.inputCacheWrite?.let { put("input_cache_write", it) }
        value.inputCacheWrite1h?.let { put("input_cache_write_1h", it) }
        value.internalReasoning?.let { put("internal_reasoning", it) }
        value.overrides?.let { put("overrides", json.encodeToJsonElement(it)) }
        value.request?.let { put("request", it) }
        value.webSearch?.let { put("web_search", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun publicPricing(block: PublicPricing.Builder.() -> Unit): PublicPricing = PublicPricing.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PublicPricing is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
