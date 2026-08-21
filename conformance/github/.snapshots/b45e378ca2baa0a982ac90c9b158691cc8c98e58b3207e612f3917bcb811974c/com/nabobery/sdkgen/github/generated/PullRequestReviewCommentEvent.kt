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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event
 */
@Serializable(with = PullRequestReviewCommentEvent.Serializer::class)
public class PullRequestReviewCommentEvent(
  public val action: String,
  public val comment: InlinePullRequestReviewCommentEventCommentX35e8d615,
  public val pullRequest: PullRequestMinimal,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var commentValue: InlinePullRequestReviewCommentEventCommentX35e8d615? = null

    public var comment: InlinePullRequestReviewCommentEventCommentX35e8d615
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var pullRequestValue: PullRequestMinimal? = null

    public var pullRequest: PullRequestMinimal
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): PullRequestReviewCommentEvent {
      check(actionValue != null) { "action is required" }
      check(commentValue != null) { "comment is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return PullRequestReviewCommentEvent(
        action = action,
        comment = comment,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestReviewCommentEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestReviewCommentEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestReviewCommentEvent {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestReviewCommentEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestReviewCommentEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val comment = json.decodeRequired<InlinePullRequestReviewCommentEventCommentX35e8d615>(rawObject, "comment")
      val pullRequest = json.decodeRequired<PullRequestMinimal>(rawObject, "pull_request")
      return PullRequestReviewCommentEvent(
        action = action,
        comment = comment,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestReviewCommentEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestReviewCommentEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("comment", json.encodeToJsonElement(value.comment))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestReviewCommentEvent(block: PullRequestReviewCommentEvent.Builder.() -> Unit): PullRequestReviewCommentEvent = PullRequestReviewCommentEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestReviewCommentEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
