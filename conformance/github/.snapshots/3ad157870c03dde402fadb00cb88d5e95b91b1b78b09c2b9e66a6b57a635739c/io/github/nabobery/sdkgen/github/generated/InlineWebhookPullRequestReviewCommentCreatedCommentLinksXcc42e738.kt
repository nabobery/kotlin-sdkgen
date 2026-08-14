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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/comment/prope
 * rties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/comment/prope
 * rties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738.Serializer::class)
public class InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738(
  public val html: InlineWebhookPullRequestReviewCommentCreatedCommentLinksHtmlXeac0dd97,
  public val pullRequest:
      InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d,
  public val self: InlineWebhookPullRequestReviewCommentCreatedCommentLinksSelfX6c3ceb0e,
) {
  public class Builder {
    private var htmlValue: InlineWebhookPullRequestReviewCommentCreatedCommentLinksHtmlXeac0dd97? =
        null

    public var html: InlineWebhookPullRequestReviewCommentCreatedCommentLinksHtmlXeac0dd97
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue:
        InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d? = null

    public var pullRequest:
        InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: InlineWebhookPullRequestReviewCommentCreatedCommentLinksSelfX6c3ceb0e? =
        null

    public var self: InlineWebhookPullRequestReviewCommentCreatedCommentLinksSelfX6c3ceb0e
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 must be a JSON object")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedCommentLinksHtmlXeac0dd97>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d>(rawObject, "pull_request")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedCommentLinksSelfX6c3ceb0e>(rawObject, "self")
      return InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("self", json.encodeToJsonElement(value.self))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738(block: InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 = InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedCommentLinksXcc42e738 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
