package io.github.nabobery.sdkgen.generated

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
 * Event emitted when a response has completed successfully
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompletedEvent
 */
@Serializable(with = CompletedEvent.Serializer::class)
public class CompletedEvent(
  public val response: BaseResponsesResult,
  public val sequenceNumber: Int,
  public val type: InlineCompletedEventTypeXb615442a,
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

    private var typeValue: InlineCompletedEventTypeXb615442a? = null

    public var type: InlineCompletedEventTypeXb615442a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): CompletedEvent {
      check(responseValue != null) { "response is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return CompletedEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CompletedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CompletedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CompletedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("CompletedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CompletedEvent must be a JSON object")
      val response = json.decodeRequired<BaseResponsesResult>(rawObject, "response")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineCompletedEventTypeXb615442a>(rawObject, "type")
      return CompletedEvent(
        response = response,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CompletedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("CompletedEvent")
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

public fun completedEvent(block: CompletedEvent.Builder.() -> Unit): CompletedEvent = CompletedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CompletedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
