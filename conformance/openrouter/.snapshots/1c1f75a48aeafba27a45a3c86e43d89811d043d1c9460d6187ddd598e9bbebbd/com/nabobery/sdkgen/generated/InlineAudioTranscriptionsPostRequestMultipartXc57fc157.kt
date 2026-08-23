package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkByteStream
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema
 */
@Serializable(with = InlineAudioTranscriptionsPostRequestMultipartXc57fc157.Serializer::class)
public class InlineAudioTranscriptionsPostRequestMultipartXc57fc157(
  /**
   * The audio file to transcribe. The format is derived from the filename extension or the file part content type. Max
   * 25 MB; send larger files as base64 JSON via input_audio.
   */
  public val `file`: SdkByteStream,
  /**
   * The model to use for transcription.
   */
  public val model: String,
  /**
   * The language of the input audio (ISO-639-1).
   */
  public val language: String? = null,
  /**
   * The response format. "json" (default) returns { text, usage }; "verbose_json" additionally returns task, language,
   * duration, and segment-level timestamps (OpenAI-compatible providers only).
   */
  public val responseFormat:
      InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791? = null,
  /**
   * The sampling temperature.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  timestampGranularities: List<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc>? = null,
) {
  /**
   * Timestamp detail levels to include when response_format is "verbose_json". "word" additionally returns word-level
   * timestamps in the words array.
   */
  public val timestampGranularities:
      List<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc>? =
      timestampGranularities?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fileValue: SdkByteStream? = null

    public var `file`: SdkByteStream
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    /**
     * The language of the input audio (ISO-639-1).
     */
    public var language: String? = null

    /**
     * The response format. "json" (default) returns { text, usage }; "verbose_json" additionally returns task,
     * language, duration, and segment-level timestamps (OpenAI-compatible providers only).
     */
    public var responseFormat: InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791?
        = null

    /**
     * The sampling temperature.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    private var timestampGranularitiesValue:
        List<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc>? =
        null

    /**
     * Timestamp detail levels to include when response_format is "verbose_json". "word" additionally returns word-level
     * timestamps in the words array.
     */
    public var timestampGranularities:
        List<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc>?
      get() = timestampGranularitiesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        timestampGranularitiesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAudioTranscriptionsPostRequestMultipartXc57fc157 {
      check(fileValue != null) { "file is required" }
      check(modelValue != null) { "model is required" }
      return InlineAudioTranscriptionsPostRequestMultipartXc57fc157(
        file = file,
        model = model,
        language = language,
        responseFormat = responseFormat,
        temperature = temperature,
        timestampGranularities = timestampGranularities,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAudioTranscriptionsPostRequestMultipartXc57fc157 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAudioTranscriptionsPostRequestMultipartXc57fc157> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAudioTranscriptionsPostRequestMultipartXc57fc157 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAudioTranscriptionsPostRequestMultipartXc57fc157")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAudioTranscriptionsPostRequestMultipartXc57fc157 must be a JSON object")
      val file = json.decodeRequired<SdkByteStream>(rawObject, "file")
      val model = json.decodeRequired<String>(rawObject, "model")
      return InlineAudioTranscriptionsPostRequestMultipartXc57fc157(
        file = file,
        model = model,
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        responseFormat = rawObject["response_format"]?.let { json.decodeFromJsonElement<InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791>(it) },
        temperature = rawObject["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        timestampGranularities = rawObject["timestamp_granularities[]"]?.let { json.decodeFromJsonElement<List<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAudioTranscriptionsPostRequestMultipartXc57fc157) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAudioTranscriptionsPostRequestMultipartXc57fc157")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", json.encodeToJsonElement(value.file))
        put("model", value.model)
        value.language?.let { put("language", it) }
        value.responseFormat?.let { put("response_format", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.timestampGranularities?.let { put("timestamp_granularities[]", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAudioTranscriptionsPostRequestMultipartXc57fc157(block: InlineAudioTranscriptionsPostRequestMultipartXc57fc157.Builder.() -> Unit): InlineAudioTranscriptionsPostRequestMultipartXc57fc157 = InlineAudioTranscriptionsPostRequestMultipartXc57fc157.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAudioTranscriptionsPostRequestMultipartXc57fc157 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
