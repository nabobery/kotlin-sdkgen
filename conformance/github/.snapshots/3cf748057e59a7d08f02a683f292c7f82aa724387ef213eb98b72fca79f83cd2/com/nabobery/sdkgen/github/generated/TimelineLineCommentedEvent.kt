package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Timeline Line Commented Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-line-commented-event
 */
@Serializable(with = TimelineLineCommentedEvent.Serializer::class)
public class TimelineLineCommentedEvent(
  public val comments: List<PullRequestReviewComment>? = null,
  public val event: String? = null,
  public val nodeId: String? = null,
) {
  public class Builder {
    public var comments: List<PullRequestReviewComment>? = null

    public var event: String? = null

    public var nodeId: String? = null

    public fun build(): TimelineLineCommentedEvent = TimelineLineCommentedEvent(
      comments = comments,
      event = event,
      nodeId = nodeId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TimelineLineCommentedEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TimelineLineCommentedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TimelineLineCommentedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TimelineLineCommentedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TimelineLineCommentedEvent must be a JSON object")
      return TimelineLineCommentedEvent(
        comments = rawObject["comments"]?.let { json.decodeFromJsonElement<List<PullRequestReviewComment>>(it) },
        event = rawObject["event"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TimelineLineCommentedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TimelineLineCommentedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.comments?.let { put("comments", json.encodeToJsonElement(it)) }
        value.event?.let { put("event", it) }
        value.nodeId?.let { put("node_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun timelineLineCommentedEvent(block: TimelineLineCommentedEvent.Builder.() -> Unit): TimelineLineCommentedEvent = TimelineLineCommentedEvent.build(block)
