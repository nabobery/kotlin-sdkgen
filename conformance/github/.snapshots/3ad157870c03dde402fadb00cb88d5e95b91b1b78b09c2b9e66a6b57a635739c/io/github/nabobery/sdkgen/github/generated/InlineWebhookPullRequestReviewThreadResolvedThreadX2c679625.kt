package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625(
  comments: List<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemX5bdf478c>,
  public val nodeId: String,
) {
  public val comments: List<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemX5bdf478c>
      = comments.toList()

  public class Builder {
    private var commentsValue:
        List<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemX5bdf478c>? = null

    public var comments:
        List<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemX5bdf478c>
      get() = requireNotNull(commentsValue) { "comments is required" }.toList()
      set(`value`) {
        commentsValue = value.toList()
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 {
      check(commentsValue != null) { "comments is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625(
        comments = comments,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 must be a JSON object")
      val comments = json.decodeRequired<List<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemX5bdf478c>>(rawObject, "comments")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625(
        comments = comments,
        nodeId = nodeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comments", json.encodeToJsonElement(value.comments))
        put("node_id", value.nodeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedThreadX2c679625(block: InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 = InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadX2c679625 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
