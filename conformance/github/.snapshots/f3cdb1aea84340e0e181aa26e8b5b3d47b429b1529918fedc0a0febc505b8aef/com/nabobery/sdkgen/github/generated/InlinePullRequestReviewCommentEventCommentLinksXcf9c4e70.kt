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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70.Serializer::class)
public class InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70(
  public val html: InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3,
  public val pullRequest: InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825,
  public val self: InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e,
) {
  public class Builder {
    private var htmlValue: InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3? = null

    public var html: InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue:
        InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825? = null

    public var pullRequest: InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e? = null

    public var self: InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 must be a JSON object")
      val html = json.decodeRequired<InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825>(rawObject, "pull_request")
      val self = json.decodeRequired<InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e>(rawObject, "self")
      return InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70")
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

public fun inlinePullRequestReviewCommentEventCommentLinksXcf9c4e70(block: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70.Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 = InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
