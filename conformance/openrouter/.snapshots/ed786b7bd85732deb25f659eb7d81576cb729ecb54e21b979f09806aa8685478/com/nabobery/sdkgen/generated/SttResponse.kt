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
 * STT response containing transcribed text and optional usage statistics
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTResponse
 */
@Serializable(with = SttResponse.Serializer::class)
public class SttResponse(
  /**
   * The transcribed text
   */
  public val text: String,
  /**
   * Duration of the input audio in seconds, present when response_format is verbose_json
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val duration: Double? = null,
  /**
   * Detected or forced language, present when response_format is verbose_json
   */
  public val language: String? = null,
  segments: List<SttSegment>? = null,
  /**
   * The task performed, present when response_format is verbose_json
   */
  public val task: String? = null,
  public val usage: SttUsage? = null,
  words: List<SttWord>? = null,
) {
  /**
   * Timestamped transcript segments, present when response_format is verbose_json
   */
  public val segments: List<SttSegment>? = segments?.let { collection0 -> collection0.toList() }

  /**
   * Timestamped words, present when the provider returns word-level timestamps
   */
  public val words: List<SttWord>? = words?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    /**
     * Duration of the input audio in seconds, present when response_format is verbose_json
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var duration: Double? = null

    /**
     * Detected or forced language, present when response_format is verbose_json
     */
    public var language: String? = null

    private var segmentsValue: List<SttSegment>? = null

    /**
     * Timestamped transcript segments, present when response_format is verbose_json
     */
    public var segments: List<SttSegment>?
      get() = segmentsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        segmentsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The task performed, present when response_format is verbose_json
     */
    public var task: String? = null

    public var usage: SttUsage? = null

    private var wordsValue: List<SttWord>? = null

    /**
     * Timestamped words, present when the provider returns word-level timestamps
     */
    public var words: List<SttWord>?
      get() = wordsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        wordsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SttResponse {
      check(textValue != null) { "text is required" }
      return SttResponse(
        text = text,
        duration = duration,
        language = language,
        segments = segments,
        task = task,
        usage = usage,
        words = words,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SttResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttResponse {
      val jsonDecoder = decoder.requireJsonDecoder("SttResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SttResponse must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      return SttResponse(
        text = text,
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<Double>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        segments = rawObject["segments"]?.let { json.decodeFromJsonElement<List<SttSegment>>(it) },
        task = rawObject["task"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<SttUsage>(it) },
        words = rawObject["words"]?.let { json.decodeFromJsonElement<List<SttWord>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("SttResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.language?.let { put("language", it) }
        value.segments?.let { put("segments", json.encodeToJsonElement(it)) }
        value.task?.let { put("task", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
        value.words?.let { put("words", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttResponse(block: SttResponse.Builder.() -> Unit): SttResponse = SttResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SttResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
