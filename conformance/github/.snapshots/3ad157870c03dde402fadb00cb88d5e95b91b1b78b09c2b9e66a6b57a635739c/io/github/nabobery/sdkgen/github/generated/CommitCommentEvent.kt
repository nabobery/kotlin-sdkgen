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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit-comment-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-comment-event
 */
@Serializable(with = CommitCommentEvent.Serializer::class)
public class CommitCommentEvent(
  public val action: String,
  public val comment: InlineCommitCommentEventCommentX076c9378,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var commentValue: InlineCommitCommentEventCommentX076c9378? = null

    public var comment: InlineCommitCommentEventCommentX076c9378
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    public fun build(): CommitCommentEvent {
      check(actionValue != null) { "action is required" }
      check(commentValue != null) { "comment is required" }
      return CommitCommentEvent(
        action = action,
        comment = comment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommitCommentEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CommitCommentEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommitCommentEvent {
      val jsonDecoder = decoder.requireJsonDecoder("CommitCommentEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommitCommentEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val comment = json.decodeRequired<InlineCommitCommentEventCommentX076c9378>(rawObject, "comment")
      return CommitCommentEvent(
        action = action,
        comment = comment,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommitCommentEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("CommitCommentEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("comment", json.encodeToJsonElement(value.comment))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commitCommentEvent(block: CommitCommentEvent.Builder.() -> Unit): CommitCommentEvent = CommitCommentEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommitCommentEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
