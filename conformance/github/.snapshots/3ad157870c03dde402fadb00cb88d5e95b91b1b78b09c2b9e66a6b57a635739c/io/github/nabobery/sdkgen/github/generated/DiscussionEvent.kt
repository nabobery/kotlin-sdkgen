package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/discussion-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion-event
 */
@Serializable(with = DiscussionEvent.Serializer::class)
public class DiscussionEvent(
  public val action: String,
  public val discussion: Discussion,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var discussionValue: Discussion? = null

    public var discussion: Discussion
      get() = requireNotNull(discussionValue) { "discussion is required" }
      set(`value`) {
        discussionValue = value
      }

    public fun build(): DiscussionEvent {
      check(actionValue != null) { "action is required" }
      check(discussionValue != null) { "discussion is required" }
      return DiscussionEvent(
        action = action,
        discussion = discussion,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DiscussionEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DiscussionEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DiscussionEvent {
      val jsonDecoder = decoder.requireJsonDecoder("DiscussionEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DiscussionEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      return DiscussionEvent(
        action = action,
        discussion = discussion,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DiscussionEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("DiscussionEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("discussion", json.encodeToJsonElement(value.discussion))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun discussionEvent(block: DiscussionEvent.Builder.() -> Unit): DiscussionEvent = DiscussionEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DiscussionEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
