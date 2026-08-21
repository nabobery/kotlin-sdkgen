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
 * Timeline Commit Commented Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-commit-commented-event
 */
@Serializable(with = TimelineCommitCommentedEvent.Serializer::class)
public class TimelineCommitCommentedEvent(
  comments: List<CommitComment>? = null,
  public val commitId: String? = null,
  public val event: String? = null,
  public val nodeId: String? = null,
) {
  public val comments: List<CommitComment>? = comments?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var commentsValue: List<CommitComment>? = null

    public var comments: List<CommitComment>?
      get() = commentsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        commentsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var commitId: String? = null

    public var event: String? = null

    public var nodeId: String? = null

    public fun build(): TimelineCommitCommentedEvent = TimelineCommitCommentedEvent(
      comments = comments,
      commitId = commitId,
      event = event,
      nodeId = nodeId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TimelineCommitCommentedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TimelineCommitCommentedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TimelineCommitCommentedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TimelineCommitCommentedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TimelineCommitCommentedEvent must be a JSON object")
      return TimelineCommitCommentedEvent(
        comments = rawObject["comments"]?.let { json.decodeFromJsonElement<List<CommitComment>>(it) },
        commitId = rawObject["commit_id"]?.let { json.decodeFromJsonElement<String>(it) },
        event = rawObject["event"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TimelineCommitCommentedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TimelineCommitCommentedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.comments?.let { put("comments", json.encodeToJsonElement(it)) }
        value.commitId?.let { put("commit_id", it) }
        value.event?.let { put("event", it) }
        value.nodeId?.let { put("node_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun timelineCommitCommentedEvent(block: TimelineCommitCommentedEvent.Builder.() -> Unit): TimelineCommitCommentedEvent = TimelineCommitCommentedEvent.build(block)
