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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event
 */
@Serializable(with = PullRequestReviewEvent.Serializer::class)
public class PullRequestReviewEvent(
  public val action: String,
  public val pullRequest: PullRequestMinimal,
  public val review: InlinePullRequestReviewEventReviewX7853b1c4,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var pullRequestValue: PullRequestMinimal? = null

    public var pullRequest: PullRequestMinimal
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var reviewValue: InlinePullRequestReviewEventReviewX7853b1c4? = null

    public var review: InlinePullRequestReviewEventReviewX7853b1c4
      get() = requireNotNull(reviewValue) { "review is required" }
      set(`value`) {
        reviewValue = value
      }

    public fun build(): PullRequestReviewEvent {
      check(actionValue != null) { "action is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(reviewValue != null) { "review is required" }
      return PullRequestReviewEvent(
        action = action,
        pullRequest = pullRequest,
        review = review,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestReviewEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestReviewEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestReviewEvent {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestReviewEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestReviewEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val pullRequest = json.decodeRequired<PullRequestMinimal>(rawObject, "pull_request")
      val review = json.decodeRequired<InlinePullRequestReviewEventReviewX7853b1c4>(rawObject, "review")
      return PullRequestReviewEvent(
        action = action,
        pullRequest = pullRequest,
        review = review,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestReviewEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestReviewEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("review", json.encodeToJsonElement(value.review))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestReviewEvent(block: PullRequestReviewEvent.Builder.() -> Unit): PullRequestReviewEvent = PullRequestReviewEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestReviewEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
