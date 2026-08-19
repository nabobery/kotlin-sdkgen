package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * A timestamped transcript segment, returned when response_format is verbose_json
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTSegment
 */
@Serializable(with = SttSegment.Serializer::class)
public class SttSegment(
  /**
   * Segment end time in seconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val end: Double,
  /**
   * Segment index within the transcript
   */
  public val id: Int,
  /**
   * Segment start time in seconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val start: Double,
  /**
   * Transcribed text of the segment
   */
  public val text: String,
  /**
   * Average log probability of the segment
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val avgLogprob: Double? = null,
  /**
   * Compression ratio of the segment
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val compressionRatio: Double? = null,
  /**
   * Probability the segment contains no speech
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val noSpeechProb: Double? = null,
  /**
   * Seek offset of the segment
   */
  public val seek: Int? = null,
  /**
   * Temperature used for the segment
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  tokens: List<Int>? = null,
) {
  /**
   * Token IDs of the segment
   */
  public val tokens: List<Int>? = tokens?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var endValue: Double? = null

    public var end: Double
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var startValue: Double? = null

    public var start: Double
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    /**
     * Average log probability of the segment
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var avgLogprob: Double? = null

    /**
     * Compression ratio of the segment
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var compressionRatio: Double? = null

    /**
     * Probability the segment contains no speech
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var noSpeechProb: Double? = null

    /**
     * Seek offset of the segment
     */
    public var seek: Int? = null

    /**
     * Temperature used for the segment
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    private var tokensValue: List<Int>? = null

    /**
     * Token IDs of the segment
     */
    public var tokens: List<Int>?
      get() = tokensValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tokensValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SttSegment {
      check(endValue != null) { "end is required" }
      check(idValue != null) { "id is required" }
      check(startValue != null) { "start is required" }
      check(textValue != null) { "text is required" }
      return SttSegment(
        end = end,
        id = id,
        start = start,
        text = text,
        avgLogprob = avgLogprob,
        compressionRatio = compressionRatio,
        noSpeechProb = noSpeechProb,
        seek = seek,
        temperature = temperature,
        tokens = tokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttSegment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SttSegment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttSegment {
      val jsonDecoder = decoder.requireJsonDecoder("SttSegment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SttSegment must be a JSON object")
      val end = json.decodeRequired<Double>(rawObject, "end")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val start = json.decodeRequired<Double>(rawObject, "start")
      val text = json.decodeRequired<String>(rawObject, "text")
      return SttSegment(
        end = end,
        id = id,
        start = start,
        text = text,
        avgLogprob = rawObject["avg_logprob"]?.let { json.decodeFromJsonElement<Double>(it) },
        compressionRatio = rawObject["compression_ratio"]?.let { json.decodeFromJsonElement<Double>(it) },
        noSpeechProb = rawObject["no_speech_prob"]?.let { json.decodeFromJsonElement<Double>(it) },
        seek = rawObject["seek"]?.let { json.decodeFromJsonElement<Int>(it) },
        temperature = rawObject["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        tokens = rawObject["tokens"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttSegment) {
      val jsonEncoder = encoder.requireJsonEncoder("SttSegment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("id", json.encodeToJsonElement(value.id))
        put("start", json.encodeToJsonElement(value.start))
        put("text", value.text)
        value.avgLogprob?.let { put("avg_logprob", json.encodeToJsonElement(it)) }
        value.compressionRatio?.let { put("compression_ratio", json.encodeToJsonElement(it)) }
        value.noSpeechProb?.let { put("no_speech_prob", json.encodeToJsonElement(it)) }
        value.seek?.let { put("seek", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.tokens?.let { put("tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttSegment(block: SttSegment.Builder.() -> Unit): SttSegment = SttSegment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SttSegment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
