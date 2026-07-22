package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/fork-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/fork-event
 */
@Serializable(with = ForkEvent.Serializer::class)
public class ForkEvent(
  public val action: String,
  public val forkee: InlineForkEventForkeeX52e3045e,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var forkeeValue: InlineForkEventForkeeX52e3045e? = null

    public var forkee: InlineForkEventForkeeX52e3045e
      get() = requireNotNull(forkeeValue) { "forkee is required" }
      set(`value`) {
        forkeeValue = value
      }

    public fun build(): ForkEvent {
      check(actionValue != null) { "action is required" }
      check(forkeeValue != null) { "forkee is required" }
      return ForkEvent(
        action = action,
        forkee = forkee,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ForkEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ForkEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ForkEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ForkEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ForkEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val forkee = json.decodeRequired<InlineForkEventForkeeX52e3045e>(rawObject, "forkee")
      return ForkEvent(
        action = action,
        forkee = forkee,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ForkEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ForkEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("forkee", json.encodeToJsonElement(value.forkee))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun forkEvent(block: ForkEvent.Builder.() -> Unit): ForkEvent = ForkEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ForkEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
