package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EventChunk.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EventChunk
 */
@Serializable(with = EventChunk.Serializer::class)
public class EventChunk(
  public val sequence: Int,
  public val text: String,
) {
  public class Builder {
    private var sequenceValue: Int? = null

    public var sequence: Int
      get() = requireNotNull(sequenceValue) { "sequence is required" }
      set(`value`) {
        sequenceValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    public fun build(): EventChunk {
      check(sequenceValue != null) { "sequence is required" }
      check(textValue != null) { "text is required" }
      return EventChunk(
        sequence = sequence,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EventChunk = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EventChunk> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EventChunk {
      val jsonDecoder = decoder.requireJsonDecoder("EventChunk")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EventChunk must be a JSON object")
      val sequence = json.decodeRequired<Int>(rawObject, "sequence")
      val text = json.decodeRequired<String>(rawObject, "text")
      return EventChunk(
        sequence = sequence,
        text = text,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EventChunk) {
      val jsonEncoder = encoder.requireJsonEncoder("EventChunk")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sequence", json.encodeToJsonElement(value.sequence))
        put("text", value.text)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun eventChunk(block: EventChunk.Builder.() -> Unit): EventChunk = EventChunk.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EventChunk is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
