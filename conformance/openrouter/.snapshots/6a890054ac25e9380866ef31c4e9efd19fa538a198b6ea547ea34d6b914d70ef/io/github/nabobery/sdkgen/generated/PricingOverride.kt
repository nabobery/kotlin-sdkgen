package io.github.nabobery.sdkgen.generated

import kotlin.Double
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A conditional override of the base pricing. An entry applies only when all of its condition fields (e.g.
 * min_prompt_tokens, or the utc_start/utc_end time window) match the request; among applicable entries, later entries
 * win per price key; price keys absent from an entry inherit the base price.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PricingOverride
 */
@Serializable(with = PricingOverride.Serializer::class)
public class PricingOverride(
  /**
   * Overridden price in USD per audio input token
   */
  public val audio: String? = null,
  /**
   * Overridden price in USD per token for completion (output) generation
   */
  public val completion: String? = null,
  /**
   * Overridden price in USD per cached audio input token
   */
  public val inputAudioCache: String? = null,
  /**
   * Overridden price in USD per cached input token (read)
   */
  public val inputCacheRead: String? = null,
  /**
   * Overridden price in USD per cache-write token
   */
  public val inputCacheWrite: String? = null,
  /**
   * Overridden price in USD per 1-hour cache-write token
   */
  public val inputCacheWrite1h: String? = null,
  /**
   * Condition: the entry applies when the total prompt tokens of a request are strictly greater than this threshold
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val minPromptTokens: Double? = null,
  /**
   * Overridden price in USD per token for prompt (input) processing
   */
  public val prompt: String? = null,
  /**
   * Condition: exclusive end of a daily UTC time window as an HHMM clock number (e.g. 400 = 04:00)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val utcEnd: Double? = null,
  /**
   * Condition: inclusive start of a daily UTC time window as an HHMM clock number (e.g. 100 = 01:00, 1030 = 10:30). The
   * entry applies while the current UTC time is inside the half-open window [utc_start, utc_end), which may wrap past
   * midnight (utc_start > utc_end).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val utcStart: Double? = null,
) {
  public class Builder {
    /**
     * Overridden price in USD per audio input token
     */
    public var audio: String? = null

    /**
     * Overridden price in USD per token for completion (output) generation
     */
    public var completion: String? = null

    /**
     * Overridden price in USD per cached audio input token
     */
    public var inputAudioCache: String? = null

    /**
     * Overridden price in USD per cached input token (read)
     */
    public var inputCacheRead: String? = null

    /**
     * Overridden price in USD per cache-write token
     */
    public var inputCacheWrite: String? = null

    /**
     * Overridden price in USD per 1-hour cache-write token
     */
    public var inputCacheWrite1h: String? = null

    /**
     * Condition: the entry applies when the total prompt tokens of a request are strictly greater than this threshold
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var minPromptTokens: Double? = null

    /**
     * Overridden price in USD per token for prompt (input) processing
     */
    public var prompt: String? = null

    /**
     * Condition: exclusive end of a daily UTC time window as an HHMM clock number (e.g. 400 = 04:00)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var utcEnd: Double? = null

    /**
     * Condition: inclusive start of a daily UTC time window as an HHMM clock number (e.g. 100 = 01:00, 1030 = 10:30).
     * The entry applies while the current UTC time is inside the half-open window [utc_start, utc_end), which may wrap
     * past midnight (utc_start > utc_end).
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var utcStart: Double? = null

    public fun build(): PricingOverride = PricingOverride(
      audio = audio,
      completion = completion,
      inputAudioCache = inputAudioCache,
      inputCacheRead = inputCacheRead,
      inputCacheWrite = inputCacheWrite,
      inputCacheWrite1h = inputCacheWrite1h,
      minPromptTokens = minPromptTokens,
      prompt = prompt,
      utcEnd = utcEnd,
      utcStart = utcStart,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PricingOverride = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PricingOverride> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PricingOverride {
      val jsonDecoder = decoder.requireJsonDecoder("PricingOverride")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PricingOverride must be a JSON object")
      return PricingOverride(
        audio = rawObject["audio"]?.let { json.decodeFromJsonElement<String>(it) },
        completion = rawObject["completion"]?.let { json.decodeFromJsonElement<String>(it) },
        inputAudioCache = rawObject["input_audio_cache"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheRead = rawObject["input_cache_read"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheWrite = rawObject["input_cache_write"]?.let { json.decodeFromJsonElement<String>(it) },
        inputCacheWrite1h = rawObject["input_cache_write_1h"]?.let { json.decodeFromJsonElement<String>(it) },
        minPromptTokens = rawObject["min_prompt_tokens"]?.let { json.decodeFromJsonElement<Double>(it) },
        prompt = rawObject["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        utcEnd = rawObject["utc_end"]?.let { json.decodeFromJsonElement<Double>(it) },
        utcStart = rawObject["utc_start"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PricingOverride) {
      val jsonEncoder = encoder.requireJsonEncoder("PricingOverride")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audio?.let { put("audio", it) }
        value.completion?.let { put("completion", it) }
        value.inputAudioCache?.let { put("input_audio_cache", it) }
        value.inputCacheRead?.let { put("input_cache_read", it) }
        value.inputCacheWrite?.let { put("input_cache_write", it) }
        value.inputCacheWrite1h?.let { put("input_cache_write_1h", it) }
        value.minPromptTokens?.let { put("min_prompt_tokens", json.encodeToJsonElement(it)) }
        value.prompt?.let { put("prompt", it) }
        value.utcEnd?.let { put("utc_end", json.encodeToJsonElement(it)) }
        value.utcStart?.let { put("utc_start", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pricingOverride(block: PricingOverride.Builder.() -> Unit): PricingOverride = PricingOverride.build(block)
