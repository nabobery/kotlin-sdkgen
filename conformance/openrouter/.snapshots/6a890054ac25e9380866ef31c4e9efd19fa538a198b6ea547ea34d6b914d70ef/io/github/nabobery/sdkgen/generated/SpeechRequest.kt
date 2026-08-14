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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Text-to-speech request input
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SpeechRequest
 */
@Serializable(with = SpeechRequest.Serializer::class)
public class SpeechRequest(
  /**
   * Text to synthesize
   */
  public val input: String,
  /**
   * TTS model identifier
   */
  public val model: String,
  /**
   * Voice identifier (provider-specific).
   */
  public val voice: String,
  /**
   * Provider-specific passthrough configuration
   */
  public val provider: InlineSpeechRequestProviderX77399e14? = null,
  /**
   * Audio output format
   */
  public val responseFormat: InlineSpeechRequestResponseFormatX95a6cd91? = null,
  /**
   * Playback speed multiplier. Only used by models that support it (e.g. OpenAI TTS). Ignored by other providers.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val speed: Double? = null,
) {
  public class Builder {
    private var inputValue: String? = null

    public var input: String
      get() = requireNotNull(inputValue) { "input is required" }
      set(`value`) {
        inputValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var voiceValue: String? = null

    public var voice: String
      get() = requireNotNull(voiceValue) { "voice is required" }
      set(`value`) {
        voiceValue = value
      }

    /**
     * Provider-specific passthrough configuration
     */
    public var provider: InlineSpeechRequestProviderX77399e14? = null

    /**
     * Audio output format
     */
    public var responseFormat: InlineSpeechRequestResponseFormatX95a6cd91? = null

    /**
     * Playback speed multiplier. Only used by models that support it (e.g. OpenAI TTS). Ignored by other providers.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var speed: Double? = null

    public fun build(): SpeechRequest {
      check(inputValue != null) { "input is required" }
      check(modelValue != null) { "model is required" }
      check(voiceValue != null) { "voice is required" }
      return SpeechRequest(
        input = input,
        model = model,
        voice = voice,
        provider = provider,
        responseFormat = responseFormat,
        speed = speed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SpeechRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SpeechRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SpeechRequest {
      val jsonDecoder = decoder.requireJsonDecoder("SpeechRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SpeechRequest must be a JSON object")
      val input = json.decodeRequired<String>(rawObject, "input")
      val model = json.decodeRequired<String>(rawObject, "model")
      val voice = json.decodeRequired<String>(rawObject, "voice")
      return SpeechRequest(
        input = input,
        model = model,
        voice = voice,
        provider = rawObject["provider"]?.let { json.decodeFromJsonElement<InlineSpeechRequestProviderX77399e14>(it) },
        responseFormat = rawObject["response_format"]?.let { json.decodeFromJsonElement<InlineSpeechRequestResponseFormatX95a6cd91>(it) },
        speed = rawObject["speed"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SpeechRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("SpeechRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input", value.input)
        put("model", value.model)
        put("voice", value.voice)
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.responseFormat?.let { put("response_format", json.encodeToJsonElement(it)) }
        value.speed?.let { put("speed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun speechRequest(block: SpeechRequest.Builder.() -> Unit): SpeechRequest = SpeechRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SpeechRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
