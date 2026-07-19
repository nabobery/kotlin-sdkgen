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
 * Event emitted when a response is in progress
 */
@Serializable(with = InProgressEvent.Serializer::class)
public class InProgressEvent(
  public val response: BaseResponsesResult,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasInProgressEventPropertiesType,
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

    private var typeValue: InlineComponentsSchemasInProgressEventPropertiesType? = null

    public var type: InlineComponentsSchemasInProgressEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InProgressEvent {
      check(responseValue != null) { "response is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return InProgressEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InProgressEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InProgressEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InProgressEvent {
      val jsonDecoder = decoder.requireJsonDecoder("InProgressEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InProgressEvent must be a JSON object")
      val response = json.decodeRequired<BaseResponsesResult>(raw, "response")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasInProgressEventPropertiesType>(raw, "type")
      return InProgressEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InProgressEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("InProgressEvent")
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

public fun inProgressEvent(block: InProgressEvent.Builder.() -> Unit): InProgressEvent = InProgressEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InProgressEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
