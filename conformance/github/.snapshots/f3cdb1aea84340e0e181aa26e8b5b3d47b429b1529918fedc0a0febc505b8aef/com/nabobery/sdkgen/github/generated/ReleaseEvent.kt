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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/release-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-event
 */
@Serializable(with = ReleaseEvent.Serializer::class)
public class ReleaseEvent(
  public val action: String,
  public val release: InlineReleaseEventReleaseX1d663d6a,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var releaseValue: InlineReleaseEventReleaseX1d663d6a? = null

    public var release: InlineReleaseEventReleaseX1d663d6a
      get() = requireNotNull(releaseValue) { "release is required" }
      set(`value`) {
        releaseValue = value
      }

    public fun build(): ReleaseEvent {
      check(actionValue != null) { "action is required" }
      check(releaseValue != null) { "release is required" }
      return ReleaseEvent(
        action = action,
        release = release,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReleaseEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReleaseEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReleaseEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ReleaseEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReleaseEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val release = json.decodeRequired<InlineReleaseEventReleaseX1d663d6a>(rawObject, "release")
      return ReleaseEvent(
        action = action,
        release = release,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReleaseEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReleaseEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("release", json.encodeToJsonElement(value.release))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun releaseEvent(block: ReleaseEvent.Builder.() -> Unit): ReleaseEvent = ReleaseEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReleaseEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
