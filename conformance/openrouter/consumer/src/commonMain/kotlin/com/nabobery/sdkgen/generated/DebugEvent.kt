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
 * Debug event emitted when debug.echo_upstream_body is true. Contains the transformed upstream request body or timing
 * milestones.
 */
@Serializable(with = DebugEvent.Serializer::class)
public class DebugEvent(
  public val debug: InlineComponentsSchemasDebugEventPropertiesDebug,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasDebugEventPropertiesType,
) {
  public class Builder {
    private var debugValue: InlineComponentsSchemasDebugEventPropertiesDebug? = null

    public var debug: InlineComponentsSchemasDebugEventPropertiesDebug
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

    private var typeValue: InlineComponentsSchemasDebugEventPropertiesType? = null

    public var type: InlineComponentsSchemasDebugEventPropertiesType
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

  public object Serializer : KSerializer<DebugEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DebugEvent {
      val jsonDecoder = decoder.requireJsonDecoder("DebugEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("DebugEvent must be a JSON object")
      val debug = json.decodeRequired<InlineComponentsSchemasDebugEventPropertiesDebug>(raw, "debug")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasDebugEventPropertiesType>(raw, "type")
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
