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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72(
  comments: List<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemX94f45fd7>,
  public val nodeId: String,
) {
  public val comments:
      List<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemX94f45fd7> =
      comments.toList()

  public class Builder {
    private var commentsValue:
        List<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemX94f45fd7>? = null

    public var comments:
        List<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemX94f45fd7>
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 {
      check(commentsValue != null) { "comments is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72(
        comments = comments,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 must be a JSON object")
      val comments = json.decodeRequired<List<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemX94f45fd7>>(rawObject, "comments")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72(
        comments = comments,
        nodeId = nodeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comments", json.encodeToJsonElement(value.comments))
        put("node_id", value.nodeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72(block: InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 = InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
