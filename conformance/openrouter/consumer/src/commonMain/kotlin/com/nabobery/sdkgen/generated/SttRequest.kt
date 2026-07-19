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
 * Speech-to-text request input. Accepts a JSON body with input_audio containing base64-encoded audio.
 */
@Serializable(with = SttRequest.Serializer::class)
public class SttRequest(
  public val inputAudio: SttInputAudio,
  /**
   * STT model identifier
   */
  public val model: String,
  /**
   * ISO-639-1 language code (e.g., "en", "ja"). Auto-detected if omitted.
   */
  public val language: String? = null,
  /**
   * Provider-specific passthrough configuration
   */
  public val provider: InlineComponentsSchemasSttRequestPropertiesProvider? = null,
  /**
   * Output format. "json" (default) returns { text, usage }. "verbose_json" additionally returns task, language,
   * duration, and segment-level timestamps; only supported by OpenAI-compatible providers.
   */
  public val responseFormat: InlineComponentsSchemasSttRequestPropertiesResponseFormat? = null,
  /**
   * Sampling temperature for transcription
   */
  public val temperature: Double? = null,
  /**
   * Timestamp detail levels to include when response_format is "verbose_json". "segment" returns segment-level
   * timestamps; "word" additionally returns word-level timestamps in the words array. Ignored unless response_format is
   * "verbose_json".
   */
  public val timestampGranularities: List<SttTimestampGranularity>? = null,
) {
  public class Builder {
    private var inputAudioValue: SttInputAudio? = null

    public var inputAudio: SttInputAudio
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    /**
     * ISO-639-1 language code (e.g., "en", "ja"). Auto-detected if omitted.
     */
    public var language: String? = null

    /**
     * Provider-specific passthrough configuration
     */
    public var provider: InlineComponentsSchemasSttRequestPropertiesProvider? = null

    /**
     * Output format. "json" (default) returns { text, usage }. "verbose_json" additionally returns task, language,
     * duration, and segment-level timestamps; only supported by OpenAI-compatible providers.
     */
    public var responseFormat: InlineComponentsSchemasSttRequestPropertiesResponseFormat? = null

    /**
     * Sampling temperature for transcription
     */
    public var temperature: Double? = null

    /**
     * Timestamp detail levels to include when response_format is "verbose_json". "segment" returns segment-level
     * timestamps; "word" additionally returns word-level timestamps in the words array. Ignored unless response_format
     * is "verbose_json".
     */
    public var timestampGranularities: List<SttTimestampGranularity>? = null

    public fun build(): SttRequest {
      check(inputAudioValue != null) { "inputAudio is required" }
      check(modelValue != null) { "model is required" }
      return SttRequest(
        inputAudio = inputAudio,
        model = model,
        language = language,
        provider = provider,
        responseFormat = responseFormat,
        temperature = temperature,
        timestampGranularities = timestampGranularities,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SttRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttRequest {
      val jsonDecoder = decoder.requireJsonDecoder("SttRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SttRequest must be a JSON object")
      val inputAudio = json.decodeRequired<SttInputAudio>(raw, "input_audio")
      val model = json.decodeRequired<String>(raw, "model")
      return SttRequest(
        inputAudio = inputAudio,
        model = model,
        language = raw["language"]?.let { json.decodeFromJsonElement<String>(it) },
        provider = raw["provider"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasSttRequestPropertiesProvider>(it) },
        responseFormat = raw["response_format"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasSttRequestPropertiesResponseFormat>(it) },
        temperature = raw["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        timestampGranularities = raw["timestamp_granularities"]?.let { json
          .decodeFromJsonElement<List<SttTimestampGranularity>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("SttRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_audio", json.encodeToJsonElement(value.inputAudio))
        put("model", value.model)
        value.language?.let { put("language", it) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.responseFormat?.let { put("response_format", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.timestampGranularities?.let { put("timestamp_granularities", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttRequest(block: SttRequest.Builder.() -> Unit): SttRequest = SttRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SttRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
