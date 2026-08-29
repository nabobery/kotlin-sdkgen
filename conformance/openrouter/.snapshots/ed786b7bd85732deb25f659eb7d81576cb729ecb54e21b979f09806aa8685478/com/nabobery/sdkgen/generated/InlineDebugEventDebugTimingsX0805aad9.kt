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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug/properties/timings
 */
@Serializable(with = InlineDebugEventDebugTimingsX0805aad9.Serializer::class)
public class InlineDebugEventDebugTimingsX0805aad9(
  public val epochMs: Int,
  public val event: InlineDebugEventDebugTimingsEventX195034a8,
  public val startMs: Int,
) {
  public class Builder {
    private var epochMsValue: Int? = null

    public var epochMs: Int
      get() = requireNotNull(epochMsValue) { "epochMs is required" }
      set(`value`) {
        epochMsValue = value
      }

    private var eventValue: InlineDebugEventDebugTimingsEventX195034a8? = null

    public var event: InlineDebugEventDebugTimingsEventX195034a8
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

    public fun build(): InlineDebugEventDebugTimingsX0805aad9 {
      check(epochMsValue != null) { "epochMs is required" }
      check(eventValue != null) { "event is required" }
      check(startMsValue != null) { "startMs is required" }
      return InlineDebugEventDebugTimingsX0805aad9(
        epochMs = epochMs,
        event = event,
        startMs = startMs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDebugEventDebugTimingsX0805aad9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDebugEventDebugTimingsX0805aad9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDebugEventDebugTimingsX0805aad9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDebugEventDebugTimingsX0805aad9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDebugEventDebugTimingsX0805aad9 must be a JSON object")
      val epochMs = json.decodeRequired<Int>(rawObject, "epoch_ms")
      val event = json.decodeRequired<InlineDebugEventDebugTimingsEventX195034a8>(rawObject, "event")
      val startMs = json.decodeRequired<Int>(rawObject, "start_ms")
      return InlineDebugEventDebugTimingsX0805aad9(
        epochMs = epochMs,
        event = event,
        startMs = startMs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDebugEventDebugTimingsX0805aad9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDebugEventDebugTimingsX0805aad9")
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

public fun inlineDebugEventDebugTimingsX0805aad9(block: InlineDebugEventDebugTimingsX0805aad9.Builder.() -> Unit): InlineDebugEventDebugTimingsX0805aad9 = InlineDebugEventDebugTimingsX0805aad9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDebugEventDebugTimingsX0805aad9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
