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
 * Event emitted when a response is incomplete
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/IncompleteEvent
 */
@Serializable(with = IncompleteEvent.Serializer::class)
public class IncompleteEvent(
  public val response: BaseResponsesResult,
  public val sequenceNumber: Int,
  public val type: InlineIncompleteEventTypeX2a7bc849,
) {
  public class Builder {
    private var responseValue: BaseResponsesResult? = null

    public var response: BaseResponsesResult
      get() = requireNotNull(responseValue) { "response is required" }
      set(`value`) {
        responseValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineIncompleteEventTypeX2a7bc849? = null

    public var type: InlineIncompleteEventTypeX2a7bc849
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): IncompleteEvent {
      check(responseValue != null) { "response is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return IncompleteEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IncompleteEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IncompleteEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IncompleteEvent {
      val jsonDecoder = decoder.requireJsonDecoder("IncompleteEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IncompleteEvent must be a JSON object")
      val response = json.decodeRequired<BaseResponsesResult>(rawObject, "response")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineIncompleteEventTypeX2a7bc849>(rawObject, "type")
      return IncompleteEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IncompleteEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("IncompleteEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("response", json.encodeToJsonElement(value.response))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun incompleteEvent(block: IncompleteEvent.Builder.() -> Unit): IncompleteEvent = IncompleteEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IncompleteEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
