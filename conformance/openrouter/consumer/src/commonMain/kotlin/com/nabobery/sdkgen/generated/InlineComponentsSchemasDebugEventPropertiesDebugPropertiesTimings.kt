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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug/properties/timings.
 */
@Serializable(with = InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings.Serializer::class)
public class InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings(
  public val epochMs: Int,
  public val event:
      InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent,
  public val startMs: Int,
) {
  public class Builder {
    private var epochMsValue: Int? = null

    public var epochMs: Int
      get() = requireNotNull(epochMsValue) { "epochMs is required" }
      set(`value`) {
        epochMsValue = value
      }

    private var eventValue:
        InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent? = null

    public var event:
        InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    private var startMsValue: Int? = null

    public var startMs: Int
      get() = requireNotNull(startMsValue) { "startMs is required" }
      set(`value`) {
        startMsValue = value
      }

    public fun build(): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings {
      check(epochMsValue != null) { "epochMs is required" }
      check(eventValue != null) { "event is required" }
      check(startMsValue != null) { "startMs is required" }
      return InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings(
        epochMs = epochMs,
        event = event,
        startMs = startMs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings must be a " +
          "JSON object")
      val epochMs = json.decodeRequired<Int>(raw, "epoch_ms")
      val event = json
        .decodeRequired<InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent>(raw, "event")
      val startMs = json.decodeRequired<Int>(raw, "start_ms")
      return InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings(
        epochMs = epochMs,
        event = event,
        startMs = startMs,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("epoch_ms", json.encodeToJsonElement(value.epochMs))
        put("event", json.encodeToJsonElement(value.event))
        put("start_ms", json.encodeToJsonElement(value.startMs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings(block: InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings.Builder.() -> Unit): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings = InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimings is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
