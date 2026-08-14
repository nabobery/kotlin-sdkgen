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
 * Debug event emitted when debug.echo_upstream_body is true. Contains the transformed upstream request body or timing
 * milestones.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DebugEvent
 */
@Serializable(with = DebugEvent.Serializer::class)
public class DebugEvent(
  public val debug: InlineDebugEventDebugX52571c89,
  public val sequenceNumber: Int,
  public val type: InlineDebugEventTypeX9f7f544d,
) {
  public class Builder {
    private var debugValue: InlineDebugEventDebugX52571c89? = null

    public var debug: InlineDebugEventDebugX52571c89
      get() = requireNotNull(debugValue) { "debug is required" }
      set(`value`) {
        debugValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineDebugEventTypeX9f7f544d? = null

    public var type: InlineDebugEventTypeX9f7f544d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): DebugEvent {
      check(debugValue != null) { "debug is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return DebugEvent(
        debug = debug,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DebugEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DebugEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DebugEvent {
      val jsonDecoder = decoder.requireJsonDecoder("DebugEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DebugEvent must be a JSON object")
      val debug = json.decodeRequired<InlineDebugEventDebugX52571c89>(rawObject, "debug")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineDebugEventTypeX9f7f544d>(rawObject, "type")
      return DebugEvent(
        debug = debug,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DebugEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("DebugEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("debug", json.encodeToJsonElement(value.debug))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun debugEvent(block: DebugEvent.Builder.() -> Unit): DebugEvent = DebugEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DebugEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
