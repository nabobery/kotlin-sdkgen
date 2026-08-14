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
 * A timestamped word, returned when the provider includes word-level timestamps
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTWord
 */
@Serializable(with = SttWord.Serializer::class)
public class SttWord(
  /**
   * Word end time in seconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val end: Double,
  /**
   * Word start time in seconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val start: Double,
  /**
   * The transcribed word
   */
  public val word: String,
) {
  public class Builder {
    private var endValue: Double? = null

    public var end: Double
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue: Double? = null

    public var start: Double
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    private var wordValue: String? = null

    public var word: String
      get() = requireNotNull(wordValue) { "word is required" }
      set(`value`) {
        wordValue = value
      }

    public fun build(): SttWord {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      check(wordValue != null) { "word is required" }
      return SttWord(
        end = end,
        start = start,
        word = word,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttWord = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SttWord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttWord {
      val jsonDecoder = decoder.requireJsonDecoder("SttWord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SttWord must be a JSON object")
      val end = json.decodeRequired<Double>(rawObject, "end")
      val start = json.decodeRequired<Double>(rawObject, "start")
      val word = json.decodeRequired<String>(rawObject, "word")
      return SttWord(
        end = end,
        start = start,
        word = word,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttWord) {
      val jsonEncoder = encoder.requireJsonEncoder("SttWord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
        put("word", value.word)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttWord(block: SttWord.Builder.() -> Unit): SttWord = SttWord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SttWord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
