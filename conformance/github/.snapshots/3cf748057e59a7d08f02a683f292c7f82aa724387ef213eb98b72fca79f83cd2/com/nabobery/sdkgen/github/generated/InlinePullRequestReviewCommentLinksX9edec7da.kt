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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links
 */
@Serializable(with = InlinePullRequestReviewCommentLinksX9edec7da.Serializer::class)
public class InlinePullRequestReviewCommentLinksX9edec7da(
  public val html: InlinePullRequestReviewCommentLinksHtmlX2b95f5cd,
  public val pullRequest: InlinePullRequestReviewCommentLinksPullRequestX812cea5d,
  public val self: InlinePullRequestReviewCommentLinksSelfX2b93b140,
) {
  public class Builder {
    private var htmlValue: InlinePullRequestReviewCommentLinksHtmlX2b95f5cd? = null

    public var html: InlinePullRequestReviewCommentLinksHtmlX2b95f5cd
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlinePullRequestReviewCommentLinksPullRequestX812cea5d? = null

    public var pullRequest: InlinePullRequestReviewCommentLinksPullRequestX812cea5d
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: InlinePullRequestReviewCommentLinksSelfX2b93b140? = null

    public var self: InlinePullRequestReviewCommentLinksSelfX2b93b140
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlinePullRequestReviewCommentLinksX9edec7da {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlinePullRequestReviewCommentLinksX9edec7da(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentLinksX9edec7da = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentLinksX9edec7da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentLinksX9edec7da {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentLinksX9edec7da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentLinksX9edec7da must be a JSON object")
      val html = json.decodeRequired<InlinePullRequestReviewCommentLinksHtmlX2b95f5cd>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlinePullRequestReviewCommentLinksPullRequestX812cea5d>(rawObject, "pull_request")
      val self = json.decodeRequired<InlinePullRequestReviewCommentLinksSelfX2b93b140>(rawObject, "self")
      return InlinePullRequestReviewCommentLinksX9edec7da(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentLinksX9edec7da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentLinksX9edec7da")
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

public fun inlinePullRequestReviewCommentLinksX9edec7da(block: InlinePullRequestReviewCommentLinksX9edec7da.Builder.() -> Unit): InlinePullRequestReviewCommentLinksX9edec7da = InlinePullRequestReviewCommentLinksX9edec7da.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentLinksX9edec7da is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
